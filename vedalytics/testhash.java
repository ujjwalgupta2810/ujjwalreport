package vedalytics;
import java.util.*;
public class testhash {
	public static void main(String[] args) {
		String s = "ujjwal";
		Map<Character,Integer> hm = new HashMap<>();
		for(char ch : s.toCharArray()) {
			if(ch != ' ') {
				hm.put(ch,hm.getOrDefault(ch,0)+1);
				
			}
		}
		for(Map.Entry<Character,Integer> entry :hm.entrySet()) {
			System.out.println(entry.getKey() +" :"+ entry.getValue());
		}
	}

}
