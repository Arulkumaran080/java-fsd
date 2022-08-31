package com.example.Userfeedback;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity
public class Feedback {
	 @Id
	    @GeneratedValue(strategy = GenerationType.AUTO)
	    @Column(name = "id", updatable = false, nullable = false)
	    private int id;
	   
	    
	    @Column(length=20)
	    private String name;
	    @Column(length=50)
	    private String Email;
	    @Column(length=50)
	    private String Feedback;

	    
	    
	    
	    //Constructor
	    public Feedback() {
	        super();
	    }
	    public Feedback(int id, String name, String Email, String Feedback) {
	        super();
	        this.id = id;
	        this.name = name;
	        this.Email = Email;
	        this.Feedback=Feedback;
	    }
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getEmail() {
			return Email;
		}
		public void setEmail(String email) {
			Email = email;
		}
		public String getFeedback() {
			return Feedback;
		}
		public void setFeedback(String feedback) {
			Feedback = feedback;
		}

}
