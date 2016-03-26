import java.net.InetAddress;

import java.net.UnknownHostException;

public class NetTool {
	InetAddress myIPaddress = null;
	InetAddress myServer = null;

	public static void main(String[] args) {
		NetTool mytool;
		mytool = new NetTool();
		String url;
		if (args.length > 0) {
			url = args[0];
		} else {
			url = "www.baidu.com";
		}
		System.out.println("My host IP is: " + mytool.getMyIP());
		System.out.println("The Server IP is :" + mytool.getServerIP(url));

	}

	// 取得LOCALHOST的IP地址
	public InetAddress getMyIP() {
		try {
			myIPaddress = InetAddress.getLocalHost();
		} catch (UnknownHostException e) {
		}
		return (myIPaddress);
	}

	// 取得 www.baidu.com 的IP地址
	public InetAddress getServerIP(String url) {
		try {
			myServer = InetAddress.getByName(url);
		} catch (UnknownHostException e) {
		}
		return (myServer);
	}
}