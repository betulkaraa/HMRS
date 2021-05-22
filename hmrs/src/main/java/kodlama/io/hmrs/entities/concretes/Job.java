package kodlama.io.hmrs.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;


import lombok.Data;

@Entity
@Data

@Table(name="Departmans")
public class Job {
	

	@Id
	@GeneratedValue
	
	@Column(name="departman_id")
	private int id;
	
	
	@Column(name="departman_name")
	private String jobName;
	
	public Job()
	{
		
	}
	

	public Job(int id, String jobName) {
		super();
		this.id = id;
		this.jobName = jobName;
	}
	

}
