package project2;

import java.io.DataInputStream;
import java.io.IOException;
import java.net.Socket;

public class serverthread extends Thread{
	DataInputStream dis=null;
	serverthread(Socket s)
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
				System.out.println("client:" + dis.readUTF());
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
