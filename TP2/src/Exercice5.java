class Exercice5 {
	void principal() {
		int compteur = 0;
		int answer;
		int nomber = ((int) (Math.random() * 100));
		answer = SimpleInput.getInt ("devinez le chiffre (entre "
		+"0 et 100) : ");
		
		while (answer != nomber) {
			if (answer > nomber) {
				compteur = compteur + 1;
				answer = SimpleInput.getInt ("Trop grand !, essaye : ");
			}
			if (answer < nomber) {
				answer = SimpleInput.getInt ("Trop petit !, essaye : ");
				compteur = compteur + 1;
			}
			if (answer == nomber) {
				compteur = compteur + 1;
			}
		}
		System.out.println("bien joué tu as trouvé, c'était "+ nomber
		+ " et tu as trouvé en " + compteur + " essais");
	}
}
