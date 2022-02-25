package Lab6;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;

public class VoteEligible {

	public static void main(String[] args) {
		HashMap<Integer,Integer> map=new HashMap<>();
		map.put(1,19);
		map.put(2, 18);
		map.put(3,11);
		map.put(19,32);
		map.put(12, 17);
		List l1=checkEligibelity(map);
		System.out.println("ID = "+l1);;
		

	}
	public static List checkEligibelity(HashMap map)
	{
		Iterator <Entry<Integer,Integer>> it=map.entrySet().iterator();
		List<Integer> ls=new ArrayList<Integer>();
		while(it.hasNext())
		{
			Entry<Integer,Integer> entry=it.next();
			if(entry.getValue()>=18)
			{
				ls.add(entry.getKey());
			}
		}
		return ls;
	}

}
