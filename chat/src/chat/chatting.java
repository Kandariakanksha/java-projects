package chat;
import java.net.*;
import java.io.*;
import java.util.Scanner;
public class chatting 
{
	private static URL rxUrl, txUrl;
	private static URLConnection rxUrlConnection, txUrlConnection;
	private static InputStream inputData, respCode;
	private static Scanner sc;
	public static void main(String[] args) 
	{
		sc = new Scanner(System.in);
		Thread t = new Thread(new Runnable()
		{
			public void run()
			{
				String oldMsg = "";
				while (true)
				{
					try
					{
						rxUrl = new URL("http://localhost/getMsg.php");
						rxUrlConnection = rxUrl.openConnection();
						inputData = rxUrlConnection.getInputStream();
						int ch;
						String newMsg = "";
						while ((ch = inputData.read()) != -1)
							newMsg = newMsg + (char)ch;
						if (!oldMsg.trim().equals(newMsg.trim()))
						{
							System.out.println("Received: " + newMsg.trim());
							oldMsg = newMsg.trim();
						}
					}catch(Exception e) {System.out.println(e);}
				}
			}
		});t.start();
		
		while (true)
		{
			String myMsg = sc.nextLine();
			String [] breakData = myMsg.split(" ");
			String finalMsg = "";
			for (int i = 0; i <= breakData.length - 1; i++)
				finalMsg = finalMsg + breakData[i] + "%20";
			try
			{
				txUrl = new URL("http://localhost/setMsg.php?msg=" + finalMsg.trim());
				txUrlConnection = txUrl.openConnection();
				txUrlConnection.setDoOutput(true);
				respCode = txUrlConnection.getInputStream();
			}catch(Exception e){System.out.println(e);}
		}
	}
}