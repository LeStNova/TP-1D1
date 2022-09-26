class Salaire {
	
	void principal () {
	
	
		float salaire = SimpleInput.getFloat("Votre salaire est de :");
	
		float assuranceMaladie = 0.75F;
		float assuranceVieillesseDeplafonnee = 0.1F;
		float contributionSocialeGeneralisee = 7.5F;
		float crds = 0.5F;
		float assuranceVieillessePlafonnee = 6.75F;
		float chomage = 2.4F;
		float totalPrelevement;
		float salairePercu;
		
		if (salaire <= 0) {
			System.out.println
			("Votre salaire est de 0 il n'y a pas d'operation a effectué");
	}   else {

			System.out.println
			("Votre salaire brut est de :" + salaire);
	
			System.out.println
			("Votre Assurance Maladie est de :" + salaire*assuranceMaladie/100);
			
			System.out.println
			("Votre Assurance Vieillesse Deplafonnee est de :" + salaire*assuranceVieillesseDeplafonnee/100);
			
			System.out.println
			("Votre Contribution Sociale Generalisee est de :" + (salaire*0.9825)*contributionSocialeGeneralisee/100);
			
			System.out.println
			("Votre CRDS est de :" + (salaire*0.9825)*crds/100) ;
			
			System.out.println
			("Votre Assurance Vieillesse Plafonnee est de :" + salaire*assuranceVieillessePlafonnee/100);
			
			System.out.println
			("Votre Chômage est de :" + salaire*chomage/100);
			
			totalPrelevement = (float) (salaire*assuranceMaladie/100 +
			salaire*assuranceVieillesseDeplafonnee/100 +
			(salaire*0.9825)*contributionSocialeGeneralisee/100 +
			(salaire*0.9825)*crds/100 +
			salaire*assuranceVieillessePlafonnee/100 +
			salaire*chomage/100);
			
			salairePercu = salaire - totalPrelevement;
			
			
		
			System.out.println("Le prélèvement totale est de :" + totalPrelevement);
	
			System.out.println("Votre salaire net est donc de :" + salairePercu);
		}
	}
	
}
