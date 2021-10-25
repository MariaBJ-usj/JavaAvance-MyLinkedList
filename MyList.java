package fr.dauphine.javaavance.td3;

//2.5/
public class MyList<K>{

	//1.2/
	private Cell<K> headCell;
	
	//1.10/
	private int cursor;
	
	public MyList() {
		this.cursor=0;
		this.headCell=null;
	}

	//1.3/
	public void add(Object obj) {
		if (obj==null) {
			throw new NullPointerException("Exception message");
		}
		if (this.headCell!=null) {
			Cell<K> lastCell = new Cell<K>(obj);
			lastCell.setNextCell(this.headCell);
			this.headCell=lastCell;
		}else{
			this.headCell=new Cell<K>(obj);
		}
		cursor++;
	}

	//1.7/
	public void add(Object obj, int i) {
		if (obj==null) {
			throw new NullPointerException("Exception message");
		}
		Cell<K> cellToPutAfter=this.headCell;
		for (int j = 0; j < i; j++) {
			cellToPutAfter=cellToPutAfter.getNextCell();
		}
		Cell<K> nextCell=cellToPutAfter.getNextCell();
		cellToPutAfter.setNextCell(new Cell<K>(obj));
		cellToPutAfter.getNextCell().setNextCell(nextCell);
		cursor++;
	}

	//1.4/
	public int size() {
		return cursor;
	}

	//1.6/
	public void addLast(Object obj) {
		if (obj==null) {
			throw new NullPointerException("Object cannot be null");
		}
		if (this.headCell==null) {
			this.headCell=new Cell<K>(obj);
			this.cursor++;
		}else {
			Cell<K> currentCell=this.headCell;
			while (currentCell.getNextCell()!=null) {
				currentCell=currentCell.getNextCell();
			}
			currentCell.setNextCell(new Cell<K>(obj));
			this.cursor++;
		}
	}

	//1.5/
	@Override
	public String toString() {
		String listString=this.headCell.getObject().toString();
		Cell<K> cell=this.headCell;
		while (cell.getNextCell()!=null) {
			cell=cell.getNextCell();
			listString+=", "+cell.getObject().toString();
		}
		return listString;
	}

	//1.9/
	public Object get(int index) {
		Cell<K> cellString=this.headCell;
		boolean error=true;
		Object myReturn;
		if (index<(this.cursor) && index>=0) {
			error=false;
			for (int j = 0; j < index; j++) {
				cellString=cellString.getNextCell();
			}
		}

		if (error) {
			throw new IllegalArgumentException("This index is Invalid");
		}else {
			myReturn=cellString.getObject();
		}
		return myReturn.toString();
	}

	//1.11/
	public int sumLetters() {
		String letters=this.headCell.getObject().toString();
		Cell<K> cell=this.headCell;
		while (cell.getNextCell()!=null) {
			cell=cell.getNextCell();
			letters+=cell.getObject().toString();
		}
		return letters.length();
	}
	//2.4/Il faut ajouter un toString() pour que l'objet soit changé en string afin de faire la somme de ses lettres
	
	//2.2/
	public boolean contains(Object obj) {
		Cell<K> cellObj = this.headCell;
		for (int j = 0; j < this.cursor; j++) {
			if (cellObj.getObject()==obj) {
				return true;
			}
			cellObj=cellObj.getNextCell();
		}
		return false;
	}
}
