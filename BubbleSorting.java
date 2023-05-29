public class BubbleSorting {

	public static void main(String[] args) {
		int []  arr = {23,4,5,9,67};
		for(int i = 0; i<arr.length;i++) {
			for(int j=1;j<arr.length-1;j++) {
				if(arr[j]<arr[j-1]) {
					int swap = arr[j];
					arr[j]=arr[j-1];
					arr[j-1]= swap;
					
					
				}
			}
		}
		for(int element:arr) {
			System.out.print(element);
		}

	}

}
