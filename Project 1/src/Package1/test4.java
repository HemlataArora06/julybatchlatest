package Package1;

public class test4 {
	
		public int sum(int a, int b)
		{
			int c;
			c= a+b;
			System.out.println("result of sum"+c);
			return c;						
		}
		public int mul(int d , int e)
		{
			int f;
			f=d*e;
			System.out.println("resultof mul"+f);
			return f;			
		}
		public int sub(int g, int h)
		{
			int i;
			i=g-h;
			System.out.println("result of sub"+i);
			return i;		
			
	}
		public  int mul2(int q, int r)
		{
			int s;
			s=q*r;
			System.out.println("result of mul2"+s);
			return s;				
			
		}
		public void div(int x, int y)
		{
			int z;
			z=x/y;
			System.out.println("result of div"+z);
			
		}
		public static void main(String[] args) 
		{
			test4 ob =new test4();
			int sumresult=ob.sum(10, 2);
			int mulresult=ob.mul(sumresult, 2);
			int subresult=ob.sub(mulresult, 2);
			int mulresult2=ob.mul(subresult, 2);
			ob.div(mulresult2,2);		
			
			
		}
	

}
