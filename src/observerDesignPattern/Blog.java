package observerDesignPattern;

import java.util.ArrayList;
import java.util.List;

public class Blog implements Subject{

	
	private List<Observer> observers;
	private String message;
	private boolean statechanged;
	public List<String> articles; 
	
	
	public Blog() {
		observers = new ArrayList<>();
		articles = new ArrayList<>();
	}
	@Override
	public void registerObserver(Observer observer) {
		this.observers.add(observer);	
	}

	@Override
	public void notifyObserver() {
		if(statechanged) {
			for(Observer o : observers) {
				o.update();
			} 
			articles.add(this.message);
		}
		
	}

	@Override
	public void unRegisterObserver(Observer observer) {
		this.observers.add(observer);
		
	}

	@Override
	public Object getUpdate() {
		return this.message; 
	}
	
	public void postNewArticle(String message) {
		this.statechanged =  true;
		this.message =  message;
		notifyObserver();
	}
	
	@Override
	public List<String> getALLArticles(Observer o) {
		if(observers.contains(o)) {
			return articles;
		} 
		return null;
		
	}
	
	

}
