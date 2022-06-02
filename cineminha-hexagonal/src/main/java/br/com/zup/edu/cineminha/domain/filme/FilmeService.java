package br.com.zup.edu.cineminha.domain.filme;

import org.springframework.stereotype.Service;

@Service
public record FilmeService(FilmeRepository repository) {

    public Filme salva(Filme filme) {
        return repository.salva(filme);
    }
}
