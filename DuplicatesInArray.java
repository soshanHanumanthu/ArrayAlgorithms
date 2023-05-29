public class DuplicatesInArray {

	public static void main(String[] args) {
		int [] arr = {10,20, 20,20,20,30,40,40};
		   for(int i=0;i<arr.length-1;i++) {
			   if(arr[i]==arr[i+1]) {
				   if (i == 0 || arr[i] != arr[i - 1]) {
					   System.out.println("the duplicate value is "+arr[i]); 
				   }
				  
			   }
		   }
	}

}