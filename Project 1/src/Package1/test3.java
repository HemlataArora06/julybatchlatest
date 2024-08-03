package Package1;

public class test3 {
	public int div(int a, int b)
	{
		int c;
		c= a/b;
		System.out.println("result of div"+c);
		return c;
				
			
	}
	public int sub(int e, int f)
	{
		int g;
		g=e-f;
		System.out.println("result of sum"+g);
		return g;
	}
	public int mul(int q, int r)
	{
		int s;
		s=q*r;
		System.out.println("result of mul"+s);
		return s;
		
	}
	public int sub1(int x , int y)
	{
		int z;
		z=x-y;
		System.out.println("result of sub"+z);
		return z;
	}
     public void sum(int t, int u)
	{
		int result;
		result=t+u;
		System.out.println("final Sum"+result);
		
	}
	public static void main(String[] args) 
	{
		test3 ob = new test3();
		int divresult=ob.div(10,2);
		int subresult=ob.sub(divresult, 2);
		int mulresult=ob.mul(subresult, 2);
		int subresult2= ob.sub(mulresult, 2);
		ob. sum(subresult2,2);
		
		
	}
		
	
	

}
