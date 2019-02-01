//package com.sahid.demo.repository;
//
//import java.util.List;
//
//import org.junit.Test;
//import org.junit.runner.RunWith;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.context.annotation.ComponentScan;
//import org.springframework.test.annotation.Rollback;
//import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
//
//import com.sahid.demo.model.Student;
//import com.sahid.demo.repo.StudentRepository;
//
//@RunWith(SpringJUnit4ClassRunner.class)
//@ComponentScan(basePackages= {"com.sahid.demo.*"})
//@Rollback
//@SpringBootTest
//public class StudentRepositoryTest {
//
//	@Autowired
//	StudentRepository sr;
//	
//	@Test
//	public void testSave()
//	{
//		Student st=new Student();
//		st.setId(22);
//		st.setFirstname("Sahid");
//		st.setLastname("hossain");
//		st.setFathername("Father");
//		st.setMothername("Mother");
//		st.setEmail("Email");
//		st.setPhoneno("01622");
//		st.setBirthdate("01 sep");
//		sr.save(st);
//	}
//	
//	public void testGetAll() {
//		List<Student> students = (List<Student>) sr.findAll();
//		students.stream().forEach(s -> {
//			System.out.println(s.toString());
//		});
//	}
//	
//	@Test
//	public void testFindOne() {
//		Student student = sr.findById(new Long(2)).get();
//		System.out.println(student.toString());
//	}
//}
