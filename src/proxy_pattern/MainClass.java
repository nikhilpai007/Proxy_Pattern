package proxy_pattern;

public class MainClass {
	public static void main(String[] args){
		SubjectInterface proxy = new proxy_ReadOnly();
		System.out.println( proxy.getContent());
		

		
	}

}