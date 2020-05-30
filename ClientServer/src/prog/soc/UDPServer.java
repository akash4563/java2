package prog.soc;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class UDPServer {
	public static void main(String[] args)throws Exception {
		DatagramSocket ds = new DatagramSocket(9999);
		
		byte b[] =new byte[1024];
		DatagramPacket dp = new DatagramPacket(b,b.length);
		ds.receive(dp);
		
		String str=new String(dp.getData());
		int num=Integer.parseInt(str.trim());
		int i = num*num;
		
		InetAddress ia = InetAddress.getLocalHost();
		byte b1[] = String.valueOf(i).getBytes();
		DatagramPacket dp1 = new DatagramPacket(b1,b1.length,ia,dp.getPort());
		ds.send(dp1);
	}
}
