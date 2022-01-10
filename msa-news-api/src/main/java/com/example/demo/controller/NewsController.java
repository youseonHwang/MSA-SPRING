package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NewsController {
	
	@RequestMapping("/")
	public String getNews() {
		System.out.print("newsController µµÂø");
		return "news Information";
	}
}
