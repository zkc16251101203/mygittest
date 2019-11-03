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
        System.out.println("客户端已经开启----");
        PrintStream ps = new PrintStream(sk.getOutputStream());
        System.out.print("请输入需要发送到服务器的内容：");
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
