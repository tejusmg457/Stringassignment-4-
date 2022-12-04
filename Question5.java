import java.util.Arrays;

public class Question5 {

	public static void main(String[] args) {
	
		String s1="a gentle Man";
		String s2="elegant Man";
		
		s1=s1.replace(" ", "");
		s2=s2.replace(" ", "");
		
		s1=s1.toLowerCase();
		s2=s2.toLowerCase();
		
		char[] ch1 = new char[s1.length()];
		char[] ch2 = new char[s2.length()];
		
		for (int i = 0; i < s1.length(); i++) 
		{
            ch1[i] = s1.charAt(i);
		}
		for (int i = 0; i < s2.length(); i++) 
		{
            ch2[i] = s2.charAt(i);
		}
		//char[] ch1=s1.toCharArray();
		//char[] ch2=s2.toCharArray();
		
		Arrays.sort(ch1);
		Arrays.sort(ch2);
		
		if(Arrays.equals(ch1, ch2))
		{
			System.out.println("Entered string is Anagram");
		}
		else
		{
			System.out.println("Entered string is not Anagram");
		}
	}

}
