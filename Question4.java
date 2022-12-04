public class Question4 {
	public static void main(String[] args) {
		String str = "Tejas@smg";
		int vowels = 0;
		int consonants = 0;
		int specialcharacters = 0;
	
		for (int i = 0; i < str.length(); i++) 
		{
		char newchar = str.charAt(i);
		if ( (newchar>= 'a' && newchar <= 'z') || 
                (newchar >= 'A' && newchar <= 'Z') ) 
		{
	        if (newchar == 'a'  || newchar == 'e' || newchar == 'i' || newchar == 'o' || newchar == 'u')
	            {
	        	vowels++;
	            }
	        else
		        {
		        consonants++;
		        }
		}

         else
         {
           	specialcharacters++;
         }  	
		}
		System.out.println("Number of vowels present in the string str is = " + vowels);
        System.out.println("Number of Consonant present in the string str is = " + consonants);
        System.out.println("Number of Special Character present in the string str is = " + specialcharacters);
	}

}

