package com.cpochard;

public class Program {

	public static void main(String[] args) {
		HelloThread timer = new HelloThread();
		//Pas besoin de mettre de stop, s'arrete automatiquement une fois la tache exécutée!
		timer.start();
	}

}
