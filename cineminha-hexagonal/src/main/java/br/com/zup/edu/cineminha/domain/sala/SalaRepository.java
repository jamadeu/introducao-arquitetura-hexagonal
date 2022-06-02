package br.com.zup.edu.cineminha.domain.sala;

import java.util.Optional;

public interface SalaRepository {

    Sala salva(Sala sala);

    Optional<Sala> findById(Long id);

}
