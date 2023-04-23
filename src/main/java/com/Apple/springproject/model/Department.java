package com.Apple.springproject.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "depatment_tbl")
public class Department {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String dpt_Name;
	private String dpt_Head;
	private String dpt_Phone;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDpt_Name() {
		return dpt_Name;
	}

	public void setDpt_Name(String dpt_Name) {
		this.dpt_Name = dpt_Name;
	}

	public String getDpt_Head() {
		return dpt_Head;
	}

	public void setDpt_Head(String dpt_Head) {
		this.dpt_Head = dpt_Head;
	}

	public String getDpt_Phone() {
		return dpt_Phone;
	}

	public void setDpt_Phone(String dpt_Phone) {
		this.dpt_Phone = dpt_Phone;
	}

}
