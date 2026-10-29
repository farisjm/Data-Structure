public class LinearSearch{
	public static void main(String[] args){
	
	//Declare and initialize an array	
	int[] numbers ={10,25,30,45,50};
	
	int searchValue =45;
	
	int position = -1;
	
	for(int i=0; i < numbers.length; i++){
		
		//compare the currect element with the search value
		if(numbers[i] == searchValue){
			
			position = i;
			
			break;
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