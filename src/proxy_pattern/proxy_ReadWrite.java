package proxy_pattern;

public class proxy_ReadWrite implements SubjectInterface {

	@Override
	public String getContent() {
		// TODO Auto-generated method stub
		Text proxyText2 = new Text();
		
		return proxyText2.getContent();
	}

	@Override
	public void setContent(String newContent) {
		// TODO Auto-generated method stub
		Text proxyText2 = new Text();
		proxyText2.setContent(newContent);
	}

}
