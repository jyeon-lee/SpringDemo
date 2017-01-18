package com.example.web;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.domain.Question;
import com.example.domain.User;

@Controller
public class QuestionController {

	private List<Question> questions =new ArrayList<>();
	
	
	@PostMapping("/questions")
	public String create(Question question){
		questions.add(question);
		for (Question que : questions) {
			System.out.println("hello"+que);
			//log.debug(""+user1);
			//log.info(""+user1);
		}
		return "redirect:/";
	}
	@GetMapping("/")
	public String index(Model model){
		model.addAttribute("questions",questions);
		
		return "index";
	}
	@GetMapping("/index")
	public String index2(Model model){
		model.addAttribute("questions",questions);
		
		return "index";
	}
	@GetMapping("/qna/form")
	public String quest(Model model){
		model.addAttribute("questions",questions);
		
		return "/qna/form";
	}
	
}