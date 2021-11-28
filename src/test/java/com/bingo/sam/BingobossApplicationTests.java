package com.bingo.sam;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class BingobossApplicationTests {

	@Test
	void contextLoads() {
		System.out.println("context loads=====");
		
		
		Container cString = new Container("Hello world");
		Container cNum = new Container(5);
		
		cString.show();
		cNum.show();
		
		System.out.println("========================== ==========================");
		Comparator<String> stringComparator = new Comparator<String>() {
		
		@Override
		
		public int compare(String o1, String o2) {
			// TODO Auto-generated method stub
			return o1.compareTo(o2);
		}
			
		};
	
	System.out.println(stringComparator.compare("hello", "world"));
	
	
	HotelData h1 = new HotelData("Extended stay", "3");
	HotelData h2 = new HotelData("Raddison", "4");
	HotelData h3= new HotelData("Marriot", "5");
	
	List<HotelData> ht= new ArrayList<>();
	ht.add(h1);
	ht.add(h2);
	ht.add(h3);
	
	Comparator<HotelData> nameComp = (hone,htwo)->{return hone.getName().compareTo(htwo.getName());};
	Comparator<HotelData> ratingComp = (hone,htwo)->{return hone.getStars().compareTo(htwo.getStars());};
	
	Collections.sort(ht, ratingComp);
	
	System.out.println(ht);
	
	}

	
}
class Container<T>{
	T value;
	public Container(T value) {
		this.value=value;
	}
	public void show() {
		System.out.println("Show op = "+this.value);
	}
	
}

class HotelData {

    private String name;
    private String stars;
    
    public HotelData(String name,String stars) {
    	this.name=name;
    	this.stars=stars;
    }
    
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getStars() {
		return stars;
	}
	public void setStars(String stars) {
		this.stars = stars;
	}

	@Override
	public String toString() {
		return "HotelData [name=" + name + ", stars=" + stars + "]";
	}
    
    
    
}