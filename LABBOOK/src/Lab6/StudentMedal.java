package Lab6;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

public class StudentMedal {

	public static void main(String[] args) {
		HashMap<String,String> map=new HashMap<>();
		map.put("1", "92");
		map.put("2", "75");
		map.put("3", "82");
		map.put("4", "98");
		map.put("5", "72");
		map.put("8", "60");
		HashMap mp1=getStudent(map);
		System.out.println(mp1);

	}
public static HashMap getStudent(HashMap map)
{
	Iterator<Entry<String,String>> it=map.entrySet().iterator();
	while(it.hasNext())
	{
		Entry<String,String> entry=it.next();
		if(Integer.parseInt(entry.getValue())>=90)
		{
			map.put(entry.getKey(),"Gold");
		}
		else if(Integer.parseInt(entry.getValue())<90 && Integer.parseInt(entry.getValue())>=80 )
		{
			map.put(entry.getKey(),"Silver");
		}
		else if(Integer.parseInt(entry.getValue())<80 && Integer.parseInt(entry.getValue())>=70)
		{
			map.put(entry.getKey(),"Broze");
		}
		else
		{
			map.put(entry.getKey(),"Not eligible");
		}
	}
	return map;
}
}
