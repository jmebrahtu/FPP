package hashMap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class PractisehashMap {
	public static void main (String[]a) {
	Map<String, String> countries = new HashMap<>();
	countries.put("India", "IN");
	countries.put("United States of America", "US");
	countries.put("Russia", "RU");
	countries.put("Japan", "JP");

	HashMap<String,String>it= new HashMap<String,String>();
	
	//the way to find the key value;
	for (String key : countries.keySet()) {
	    System.out.println("Key = " + key);
	}
	//iterating over values only
	for (String value : countries.values()) {
	    System.out.println("Value = " + value);
	}
	Map<String, String> map = new HashMap<String, String>();
	Iterator<Map.Entry<String, String>> entries =countries.entrySet().iterator();
	while (entries.hasNext()) {
	    Map.Entry<String, String> entry = entries.next();
	    System.out.println("Key = " + entry.getKey() + ", Value = " + entry.getValue());
	}
	countries.put("FPP", "black1");
	countries.put("MPP", "black2");
	countries.put("WAP", "black3");
	countries.put("DBMS", "black4");
	
	 
	if(countries.containsKey("WAP")){
		System.out.println("found");
	}else {
		System.out.println("Not found");
	}
	}
}

