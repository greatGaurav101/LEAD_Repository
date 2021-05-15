package practice_008;

import java.util.HashMap;

public class DemoCharacters {

	public static void main(String[] args) {
		String str="welcome to testyantra";
		char []cha=str.toCharArray();

		HashMap<Character,Integer> hm = new HashMap();

		for(char ch:cha) {
			if(hm.containsKey(ch)) {
				hm.put(ch,hm.get(ch)+1);
			}
			else {
				hm.put(ch,1);
			}
		}
		System.out.println(hm);
	}

}
