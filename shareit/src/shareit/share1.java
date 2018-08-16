package shareit;
import java.io.*;
public class share1 {
public static void main(String[] at)
{
	try
	{
		File f=new File("C:\\Users\\2016\\Desktop\\ak.txt");
		FileInputStream fis=new FileInputStream(f);
		FileOutputStream fos=new FileOutputStream("D:\\ak.txt");
		int k;
		while((k=fis.read())!=-1)
		{
			System.out.print((char)k);
			fos.write(k);
		}
	}
	catch(Exception e)
	{
	System.out.print(e);	
	}
}
}
