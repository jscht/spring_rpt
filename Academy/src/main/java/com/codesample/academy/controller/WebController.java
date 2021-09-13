package com.codesample.academy.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

import com.codesample.academy.data.Classes;
import com.codesample.academy.data.Teachers;
//import com.codesample.academy.data.Uid;

@Controller
public class WebController {
// 수업아이디, 수업이름, 강사, 신청인원/최대인원, 설명, 수업일정(시작일, 종료일, 수업요일)
	Classes classes1 = new Classes("1", "정보통신1", "강사1", 0, 20, "설명1", "일정1");		
	Classes classes2 = new Classes("2", "정보통신2", "강사1", 0, 30, "설명2", "일정2");
	Classes classes3 = new Classes("3", "회계1", "강사2", 0, 20, "설명3", "일정3");
	Classes classes4 = new Classes("4", "회계2", "강사2", 0, 30, "설명4", "일정4");
	
// 강사아이디, 강사이름, 전문분야, 개설수업리스트(개설수업아이디, 개설수업이름)
	Teachers teacher1 = new Teachers("1", "강사1", "정보통신", "개설수업목록1");
	Teachers teacher2 = new Teachers("2", "강사2", "회계", "개설수업목록2");
	
	@GetMapping("/")
	public String index() {
		return "index";
	}
	
	@GetMapping("/classes")
	public String lesson(Model model) {
		model.addAttribute("classes1", classes1);
		model.addAttribute("classes2", classes2);
		model.addAttribute("classes3", classes3);
		model.addAttribute("classes4", classes4);
		//System.out.println(classes1.getApplicant());
		//System.out.println(classes1.getMaxApplicant());
		return "classes";
	}
	
	@GetMapping("/classes/{classid}")
	public String classId(@PathVariable("classid") String classid, Model model) {
		model.addAttribute("classes1", classes1);
		model.addAttribute("classes2", classes2);
		System.out.println(classes1.getLessonId());		
		
	return "class_detail";
	}
	
	@GetMapping("/teachers")
	public String teachers(Model model) {
		model.addAttribute("teacher1", teacher1);
		model.addAttribute("teacher2", teacher2);
		return "teachers";
	}
	
	@GetMapping("/teachers/{teacherid}")
	public String teacherId(@PathVariable("teacherid") String teacherid, Model model) {
	
	return "teacher_detail";
	}
	
}

