package com.dagoat.MovieApiV2.domain.actor.models;

import com.dagoat.MovieApiV2.domain.core.models.Person;

import javax.persistence.Entity;

@Entity
public class Actor extends Person {
    private String alias;

    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }
}
