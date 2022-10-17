/**
 * @author Belbeoch Ewen
 */

class Exercice4 {

    void principal() {
        testEstSousChaine();
    }

    /**
     * teste si une chaîne est une sous-chaîne d’une autre
     * @param mot chaîne de caractères
     * @param phrase chaîne de carectères
     * @return vrai ssi la première chaîne est présente dans la seconde */
    boolean estSousChaine (String mot, String phrase) {
        boolean check = false;

        int sizeMot1 = mot.length();                //transformation string mot en char[]
        char [] tabMot1 = new char [sizeMot1];
        for (int i = 0; i < sizeMot1; i++) {
            tabMot1[i] = mot.charAt(i);
        }

        int sizeMot2 = phrase.length();             //transformation string phrase en char[]
        char [] tabMot2 = new char [sizeMot2];
        for (int i = 0; i < sizeMot2; i++) {
            tabMot2[i] = phrase.charAt(i);
        }

        for (int i = 0; i < tabMot2.length; i++) {
            if (tabMot2[i] == tabMot1[0]) {
                check = true;
                int j = 0;
                while (j < tabMot1.length && check != false) {
                    if (i+j >= tabMot2.length || tabMot2[i+j] != tabMot1[j]) {
                        check = false;
                    }
                    j++;
                }
            }
        }
        return check;
    }

    void testEstSousChaine() {
        System.out.println("methode test \t ****testEstSousChaine****");
        testCasEstSousChaine("bit", "bibt", false);
        testCasEstSousChaine("bit", "bit est présent", true);
        testCasEstSousChaine("bit", "b it n'est pas présent", false);
        testCasEstSousChaine("bit", "il y a bit", true);
        testCasEstSousChaine("bit", "il y a pas bi", false);
    }

    void testCasEstSousChaine(String m1, String m2, boolean result) {
        System.out.print("le mot " + m1 + " est-il dans " +
        m2 + " \t = ");

        boolean test = estSousChaine(m1, m2);

        if (test == result) {
            System.out.println("OK");
        } else {
            System.out.println("ERREUR");
        }
    }
}