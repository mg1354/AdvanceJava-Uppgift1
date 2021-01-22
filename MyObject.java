
public class MyObject {

	private boolean bool ;
	private int value ;
	private String name;
	
	
	public MyObject(boolean bool, int value, String name){
        this.bool = bool;
        this.value = value;
        this.name = name;
        
    }
	
	   public Boolean getBool(){
	        return bool;
	    }
	    public int getValue(){
	        return value;
	    }
	    public String getName(){
	        return name;
	    }
	    public void setName(String name){
	        this.name = name;
	    }
	    public String toString(){
//	        return ("Boolean: " + this.bool + "_" + "Name: " + this.name + "_" + "Value: " + this.value );
	    	return ( this.bool + "_" + this.name + "_" + this.value );
	    }
	

}


