package project2;
import java.io.*;
import java.net.*;
import java.util.Scanner;
public class ServerClass {
		public static void main(String[] at)
		{
			Scanner sc=new Scanner(System.in);
			String sc1;
		try
		{
			ServerSocket ss=new ServerSocket(1292);
			Socket s=ss.accept();
			//System.out.println("Connected to: " + s.getRemoteSocketAddress());
			//DataInputStream dis=new DataInputStream(s.getInputStream());
			DataOutputStream dos=new DataOutputStream(s.getOutputStream());
			serverthread t=new serverthread(s);
		    t.start();
			while(true)
			{
			//System.out.print(dis.readUTF());
			sc1=sc.nextLine();	
			dos.writeUTF(sc1);
			}
		}
		catch(Exception e)
		{
			System.out.print(e);
		}
		}
	}
