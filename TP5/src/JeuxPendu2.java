/**
* teste si le mot pris au hasard est vrai
* @return vrai mot en entré est le même
*/

import java.util.Arrays;

class JeuxPendu2 {
	void principal () {
		partie(creerDico());
	}

	/**
	* Création d’un dictionnaire de mots
	* @return dictionnaire initialisé
	*/
	String[] creerDico() {
		String dictionnaire[] = {"france","russie","allemagne","suisse"};
		return dictionnaire;
	}

	void testDico() {
		System.out.println(Arrays.toString(creerDico()));
	}

	/**
	* choix aléatoire d’un chiffre en prenant en compte la longueur du tableau de mot 
	* @return entier 
	*/
	int random() {
		int ret;
		int max = creerDico().length;
		ret = (int) ((Math.random() * (max - 0)) + 0);
		return ret;
	}

	/**
	* choix aléatoire d’un mot dans un dictionnaire 
	* @param dico dictionnaire des mots à choisir
	* @return chaine choisie de manière aléatoire
	*/
	String choisirMot (String[] dico) {
		String ret;
		int nb = random();
		ret = dico[nb];
		return ret;
	}

	void testChoisirMot() {
		int i = 1;
		int compteur = 0;
		String[] creerDico = creerDico();
		int toutMot = creerDico().length;
		while(compteur < toutMot) {
			while (creerDico[compteur] != choisirMot(creerDico)) {
				i++;
			}
			System.out.println("le mot "+ creerDico[compteur] +
			" est apparu au bout du " + i + " tours");
			compteur++;
		}
	}

	/**
	* affiche la réponse du joueur
	* @param reponse reponse du joueur
	*/
	void afficherReponse(char[] reponse) {
		for (int i = 0 ; i < reponse.length; i++) {
			System.out.print (reponse[i] + " ");
		}
		System.out.println ();
	}

	/**
    * Test de afficheReponse()
    */
	void testAfficherReponse () {
		System.out.println ();
		System.out.println ("*** testAfficherReponse()");	//"france","russie","allemagne","suisse"

		char[] reponse1 = {'f','r','a','n','c','e'};
		testCasAfficherReponse (reponse1);

		char[] reponse2 = {'r','u','s','s','i','e'};
		testCasAfficherReponse (reponse2);

		char[] reponse3 = {'a','l','l','e','m','a','g','n','e'};
		testCasAfficherReponse (reponse3);

		char[] reponse4 = {'s','u','i','s','s','e'};
		testCasAfficherReponse (reponse4);
	}

	/**
	* teste un appel à afficherReponse()
	* @param reponse tableau des réponse à afficher
	*/
	void testCasAfficherReponse (char[] reponse) {
		System.out.print ("afficherReponse (" + Arrays.toString(reponse) + ") : ");
		afficherReponse (reponse);
	}

	/**
	* création d’un tableau de reponse contenant des ’_’ 
	* @param lg longueur du tableau à créer
	* @return tableau de reponse contenant des ’_’
	*/
	char[] creerReponse(int lg) {
		char reponse[] = new char [lg];
		for (int i = 0; i < lg; i++) {
			reponse[i] = '_';
		}
		return reponse;
	}

	void testCreerReponse(){
		System.out.println(creerReponse(6));
		System.out.println(creerReponse(4));
		System.out.println(creerReponse(0));
	}

	boolean tester (String mot, char[] reponse, char car) {
		boolean rep = false;
		for (int i = 0; i < mot.length(); i++) {
			if (car == mot.charAt(i)) {
				reponse[i] = car;
				rep = true;
			}
		}
		System.out.println(Arrays.toString(reponse));
		return rep;
	}

	/**
	* rend vrai si le mot est trouvé
	* @param mot mot à deviner
	* @param reponse réponse du joueur
	* @return vrai ssi le mot est égal caractère par caractère à la réponse */
	boolean estComplet (String mot, char[] reponse) {
		boolean rep = true;
		for (int i = 0; i < reponse.length; i++) {
			if (mot.charAt(i) != reponse[i]) {
				rep = false;
			}
		}
		return rep;
	}

	/**
	* lancement d’une partie du jeu du pendu
	* @param dico dictionnaire des mots à deviner */
	void partie(String[] dico) {
		int vie = 9;
		boolean check = false;
		boolean reponse;
		String mot = choisirMot(dico);
		char car;
		System.out.println("vie = " + vie);
		int lg = mot.length();
		char[] tableauRep = creerReponse(lg);
		System.out.println(Arrays.toString(tableauRep));
		while (check != true && vie != 0) {
			car = SimpleInput.getChar("met une lettre : ");
			reponse = tester(mot, tableauRep, car);

			if (reponse != true) {
				vie = vie - 1;
			}
			check = estComplet(mot, tableauRep);
			System.out.println("vie = " + vie);
		}

		if (check == true) {
			System.out.println("GG tu as gagné");
		}
		else {
			System.out.println("gros nul ...");
		}
	}
}