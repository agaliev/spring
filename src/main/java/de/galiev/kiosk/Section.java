package de.galiev.kiosk;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Column;

@Entity
public class Section implements Serializable{
	protected String name;
	protected long id;

	public Section() {
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Id
	@GeneratedValue
	@Column(name = "section_id")
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}
}
