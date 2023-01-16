package com.masai.entites;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Collage {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int collageId;
	private String collageName;
	private String collageAddress;
	
	@OneToMany(cascade = CascadeType.ALL,mappedBy = "collage")  //,mappedBy = "collage"
	private List<Student> studList = new ArrayList<>();

	public int getCollageId() {
		return collageId;
	}

	public void setCollageId(int collageId) {
		this.collageId = collageId;
	}

	public String getCollageName() {
		return collageName;
	}

	public void setCollageName(String collageName) {
		this.collageName = collageName;
	}

	public String getCollageAddress() {
		return collageAddress;
	}

	public void setCollageAddress(String collageAddress) {
		this.collageAddress = collageAddress;
	}

	public List<Student> getStudList() {
		return studList;
	}

	public void setStudList(List<Student> studList) {
		this.studList = studList;
	}

	@Override
	public String toString() {
		return "Collage [collageId=" + collageId + ", collageName=" + collageName + ", collageAddress=" + collageAddress
				+ ", studList=" + studList + "]";
	}

	public Collage() {
		super();
		// TODO Auto-generated constructor stub
	}


	
	
	

	
	
	

}
