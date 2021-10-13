package org.example;

import io.restassured.http.ContentType;
import org.testng.annotations.Test;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.Locale;
import java.util.stream.Collectors;

import static io.restassured.RestAssured.given;

public class GetJobsTest {

    @Test
    public void shouldGetJobs() {
        Job[] jobs = getAllJobs();

        long count = Arrays.stream(jobs).filter(job -> job.getType().equals(JobType.FULL_TIME.getType()))
                .count();
        System.out.println(count);
    }


    @Test
    public void shouldGetHowToApplyLinks() {
        Job[] jobs = getAllJobs();

        Arrays.stream(jobs)
                .map(job -> job.getHowToApply())
                .map(hta -> hta.substring(hta.indexOf("\">") + 2,
                        hta.indexOf("</a>")))
                .forEach(System.out::println);
    }

    private Job[] getAllJobs() {
        return given().contentType(ContentType.JSON)
                .when()
                .get("https://jobs.github.com/positions.json")
                .then()
                .extract().as(Job[].class);
    }


    @Test
    public void shouldFindByDate() {
        Job[] jobs = getAllJobs();
        LocalDateTime dateTime = LocalDateTime.of(2021, 5, 17, 12, 0);

        Arrays.stream(jobs).map(job ->
            LocalDateTime.parse(job.getCreatedAt(), DateTimeFormatter.ofPattern("EEE MMM dd HH:mm:ss zzz yyyy", Locale.US)))
                .forEach(localDateTime -> System.out.println(localDateTime));

        System.out.println();

        Arrays.stream(jobs).filter(job -> LocalDateTime.parse(job.getCreatedAt(),
                DateTimeFormatter.ofPattern("EEE MMM dd HH:mm:ss zzz yyyy", Locale.US)).isBefore(dateTime))
                .forEach(job -> System.out.println(job));
    }

}
