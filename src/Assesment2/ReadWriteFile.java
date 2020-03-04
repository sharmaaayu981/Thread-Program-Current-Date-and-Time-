package Assesment2;

public class ReadWriteFile 
{
	public void readWrite() 
	{
		Thread w = new Thread(new Writer());
		Thread r =new  Thread(new Reader());
		w.start();
		r.start();
		
	}
}
