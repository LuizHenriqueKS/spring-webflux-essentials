package br.zul.springwebflux.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.zul.springwebflux.domain.Anime;
import br.zul.springwebflux.service.AnimeService;
import lombok.RequiredArgsConstructor;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;


@RequiredArgsConstructor
@RestController
@RequestMapping("animes")
public class AnimeController {
    
    private final AnimeService animeService;

    @GetMapping()
    public Flux<Anime> listAll() {
        return animeService.findAll();
    }
    
    @GetMapping("{id}")
    public Mono<Anime> findById(@PathVariable int id) {
        return animeService.findById(id);
    }

}
