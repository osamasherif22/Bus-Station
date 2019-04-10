package Files;
import java.io.*;
import java.lang.*;
import java.util.*;
import algoritm.*;
public class ReadFile {
	private Scanner x;
	public void openFile()
	{
		try {
			x=new Scanner(new File("inputFile.txt"));
			System.out.println("jjjj");
		}catch (Exception e) {
			System.out.println("nnn");
		}
	}
	
	public void readFile(ArrayList<Trip> trpList) {
		while(x.hasNext())
		{
			Trip temp=new Trip(/*x.next(),x.next(),x.next(),x.next(),x.next(),x.next()*/);
			temp.setId(x.next());
			temp.setSource(x.next());
			temp.setDestination(x.next());
			temp.setDate(x.next());
			temp.setTime(x.next());
			temp.setNumOfSeats(Integer.valueOf(x.next()));
			temp.setDestance(x.next());
			//System.out.println(temp.getId()+" "+temp.getDate());
			trpList.add(temp);
		}
	//		
		}
	public void closeFile() {
		x.close();
	}
}
