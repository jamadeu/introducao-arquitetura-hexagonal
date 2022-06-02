package br.com.zup.edu.cineminha.adapters.persistence.sala;

import br.com.zup.edu.cineminha.domain.sala.SalaRepository;
import br.com.zup.edu.cineminha.domain.sala.Sala;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class SalaRepositoryImpl implements SalaRepository {

    @Autowired
    private JpaSalaRepository repository;

    @Override
    public Sala salva(Sala sala) {
        return repository.save(sala);
    }

    @Override
    public Optional<Sala> findById(Long id) {
        return repository.findById(id);
    }

}
