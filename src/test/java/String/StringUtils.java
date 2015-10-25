package String;

import java.util.HashMap;
import java.util.Map;

public class StringUtils {
	public static HashMap<Character,Integer> createMap(String A){
		HashMap<Character,Integer> hashmap = new HashMap<Character,Integer>();
		for(int i=1;i<=256;i++)
			hashmap.put((char)i, 0);
		for(int i=0;i<A.length();i++)
			hashmap.put(A.charAt(i),hashmap.get(A.charAt(i))+1);
		for(Map.Entry<Character,Integer> entry : hashmap.entrySet())
			System.out.println(entry.getKey()+":"+entry.getValue());
		return hashmap;
	}
	
}
