class Exercice1 {
	void principal () {
		int chiffre;
		chiffre = SimpleInput.getInt("donne un chiffre : ");
		while (chiffre != -1) {
			System.out.print(chiffre);
			chiffre = SimpleInput.getInt(" ");
		}
	}
}
