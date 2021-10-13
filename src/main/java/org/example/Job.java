package org.example;

import com.fasterxml.jackson.annotation.*;
import java.util.UUID;

@lombok.Data
public class Job {
    @lombok.Getter(onMethod_ = {@JsonProperty("id")})
    @lombok.Setter(onMethod_ = {@JsonProperty("id")})
    private UUID id;
    @lombok.Getter(onMethod_ = {@JsonProperty("type")})
    @lombok.Setter(onMethod_ = {@JsonProperty("type")})
    private String type;
    @lombok.Getter(onMethod_ = {@JsonProperty("url")})
    @lombok.Setter(onMethod_ = {@JsonProperty("url")})
    private String url;
    @lombok.Getter(onMethod_ = {@JsonProperty("created_at")})
    @lombok.Setter(onMethod_ = {@JsonProperty("created_at")})
    private String createdAt;
    @lombok.Getter(onMethod_ = {@JsonProperty("company")})
    @lombok.Setter(onMethod_ = {@JsonProperty("company")})
    private String company;
    @lombok.Getter(onMethod_ = {@JsonProperty("company_url")})
    @lombok.Setter(onMethod_ = {@JsonProperty("company_url")})
    private String companyUrl;
    @lombok.Getter(onMethod_ = {@JsonProperty("location")})
    @lombok.Setter(onMethod_ = {@JsonProperty("location")})
    private String location;
    @lombok.Getter(onMethod_ = {@JsonProperty("title")})
    @lombok.Setter(onMethod_ = {@JsonProperty("title")})
    private String title;
    @lombok.Getter(onMethod_ = {@JsonProperty("description")})
    @lombok.Setter(onMethod_ = {@JsonProperty("description")})
    private String description;
    @lombok.Getter(onMethod_ = {@JsonProperty("how_to_apply")})
    @lombok.Setter(onMethod_ = {@JsonProperty("how_to_apply")})
    private String howToApply;
    @lombok.Getter(onMethod_ = {@JsonProperty("company_logo")})
    @lombok.Setter(onMethod_ = {@JsonProperty("company_logo")})
    private String companyLogo;
}

