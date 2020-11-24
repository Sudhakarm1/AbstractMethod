package org.jsp.assingment;
import java.util.Scanner;
public class MainMethod 
{
	public static void main(String[] args) 
	{
		Scanner Sc=new Scanner(System.in);
		while(true)
		{
		System.out.println("Enter Your Choice");
		System.out.println("1.Chrome");
		System.out.println("2.Opera");
		System.out.println("3.Safari");
		int Num=Sc.nextInt();
		switch(Num)
		{
		case 1:
			Chrome Ch=new Chrome();
			Ch.strat();
			Ch.stop();
			break;
		case 2:
			Opera Op=new Opera();
			Op.strat();
			Op.stop();
			break;
		case 3:
			Safari Sa=new Safari();
			Sa.strat();
			Sa.stop();
			break;
		default:
			System.out.println("Enter Your Valid Choice");
		}
		}
	}
}
