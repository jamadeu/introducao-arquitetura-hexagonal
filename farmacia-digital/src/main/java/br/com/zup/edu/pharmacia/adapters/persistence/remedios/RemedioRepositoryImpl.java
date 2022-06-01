package br.com.zup.edu.pharmacia.adapters.persistence.remedios;

import br.com.zup.edu.pharmacia.domain.remedios.Remedio;
import br.com.zup.edu.pharmacia.domain.remedios.RemedioRepository;
import org.springframework.stereotype.Component;

@Component
public class RemedioRepositoryImpl implements RemedioRepository {

    private final JpaRepository repository;

    public RemedioRepositoryImpl(JpaRepository repository) {
        this.repository = repository;
    }

    @Override
    public Remedio salva(Remedio remedio) {
        return repository.save(remedio);
    }
}
