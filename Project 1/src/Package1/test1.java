package Package1;

public class test1 {
	public int sum(int a, int b)
	{
		
		
		int c = a+b;
		System.out.println("result of sum" +c);
		return c ;
				
	}
	public int sub(int x, int y)
	{
		
		
		int z = x-y;
		System.out.println("result of sub"+z);
		return z;
			
	}
	
	public void multi(int s, int r)
	{
		int t ;
		t = s*r;
		System.out.println("final result"+t);
		
				
	}
	public static void main(String[] args) 
	{
		test1 obj = new test1();
		int sumresult=obj.sum(10,5);
		int subresult=obj.sub(15,5);
		obj.multi(sumresult,subresult);
		
		
		
	}

}
