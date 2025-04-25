package week4.day1;

public class JavaConnection implements DatabseConnection {
	public void connect() {
		System.out.println("Connected successfully");		
	}
	public void disconnect(){
		System.out.println("Disconnected successfully");		
	}
	public void executeUpdate(){
		System.out.println("Excute updated successfully");		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JavaConnection connect = new JavaConnection();
		connect.connect();
		connect.disconnect();
		connect.executeUpdate();
		
		

	}

}
