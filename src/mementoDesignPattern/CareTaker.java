package mementoDesignPattern;

public class CareTaker {
	
    Object object;
    
    
    public void save(FileWriterUtil fileWriterUtil) {
    	this.object = fileWriterUtil.save();
    }
    
    public void undo(FileWriterUtil fileWriter){
		fileWriter.undoLastToSave(object);
	}
}
