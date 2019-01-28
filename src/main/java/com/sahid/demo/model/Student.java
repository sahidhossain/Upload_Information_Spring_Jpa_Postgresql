package com.sahid.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "studentinformation1")
public class Student {
	private static final long serialVersionUID = -3009157732242241606L;
	@Id
    //@GeneratedValue(strategy=GenerationType.AUTO)
    private long id;
    
    @Column(name = "firstname")
    private String firstname;
    
    @Column(name = "lastname")
    private String lastname;
    
    @Column(name = "fathername")
    private String fathername;
    
    @Column(name = "mothername")
    private String mothername;
    

	@Column(name = "email")
    private String email;
    
    @Column(name = "phoneno")
    private String phoneno;
    
    @Column(name = "birthdate")
    private String birthdate;
    
    
    public Student() {}
    public Student(long id, String firstname, String lastname, String fathername, String mothername, String email,
			String phoneno, String birthdate) {
		super();
		this.id = id;
		this.firstname = firstname;
		this.lastname = lastname;
		this.fathername = fathername;
		this.mothername = mothername;
		this.email = email;
		this.phoneno = phoneno;
		this.birthdate = birthdate;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getFathername() {
		return fathername;
	}

	public void setFathername(String fathername) {
		this.fathername = fathername;
	}

	public String getMothername() {
		return mothername;
	}

	public void setMothername(String mothername) {
		this.mothername = mothername;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhoneno() {
		return phoneno;
	}

	public void setPhoneno(String phoneno) {
		this.phoneno = phoneno;
	}

	public String getBirthdate() {
		return birthdate;
	}

	public void setBirthdate(String birthdate) {
		this.birthdate = birthdate;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
    public String toString() {
        return String.format(
                "Student[id=%d, firstName='%s', lastName='%s',fathername='%s',mothername='%s',email='%s',phoneno='%s',birthdate='%s']",
                id, firstname, lastname,fathername,mothername,email,phoneno,birthdate);
    }
}
