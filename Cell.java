package fr.dauphine.javaavance.td3;

//2.5/
public class Cell<K> {

	//1.1/
	private Cell<K> nextCell;
	
	//2.1/
	private Object obj;
	
	
	public Cell(Object obj) {
		this.obj=obj;
		this.nextCell=null;
	}
	
	public Object getObject() {
		return obj;
	}
	
	public void setObject(Object obj) {
		this.obj = obj;
	}
	
	public Cell<K> getNextCell() {
		return nextCell;
	}
	
	public void setNextCell(Cell<K> cell) {
		this.nextCell = cell;
	}
}
