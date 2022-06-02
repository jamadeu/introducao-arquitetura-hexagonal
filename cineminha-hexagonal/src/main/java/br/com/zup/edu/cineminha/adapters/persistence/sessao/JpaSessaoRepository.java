package br.com.zup.edu.cineminha.adapters.persistence.sessao;

import br.com.zup.edu.cineminha.domain.sessao.Sessao;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JpaSessaoRepository extends JpaRepository<Sessao, Long> {
}