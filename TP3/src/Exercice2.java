class Exercice2 {
	void principal () {
		int nbVal = 0;
		int tab[];
		tab = new int[10];
		int var;
		boolean exit = false;
		int min;
		int i;
		boolean check = true;
		
		while (nbVal < 10 && exit == false){
			var = SimpleInput.getInt("put a number : ");
			if (var != -1) {
				tab[nbVal] = var;
				nbVal++;
			}
			else {
				exit = true;
			}
		}
		System.out.println ("il y a " + nbVal + " nombre de valeur "+
		"dans le tableau");
		
		min = tab[0];
		i = 0;
		
		while (i < nbVal && check) {
			if (min > tab[i]) {
				check = false;
			}
			min = tab[i];
			i++;
		}
		
		if (check == true) {
		System.out.println ("les valeur sont dans l'ordre");
		}
		else {
		System.out.println ("les valeur ne sont pas dans l'ordre");
		}
	}
}
