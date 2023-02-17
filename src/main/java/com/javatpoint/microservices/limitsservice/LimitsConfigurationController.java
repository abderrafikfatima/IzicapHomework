package com.javatpoint.microservices.limitsservice;

import org.springframework.web.bind.annotation.GetMapping;  
import org.springframework.web.bind.annotation.RestController;
import com.javatpoint.microservices.limitservice.bean.LimitConfiguration;

@RestController  
public class LimitsConfigurationController {  

	@GetMapping("/limits")  
	public LimitConfiguration retriveLimitsFromConfigurations() {  
			return new LimitConfiguration(1000, 1);  
	}  
}  
