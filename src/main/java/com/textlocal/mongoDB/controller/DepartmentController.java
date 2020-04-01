package com.textlocal.mongoDB.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.textlocal.mongoDB.model.Department;
import com.textlocal.mongoDB.repository.DepartmentRepository;

public class DepartmentController {
	@Autowired
	private DepartmentRepository departmentRepository;
	
	@PostMapping
	public Department createDept(@RequestBody Department department) {
		departmentRepository.save(department);
		return department;
	}
	
	@GetMapping
	public List listDepts(){
	    return departmentRepository.findAll();
	 }
	
	@PutMapping("/{deptId}")
    public Department updateDept(@RequestBody Department department, @PathVariable String deptId) {
        department.setId(deptId);
        departmentRepository.save(department);
        return department;
    }
	
	@DeleteMapping("/{deptId}")
    public String deleteDept(@PathVariable String deptId) {
        departmentRepository.deleteById(deptId);
        return deptId;
    }
	
}
