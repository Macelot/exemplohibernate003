package org.marcelot;
// Generated 14/09/2020 21:28:42 by Hibernate Tools 5.4.18.Final

/**
 * Roles generated by hbm2java
 */
public class Roles implements java.io.Serializable {

	private Integer id;
	private String role;

	public Roles() {
	}

	public Roles(String role) {
		this.role = role;
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getRole() {
		return this.role;
	}

	public void setRole(String role) {
		this.role = role;
	}

}
