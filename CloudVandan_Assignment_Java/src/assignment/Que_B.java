package assignment;

public class Que_B {

	public static int romanToInt(String s)
	{
		int result=0;
		int prev_val =0;
		
		for(int i=s.length()-1;i>=0;i--)
		{
			char ch = s.charAt(i);
			int curr_val=0;
			
			switch(ch)
			{
				case 'I':
					curr_val=1;
				break;
				case 'V':
					curr_val=5;
				break;	
				case 'X':
					curr_val=10;
				break;	
				case 'L':
					curr_val=50;
				break;	
				case 'C':
					curr_val=100;
				break;
				case 'D':
					curr_val=500;
				break;
				case 'M':
					curr_val=1000;
				break;
				default:
				  return -1;
				
			}
			
			if(curr_val<prev_val)
				result-=curr_val;
			else
				result +=curr_val;
			
			prev_val=curr_val;
		}
		return result;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int result = romanToInt("IX");
		System.out.println(result);

	}

}
