package br.com.fernando.devsuperior.repositories;

import br.com.fernando.devsuperior.entities.Record;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RecordRepository extends JpaRepository<Record,Long> {
}

