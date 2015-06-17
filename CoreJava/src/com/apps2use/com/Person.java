package com.apps2use.com;

public class Person implements Human{

	private String name;
	private String age;
	
	@Override
	public boolean isPerfect() {
	    if(name!=null&&age!=null){
		return true;
	    }
	    else{
	    	return false;
	    }
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}
	
	
}
