/*
* @author M.Belbeoch
*/

class Passage{
	void principal(){
		
		int compteur = 0;
		
		float ue1 = SimpleInput.getFloat("saisir votre moyenne "
		+"'Réaliser un développement d’application' : ");
		while (ue1 < 0F | ue1 > 20F) {
			ue1 = SimpleInput.getFloat("saisir une moyenne entre "+
			"0 et 20 : ");
		}
		if (ue1 >= 10) {
			compteur = compteur + 1;
		}
		
		float ue2 = SimpleInput.getFloat("saisir votre moyenne "
		+"'Optimiser des applications' : ");
		while (ue2 < 0F | ue2 > 20F) {
			ue2 = SimpleInput.getFloat("saisir une moyenne entre "+
			"0 et 20 : ");
		}
		if (ue2 >= 10) {
			compteur = compteur + 1;
		}
		
		float ue3 = SimpleInput.getFloat("saisir votre moyenne "
		+"'Administrer des systèmes informatiques communicants"+
		" complexes' : ");
		while (ue3 < 0F | ue3 > 20F) {
			ue3 = SimpleInput.getFloat("saisir une moyenne entre "+
			"0 et 20 : ");
		}
		if (ue3 >= 10) {
			compteur = compteur + 1;
		}
		
		float ue4 = SimpleInput.getFloat("saisir votre moyenne "
		+"'Gérer des données de l’information' : ");
		while (ue4 < 0F | ue4 > 20F) {
			ue4 = SimpleInput.getFloat("saisir une moyenne entre "+
			"0 et 20 : ");
		}
		if (ue4 >= 10) {
			compteur = compteur + 1;
		}
		
		float ue5 = SimpleInput.getFloat("saisir votre moyenne "
		+"'Conduire un projet' : ");
		while (ue5 < 0F | ue5 > 20F) {
			ue5 = SimpleInput.getFloat("saisir une moyenne entre "+
			"0 et 20 : ");
		}
		if (ue5 >= 10) {
			compteur = compteur + 1;
		}
		
		float ue6 = SimpleInput.getFloat("saisir votre moyenne "
		+"'Collaborer au sein d’une équipe informatique' : ");
		while (ue6 < 0F | ue6 > 20F) {
			ue6 = SimpleInput.getFloat("saisir une moyenne entre "+
			"0 et 20 : ");
		}
		if (ue6 >= 10) {
			compteur = compteur + 1;
		}
		
		if ((ue1 >= 8 && ue2 >= 8 && ue3 >= 8 && ue4 >= 8 && ue5 >= 8 &&
		ue6 >= 8) || (compteur >= 4)) {
			System.out.println ("Tu as obtenue ton année. Bien joué");
			if (ue1 >= 8 && ue1 <= 10) {
				System.out.println ("Tu as obtenue "+ue1+" au UE1");
			}
			if (ue2 >= 8 && ue2 <= 10) {
				System.out.println ("Tu as obtenue "+ue2+" au UE2");
			}
			if (ue3 >= 8 && ue3 <= 10) {
				System.out.println ("Tu as obtenue "+ue3+" au UE3");
			}
			if (ue4 >= 8 && ue4 <= 10) {
				System.out.println ("Tu as obtenue "+ue4+" au UE4");
			}
			if (ue5 >= 8 && ue5 <= 10) {
				System.out.println ("Tu as obtenue "+ue5+" au UE5");
			}
			if (ue6 >= 8 && ue6 <= 10) {
				System.out.println ("Tu as obtenue "+ue6+" au UE6");
			}
		}
		
		else {
			System.out.println ("Tu ne l'as pas obtenu car ...");
			if (ue1 < 10) {
				System.out.println ("tu as eu "+ue1);
			}
			if (ue2 < 10) {
				System.out.println ("tu as eu "+ue2);
			}
			if (ue3 < 10) {
				System.out.println ("tu as eu "+ue3);
			}
			if (ue4 < 10) {
				System.out.println ("tu as eu "+ue4);
			}
			if (ue5 < 10) {
				System.out.println ("tu as eu "+ue5);
			}
			if (ue6 < 10) {
				System.out.println ("tu as eu "+ue6);
			}
			System.out.println ("au lieu de 8 pour avoir le minimum"
			+", ou bien il te manquait "+(4-compteur)+" 10 pour "+
			"passer ...");
		}	
	}
}

