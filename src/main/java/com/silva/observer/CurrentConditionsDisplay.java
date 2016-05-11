package com.silva.observer;

public class CurrentConditionsDisplay implements Observer,Display{
    
	private float t;
	
	private float h;
	
	private float p;
	
	Subject subject;
	
	public void display() {
		System.out.println(String.format("t = %f , h = %f ,p = %f",t,h,p ));
	}
    
	public CurrentConditionsDisplay (Subject s){
		this.subject = s;
	}
	public void update(float t, float h, float p) {
		this.t = t;
		this.h = h;
		this.p = p;
		display();
	}
	public void register(){
		subject.registerObserver(this);
	}
		
	

}
