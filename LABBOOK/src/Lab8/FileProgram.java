package Lab8;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileProgram {

	public static void main(String[] args) throws IOException, InterruptedException {
		File f=new File("File1");
		f.createNewFile();
		FileWriter f1=new FileWriter(f);
		f1.write("Capgemini is a global leader in partnering with companies to transform and "
				+ "manage their business by harnessing the power of technology."
				+ " The Group is guided everyday by its purpose of unleashing human energy through"
				+ " technology for an inclusive and sustainable future. ");
		File f2=new File("File2");
		
		
		 CopydataThread obj=new  CopydataThread(f1,f2);

	}

}
class CopydataThread extends Thread
{
	public CopydataThread(FileWriter f1,File f2) throws IOException, InterruptedException
	{
		FileReader fr=new FileReader("f1");
		int x=fr.read();
		FileWriter f=new FileWriter(f2);
		int i=0;
		while(x!=-1)
		{
			f.write((char)x);
			i++;
			if(i%10==0)
			{
				System.out.println("10 character are copied");
				sleep(500);
			}
			x=fr.read();
			}
		
		
	}
}