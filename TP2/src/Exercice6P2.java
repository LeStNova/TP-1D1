class Exercice6P2 {
	void principal() {
		boolean verif = false;
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
				if ((limit - min) == 0) {
					System.out.println("super j'ai trouvé, c'était "+
					(int) ((Math.random() * (limit - min)) + min));
					answer = '=';
					verif = true;
				}
			}
			if (answer == '-') {
				limit = number - 1;
				number = (int) ((Math.random() * (limit - min)) + min);
				if ((limit - min) == 0) {
					System.out.println("super j'ai trouvé, c'était "+
					(int) ((Math.random() * (limit - min)) + min));
					answer = '=';
					verif = true;
				}
			}
		}
		if (verif == false) {
		System.out.println("super j'ai trouvé, c'était "+ number);
		}
	}
}
