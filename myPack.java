package new_pack;

import java.util.*;

public class myPack{
	public int val1;
	public int val2;
	public String s1;
	Scanner key = new Scanner(System.in);
	public int getVal1()
	{
		System.out.println("Enter the first value");
		val1 = Integer.parseInt(key.nextLine());
		return val1;
	}
	public int getVal2()
	{
		//Scanner key = new Scanner(System.in);
		System.out.println("Enter the Second value");
		val2 = Integer.parseInt(key.nextLine());
		return val2;
	}
	public void add_deci() {
		
		//myPack n1 = new myPack();
		//int v1=n1.getVal1();
		//int v2=n1.getVal2();
		int v3=val1+val2;
		System.out.println("Result after decimal addition is :" + v3);
	}
	public void add_bin(){
		int[] sum1 = new int[20];
		int i=0;
		int carry=0;
		
		// TODO Auto-generated method stub
		//myPack n1 = new myPack();
		//int val1=n1.getVal1();
		//int val2=n1.getVal2();

		while (val1 != 0 || val2 != 0) 
		{
			sum1[i++] = (int)((val1 % 10 + val2 % 10 + carry) % 2);
			carry = (int)((val1 % 10 + val2 % 10 + carry) / 2);
			val1 = val1 / 10;
			val2 = val2 / 10;
		}
		if (carry != 0) {
			sum1[i++] = carry;
		}
		--i;
		System.out.println("Result after binary addition is :");
		while (i >= 0) {
			 System.out.print(sum1[i--]);
		}

	
}
	}




