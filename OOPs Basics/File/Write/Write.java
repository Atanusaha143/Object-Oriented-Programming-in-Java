import java.io.*;
import java.util.*;

public class Write
{
	public void Writing(String s)
	{
		try
		{
			Scanner cin = new Scanner(System.in);
			
			File txtFile = new File("C:/Users/Dell/Desktop/Java/OOPs Basics/File/Write/WriteInFile.txt");
			txtFile.createNewFile();
			
			FileWriter writer;
			
			writer = new FileWriter(txtFile, true);
	
			writer.write(s+"\r\n");
			
			writer.flush();
			writer.close();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}