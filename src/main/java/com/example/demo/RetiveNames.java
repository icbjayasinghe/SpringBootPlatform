package com.example.demo;

import java.util.ArrayList;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class RetiveNames {
	@RequestMapping(value = "/names", method = RequestMethod.GET)
	@ResponseBody
	public ArrayList method() {
	
		ArrayList al =new ArrayList();
		al.add("lamaya");
		al.add("gihim harina diyaba");
		return al;
	}
	
	@RequestMapping(value = "/jobs", method = RequestMethod.GET)
	@ResponseBody
	public ArrayList method2() {
	
		ArrayList al =new ArrayList();
		al.add("go to maradhana");
		al.add("check stock");
		return al;
	}

}
