package proxy_pattern;

public class proxy_WriteOnly implements SubjectInterface {

	@Override
	public String getContent() {
		// TODO Auto-generated method stub

		return null;
	}

	@Override
	public void setContent(String newContent) {
		// TODO Auto-generated method stub
		Text proxyText1 = new Text();
		proxyText1.setContent(newContent);
		
	}

}
