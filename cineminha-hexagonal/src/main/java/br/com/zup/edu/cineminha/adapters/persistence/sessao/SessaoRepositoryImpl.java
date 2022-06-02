package br.com.zup.edu.cineminha.adapters.persistence.sessao;

import br.com.zup.edu.cineminha.domain.sessao.Sessao;
import br.com.zup.edu.cineminha.domain.sessao.SessaoRepository;
import org.springframework.stereotype.Component;

@Component
public class SessaoRepositoryImpl implements SessaoRepository {

    private final JpaSessaoRepository repository;

    public SessaoRepositoryImpl(JpaSessaoRepository repository) {
        this.repository = repository;
    }

    @Override
    public Sessao salva(Sessao sessao) {
        return repository.save(sessao);
    }
}
