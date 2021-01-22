import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;
import java.util.stream.Collectors;


public class MyObject1 {
//*******************	main method
   public static void main(String[] args) {
		
	  MyObject[] array = new MyObject[50];
		
        for (int i =0; i<50;i++) {
    	
    	MyObject myObj = new MyObject(myBool(), myInt(), myName());
    	 
    	array[i] = myObj; 
    	}
    	
//    	System.out.println(Arrays.toString(array));
          	
    	List< MyObject> myList = Arrays.asList(array);
    	
    	overTwenty(myList);
    	average(myList);
    	changename(myList);
    	
    }
//****************************
  
	
	public static Boolean myBool() {
		boolean isTrue = false;
		int randomNum = (int)(Math.random() * 50);
		if (randomNum > 25) {
			isTrue = true;
			}
		//else {isTrue = false;}
		return isTrue;
	}
	
	public static int myInt() {
		
		int myInt ;
		
		myInt = (int)(Math.random() * 51);
		
		return myInt;
	}
	
	public static String myName(){
		
		String letters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String name = "";
		for (int i=0 ; i<7 ; i++) {
		int x = (int)(Math.random() * 26);
		char z = letters.charAt(x);
		name = name+z;
		}
		return name;
	}
	
  public static void overTwenty(List<MyObject>  array) {
		
    List< MyObject> myList = array
				  .stream()
				  .filter(x -> x.getValue() >20)
		          .collect(Collectors.toList());
				                 
    System.out.println("List of over 20 : " + myList);			
   }
	
  public static void average(List<MyObject>  array) {
		
	  OptionalDouble average = array
					  .stream()
					  .mapToDouble(x -> x.getValue())
					  .average();
					                 
	    System.out.println("Average of values:" + average);			
	   }
  public static void changename(List<MyObject>  array) {
		
	  List< MyObject> myList = array
			  .stream()
			  .filter(x -> x.getBool())
              .map(x -> {
                  if(x.getBool()){
                      x.setName("This Is True");
                  }
                  return x;
              })
			  .collect(Collectors.toList());
			                 
              System.out.println("Changing names : " + myList);				
	   }
  
}



