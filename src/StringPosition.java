
public class StringPosition {

	private void findPositionsstr(String[] strArray, String searchStr) {
		
		String posString = "";
		searchStr = searchStr.toLowerCase();
		for(int i = 0; i < strArray.length; i++)
		{
			if(searchStr.equalsIgnoreCase(strArray[i]))
			{
				if(posString != "")
					posString = posString + ", " + i;
				else
					posString = posString  + i;
			}	
		}
		System.out.println("Matched Positions - "+posString);
	}
	public static void main(String[] args) {
		
		String str = "Dramatically increase the success of Virtusa digital transformation. ViRtusa developing net new solutions or scaling existing processes and staff worldwide, Virtusa helps you reach your goals in some of today’s most complex and fast-moving use cases";
		str = str.toLowerCase();
		String[] strArray = str.split(" ");
		String searchStr = "virtusa";
		
		StringPosition sp = new StringPosition();
		sp.findPositionsstr(strArray, searchStr);
	}
}
