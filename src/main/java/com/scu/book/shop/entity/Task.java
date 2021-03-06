package com.scu.book.shop.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;

import static javax.persistence.GenerationType.IDENTITY;

import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Test generated by hbm2java
 */
@Entity
@Table(name = "task")
public class Task implements java.io.Serializable {

	private static final long serialVersionUID = 2869623046140621262L;
	
	private Integer taskId;
	private String taskName;

	public Task() {
	}
	
	public Task(Integer taskId, String taskName) {
		this.taskId = taskId;
		this.taskName = taskName;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "task_id", unique = true, nullable = false)
	public Integer getTaskId() {
		return taskId;
	}

	public void setTaskId(Integer taskId) {
		this.taskId = taskId;
	}

	@Column(name = "task_name", nullable = false, length = 50)
	public String getTaskName() {
		return taskName;
	}

	public void setTaskName(String taskName) {
		this.taskName = taskName;
	}

}
