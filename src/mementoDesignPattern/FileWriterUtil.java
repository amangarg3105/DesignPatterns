package mementoDesignPattern;

public class FileWriterUtil {
	private String fileName;
	private StringBuilder content;

	public FileWriterUtil(String file) {
		this.fileName = file;
		this.content = new StringBuilder();
	}

	 Memento save() {
		return new Memento(fileName, content);
	}

	public void write(String str) {
		content.append(str);
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.content.toString();
	}

	 void undoLastToSave(Object obj) {
		Memento memento = (Memento) obj;
		this.fileName = memento.filename;
		this.content = memento.content;
	}

	private class Memento {
		private String filename;
		private StringBuilder content;

		public Memento(String filename, StringBuilder content) {
			this.filename = filename;
			this.content = new StringBuilder(content);
		}

	}

}
