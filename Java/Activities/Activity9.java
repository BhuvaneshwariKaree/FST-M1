package activities;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Activity9 {

	public static void main (String[] args)
	{
		List<String> strList = new ArrayList<>();
		strList.add("Grapes");
		strList.add("Cherry");
		strList.add("Papaya");
		strList.add(1, "Watermelon");
		strList.add(0, "Mango");
		
		for(String name : strList) {
			System.out.println(name);
			
		}
		
		Iterator<String> listItr = strList.iterator();
		while (listItr.hasNext()) {
			System.out.println(listItr.next());
		}
		
		System.out.println("3rd name is: " + strList.get(2));
		
		System.out.println("Does mango exist? " + strList.contains("Mango"));
		
		System.out.println("Number of elements in list: " + strList.size());	
		
		strList.remove("Papaya");
		
		System.out.println("Number of elements in list: " + strList.size());	
	}

}
