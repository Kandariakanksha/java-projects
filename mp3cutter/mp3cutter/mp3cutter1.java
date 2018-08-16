package mp3cutter;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.DataInputStream;
public class mp3cutter1 {
	public static void main(String[] at)
	{
		try
		{
			File f=new File("C:\\Users\\2016\\Downloads\\Music\\gautam.m4a");
			FileInputStream fis=new FileInputStream(f);
			int k;
			int count=0;
			int len=(int) f.length();
			File f1=new File("D:\\1st.m4a");
			FileOutputStream fos1=new FileOutputStream(f1);
			File f2=new File("D:\\2nd.m4a");
			FileOutputStream fos2=new FileOutputStream(f2);
			while((k=fis.read())!=-1)
			{
			if(count<=len/2)
			{
				fos1.write(k);
				count++;
			}
			else
			{
				fos2.write(k);
				count++;
			}
			}
			System.out.println("two files created");
		}
		catch(Exception e)
		{
		System.out.print(e);	
		}

	}
}
