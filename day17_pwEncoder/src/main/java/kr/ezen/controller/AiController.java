package kr.ezen.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/ai")
public class AiController {
	@GetMapping("/ani.do")
	public String animal() {
//		return "ai/animalShape";
		return "ai/animalShape2";
	}
}
