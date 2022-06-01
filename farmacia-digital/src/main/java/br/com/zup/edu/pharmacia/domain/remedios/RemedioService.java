package br.com.zup.edu.pharmacia.domain.remedios;

import org.springframework.stereotype.Service;

@Service
public record RemedioService(RemedioRepository repository) {

    public Remedio salva(Remedio remedio) {
        return repository.salva(remedio);
    }
}
