package kodlama.io.hmrs.business.abstracts;
import java.util.List;

import kodlama.io.hmrs.entities.concretes.Job;

public interface JobService {
	List<Job> getAll();
}
