package kr.co.sunnyvale.controller.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.context.request.NativeWebRequest;

@Controller
public class IndexController {

	@GetMapping("/")
	public String index( NativeWebRequest request ){
		return "index";
	}
	
	
}