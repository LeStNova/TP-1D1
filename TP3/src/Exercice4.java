class Exercice4 {
	void principal () {
		int tab[] = {0,1,1,2,3,4,5,6,7,8,9,1,5,9};
		int i = 0;
		int var;
		int counter = 0;
		
		var = SimpleInput.getInt ("met une valeur : ");
		
		while (i < tab.length && counter < 2) {
			if (tab[i] == var) {
				counter++;
			}
			i++;
		}
		if(counter >= 2) {
			System.out.println("il y a au moins 2 fois " + var +
			" dans le tableau");
		}
		else {
			System.out.println("il n'y a pas " + var + " au moins"+
			" deux fois dans la boucle");
		}
	}
}
