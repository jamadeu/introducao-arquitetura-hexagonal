package br.com.jamadeu.hexagonal.adapters;

import br.com.jamadeu.hexagonal.domain.Proposta;
import br.com.jamadeu.hexagonal.domain.PropostaRepository;
import org.springframework.stereotype.Component;

@Component
public class PropostaRepositoryImpl implements PropostaRepository {

    private final JpaRepository repository;

    public PropostaRepositoryImpl(JpaRepository repository) {
        this.repository = repository;
    }

    @Override
    public Proposta salva(Proposta proposta) {
        return repository.save(proposta);
    }
}
