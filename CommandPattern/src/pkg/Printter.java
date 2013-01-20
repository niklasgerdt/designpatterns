package pkg;

import java.util.ArrayList;

public class Printter {
	private ArrayList<Print> prints;
	
	public Printter(){
		prints = new ArrayList<Print>();
	}
	
	public void addPrint(Print print){
		prints.add(print);
	}
	
	public void print(){
		for (Print p : prints){
			p.print();
		}
	}
}
