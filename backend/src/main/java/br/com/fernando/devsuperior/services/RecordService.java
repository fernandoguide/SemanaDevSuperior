package br.com.fernando.devsuperior.services;

import br.com.fernando.devsuperior.dtos.RecordDTO;
import br.com.fernando.devsuperior.dtos.RecordInsertDTO;
import br.com.fernando.devsuperior.entities.Game;
import br.com.fernando.devsuperior.entities.Record;
import br.com.fernando.devsuperior.repositories.GameRepository;
import br.com.fernando.devsuperior.repositories.RecordRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.Instant;

@Service
public class RecordService {

    @Autowired
    private RecordRepository recordRepository;

    @Autowired
    private GameRepository gameRepository;

    @Transactional
    public RecordDTO insert(RecordInsertDTO dto){
        Record entity = new Record();

        entity.setName(dto.getName());
        entity.setAge(dto.getAge());
        entity.setMoment(Instant.now());

        Game game = gameRepository.getOne(dto.getGameId());
        entity.setGame(game);

        entity = recordRepository.save(entity);

        return new RecordDTO(entity);
    }
    @Transactional(readOnly = true)
    public Page<RecordDTO> findByMoments(Instant minDate, Instant maxDate, PageRequest pageRequest) {
        return recordRepository.findByMoments(minDate,maxDate,pageRequest).map(x -> new RecordDTO(x));
    }

}