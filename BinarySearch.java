public class BinarySearch{
	public static void main (String [] args){
		
		int[] numbers = {10,20,30,40,50,60,70};
		
		int searchValue = 50;
		
		int low = 0;
		int high = numbers.length - 1;
		
		int position = -1;
		
		while (low <= high){
			
			int mid =(low + high)/2 ;
			
			if (numbers[mid] == searchValue ){
				
				position = mid;
				break;
				
			}
			else if (numbers[mid] < searchValue){
				
				low = mid + 1;
			}
			else{
				high = mid -1;
			}
		}
		
		if(position != -1){
			System.out.println("Element found!");
			System.out.println("Index: "+position);
			System.out.println("position: "+(position + 1));
			
		}

		else{
			System.out.println("Element not found!");
		}
	
	}
}