package com.example.Userfeedback;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
@Transactional
public class Feedbackservice {

	 @Autowired
	    FeedbackRepository feedback;//reference object of interface
	    
	    //get list of all records
	    public List<Feedback> getAllProduct(){
	        return feedback.findAll();//findAll is a method of jparepository which returns all records in list
	    }
	  
	    public void addProduct(Feedback fe){
	    	feedback.save(fe);
	    }
}
