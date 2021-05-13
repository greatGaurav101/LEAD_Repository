package practice_008;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CombineTwoArraysusingCollection {
	public static void main(String [] args) {
		String [] st1= {"A","E","I","O","U"};
		String [] st2= {"BOY","GIRL","Male"};


		List al = new ArrayList(Arrays.asList(st1));
		al.add(Arrays.asList(st2));

		Object []st3=al.toArray();
		System.out.println(Arrays.toString(st3));

		for(Object st:st3) {
			System.out.print(st.toString());
		}

	}
}
