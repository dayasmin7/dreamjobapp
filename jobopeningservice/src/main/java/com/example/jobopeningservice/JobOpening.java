package com.example.jobopeningservice;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class JobOpening {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long jobId;
	private Long companyId;
	private String position;
    private String email;
    public Long getjobId() {
		return jobId;
	}
	public void setjobId(Long id) {
		this.jobId = id;
	}
	
    public Long getcompanyId() {
		return companyId;
	}
	public void setcompanyId(Long id) {
		this.companyId = id;
	}
	
	public String getPosition() {
		return position;
	}
	public void setPosition(String position) {
		this.position = position;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}

}