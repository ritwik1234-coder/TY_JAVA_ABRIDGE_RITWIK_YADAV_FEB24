package com.capgemini.assignments.arraydouble;

public class TestB {

	public static void main(String[] args) {
		Item[] item=new Item[2];
		Item e1=new Item(101,"Oreo");
		Item e2=new Item(102,"Sunfeast");
		item[0]=e1;
		item[1]=e2;
		printItemDetails(item);
		Item itm[]=getitems();
		printItemDetails(itm);
		
	}
	private static void printItemDetails(Item[] item) {
		for (int i = 0; i < item.length; i++) {
			System.out.println("Price-"+item[i].price);
			System.out.println("Name-"+item[i].name);
			System.out.println("************************************");
		}
	}
	static Item[] getitems() {
		Item[] item= new Item[2];
		Item e1=new Item(114,"Parle-g");
		Item e2=new Item(124,"Glucose biscuit");
		item[0]=e1;
		item[1]=e2;
		return item;
	}
}
