package com.springmvc.beginner.restcontroller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.sun.org.apache.bcel.internal.generic.NEWARRAY;

@RestController
public class HelloRestController {
	
	
	@RequestMapping("/")
	public String welcome() {
		
		return "Hello from SPRING REST!";
	}
	
	@RequestMapping("/param")
	public String welcomeParam(@RequestParam("name") String name, @RequestParam("loc") String location) {
		return name + " from " + location + ", Welcome to Spring REST!!!!";
		
	}
	
	@RequestMapping(value = "/all", method = RequestMethod.GET ,produces = MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody
	public List getAllFriendsArray() {
		List friends = new ArrayList();
		
		friends.add("OBB");
		friends.add("OWIO");
		friends.add("BNP");
		
		return friends;
	}

	@RequestMapping(value = "/friends/all", 
					method = RequestMethod.GET ,
					produces = MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody
	public List getAllFriendsJsonArray() {
		List friends = new ArrayList();
		
		friends.add(new Friend(1, "OBB", "Chennai"));
		friends.add(new Friend(2, "BNP", "Bengaluru"));
		friends.add(new Friend(3, "OKI", "Tokyo"));
		
		return friends;
	}
}
