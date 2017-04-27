package com.plm.beans;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;

@Entity
public class Project {

@Id
@GeneratedValue(strategy= GenerationType.AUTO)
private int 	projectId;
private	String	name ;
private	Date 	fromDate;
private	Date 	toDate;

@OneToMany(cascade = CascadeType.ALL )
@JoinTable(	name = "PROJ_TASK", 
			joinColumns = @JoinColumn (name = "PROJ_ID", referencedColumnName = "projectId"), 
			inverseJoinColumns = @JoinColumn(name = "TASK_ID", referencedColumnName = "taskId"))
private	List<Task> list;

public Project() {
}

public Project(String name, Date fromDate, Date toDate, List<Task> list) {
	super();
	this.name = name;
	this.fromDate = fromDate;
	this.toDate = toDate;
	this.list = list;
}

public int getProjectId() {
	return projectId;
}

public void setProjectId(int projectId) {
	this.projectId = projectId;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public Date getFromDate() {
	return fromDate;
}

public void setFromDate(Date fromDate) {
	this.fromDate = fromDate;
}

public Date getToDate() {
	return toDate;
}

public void setToDate(Date toDate) {
	this.toDate = toDate;
}

public List<Task> getList() {
	return list;
}

public void setList(List<Task> list) {
	this.list = list;
}


}
