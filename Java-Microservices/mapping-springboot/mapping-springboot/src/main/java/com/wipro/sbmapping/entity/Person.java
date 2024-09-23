package com.wipro.sbmapping.entity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;

@Entity
public class Person {
	
	 @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long id;

	    private String name;
	    private String email;
	    private int age;

	    @OneToOne(cascade = CascadeType.ALL)
	    @JoinColumn(name = "passport_id", referencedColumnName = "id")
	    private Passport passport;

		public Person() {
			super();
			// TODO Auto-generated constructor stub
		}

		public Person(Long id, String name, String email, int age, Passport passport) {
			super();
			this.id = id;
			this.name = name;
			this.email = email;
			this.age = age;
			this.passport = passport;
		}

		public Long getId() {
			return id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getEmail() {
			return email;
		}

		public void setEmail(String email) {
			this.email = email;
		}

		public int getAge() {
			return age;
		}

		public void setAge(int age) {
			this.age = age;
		}

		public Passport getPassport() {
			return passport;
		}

		public void setPassport(Passport passport) {
			this.passport = passport;
		}

		@Override
		public String toString() {
			return "Person [id=" + id + ", name=" + name + ", email=" + email + ", age=" + age + ", passport="
					+ passport + "]";
		}
	    
	    

}
