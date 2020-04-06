package com.rssapp.rss.controller;

import javax.servlet.http.HttpServletRequest;

import org.json.JSONObject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class AppController {
	
	@ResponseBody
	@PostMapping(value={"/sendRss"}, consumes = "application/json", produces = "application/json")
	public String sendRss(@RequestBody String data, HttpServletRequest request) 
	{
		JSONObject jsonObject = new JSONObject();
		jsonObject = new JSONObject(data);
		String url = (String) jsonObject.get("url");
		String email = (String) jsonObject.get("email");
		System.out.println("emial" + email + " " + "url" + url);
		data ="aaaa";
		return data;
	}		
}
