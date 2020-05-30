package prog.soc;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;

public class ClientSocket {
	public static void main(String[] args) throws Exception{
		
		int port=9997;
		String ip="localhost";
		String name="Rahul";
		
		
		Socket socket = new Socket(ip,port);
		
		OutputStreamWriter sWriter = new OutputStreamWriter(socket.getOutputStream());
		PrintWriter pWriter = new PrintWriter(sWriter);
		pWriter.println(name);
		pWriter.flush();
		
		InputStreamReader in = new InputStreamReader(socket.getInputStream());
		BufferedReader reader = new BufferedReader(in);
		String surname = reader.readLine();
		System.out.println("Client: "+surname);
		
		sWriter.close();
		pWriter.close();
		socket.close();
	}
}
