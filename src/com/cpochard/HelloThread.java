package com.cpochard;

//Je cr�e une classe HelloThread d�riv�e de la classe Thread (d�ja connue par JAVA) grace � extends
public class HelloThread extends Thread {
	
	int compteur = 0;
	
	// On utilise un construteur pour cr�er un objet � partir de la classe
	// HelloThread
	public HelloThread() {
		// On r�cup�re tout ce qu'il y a dans Thread (propri�t�s, fonctions...et
		// l'injecte
		// dans HelloThread
		super("HelloThread");
	}
	// fonction publique qui permet de d�marrer qui ne renvoie rien (car void)
	public void run() {
		/*while (true) {
		System.out.println("Super HelloThread" + compteur);
		//Pour qu'a chaque fois qu'on rentre dans la boucle le compteur augmente de 100
		compteur+=100;
		//this permet d'acc�der � toutes les variables, constantes...de la classe dans laquelle on se trouve
		//Ici on veut mettre le programme en pause de la dur�e du compteur (attention temps en millisecondes)
		try {
			this.sleep(compteur);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}*/
		
		System.out.println("Super HelloThread" + compteur);
}
}
