package com.rssapp.rss.controller;

import java.util.Iterator;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.json.JSONObject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.rssapp.rss.entity.RssFeed;

@Controller
public class AppController {
	
	
	@RequestMapping(value={"/", "/login"}, method = RequestMethod.GET)
    public ModelAndView login(){
        ModelAndView modelAndView = new ModelAndView();
		RssFeed rssFeed = new RssFeed();
		
		modelAndView.addObject("rssFeed", rssFeed);
		modelAndView.setViewName("home");

        return modelAndView;
    }
	
	
	@ResponseBody
	@PostMapping(value={"/sendRss"})
	public void sendRss(@RequestBody String data, HttpServletRequest request) 
	{
		JSONObject jsonObject = new JSONObject();
		jsonObject = new JSONObject(data);
		String url = (String) jsonObject.get("url");
		String email = (String) jsonObject.get("email");
		System.out.println("emial" + email + " " + "url" + url);
	}
	
}
