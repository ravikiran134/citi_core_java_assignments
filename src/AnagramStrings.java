import java.util.Arrays;
import java.util.Scanner;

public class AnagramStrings 
{
	public boolean isAnagrams(String str1, String str2)
	{
		boolean flag = false;
		str1 = str1.replaceAll("\\s", "");
		str2 = str2.replaceAll("\\s", "");
		if(str1.length()!=str2.length())
			flag = false;
		else
		{
			char[] ArrStr1 = str1.toLowerCase().toCharArray();  
            char[] ArrStr2 = str2.toLowerCase().toCharArray();  
            Arrays.sort(ArrStr1);  
            Arrays.sort(ArrStr2); 
            
            if(Arrays.equals(ArrStr1, ArrStr2))
            {
            	flag = true;
            }
		}
		return flag;
	}

	public static void main(String[] args) 
	{
		Scanner sc  = new Scanner(System.in);
		AnagramStrings as = new AnagramStrings();
		
		System.out.println("Enter First String : ");
		String str1 = sc.nextLine();
		
		System.out.println("Enter Second String : ");
		String str2 = sc.nextLine();
				
		if(as.isAnagrams(str1, str2))
		{
			System.out.println("True");
		}
		else
			System.out.println("False");
	}

}
