class Exercice4 {
	void principal() {
		float x;
		int n;
		float var;
		boolean neg = false;
		x = SimpleInput.getFloat ("Mettre un nombre reel : ");
		n = SimpleInput.getInt ("Mettre un nombre entier  : ");
		var = x;
		x = 1;
		if (n < 0) {
			n = n * -1;
			neg = true;
		}
		
		if (n == 0) {
			x = 1;
		}
		while (n != 0) {
			x = x * var;
			n = n - 1;
		}
		if (neg == true) {
			System.out.println(1 / x);
		}
		else {
			System.out.println(x);
		}
	}
}
