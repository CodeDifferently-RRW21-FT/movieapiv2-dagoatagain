package com.dagoat.MovieApiV2.domain.actor.service;

import com.dagoat.MovieApiV2.domain.actor.models.Actor;
import com.dagoat.MovieApiV2.domain.core.interfaces.CrudService;

public interface ActorService extends CrudService<Actor, Long> {
    Actor findByAlias(String alias);
}
