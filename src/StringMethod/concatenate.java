package StringMethod;

public class concatenate {

	    public static void main(String[] args)
	    {
	        String str1 = "Hello Java and ";
	        String str2 = "Welcome to Java";
	        
	        System.out.println("String 1: " + str1);
	        System.out.println("String 2: " + str2); 
	       
	        String str3 = str1.concat(str2);
	        
	        System.out.println("The concatenated string: " + str3);
	    }
	}

