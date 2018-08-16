package mp3cutter;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.DataInputStream;
public class mergemp3 {
	public static void main(String[] at)
	{
		try
		{
			File f=new File("D:\\completesong.m4a");
			File f1=new File("D:\\1st.m4a");
			FileInputStream fis1=new FileInputStream(f1);
			File f2=new File("D:\\2nd.m4a");
			FileInputStream fis2=new FileInputStream(f2);
			int k,m;
			int count=0;
			//int len1=(int) f1.length();
			//int len2=(int) f2.length();
			FileOutputStream fos=new FileOutputStream(f);
			while((k=fis1.read())!=-1)
			{
	        	fos.write(k);		
			
			}
			while((m=fis2.read())!=-1)
			{
	        	fos.write(m);		
			
			}
			System.out.println("file merged");
		}
		catch(Exception e)
		{
		System.out.print(e);	
		}

	}
}
