package org.example;

public enum JobType {
    FULL_TIME("Full Time"),
    PART_TIME("Part Time");

    private final String type;

    JobType(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }
}
