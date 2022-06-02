package br.com.zup.edu.cineminha.domain.filme;

import java.util.Optional;

public interface FilmeRepository {

    Filme salva(Filme filme);

    Optional<Filme> findById(Long id);

}
