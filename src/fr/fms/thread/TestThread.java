package fr.fms.thread;


/*
 *@author PastorGuillaume
 *@since Jeudi 23 Février 2023
 *@params Exos Thread
 */
 // Exercice 2.1 : Reprenez la classe TestThread et modifier là pour obtenir qqchose qui
// ressemble au résultat suivant.


public class TestThread extends Thread {
	
	public TestThread(String name) {
		
		super(name);
	}
	
	public void run() {
		for(int i = 0; i < 5; i++) {
			System.out.print(this.getName());	
		}
		System.out.println();	
	}
		
	public static void main(String[] args) {
		TestThread t = new TestThread("A");
		TestThread t1 = new TestThread("---- hello ----");
		TestThread t2 = new TestThread(" --- 1 --- ");
		TestThread t3 = new TestThread(" -- salut -- ");
		TestThread t4 = new TestThread(" -- java -- ");
		t.start();
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		
		
	}

}
