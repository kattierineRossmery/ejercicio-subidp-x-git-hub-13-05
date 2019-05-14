package com.everis.ejercicio1.models;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "StudentParents")
public class StudentParents {
	
	
	  @EmbeddedId 
	  private StudentParentsPK pkLlave;
	  
	  @ManyToOne
	  @JoinColumn(name = "student_id", referencedColumnName = "student_id",
	  insertable = false, updatable = false) 
	  private Students student;
	  
	  @ManyToOne
	  @JoinColumn(name = "parent_id", referencedColumnName = "parent_id",
	  insertable = false, updatable = false) 
	  private Parents parent;

	public StudentParentsPK getPkLlave() {
		return pkLlave;
	}

	public void setPkLlave(StudentParentsPK pkLlave) {
		this.pkLlave = pkLlave;
	}

	public Students getStudent() {
		return student;
	}

	public void setStudent(Students student) {
		this.student = student;
	}

	public Parents getParent() {
		return parent;
	}

	public void setParent(Parents parent) {
		this.parent = parent;
	}

	
	 
}
