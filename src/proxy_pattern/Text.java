package proxy_pattern;

public class Text implements SubjectInterface {
	private String content = "Hello,World!" ;
	
	
	public void setContent(String newContent) {
		this.content = newContent;
		
	}
	
	public String getContent() {
		return content;
	}
	
		
}


