/**
 * 
 */
package com.benito.cicdappliedtospringbootjavaapp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author benito
 *
 */
@RestController
public class HelloController {

	@GetMapping("/")
	public String home() {
		return "Hello World from DZONE";
	}
}
