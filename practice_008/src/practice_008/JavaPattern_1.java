package practice_008;

public class JavaPattern_1 {

	public static void main(String[] args) {
		for(int i=1 ;i<=5; i++) {
			for(int j=5 ;j>0 ;j--) {
				if(j !=i) {
					System.out.print(j);
				}
				else {
					System.out.print("*");
				}
			}
			System.out.println();
		}

	}

}
