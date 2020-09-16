package br.com.fernando.devsuperior.repositories;

import br.com.fernando.devsuperior.entities.Record;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RecordRepository extends JpaRepository<Record,Long> {
}

