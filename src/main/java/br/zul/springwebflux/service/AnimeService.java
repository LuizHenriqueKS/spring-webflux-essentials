package br.zul.springwebflux.service;

import org.springframework.stereotype.Service;

import br.zul.springwebflux.domain.Anime;
import br.zul.springwebflux.repository.AnimeRepository;
import lombok.RequiredArgsConstructor;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RequiredArgsConstructor
@Service
public class AnimeService {
    
    private final AnimeRepository animeRepository;

    public Flux<Anime> findAll() {
        return animeRepository.findAll();
    }

    public Mono<Anime> findById(int id) {
        return animeRepository.findById(id);
    }

}
