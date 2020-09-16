package br.com.fernando.devsuperior.repositories;

import br.com.fernando.devsuperior.entities.Game;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GameRepository extends JpaRepository<Game,Long> {
}
