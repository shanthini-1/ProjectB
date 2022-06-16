package com.chainsys.application.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestParam;

@RestController
public class Service {
	@RequestMapping("/welcome")
	public String welcomePage() {
		return "<h1> Welcome </h1>";
	}

	@RequestMapping("/Home")
	public String homePage() {
		String html = "<body>\r\n" + "	<div>\r\n" + "	<form>\r\n"
				+ "		<div>\r\n"
				+ "			<label for='name'> Name: <input name='name'\r\n"
				+ "				id='name' type='text'  maxlength=15 min=3 placeholder='enter your name'\r\n"
				+ "				required>\r\n"
				+ "			</label>\r\n"
				+ "		<div>\r\n"
				+ "			<label for='year'> Years Of experience: <input name='year'\r\n"
				+ "				id='year' type='number' step=0.05 maxlength=3 min=5 value=35\r\n"
				+ "				required>\r\n"
				+ "			</label>\r\n" 
				+ "		</div>\r\n"
				+ "		<div>\r\n"
				+ "			<label for='age'> Age Range : <input name='age' id='age'\r\n"
				+ "				type='range' step=1 min=22 max=30 value=23 required>\r\n" 
				+ "			</label>\r\n"
				+ "		</div>\r\n" + "</form>"
				+"</body>";
		return html;
	}
	
	@RequestMapping("/getdata")
	public String getData(@RequestParam(value="city",defaultValue="madurai")String city) {
		return "<h1>Welcome to "+city+"</h1";
		
//		http://localhost:8080/getdata?city=chennai -> querystring to 
	}
}
