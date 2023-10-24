public class ForLoop2 {

	public static void main(String[] args) {
		
		for( int i=1; i<=10 ;i++)
		System.out.println(i);
		
		System.out.println("After loop i ="+i);
		//this statement gives error beacuse the scope of i  is limited only for 
            //the for loop and after for condition i is not initilize.
		
	}

}