package study.jdk;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * Created by lizhupeng on 2016/7/18.
 */
public class SocketServer {
    public static void main(String[] args) throws IOException{
        //Create ServerSocket and listen on port 9999
        ServerSocket serverSocket = new ServerSocket(9999);
        Socket socket = null;
        while (true){
            //accept socket service,if no connection,the socket will waiting
            socket = serverSocket.accept();
            //accept the inputStream from socketClient
            InputStream input = socket.getInputStream();
            byte[] buf = new byte[1024];
            int len = input.read(buf);
            String result = new String(buf,0,len);
            //往服务端的socket写输出流写数据,回传到客户端的socket的输入流中
            System.out.println("The data from client: " + result);
            OutputStream output = socket.getOutputStream();
            output.write(result.toUpperCase().getBytes());
            socket.close();
        }
    }
}
