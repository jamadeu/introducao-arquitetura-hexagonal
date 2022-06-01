package br.com.jamadeu.hexagonal.adapters;

import br.com.jamadeu.hexagonal.domain.Proposta;
import org.springframework.data.repository.CrudRepository;

public interface JpaRepository extends CrudRepository<Proposta, Long> {
}
