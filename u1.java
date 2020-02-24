import java.util.*;

import new_pack.myPack;
public class u1 {
	public static void main(String args[])
	{
		int ch;
		Scanner key = new Scanner(System.in);
		System.out.println("1)binary 2)decimal");
		ch = Integer.parseInt(key.nextLine());
		myPack obj1 = new myPack();
		obj1.getVal1();
		obj1.getVal2();
		if(ch==1)
		obj1.add_bin();
		else if (ch==2)
		obj1.add_deci();
	
	}
}
