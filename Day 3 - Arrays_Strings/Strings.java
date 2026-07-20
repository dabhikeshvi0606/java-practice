public class Strings {
    public static void main(String[] args){

        String str1 = "Hello";
        String str2 = "Hello";
        
        System.out.println("Original String: " + str1);
        System.out.println(str1 == str2); //compares memory locations
        System.out.println(str1.equals(str2)); //compares string values
        System.out.println(str1.length()); //gives length of string
        System.out.println(str1.toUpperCase()); //changes to uppercase
        System.out.println(str2.toLowerCase()); //changes to lower case
        System.out.println(str1.charAt(0)); //gives character at particular index
        System.out.println(str2.substring(1,4)); //slicing is done 
        System.out.println(str1.contains("he")); //tells if the string contain particular letters
        System.out.println(str2.contains("hi")); //tells if the string contain particular letters
        System.out.println(str1.replace("o","p")); //replaces the letter mentioned with given letter
        System.out.println(str2.trim()); //trims extra spaces



       
    }
}
