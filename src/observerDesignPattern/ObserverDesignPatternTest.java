package observerDesignPattern;
/*
 * n observer design pattern multiple observer objects registers with a subject for change notification. When the state of subject 
 * changes, it notifies the observers. Objects that listen or watch for change are called observers and the object that is being 
 * watched for is called subject.
 * 
 * Let us take a blog and subscriber example for observer design pattern sample implementation. Assume that there is a blog and 
 * users register to that blog for update. When a new article is posted in the blog, it will send update to the registered users 
 * saying a new article is posted. Then the user will access the blog and read the new article posted. In this example, blog is
 *  the subject and user is the observer
 */
public class ObserverDesignPatternTest {
	
	public static void main(String[] args) {
		Blog blog = new Blog();
		User user1 = new User();
		User user2 = new User();
		blog.registerObserver(user1);
		blog.registerObserver(user2);
		user1.setSubject(blog);
		user2.setSubject(blog);
		
		
		System.out.println(user1.getArticle());	
		blog.postNewArticle("This is our first post");
		
		System.out.println(user1.getArticle());
		
		User user3 = new User();
//		user3.setSubject(blog);
//		blog.registerObserver(user3);
		System.out.println(user3.getArticle());
		
		blog.postNewArticle("This is our second Article for new Users");
		
		System.out.println(user3.getArticle());
		
		System.out.println(user3.getAllArticles(blog));
	}

}
