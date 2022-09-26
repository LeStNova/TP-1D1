/*
* @author M.Belbeoch
*/

class CercleInfo{
	void principal(){
		float rayon;
		double perimetre;
		double aire;
		double pi = Math.PI;
		rayon = SimpleInput.getFloat("Quelle est le rayon de "
		+"votre cercle en centimetre : ");
		
		while (rayon < 0) {
			rayon = SimpleInput.getFloat("Entrez un nombre superieur "
			+"a 0 : ");
		}
		
		perimetre = 2 * pi * rayon;
		aire = rayon * rayon * pi;
		
		System.out.println
		("Le périmetre d'un cercle de rayon " + rayon  + " est de " 
		+ perimetre + " cm");
		System.out.println
		("L'aire du cercle de rayon " + rayon  + " est de " 
		+ aire + " cm3");
	}
}
