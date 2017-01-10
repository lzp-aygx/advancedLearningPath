package study.jdk;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;

/**
 * Created by lizhupeng on 2016/7/18.
 */
public class SocketClient {
    public static void main(String[] args) {
        try{
            while (true) {
                //创建客户端socket,并且只想对应的服务器和端口
                Socket socketClient = new Socket("127.0.0.1", 9999);
                OutputStream outputStream = socketClient.getOutputStream();
                //使用Scanner
                Scanner scanner = new Scanner(System.in);
                outputStream.write(scanner.nextLine().getBytes());
                InputStream input = socketClient.getInputStream();
                byte[] buf = new byte[1024];
                int len = input.read(buf);
                String result = new String(buf, 0, len);
                System.out.println(result);
            }
        }catch(Exception e){
            System.out.println(e);
        }

    }
}
