package br.com.zup.edu.cineminha.domain.sessao;

import org.springframework.stereotype.Service;

@Service
public class SessaoService {

    private final SessaoRepository repository;

    public SessaoService(SessaoRepository repository) {
        this.repository = repository;
    }

    public Sessao salva(Sessao sessao){
        return repository.salva(sessao);
    }
}
