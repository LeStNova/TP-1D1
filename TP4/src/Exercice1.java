/**
* calcul de la combinaison avec
* @param n,k valeur de la factoriel
*/

class Exercice1 {
	void principal () {
		testFactoriel();
	}
	/**
	* calcul de la factoriel du paramètre
	* @param n valeur de la factoriel à calculer
	* @return factoriel de f
	*/
	int factoriel (int n) {
		int f = 1;
		int ret = 1;
		while (n > 1) {
			f = f * n;
			n = n - 1;
			ret = f;
		}
		return ret;
	}
	/**
	* calcul de la combinaison k parmi n
	* @param n cardinalité de l’ensemble
	* @param k nombre d’éléments dans n avec k<=n
	* @return nombre de combinaisons de k parmi n 
	*/
	int combinaison (int n, int k) {
		int ret;
		ret = factoriel(n-k);
		ret = ret * factoriel(k);
		ret = factoriel(n) / ret;
		return ret;
	}
	/**
	* Teste la méthode factoriel() */
	void testFactoriel () {
		System.out.println ();
		System.out.println ("*** testFactoriel()");
		testCasFactoriel (5, 120); 
		testCasFactoriel (0, 1); 
		testCasFactoriel (1, 1); 
		testCasFactoriel (2, 2);
	}
	
	/**
	* teste un appel de factoriel
	* @param n valeur de la factoriel à calculer 
	* @param result resultat attendu
	**/
	void testCasFactoriel (int n, int result) { 
		// Arrange
		System.out.print ("factoriel (" + n + ") \t= " + result + "\t : ");
		
		// Act
		int resExec = factoriel(n);
		
		// Assert
		if (resExec == result){
			System.out.println ("OK"); 
		}
		else {
			System.err.println ("ERREUR"); 
		}
	}
}
