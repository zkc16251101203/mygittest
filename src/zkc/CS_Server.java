package zkc;
import java.net.*;
import java.util.ArrayList;
import java.util.Map;



import java.io.*;
public class CS_Server 
{
    public static void main(String[] args) throws Exception
    {
        ServerSocket ss = new ServerSocket(1680);
        System.out.println("服务器正在等待客户端的连接请求----");
        while(true){
             Socket sk= ss.accept();
             ServerThread  st = new ServerThread(sk);
             st.start();
            
        }
    }
}

//服务器线程类
class ServerThread extends Thread
{
    Socket sk;
    public ServerThread(Socket sk){
    this.sk= sk;
    }
    public void run() {     
        BufferedReader br=null;
        try{
        br  = new BufferedReader(new InputStreamReader(sk.getInputStream()));
        String line = br.readLine();
        System.out.println("来自客户端的数据："+line);
        br.close();
        sk.close();
        }
        catch(IOException e){
            e.printStackTrace();
        }
    }
}