package proxy_pattern;

public class proxy_ReadOnly implements SubjectInterface{

	@Override
	public String getContent() {
		Text proxyText = new Text();
		
		return proxyText.getContent();
	}

}
