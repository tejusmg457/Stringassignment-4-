import java.util.*;
class Question7 
{
	boolean uniqueChar(String str)
    {

        for (int i = 0; i < str.length(); i++)
        for (int j = i + 1; j < str.length(); j++)
        if (str.charAt(i) == str.charAt(j))
        return false;
        
        return true;
    }

 
    public static void main(String args[])
    	{
    	Question7 obj = new Question7();
        String input = "teju@123";
 
        if (obj.uniqueChar(input))
            System.out.println( input + " String has contain unique characters");
        else
            System.out.println(input + " String don't have unique characters");
    	}
    }
	

