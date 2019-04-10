package Files;
import java.io.*;
import java.lang.*;
import java.util.*;
public class CreatFile {
	private Formatter x;
	public void openFile()
	{
		try {
			x=new Formatter("outputfile.txt");
		}catch (Exception e) {
			// TODO: handle exception
		}
	}
	
	public void addRecords() {
		x.format("%s %s %s", "hello","new","file");
		
	}
	public void closeFile() {
		x.close();
	}
}
