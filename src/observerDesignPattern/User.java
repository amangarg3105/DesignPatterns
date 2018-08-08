package observerDesignPattern;

import java.util.List;

public class User implements Observer {

	private Subject subject;
	private String article;
	
	
	@Override
	public void update() {
		this.article = (String) subject.getUpdate();
		
	}

	@Override
	public void setSubject(Subject blog) {
	this.subject =blog;
	this.article = "No New Article";
		
	}
	
	
	public String getArticle() {
		return article;
	}

	
	public List<String> getAllArticles(Blog b) {
		
		if(b.getALLArticles(this) == null) {
			System.out.println("No Articles present at this time");
			return null;
		}
		return b.articles;
	}
}
