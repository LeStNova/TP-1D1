class Exercice1 {
	void principal () {
		int nbVal = 0;
		int tab[];
		tab = new int[10];
		int var;
		int counter = 0;
		boolean exit = false;
		
		while (nbVal < tab.length && exit == false){
			var = SimpleInput.getInt("put a number : ");
			if (var != -1) {
				tab[nbVal] = var;
				nbVal++;
			}
			else {
				exit = true;
			}
		}
		for (int i = 0; i < nbVal; i++) {
			System.out.println (tab[i]);
		}
		System.out.println ("le tableau a " + nbVal + " valeurs");
		
		var = SimpleInput.getInt("tapez une valeur pour voir si elle"+
		" est dans le tableau : ");
		while (var == -1) {
			var = SimpleInput.getInt("tapez une valeur autre de -1 : ");
		}
		
		for (int i = 0; i < nbVal; i++) {
			if (tab[i] == var) {
				counter++;
			}
		}
		System.out.println (var + " ce trouve " + counter +
		" dans le tableau");
	}
}
