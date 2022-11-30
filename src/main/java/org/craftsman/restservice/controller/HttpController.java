package org.craftsman.restservice.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HttpController {

	/**
	 * Index.
	 *
	 * @return the string
	 */
	@GetMapping("/")	
	public String index() {
		return "/openapi/swagger-ui.html";
	}

	/**
	 * Error 403.
	 *
	 * @return the string
	 */
	@GetMapping("/403")
	public String error403() {
		return "/error/403";
	}

	/**
	 * Error 404.
	 *
	 * @return the string
	 */
	@GetMapping("/404")
	public String error404() {
		return "/error/404";
	}


}
