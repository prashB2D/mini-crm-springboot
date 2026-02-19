package com.p23.miniCRM.model;



import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Customer {
  
    @Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer Cid ;
	
	

	private String Cname;
	
	private Integer Cage;
	
	private String Ccity;
	
	
	
	

	public Customer(Integer cid, String cname, Integer cage, String ccity) {
		super();
		Cid = cid;
		Cname = cname;
		Cage = cage;
		Ccity = ccity;
	}

	public Customer() {
		super();
	}

	public Integer getCid() {
		return Cid;
	}

	public void setCid(Integer cid) {
		Cid = cid;
	}

	public String getCname() {
		return Cname;
	}

	public void setCname(String cname) {
		Cname = cname;
	}

	public Integer getCage() {
		return Cage;
	}

	public void setCage(Integer cage) {
		Cage = cage;
	}

	public String getCcity() {
		return Ccity;
	}

	public void setCcity(String ccity) {
		Ccity = ccity;
	}
	@Override
	public String toString() {
		return "Customer [Cid=" + Cid + ", Cname=" + Cname + ", Cage=" + Cage + ", Ccity=" + Ccity + "]";
	}
}
