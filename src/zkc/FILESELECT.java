package zkc;
import java.io.*;
public class FILESELECT {
public static void main(String agrs[]) {
	try {
		File f=new File("C:\\Windows\\");
		File files[]=f.listFiles();
		for(File f1:files) {
			if(f1.isDirectory()) {
				System.out.println("文件夹的名字是:"+f1.getName());
			}
			else if(f1.isFile()) {
				System.out.println("文件的名字是:"+f1.getName());
			}
		}
	} catch (Exception e) {
		// TODO: handle exception
		e.printStackTrace();
	}
}
}
