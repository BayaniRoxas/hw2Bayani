package co2123.hw2.repo;

import co2123.hw2.model.Reimbursement;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ReimbursementRepository extends CrudRepository<Reimbursement, Integer> {
    List<Reimbursement> findByAmount(int amount);
}
