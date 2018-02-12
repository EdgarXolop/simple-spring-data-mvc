package com.xolop.examples.datamvc.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.xolop.examples.datamvc.repository.UserRepository;

import net.sf.json.JSONObject;

@Controller
@RequestMapping
public class MainController {
    
    @Autowired
    private UserRepository userRepository;

    @RequestMapping(method = RequestMethod.GET)
    public ResponseEntity<String> indexView(HttpServletRequest request){
        ResponseEntity<String> response = null;
		HttpStatus status = null;			

        JSONObject resp = new JSONObject();
        
        status = HttpStatus.ACCEPTED;
        
        resp.put("data", userRepository.findAll());
		
        response = ResponseEntity.status(status).body(resp.toString());
        
        return response;
    }
}
