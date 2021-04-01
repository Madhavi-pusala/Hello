package StringMethod;

public class Character {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "Welcome to the String method";
        System.out.println("Original String = " + str);
        int index1 = str.charAt(0);
        int index2 = str.charAt(12);

        System.out.println("The character at position 0 is " +
            (char)index1);
        System.out.println("The character at position 12 is " +
            (char)index2);
	}

}

