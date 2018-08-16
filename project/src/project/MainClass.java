package project;
import java.util.Scanner;


import java.io.*;
import java.net.*;
public class MainClass{
public static void main(String[] at)
{
	Scanner sc=new Scanner(System.in);
	String sc1;
	try
	{
	Socket s=new Socket("localhost",1292);
	DataOutputStream dos=new DataOutputStream(s.getOutputStream());
	//DataInputStream dis=new DataInputStream(s.getInputStream());
	mainthread m=new mainthread(s);
	m.start();
	while(true)
	{
	sc1=sc.nextLine();	
	dos.writeUTF(sc1);
//	System.out.print(dis.readUTF());
	}
	}
	catch(Exception e)
	{
		System.out.print(e);
	}
	//System.exit(0);(to exit through program in java.)

}
}
