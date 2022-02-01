package br.zul.springwebflux.repository;

import org.springframework.data.repository.reactive.ReactiveCrudRepository;

import br.zul.springwebflux.domain.Anime;

public interface AnimeRepository extends ReactiveCrudRepository<Anime, Integer> {

}
