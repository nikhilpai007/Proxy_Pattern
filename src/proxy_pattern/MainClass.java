package proxy_pattern;

public class MainClass {
	public static void main(String[] args){
		
		//  Read Only 
		System.out.println(":::::: Read Only Content ::::::");
		SubjectInterface proxy = new proxy_ReadOnly();
		System.out.println( proxy.getContent());
		
		//  Write Only
		System.out.println("\n :::::: Write Only Content ::::::");
		SubjectInterface proxy1 = new proxy_WriteOnly();
		proxy1.setContent("Hello,Earth!");
		
		//  Read/Write 		
		System.out.println("\n :::::: Read/Write Content ::::::");
		SubjectInterface proxy2 = new proxy_ReadWrite();
		proxy2.setContent("Hello,World!");
		System.out.println(proxy2.getContent());
	}

}