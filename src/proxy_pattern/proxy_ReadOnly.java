package proxy_pattern;

public class proxy_ReadOnly implements SubjectInterface{

	@Override
	public String getContent() {
		Text proxyText = new Text();
		
		return proxyText.getContent();
	}

	@Override
	public void setContent(String newContent) {
		// TODO Auto-generated method stub
	
	}

}
