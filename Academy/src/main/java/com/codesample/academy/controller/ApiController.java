package com.codesample.academy.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.codesample.academy.data.Uid;

@RestController
@RequestMapping("/api")
public class ApiController {
	@GetMapping("/classes/{classid}")
	public Uid getUid(@PathVariable("classid") String classid) {
		Uid uid = new Uid(classid);
		return uid;
	}
}