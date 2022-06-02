package br.com.zup.edu.cineminha.adapters.persistence.filme;

import br.com.zup.edu.cineminha.domain.filme.Filme;
import br.com.zup.edu.cineminha.domain.filme.FilmeRepository;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class FilmeRepositoryImpl implements FilmeRepository {

    private final JpaFilmeRepository repository;

    public FilmeRepositoryImpl(JpaFilmeRepository repository) {
        this.repository = repository;
    }

    @Override
    public Filme salva(Filme filme) {
        return repository.save(filme);
    }

    @Override
    public Optional<Filme> findById(Long id) {
        return repository.findById(id);
    }
}
