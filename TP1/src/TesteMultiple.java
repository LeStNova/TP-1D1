/*
* @author M.Belbeoch
*/

class TesteMultiple{
	void principal(){
		boolean var = false;
		int nombre = SimpleInput.getInt("saisir un nombre entier : ");
		if (nombre%2 == 0){
			System.out.println(nombre +" est divisible par 2");
			var = true;
		}
		if (nombre%3 == 0){
			System.out.println(nombre +" est divisible par 3");
			var = true;
		}
		if (nombre%4 == 0){
			System.out.println(nombre +" est divisible par 4");
			var = true;
		}
		if (nombre%5 == 0){
			System.out.println(nombre +" est divisible par 5");
			var = true;
		}
		else if (var == false){
			System.out.println(nombre+
			" n'est pas divisible par 2,3,4 ou 5");
		}
	}
}
