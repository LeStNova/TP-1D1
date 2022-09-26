class Exercice3 {
	void principal () {
		String word;
		int sizeWord;
		int i = 0;
		boolean check = true;
		
		word = SimpleInput.getString ("met un mot : ");
		sizeWord = word.length() - 1;
		
		while (i < sizeWord && check != false) {
			if (word.charAt(i) != word.charAt(sizeWord-i)){
				check = false;
			}
			i++;
		}
		if (check == false) {
			System.out.println (word + " n'est pas un palindrome");
		}
		else {
			System.out.println (word + " est un palindrome");
		}
	}
}
