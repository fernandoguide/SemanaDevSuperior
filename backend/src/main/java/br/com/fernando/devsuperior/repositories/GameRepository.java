package br.com.fernando.devsuperior.repositories;

import br.com.fernando.devsuperior.entities.Game;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameRepository extends JpaRepository<Game,Long> {
}
