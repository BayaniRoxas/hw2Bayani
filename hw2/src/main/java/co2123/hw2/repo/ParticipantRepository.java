package co2123.hw2.repo;

import co2123.hw2.model.Participant;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ParticipantRepository extends CrudRepository<Participant, String> {
    List<Participant> findByName(String name);
}
