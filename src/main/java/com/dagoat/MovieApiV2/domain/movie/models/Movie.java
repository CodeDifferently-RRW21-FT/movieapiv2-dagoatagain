package com.dagoat.MovieApiV2.domain.movie.models;

import com.dagoat.MovieApiV2.domain.core.models.BaseClass;

import javax.persistence.Entity;

@Entity
public class Movie extends BaseClass {
    private String title;

    public Movie() {
    }

    public Movie(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
