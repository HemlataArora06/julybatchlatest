package Package1;

public class test2 {
	public int sum(int a , int b)
	{
		int c ;
		c = a+b;
		System.out.println("result of sum" +c);	
		return c ;
		
	}
	public int sub(int x , int y)
	{
		int z ;
		 z = x-y;
		System.out.println("result of sub " +z);
		return z;
		
		
	}
	public int multi(int s, int r)
	{
		int t ;
		 t = s*r;
		System.out.println("result of multi"+t);
		return t;
		
	}
public void div(int f, int g)
{
	int result ;
	result = f/g;
	System.out.println("final result is "+ result);
}
     public static void main(String[] args)
{
	test2 ob = new test2();
	int sumresult1 = ob.sum(10,2);
	int sumresult2=ob.sum(sumresult1,2);
	int subresult=ob.sub(sumresult2,2);
	int multiresult=ob.multi(subresult,2);
	ob.div(multiresult,2);
	
		
	
}
}
