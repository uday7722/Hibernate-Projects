package com.hibernate.mappingproject.Hibernate_Jpa_Project;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Actor {
	@Id
	private int actorId;
	private String actorName;
	private String actorMovie;
	@Override
	public String toString() {
		return "Actor [actorId=" + actorId + ", actorName=" + actorName + ", actorMovie=" + actorMovie + "]";
	}
	public int getActorId() {
		return actorId;
	}
	public void setActorId(int actorId) {
		this.actorId = actorId;
	}
	public String getActorName() {
		return actorName;
	}
	public void setActorName(String actorName) {
		this.actorName = actorName;
	}
	public String getActorMovie() {
		return actorMovie;
	}
	public void setActorMovie(String actorMovie) {
		this.actorMovie = actorMovie;
	}
	
	
	

}
