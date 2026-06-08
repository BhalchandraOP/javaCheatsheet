package com.bhalchandra;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

/**
 * Unit test for simple App.
 */
@Entity
@Table(name = "alien_data")
public class Alien {

	@Id
	@Column(name = "a_id")
	private int aid;
	@Column(name = "a_name")
	private String aname;
	private String tech;

//	@Test
//	public void shouldAnswerWithTrue() {
//		assertTrue(true);
//	}

	@Override
	// ToString
	public String toString() {
		return "Alien [aname=" + aname + ", aid=" + aid + ", tech=" + tech + "]";
	}

	// Getter
	public String getAname() {
		return aname;
	}

	// Setter
	public void setAname(String aname) {
		this.aname = aname;
	}

	//
	public int getAid() {
		return aid;
	}

	//
	public void setAid(int aid) {
		this.aid = aid;
	}

	//
	public String getTech() {
		return tech;
	}

	//
	public void setTech(String tech) {
		this.tech = tech;
	}

}
