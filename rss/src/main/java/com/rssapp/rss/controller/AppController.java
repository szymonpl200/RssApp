package com.rssapp.rss.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
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

}
