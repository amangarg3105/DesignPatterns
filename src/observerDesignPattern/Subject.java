package observerDesignPattern;

import java.util.List;

public interface Subject {
	public void registerObserver(Observer observer);

	public void notifyObserver();

	public void unRegisterObserver(Observer observer);

	public Object getUpdate();
	
	public List<String> getALLArticles(Observer o);
}
