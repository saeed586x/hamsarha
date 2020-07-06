package hamsarha.ir.socialnet.service;

import hamsarha.ir.socialnet.repository.WorkExperianceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class WorkExperianceService {

    private final WorkExperianceRepository workExperianceRepository;

    public WorkExperianceService(WorkExperianceRepository workExperianceRepository) {
        this.workExperianceRepository = workExperianceRepository;
    }
}
