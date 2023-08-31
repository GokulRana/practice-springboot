package com.demo.amdocsb4.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class demo4 {
   @GetMapping("/get")
   public String show() {
	   return "Welcome to amdocs spring boot session";
   }
   @GetMapping("/set")
   public String show1() {
	   return "Welcome to amdocs spring boot session welcome again";
   }
}
