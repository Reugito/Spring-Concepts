package com.example.demo.component;

import org.springframework.stereotype.Component;

@Component
public class DepartmentBean {
	private String deptName;
	
	public String getDeptName() {
		return deptName;
	}
	public String setDeptName(String deptName) {
		return deptName = deptName;
	}
}
