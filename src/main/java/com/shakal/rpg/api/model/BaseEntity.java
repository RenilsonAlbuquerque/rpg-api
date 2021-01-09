package com.shakal.rpg.api.model;



import javax.persistence.MappedSuperclass;

import org.hibernate.annotations.Where;

@MappedSuperclass
//@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@Where(clause="deleted=0")
public class BaseEntity {
	/*
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	protected long id;
	*/
	private boolean deleted;

	/*
	public long getId() {
		return id;
	}

	protected void setId(long id) {
		this.id = id;
	}
	*/
	public boolean isDeleted() {
		return this.deleted;
	}

	public void setDeleted(boolean deleted) {
		this.deleted = deleted;
	}

}
