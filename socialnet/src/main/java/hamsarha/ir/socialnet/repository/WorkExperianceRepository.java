package hamsarha.ir.socialnet.repository;

import hamsarha.ir.socialnet.model.WorkExperiance;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WorkExperianceRepository extends JpaRepository<WorkExperiance, Long> {
}
