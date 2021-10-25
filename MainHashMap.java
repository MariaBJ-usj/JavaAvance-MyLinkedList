package fr.dauphine.javaavance.td3;

import java.util.HashMap;
import java.util.Map;

import fr.dauphine.javaavance.td1.Circle;
import fr.dauphine.javaavance.td1.Point;

public class MainHashMap {

	public static void main(String [] args) {
		Map<Point, Circle> m = new HashMap<>();
		Point p1 = new Point(1,2);
		Circle c1 = new Circle(p1,100);
		m.put(p1, c1);
		System.out.println(m.containsKey(p1));
		System.out.println(m.containsKey(new Point(1,2)));
		
		//3/If we change the coordinates of p1 to x=1 and y=2,the result is "true, false" despite that the new Point 
		//has the same coordinates as the circle's center
		//In order to correct this we need to change:
		//-the equals method in Point so it compares the coordinates between two points
		//-the hashcode in Point so it returns the same for all instances of the class Point

	}
}
