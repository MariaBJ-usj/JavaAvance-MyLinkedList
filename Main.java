package fr.dauphine.javaavance.td3;

public class Main {
	
	//1.8/
	public static void main(String[] args) {
		MyList ml = new MyList();
		ml.addLast("tatu");
		ml.add("toto");
		ml.add("titi");
		ml.addLast("tutu");
		
		//2.3/
		ml.add(12);
		
		System.out.println(ml.toString());
		System.out.println(ml.size());
		System.out.println(ml.get(3));
		System.out.println(ml.sumLetters());
	}
}
