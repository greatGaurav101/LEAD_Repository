package practice_008;

public class tc_002 {

	public static void main(String[] args) {
		int [] a={29,12,32,15,8};
	      int temp;
	       for(int i=0; i<a.length ;i++){
	          for(int j=0; j<a.length-1-i; j++){
	            if(a[j]>a[j+1]){
	             temp=a[j];
	             a[j]=a[j+1];
	             a[j+1]=temp; 
	              }
	            }
	         }
	     
	       for(int i=0; i<a.length ;i++){
	          System.out.print(a[i]+" ");
	             }
	          

	}

}
