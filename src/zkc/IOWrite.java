package zkc;
import java.io.*;

public class IOWrite {
public static void main(String[] args) {
	File file=new File("src/A.txt");
	File file1=new File("src/B.txt");
	FileWriter fw=null;
	FileReader fr=null;
	try {
		 fw=new FileWriter(file1);
		 fr=new FileReader(file);
		char a[]=new char[100];
		int flag=-1;
		while((flag=fr.read(a))!=-1) {
			fw.write(a,0,flag);
		}
	} catch (Exception e) {
		// TODO 自动生成的 catch 块
		e.printStackTrace();
	}
	finally {
		if(fw!=null) {
			try {
				fw.close();
			} catch (IOException e) {
				// TODO 自动生成的 catch 块
				e.printStackTrace();
			}
		if(fr!=null) {
			try {
				fr.close();
			}catch (Exception e) {
				// TODO: handle exception
			}
		}
		}
	}
	
	
}
}
