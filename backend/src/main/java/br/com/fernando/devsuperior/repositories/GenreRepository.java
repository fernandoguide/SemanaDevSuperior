package br.com.fernando.devsuperior.repositories;

import br.com.fernando.devsuperior.entities.Genre;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GenreRepository extends JpaRepository<Genre,Long> {
}
