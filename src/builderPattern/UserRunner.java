package builderPattern;

/*Let’s discuss a common problem in our application. In any user management module, primary entity is User, 
let’s say. Ideally and practically as well, once a user object is fully created, you will not want to change it’s state. 
It simply does not make sense, right? Now, let’s assume, our User object has following 5 attributes i.e. firstName, 
lastName, age, phone and address.*/

/*In normal practice, if you want to make a immutable User class,
then you must pass all five information as parameters to constructor. It will look like this:
	
	public User (String firstName, String lastName, int age, String phone, String address){
    this.firstName = firstName;
    this.lastName = lastName;
    this.age = age;
    this.phone = phone;
    this.address = address;
}*/

/*
 * Very good. Now what if only firstName and lastName are mandatory and rest 3 fields are optional.
 *  Problem !! We need more constructors.
 *  public User (String firstName, String lastName, int age, String phone){ ... }
public User (String firstName, String lastName, String phone, String address){ ...  }
public User (String firstName, String lastName, int age){ ...   }
public User (String firstName, String lastName){ ...    }

We will need some more like above. Still can manage? Now let’s introduce our sixth attribute i.e. salary. Now it is problem.

One way it to create more constructors, and another is to loose the immutability and introduce setter methods. 
You choose any of both options, you loose something, right?

Here, builder pattern will help you to consume additional attributes while retaining the immutability of Use class.
 */


public class UserRunner {

	public static void main(String[] args) {

		User user = new User.UserBuilder("aman", "garg").build();
		System.out.println(user);

		User user1 = new User.UserBuilder("aman", "garg").age(22).build();
		System.out.println(user1);
	}

}
