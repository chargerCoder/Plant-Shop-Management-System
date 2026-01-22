package Entity;
import java.lang.*;
import java.io.*; 
import javax.swing.*; 
public class DataStore
{
	private String s1, s2, s3, s4, s5, s6, s7;
	private double s8;
	
	private File file;
	private FileWriter fwriter;
	
	public DataStore() { }
	public DataStore(String s1, String s2, String s3, String s4, String s5, String s6, String s7, double s8)
	{
		this.s1 = s1;
		this.s2 = s2;
		this.s3 = s3;
		this.s4 = s4;
		this.s5 = s5;
		this.s6 = s6;
		this.s7 = s7;
		this.s8 = s8;
	}	

	public void insertAllInfo()
	{
		try 
		{
			file = new File("./Data/userdata.txt");
			
			if(!file.exists())
			{
				file.getParentFile().mkdirs();
				file.createNewFile();
			}
			
			fwriter = new FileWriter(file, true);
			fwriter.write("========================================\n");
			fwriter.write("User " + s5 +"\n\n");
			fwriter.write("Name: "+s1+"\n");
			fwriter.write("Division: "+s2+"\n");
			fwriter.write("Skill level: "+s3+"\n");
			fwriter.write("Contact: "+s4+"\n");
			fwriter.write("Plant name: "+s6+"\n");
			fwriter.write("Quantity: "+s7+"\n");
			fwriter.write("Total Price: "+s8+"\n");
			fwriter.write("========================================\n");
			
			fwriter.flush();
			fwriter.close();
		}
		catch(IOException ioe)
		{
			ioe.printStackTrace();
			JOptionPane.showMessageDialog(null,"Error occcurs");
		}
	}
}