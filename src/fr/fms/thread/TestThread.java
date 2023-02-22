package fr.fms.thread;

 // Exercice 2.1 : Reprenez la classe TestThread et modifier là pour obtenir qqchose qui
// ressemble au résultat suivant.


public class TestThread extends Thread {
	
	public TestThread(String name) {
		super(name);
	}
	
	public void run() {
		for(int i = 0; i < 15; i++)
			System.out.println(this.getName());
	}
	
	public static void main(String[] args) {
		TestThread t = new TestThread("-- A --");
		TestThread t1 = new TestThread("---- hello ----");
		TestThread t2 = new TestThread("--- 1 ---");
		TestThread t3 = new TestThread("-- salut --");
		t.start();
		t1.start();
		t2.start();
		t3.start();
	}

}
