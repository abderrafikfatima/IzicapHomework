
package com.javatpoint.microservices.limitservice.bean;  

public class LimitConfiguration {  
	
	private int maximum;  
	
	private int minimum;  

	protected LimitConfiguration(){}  
	//generating getters  
	
	public int getMaximum() {  
		return maximum;  
	}
	
	public int getMinimum() {  
		return minimum;  
	}  
	
	//genetrating constructor using fields  
	public LimitConfiguration(int maximum, int minimum) {  
		super();  
		this.maximum = maximum;  
		this.minimum = minimum;  
	}

}  

