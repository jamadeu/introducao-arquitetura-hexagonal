package br.com.jamadeu.hexagonal.domain;

import org.springframework.stereotype.Service;

@Service
public record PropostaService(PropostaRepository repository) {

    public Proposta salva(Proposta proposta) {
        return repository.salva(proposta);
    }
}
