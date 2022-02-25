package Lab6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class SortMap {
	public static List getValues(HashMap mp)
	{
		Set set=mp.entrySet();
		List l1=new ArrayList<>();
		Iterator it=set.iterator();
		while(it.hasNext())
		{
			Map.Entry entry=(Map.Entry)it.next();
			l1.add(entry.getValue());
			
		}
		Collections.sort(l1);
		return l1;
	}

	public static void main(String[] args) {
		HashMap<Integer,Integer> mp=new HashMap<Integer,Integer>();
		mp.put(1,25);
		mp.put(2, 18);
		mp.put(3, 19);
		List<?> list=getValues(mp);
		System.out.println(list);
		

	}

}
