package com.cav.repository;


import java.util.Optional;


import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.cav.crud.repository.DepartmentRepository;
import com.cav.crud.repository.PersonRepository;
import com.cav.onetomany.bidirectional.eager.entities.Department;
import com.cav.onetomany.bidirectional.eager.entities.Person;

@SpringBootTest
@RunWith(SpringRunner.class)
public class BidirectionalOneToManyTest {
	
	
	@Autowired
    PersonRepository personRepository;
		
	@Autowired
	DepartmentRepository departmentRepository;
	
	
	
	@Test
	public void oneToManyTestDepartments() {
		System.out.println("Start Test");
		Department department = new Department(1111L, "Dept1");
		departmentRepository.save(department);
		
		Person person = new Person(1111L, "Tom",department);
		personRepository.save(person);
		
		Optional<Department> deptResp = departmentRepository.findById(1111L);
		department = deptResp.get();
		System.out.println(department.toString());
		
		Optional<Person> perRosp = personRepository.findById(1111L);
		System.out.println(perRosp.get().toString());
		department = perRosp.get().getDepartment();
		System.out.println(department.toString());
	}

}
