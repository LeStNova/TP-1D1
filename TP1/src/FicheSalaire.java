/*
* @author M.Belbeoch
*/

class FicheSalaire{
	void principal(){
		float salaireBrut;
		float assuranceMaladie = 0.75F;
		float assuranceVieillesseDeplaf = 0.1F;
		float contributionSocial = 7.5F;
		float crds = 0.5F;
		float assuranceVieillessePlaf = 6.75F;
		float chomage = 2.4F;
		float totalPrelev;
		float salaireNet;
		
		salaireBrut = SimpleInput.getFloat("votre salaire brut : ");
		
		while (salaireBrut < 0) {
			salaireBrut = SimpleInput.getFloat("votre salaire brut"+
			" (valeur positive please) : ");
		}
		
		System.out.println
		("Votre salaire brut est de " + salaireBrut + " €");
		
		System.out.println
		("moins " + salaireBrut*assuranceMaladie/100 
		+ " € d'assurance maladie");
		totalPrelev = salaireBrut*assuranceMaladie/100;
		
		System.out.println
		("moins " + salaireBrut*assuranceVieillesseDeplaf/100 
		+ " € d'assurance vieillesse deplafonné");
		totalPrelev = totalPrelev+salaireBrut*assuranceVieillesseDeplaf
		/100;
		
		System.out.println
		("moins " + salaireBrut*contributionSocial/100 
		+ " € de contribution social");
		totalPrelev = totalPrelev+salaireBrut*contributionSocial/100;
		
		System.out.println
		("moins " + salaireBrut*crds/100 + " € de CRDS");
		totalPrelev = totalPrelev+salaireBrut*crds/100;
		
		System.out.println
		("moins " + salaireBrut*assuranceVieillessePlaf/100 
		+ " € d'assurance vieillesse plafonné");
		totalPrelev=totalPrelev+salaireBrut*assuranceVieillessePlaf/100;
		
		System.out.println
		("moins " + salaireBrut*chomage/100 + " € de chomage");
		totalPrelev = totalPrelev+salaireBrut*chomage/100;
		
		System.out.println
		("Total des prelèvements " + totalPrelev + " €");
		
		salaireNet = salaireBrut - totalPrelev;
		System.out.println
		("Votre salaire Net est de " + salaireNet + " €");
	}
}

