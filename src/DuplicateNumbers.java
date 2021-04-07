import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class DuplicateNumbers {

	public void getUniqueNumbers()
	{
		Integer[] arr = { 10, 15, 20, 10, 10, 10, 20, 30, 35, 40, 40};
	    List<Integer> l = Arrays.asList(arr);
	    Set<Integer> s = new HashSet<Integer>(l);
	    System.out.println(s);
		DuplicateNumbers.findDuplicateNumbers(s,arr);
	}
	public static void findDuplicateNumbers(Set<Integer> s, Integer[] arr)
	{ 
		 Iterator<Integer> i = s.iterator();
	     while (i.hasNext())
	     {
	    	 int next = i.next();
	    	 int count = 0;
	    	 for(int j = 0; j<arr.length;j++)
	    	 { 
	    		 if(arr[j]==next)
	    		 {
	    			 count++;
	    		 } 
	    	 }
	    	 if(count > 1)
	    		 System.out.println(next);
	     }
	}
	
	public static void main(String[] args) {
		
		DuplicateNumbers dn = new DuplicateNumbers();
		dn.getUniqueNumbers();

	}

}
