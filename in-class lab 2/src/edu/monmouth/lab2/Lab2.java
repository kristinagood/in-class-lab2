package edu.monmouth.lab2;

import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import edu.monmouth.shape.Circle;
import edu.monmouth.shape.Rectangle;


public class Lab2 {
	
	public static void main(String[] args) {
	
		if (args.length != 1) 
		{
            System.err.println("Not one");
            System.exit(-1);
        } else 
        {
           File file = new File(args[0]);
        }

	//Create Circle and Rectangle objects
	Circle c1 = new Circle("c1", 100);
	Circle c2 = new Circle("c2", 2);
	Circle c3 = new Circle("c3", 30);
	Circle c4 = new Circle("c4", 408);
	Circle c5 = new Circle("c5", 5);
	Circle c6 = new Circle("c3", 5);
	Circle c7 = new Circle("c4", 8);
	Rectangle r1 = new Rectangle("r1", 10, 12);
	Rectangle r3 = new Rectangle("r3", 3, 3);
	Rectangle r4 = new Rectangle("r4", 4, 32);
	Rectangle r5 = new Rectangle("r5", 5, 1);
	Rectangle r0 = new Rectangle("r0", 10, 12);
	Rectangle r2 = new Rectangle("r2", 2, 20);
		
	//Create a List that can only store Circle objects
	List <Circle> listOfCircles = new ArrayList<Circle>();
	
	//Add the Circle objects (from above) to the List
	listOfCircles.add(c1);
	listOfCircles.add(c2);
	listOfCircles.add(c3);
	listOfCircles.add(c4);
	listOfCircles.add(c5);
	listOfCircles.add(c6);
	listOfCircles.add(c7);
	
	//Enhanced for loop
	for (Circle c : listOfCircles) 
	{
		System.out.println(c);
	}
	
	//Using Iterator’s hasNext() with a while loop
	Iterator <Circle> it = listOfCircles.iterator();
    while (it.hasNext()) 
    {
        System.out.println(it.next());
    }
    
    //Using LinkedList’s size() and get() methods with a for loop
    for (int i = 0; i < listOfCircles.size(); i ++) 
    {
    	System.out.println(listOfCircles.get(i));
    }
     
    //Using a method from the Collections class, sort the List of Circle objects
    Collections.sort(listOfCircles);
    
    //Use any mechanism to iterate through the List, printing out each Circle, verifying they are sorted
    for (int i = 0; i < listOfCircles.size(); i ++) 
    {
    	System.out.println(listOfCircles.get(i));
    }
    
    //Create a List that can only store Rectangle objects.
    List <Rectangle> listOfRectangles = new ArrayList<Rectangle>();
    
    //Add the Rectangle objects (from above) to the List
    listOfRectangles.add(r1);
    listOfRectangles.add(r3);
    listOfRectangles.add(r4);
    listOfRectangles.add(r5);
    listOfRectangles.add(r0);
    listOfRectangles.add(r2);
    
    //Enhanced for loop
    for (Rectangle r : listOfRectangles) 
	{
		System.out.println(r);
	}
    
    //Using Iterator’s hasNext() with a while loop
    Iterator <Rectangle> iterator = listOfRectangles.iterator();
    while (iterator.hasNext()) 
    {
        System.out.println(iterator.next());
    }
    
    //Using LinkedList’s size() and get() methods with a for loop
    for (int i = 0; i < listOfRectangles.size(); i ++) 
    {
    	System.out.println(listOfRectangles.get(i));
    }
    
    //Using a method from the Collections class, sort the List of Rectangle objects
    Collections.sort(listOfRectangles);
    
    //Use any mechanism to iterate through the List, printing out each Rectangle,verifying they are sorted
    for (int i = 0; i < listOfRectangles.size(); i ++) 
    {
    	System.out.println(listOfRectangles.get(i));
    }
    
    //Create two more objects as:
    Circle findThisCircle = new Circle("cX", 98);
    Rectangle findThisRectangle = new Rectangle("r4", 4, 4);
    
    //Using a method from the Collections class perform the Binary Search algorithm to find each of these in their respective Lists. Print a message, indicating if the object was found or not
    System.out.println(Collections.binarySearch(listOfCircles, findThisCircle));
   //not sure how to print a message at the same time
    System.out.println(Collections.binarySearch(listOfRectangles, findThisRectangle));
		

    
		}

}
