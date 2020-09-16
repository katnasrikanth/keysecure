package com.demo.providerapp.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.providerapp.Provider;

@RestController
public class ProviderController {
	
	@GetMapping("/providers")
	public List<Provider> getNames() {
		
		List<Provider> providers= new ArrayList<>();
		
		Provider p1=new Provider();
		p1.setId(1);
		p1.setName("stalin");
		
		providers.add(p1);
		return providers;
	}

}
