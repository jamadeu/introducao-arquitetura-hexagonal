package br.com.zup.edu.cineminha.application.filme;

import br.com.zup.edu.cineminha.domain.filme.FilmeService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;

import javax.validation.Valid;

@RestController
@RequestMapping("/api/filmes")
public class FilmeController {

    private final FilmeService service;

    public FilmeController(FilmeService service) {
        this.service = service;
    }

    @PostMapping
    public ResponseEntity<?> cadastra(@RequestBody @Valid NovoFilmeRequest request,
                                      UriComponentsBuilder uriBuilder) {

        var filme = service.salva(request.toModel());

        var location = uriBuilder.path("/api/filmes/{id}")
                .buildAndExpand(filme.getId())
                .toUri();

        return ResponseEntity.created(location).build();
    }


}
