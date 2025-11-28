package activities;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Activity11 {

	public static void main(String[] args)
	
	{	
		// create a map
		Map<Integer, String> colours = new HashMap<>();
		
		// adding colours
		colours.put(1, "Red");
		colours.put(2, "Blue");
		colours.put(3, "Green");
		colours.put(4, "White");
		colours.put(5, "Black");
		
		
		System.out.println(colours);
		
		for(Entry<Integer, String> item : colours.entrySet()) 
		{
			System.out.println(item.getKey() + ": " + item.getValue());
		}
		
		colours.remove(3);
		
		System.out.println("Does Green exist? " + colours.containsValue("Green"));
		
		System.out.println("Size of the Map: " + colours.size());
		
		System.out.println(colours);
		
		colours.remove(1);
		
		System.out.println("Size of the Map after removing red colour: " + colours);
	}
}
