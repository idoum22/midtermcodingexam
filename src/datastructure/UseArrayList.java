package datastructure;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class UseArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String> list = new ArrayList<String>();

		//Insert ten elements into list
		list.add("Mali");
		list.add("Senegal");
		list.add("Algeria");
		list.add("Nigeria");
		list.add("Mauritania");
		list.add("Burkina Fasso");
		list.add("Ivory cost");
		list.add("Niger");
		list.add("Guinea");
		list.add("Gana");

		System.out.println("FOR EACH LOOP");

		for(String s : list) {
			System.out.println(s);
		}

		System.out.println("WHILE WITH ITERATOR");

		Iterator<String> it = list.listIterator();

		while(it.hasNext()) {
			System.out.println(it.next());
		}
		it = list.listIterator();
		System.out.println("REMOVE ELEMENT");
		while(it.hasNext()) {
			if(it.next().contentEquals("Ivory cost"))
				it.remove();
		}
		it = list.listIterator();
		System.out.println("AFTER REMOVING Ivory cost");
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}

}
