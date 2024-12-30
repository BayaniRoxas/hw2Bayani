package co2123.hw2.repo;

import co2123.hw2.model.Study;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface StudyRepository extends CrudRepository<Study, Integer> {
    List<Study> findByUniversity(String university);

    List<Study> findByLatestName(String name);
}
