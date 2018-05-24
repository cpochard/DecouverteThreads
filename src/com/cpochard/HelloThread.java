package com.cpochard;

//Je crée une classe HelloThread dérivée de la classe Thread (déja connue par JAVA) grace à extends
public class HelloThread extends Thread {
	
	int compteur = 0;
	
	// On utilise un construteur pour créer un objet à partir de la classe
	// HelloThread
	public HelloThread() {
		// On récupère tout ce qu'il y a dans Thread (propriétés, fonctions...et
		// l'injecte
		// dans HelloThread
		super("HelloThread");
	}
	// fonction publique qui permet de démarrer qui ne renvoie rien (car void)
	public void run() {
		/*while (true) {
		System.out.println("Super HelloThread" + compteur);
		//Pour qu'a chaque fois qu'on rentre dans la boucle le compteur augmente de 100
		compteur+=100;
		//this permet d'accéder à toutes les variables, constantes...de la classe dans laquelle on se trouve
		//Ici on veut mettre le programme en pause de la durée du compteur (attention temps en millisecondes)
		try {
			this.sleep(compteur);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}*/
		
		System.out.println("Super HelloThread" + compteur);
}
}
