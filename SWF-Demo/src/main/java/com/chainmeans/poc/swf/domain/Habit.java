/**
 * Created on April 11, 2013
 */
package com.chainmeans.poc.swf.domain;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

/**
 * @author Roberto
 *
 */
@Entity
@Table(name = "habit")
public class Habit implements Serializable {

	private String habitId;
	private Set<Nexus> nexus = new HashSet<Nexus>();

	public Habit() {
	}

	public Habit(String habitId) {
		this.habitId = habitId;
	}

	public Habit(String habitId, Set<Nexus> nexus) {
		this.habitId = habitId;
		this.nexus = nexus;
	}

	@Id
	@Column(name = "Habit_ID")
	public String getHabitId() {
		return this.habitId;
	}

	public void setHabitId(String habitId) {
		this.habitId = habitId;
	}

	@ManyToMany
	@JoinTable(name = "nexus_habit_detail", 
	      joinColumns = @JoinColumn(name = "HABIT_ID"), 
	      inverseJoinColumns = @JoinColumn(name = "NEXUS_ID"))
	public Set<Nexus> getNexus() {
		return this.nexus;
	}

	public void setNexus(Set<Nexus> nexus) {
		this.nexus = nexus;
	}

}
