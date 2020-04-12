import java.io.File;

public class Create
{
	public static void main (String args[])
	{
		// Creating Folder
		File IO = new File("C:/Users/Dell/Desktop/IO");
		
		IO.mkdir(); // creates file at that specific location;
		
		String FolderPath = IO.getAbsolutePath(); // returns path 
		System.out.println("Path of the file: "+FolderPath);
		
		String FileName = IO.getName(); // returns file name
		System.out.println("File Name: "+FileName);
		
		// IO.delete(); // delete and returns
		
		// Creating File
		
		File file1 = new File(FolderPath+"/file1.txt"); // creating file into created folder IO
		File file2 = new File(FolderPath+"/file2.txt"); // creating another file into created folder IO
		
		try
		{
			file1.createNewFile(); // creates file
			file2.createNewFile();
			System.out.println("Files are created");
		}
		catch(Exception e)
		{
			System.out.println("Exception Occures\n Reason: "+e);
		}
		
		if(file1.exists()) System.out.println(file1.getName()+" exixts"); // .exists() returns true/false
		else System.out.println(file1.getName()+" doestn't exist");
	}
}