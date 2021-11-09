package com.yash.ThirdAssignment;

import java.io.Serializable;

public class Manager extends Employee implements Serializable{

	
	private static final long serialVersionUID = 1L;
	
	private int managerId;
	
	
	public Manager(int managerId) {
		super();
		this.managerId = managerId;
	}

	public int getManagerId() {
		return managerId;
	}

	public void setManagerId(int managerId) {
		this.managerId = managerId;
	}

	@Override
	public String toString() {
		return "Manager [managerId=" + managerId + "]";
	}
	

}
