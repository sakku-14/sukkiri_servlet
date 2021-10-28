package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import lombok.extern.slf4j.Slf4j;

@Controller
@Slf4j
public class LogoutController {

	@GetMapping("/logout")
	public String getLogout() {
		
		log.info("ログアウト");
		return "redirect:/login";
	}
}
