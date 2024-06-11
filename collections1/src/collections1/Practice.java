package collections1;

import java.util.ArrayList;
import java.util.List;

import javax.print.attribute.Size2DSyntax;

public class Practice {

	public static void main(String[] args) {
	
		ArrayList l=new ArrayList();
		l.add("venkatesh");
		l.add("babu");
		l.add("YR");
		l.add("venkatesh");
		l.add(null);
		l.add(23);
		l.add(true);
//		
//		Object obj= l.get(1);
//		System.out.println(obj);
//		System.out.println(l.size());
		
//		for(Object temp: l) {
//			System.out.println(temp);
//		l.remove("babu");
//		System.out.println(l);
//		l.clear();
////		System.out.println(l);
//			
//			System.out.println(l.isEmpty());
		l.contains(23);
		System.out.println(l.contains(23));
		}
}
