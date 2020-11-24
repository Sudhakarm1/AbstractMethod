package org.jsp.Assingment2;
import java.util.Scanner;
public class MainMethod 
{
	public static void main(String[] args) 
	{
		Scanner Sc=new Scanner(System.in);
		while(true)
		{
		System.out.println("Enter Your DATABASE");
		System.out.println("1.Oracle");
		System.out.println("2.SQLServer");
		System.out.println("3.MySql");
		int Num=Sc.nextInt();
		switch(Num)
		{
		case 1:
			Oracle Or=new Oracle();
			Or.Connect();
			Or.DisConnect();
			break;
		case 2:
			SQLServer Sq=new SQLServer();
			Sq.Connect();
			Sq.DisConnect();
			break;
		case 3:
			MySql Ms=new MySql();
			Ms.Connect();
			Ms.DisConnect();
			break;
		default:
			System.out.println("Enter Your Valid DATABASE");
		}
	   }
	}
}
