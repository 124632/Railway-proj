package com.xworkz.railway.controller;

import java.util.LinkedHashMap;
import java.util.Map;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Component
@RequestMapping("/")
public  class RailwayController {
	
	public RailwayController() {
		System.out.println("Created \t"+this.getClass().getSimpleName());
	}
	
	private Map<String,String> map;
	@PostConstruct
	public void initializeMap() {
		map=new LinkedHashMap<>();
		map.put("Mysore", "Karnataka express");
		map.put("Davanegere", "Shatabdi express");
		map.put("Bagalore", "GolGumbaz express");
	}
	@RequestMapping("/search.odc")
	public  String display(@RequestParam String name ,@RequestParam String age,
			@RequestParam String source,@RequestParam String destination,@RequestParam String date, Model model) {
		System.out.println("Name is:"+name);
		System.out.println("Age is:"+age);
		System.out.println("Source is:"+source);
		System.out.println("Destination is:"+destination);
		System.out.println("Date is:"+date);
		
		model.addAttribute("name","Name is:"+name );
		model.addAttribute("age","Age is:"+age );
		model.addAttribute("source","Source is:"+source );
		model.addAttribute("destination","Destination is:"+destination );
		model.addAttribute("date","Date is:"+date );
		System.out.println("directing to reservation.jsp");
		return"reservation";
	}
	
	@RequestMapping("/submit.odc")
	public String searchTrains(@RequestParam String destination,Model model) {
		System.out.println("Destination is:"+destination);
		if(destination!=null) {
			System.out.println("Destination is not null");
			if(map.containsKey(destination)) {
				model.addAttribute("Destination","Destination name is"+destination);
				model.addAttribute("TrainName","Trail name is"+ map.get(destination));
			}
		}else {
			System.out.println("destination not matched"+destination);
			model.addAttribute("result","you have not selected,so result is not found");
		}
		return"search";
	}
}
