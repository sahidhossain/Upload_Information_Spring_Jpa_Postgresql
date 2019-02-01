//package com.sahid.demo;
//
//import java.util.List;
//
//import javax.persistence.EntityManager;
//import javax.persistence.PersistenceContext;
//import javax.transaction.Transactional;
//
//import org.junit.Test;
//import org.junit.runner.RunWith;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.context.annotation.ComponentScan;
//import org.springframework.test.annotation.Rollback;
//import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
////import org.springframework.test.context.junit4.SpringRunner;
//
//import com.sahid.demo.model.Student;
//
////@RunWith(SpringRunner.class)
//@RunWith(SpringJUnit4ClassRunner.class)
//@ComponentScan(basePackages= {"com.sahid.demo.*"})
//@Rollback(false)
//@SpringBootTest
//public class StudentInformationApplicationTests {
//	@PersistenceContext
//	EntityManager em;
//	
//	@Test
//	@Transactional
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
//		em.persist(st);;		
//	}
//	
//	@Test 
//	public void testGetAll() {
//		List<Student> students = em.createQuery("SELECT s FROM Student s", Student.class).getResultList();
//		students.stream().forEach(s -> {
//			System.out.println(s.toString());
//		});
//	}
//	
//
//	
//	public void testFindOne() {
//		Student student = em.find(Student.class, 22);
//		System.out.println(student.toString());
//	}
//	
//	
//	@Test
//	public void testFindById() {
//		Student student = em.createQuery("SELECT s FROM Student s WHERE s.id=:id", Student.class)
//							.setParameter("id",1)
//							.getResultList()
//							.stream()
//							.findFirst()
//							.orElse(null);
//		System.out.println(student.toString());
//	}
//	
//	public void contextLoads() {
//	}
//
//}
//
