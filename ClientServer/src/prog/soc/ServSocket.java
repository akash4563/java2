package prog.soc;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class ServSocket {
	public static void main(String[] args) throws Exception{
		System.out.println("Server : Server has started");
		ServerSocket serverSocket = new ServerSocket(9997);
		System.out.println("Server : Server has started listening");
		Socket socket = serverSocket.accept();
		System.out.println("Server : Client has connected");
		
		InputStreamReader in = new InputStreamReader(socket.getInputStream());
		BufferedReader reader = new BufferedReader(in);
		String str = reader.readLine();
		
		System.out.println("Server: " + str);
		String surname = "dravid";
		
		OutputStreamWriter sWriter = new OutputStreamWriter(socket.getOutputStream());
		PrintWriter pWriter = new PrintWriter(sWriter);
		pWriter.println(surname);
		pWriter.flush();; 
		serverSocket.close();
		
	}
}
