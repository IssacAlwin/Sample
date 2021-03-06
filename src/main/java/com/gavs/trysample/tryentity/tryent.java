package com.gavs.trysample.tryentity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "trysampletable")
public class tryent {
	
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name = "id")
	private int id;
	
    @Column(name = "name")
	private String name;
	
    @Column(name = "dept")
	private String department;
	
    @Column(name = "loc")
	private String location;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	@Override
	public String toString() {
		return "tryent [id=" + id + ", name=" + name + ", department=" + department + ", location=" + location + "]";
	}

	public tryent(int id, String name, String department, String location) {
		this.id = id;
		this.name = name;
		this.department = department;
		this.location = location;
	}
	
//	public tryent() {
//		
//	}
    

}
