class Exercice6P1 {
	void principal() {
		char answer = ' ';
		int limit = 100;
		int min = 0;
		int number = ((int) (Math.random() * 100));
		System.out.println("choisi un chiffre");

		while (answer != '=') {
			answer = SimpleInput.getChar ("est ce que c'est "+number+
			" ? ");
			if (answer == '+') {
				min = number + 1;
				number = (int) ((Math.random() * (limit - min)) + min);
			}
			if (answer == '-') {
				limit = number - 1;
				number = (int) ((Math.random() * (limit - min)) + min);
			}
		}
		System.out.println("super j'ai trouvé, c'était "+ number);
	}
}
