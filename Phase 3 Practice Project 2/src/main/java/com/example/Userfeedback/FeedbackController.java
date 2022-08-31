package com.example.Userfeedback;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Userfeedback.Feedbackservice;

@RestController
@RequestMapping(path = "/webapi") 
public class FeedbackController {
	@Autowired
	Feedbackservice feedback;
	 	    @GetMapping("/alluserfeedback")
	    public List<Feedback> getAllProduct(){
	        return feedback.getAllProduct();
	    }
	    
	 
	    @PostMapping("/adduserfeedback")  
	    public void addProduct(@RequestBody Feedback fe ) {
	    	feedback.addProduct(fe);
	    }
	    

}
