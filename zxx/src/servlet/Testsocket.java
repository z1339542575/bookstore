package servlet;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class Testsocket {
	
	public static void main(String[] args) throws Exception, IOException {
		
		Socket socket =new Socket("10.0.5.9",9990);
		
		OutputStream out = socket.getOutputStream();
		InputStream in = socket.getInputStream();
		
		byte[] b = new byte[1024];
		
		in.read(b);
		for(int i = 0; i < b.length;i++){
			
			System.out.println((char)b[i]);
		}
		out.write("²âÊÔ".getBytes());
		in.close();
		
		
	} 
}
