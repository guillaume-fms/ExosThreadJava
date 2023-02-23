package fr.fms.thread;
/*
 *@author PastorGuillaume
 *@since Jeudi 23 Février 2023
 *@params Exos Thread
 */
// Exercice 2.2 : Modifier maintenant TestRunnable afin d’obtenir
// ceci.

public class TestRunnable implements Runnable {

	public static void main(String[] args){
		String [] str = {
				"!*!",
				"'**'",
				"#***#",
				"$****$",
				"%*****%",
				"'*******'",
				"(********",
				")*********)",
				"************"};
				
		
        for (String i: str) {
            System.out.println(i);
        }
		
	}

	@Override
	public void run() {
		for(int i = 0; i < 10; i++) {
			System.out.println(this.toString());
		}

	}
}
