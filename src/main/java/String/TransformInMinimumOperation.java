package String;

import java.util.*;

import org.apache.log4j.Logger;

public class TransformInMinimumOperation {
	static Logger log = Logger.getLogger(TransformInMinimumOperation.class.getName());
	private boolean compare(String A, String B){
		HashMap<Character,Integer> hma = new HashMap<Character,Integer>();
		HashMap<Character,Integer> hmb = new HashMap<Character,Integer>();
		hma = StringUtils.createMap(A);
		hmb = StringUtils.createMap(B);
		return true;
	}
	private String rightShiftBy1(String A){
		return A.charAt(A.length()-1)+A.substring(0, A.length()-1);
	}
	public int transform(String A, String B){
		int count=0;
		if(A==null || B==null)
			return -1;
		if(A.length() != B.length())
			return -1;
		//Code to validate if both the Strings have same characters if not, return -1
		int len=A.length()-1;
		while(A.charAt(len)==B.charAt(len) && len>=0)
			len--;
		for(int j=0;j<=len;j++){
			
		//	log.info("Pick "+A.charAt(len)+" and insert at front, "+A+" => ");
			System.out.print("Pick "+A.charAt(len)+" and insert at front, "+A+" => ");
			String temp=A.substring(len+1,A.length());
			//log.debug("Right "+rightShiftBy1(A.substring(0,len+1)));
			//System.out.println("temp "+temp);
			A = rightShiftBy1(A.substring(0,len+1))+temp;
			System.out.println(A);	
			count++;
			if(A.substring(len,A.length()).equals(B.substring(len,B.length()))){
				len--;
			}
			if(A.equals(B))
				return count;
		}
		if(A.equals(B)==false)
			return -1;
		else
			return count;
	}
	
}
