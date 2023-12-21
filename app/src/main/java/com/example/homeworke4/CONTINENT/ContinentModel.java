package com.example.homeworke4.CONTINENT;

import java.io.Serializable;

public class ContinentModel implements Serializable {
    private String poster;
    private String name;

    public ContinentModel(String poster, String name) {
        this.poster = poster;
        this.name = name;
    }

    public String getPoster() {
        return poster;
    }

    public void setPoster(String poster) {
        this.poster = poster;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
