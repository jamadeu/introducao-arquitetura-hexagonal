package br.com.zup.edu.pharmacia.adapters.persistence.remedios;

import br.com.zup.edu.pharmacia.domain.remedios.Remedio;
import org.springframework.data.repository.CrudRepository;

public interface JpaRepository extends CrudRepository<Remedio, Long> {
}
