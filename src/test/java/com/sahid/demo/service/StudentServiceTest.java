//package com.sahid.demo.service;
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
//
//@RunWith(SpringJUnit4ClassRunner.class)
//@ComponentScan(basePackages= {"com.sahid.demo.*"})
//@Rollback(false)
//@SpringBootTest
//public class StudentServiceTest {
//	
//@Autowired
//StudentService service;
//
//@Test
//public void testSave()
//{
//	Student st=new Student();
//	st.setId(22);
//	st.setFirstname("Sahid");
//	st.setLastname("hossain");
//	st.setFathername("Father");
//	st.setMothername("Mother");
//	st.setEmail("Email");
//	st.setPhoneno("01622");
//	st.setBirthdate("01 sep");
//	service.saveStudentData(st);
//}
//
//@Test
//public void testGetAll()
//{
//	List<Student> st=service.getAllStudentData();
//	st.stream().forEach(s->
//	{System.out.println(st.toString());});
//		
//}
//
//@Test
//public void testFindOne()
//{
//	@SuppressWarnings("deprecation")
//	Student st=service.findOne(new Long(2));
//	System.out.println(st.toString());
//}
//}
