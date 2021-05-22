package kodlama.io.hmrs.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.batch.BatchProperties.Job;
import org.springframework.stereotype.Service;

import kodlama.io.hmrs.business.abstracts.JobService;
import kodlama.io.hmrs.dataAccess.abstracts.JobDao;

@Service
public class JobManager implements JobService {
	
	private JobDao jobDao;
	

	@Autowired
	public JobManager(JobDao jobDao) {
		super();
		this.jobDao = jobDao;
	}
	


	@Override
	public List<kodlama.io.hmrs.entities.concretes.Job> getAll() {
		
		return this.jobDao.findAll();	}

}