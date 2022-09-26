class Exercice3 {
	void principal() {
		int val1;
		int val2;
		val1 = SimpleInput.getInt ("Première valeur : ");
		System.out.println(val1 + " ");
		val2 = SimpleInput.getInt ("saisir une valeur : ");
		while (val1 <= val2) {
			System.out.println(" "+val2);
			val1 = val2;
			val2 = SimpleInput.getInt ("saisir une valeur : ");
		}
	}	
}
