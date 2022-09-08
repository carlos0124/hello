package com.javahungry.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import java.util.List;
import org.springframework.web.bind.annotation.RestController;


import com.javahungry.SpringbootHelloWorldApplication;

@RestController
public class HelloWorldController {
	@Autowired
	private SpringbootHelloWorldApplication servicio;
	
 @GetMapping(path="/hello")
 public String sayHello() {
  return "Hello!! from Java Hungry";
 }

}