package com.example.homeworke4.COUNTRY;

public class CountryModel {
    private String poster;
    private String name;

    public CountryModel(String poster, String name) {
        this.poster = poster;
        this.name = name;
    }

    public String getPoster() {
        return poster;
    }

    public String getName() {
        return name;
    }
}
