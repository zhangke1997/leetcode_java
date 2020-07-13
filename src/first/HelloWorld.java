package first;

public class HelloWorld {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 2;
		int[][] res =new int[2][3];
		
		System.out.print(res);
		
		Integer aaa = 2;//常量赋值 常量化 栈中常量池
		Integer aa = new Integer(2);//堆中指针对象
		Integer a2 = new Integer(2);
		aa=344;
		Integer a3 =aa;       //指针地址赋值
		System.out.println(aa == a2);
		System.out.println(a3);
		System.out.println(aa == a3);
		a2= aa;
		aa = 344;
		System.out.println(a2);
		Integer bb = aaa;
		aaa = 4;
		int b =a ;
		a=2;
		System.out.println(bb);
		
	
	}

}
