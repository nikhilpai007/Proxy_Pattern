package proxy_pattern;

public class Text implements SubjectInterface {
	private String content = "Read Test => Hello,World!" ;
	
	
	public void setContent(String newContent) {
	//	this.content = newContent;
		System.out.println("Write Test => " + newContent);
		
	}
	
	public String getContent() {
		return content;
	}
	
		
}


