package prototypeDesignPattern;

import prototypeDesignPattern.PrototypeFactory.ModelType;



/*Lets understand this pattern using an example.
I am creating an entertainment application that will require instances of Movie, Album and Show classes very frequently. 
I do not want to create their instances everytime as it is costly. So, I will create their prototype instances, and everytime,
when i will need a new instance, 
I will just clone the prototype.*/

public class TestPrototypePattern {

	public static void main(String[] args) {
		
		try
        {
            Movie moviePrototype  = (Movie)PrototypeFactory.getInstance(ModelType.MOVIE);
            moviePrototype.setName("intersteller");
            System.out.println(moviePrototype.getName());
 
           /* String albumPrototype  = PrototypeFactory.getInstance(ModelType.ALBUM).toString();
            System.out.println(albumPrototype);
 
            String showPrototype  = PrototypeFactory.getInstance(ModelType.SHOW).toString();
            System.out.println(showPrototype);*/
 
        }
        catch (CloneNotSupportedException e)
        {
            e.printStackTrace();
        }

	}

}
