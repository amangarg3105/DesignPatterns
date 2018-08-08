package mementoDesignPattern;

/*
 * Memento pattern is a behavioral design pattern. Memento pattern is used to restore state of an object to a previous state. As your application is progressing, you may want 
 * to save checkpoints in your application and restore back to those checkpoints later.
 * 
 * One of the best real life example is the text editors where we can save it’s data anytime and use undo to restore it to previous saved state.

   We will implement the same feature and provide a utility where we can write and save contents to a File anytime and we can restore it to last saved state.
 */

public class FileWriterClient {

	public static void main(String[] args) {
		CareTaker caretaker = new CareTaker();

		FileWriterUtil fileWriter = new FileWriterUtil("data.txt");
		fileWriter.write("First Set of Data\n");
		System.out.println(fileWriter + "\n\n");

		// lets save the file
		caretaker.save(fileWriter);
		// now write something else
		fileWriter.write("Second Set of Data\n");

		// checking file contents
		System.out.println(fileWriter + "\n\n");

		// lets undo to last save
		caretaker.undo(fileWriter);

		// checking file content again
		System.out.println(fileWriter + "\n\n");

	}

}
