package practice_008;

import java.util.HashMap;
import java.util.Set;

public class tc_003 {

	public static void main(String[] args) {
		String str="Mahabharat";
		  str=str.toLowerCase();
		  
		  char [] c=str.toCharArray();

		   HashMap<Character,Integer> hm=new HashMap();
		   
		   for(char ch:c){
		      if(hm.containsKey(ch)){
		          hm.put(ch,hm.get(ch)+1);
		         }
		      else{
		          hm.put(ch,1);
		        }
		      }
		   System.out.print(hm);

		     
		    Set<Character> cha=hm.keySet();
		     for(char chr:cha){
		       if(hm.get(chr)==1){
		         System.out.print(chr);
		         }

		     }


	}

}
