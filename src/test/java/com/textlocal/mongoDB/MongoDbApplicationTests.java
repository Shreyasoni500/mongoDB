package com.textlocal.mongoDB;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.textlocal.mongoDB.model.Department;
import com.textlocal.mongoDB.model.Employee;
import com.textlocal.mongoDB.repository.DeptRepository;

@SpringBootTest
class MongoDbApplicationTests {

@Autowired
private DeptRepository deptRepository;

List<Employee> list = new ArrayList<Employee>();
//@Test
/*public void insertData() {
	list.add(new Employee("1","Vikas",12,2000));
	list.add(new Employee("2","Vikas1",12,2000));
	list.add(new Employee("3","Vikas2",12,2000));
	list.add(new Employee("4","Vikas3",12,2000));
	Department dept = new Department();
	dept.setId("1");
	dept.setName("computer science");
	dept.setEmployees(list);
	dept.setDescription("Time Pass");
	Department deptTest = deptRepository.save(dept);
	System.out.print(deptTest);
}*/

@Test
public void getAllDept() {
	System.out.println("*******************************************************************");
	List dept = deptRepository.findAll();
	System.out.print(dept);
}
}
