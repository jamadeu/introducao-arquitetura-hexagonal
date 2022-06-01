package br.com.jamadeu.hexagonal.application;

import br.com.jamadeu.hexagonal.domain.Proposta;
import br.com.jamadeu.hexagonal.domain.PropostaService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponentsBuilder;

import javax.validation.Valid;
import java.net.URI;

@RestController
@RequestMapping("v1/propostas")
public class PropostaController {

    private final PropostaService service;

    public PropostaController(PropostaService service) {
        this.service = service;
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    private URI salva(@RequestBody @Valid NovaPropostaRequest request, UriComponentsBuilder uriBuilder){
        Proposta proposta = service.salva(request.toModel());

        return uriBuilder.path("v1/propostas/{id}").buildAndExpand(proposta.getId()).toUri();
    }
}
