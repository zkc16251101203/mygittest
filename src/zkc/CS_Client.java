package zkc;
import java.net.*;
import java.io.*;
import java.util.Scanner;
public class CS_Client 
{
    public static void main(String[] args) 
    {
        try{
        Socket sk =new Socket("127.0.0.1",1680);
        System.out.println("�ͻ����Ѿ�����----");
        PrintStream ps = new PrintStream(sk.getOutputStream());
        System.out.print("��������Ҫ���͵������������ݣ�");
        Scanner sn = new Scanner(System.in);
        String str = sn.nextLine();
        ps.println(str);
        ps.close();
        sk.close();
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
}
