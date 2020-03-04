package Assesment2;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.*;

public class Writer implements Runnable
{
	@Override
	public void run() 
	{
		synchronized (this) 
		{
			while(true)
			{
				try 
				{
					read();
				}
				catch (IOException e) 
				{
					System.out.println(e);
					
				} 
				catch (InterruptedException e) 
				{
					e.printStackTrace();
				}
			}
		}
	}
	public void read() throws IOException, InterruptedException
	{
		File file = new File("abc.txt");
		FileOutputStream fos = new FileOutputStream(file, true);

		Date date = new Date();
		DateFormat dateFormat = new SimpleDateFormat("yyyy-mm-dd hh:mm:ss");
        String s = dateFormat.format(date);
        fos.write(s .getBytes());
		System.out.println("File write is done");
		file.delete();
        Thread.sleep(10000);
		fos.close();
	}
}
