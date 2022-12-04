
public class Question2 {

	public static void main(String[] args) {
		String std = "addition";
		char newstd[] = "addition".toCharArray();
		System.out.println("Duplicate elements present in the string ::"); 
		  for(int i = 0; i < newstd.length; i++) {  
		  for(int j = i + 1; j <newstd.length; j++) {  
		  if(newstd[i] == newstd[j])  
		  System.out.print(newstd[j] + ",");  
		  } 
		}  
	}

}
