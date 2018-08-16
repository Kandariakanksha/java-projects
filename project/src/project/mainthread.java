package project;
import java.io.*;
import java.net.Socket;
public class mainthread extends Thread{
DataInputStream dis=null;
mainthread(Socket s)
{
	try
	{
		dis=new DataInputStream(s.getInputStream());
	}
	catch(Exception e)
	{
		System.out.println(e);
	}
}
public void run()
{
	try
	{
		do
		{
			System.out.println("Server:" + dis.readUTF());
		}
		while(true);
	}
	catch(Exception e)
	{
		System.out.println(e);
	}
	finally
	{
		try
		{
			dis.close();
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
	}
}
}
