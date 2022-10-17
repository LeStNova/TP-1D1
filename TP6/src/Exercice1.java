/**
 * @author Belbeoch Ewen
 */

import java.util.Arrays;

class Exercice1 {

    final int LG_TAB = 4;

    void principal() {
        testSaisirEtTrier();
    }

    /**
     * Crée et saisit un tableau trié de LG_TAB entiers
     * @return tableau trié de LG-TAB entiers
     */
    int[] saisirEtTrier() {
        int[] t = new int[LG_TAB];
        int i = 0;
        while (i < t.length) {
            t[i] = SimpleInput.getInt("Entrer un entier : ");
            for (int j = 0; j < i; j++) {
                if (t[j] > t[i]) {
                    int tmp = t[j];
                    t[j] = t[i];
                    t[i] = tmp;
                }
            }
            i++;
        }
        return t;
    }

    void testSaisirEtTrier() {
        System.out.println("methode test \t testeSaisirEtTrier");
        testeCasSaisirEtTrier(new int[] {1,4,7,8}, new int[] {1,4,7,8});        //val positif
        testeCasSaisirEtTrier(new int[] {-3,4,7,8}, new int[] {-3,4,7,8});      //val pos et neg
        testeCasSaisirEtTrier(new int[] {-3,4,1,-2}, new int[] {-3,-2,1,4});    //val pos et neg
        testeCasSaisirEtTrier(new int[] {0,-5,7,5}, new int[] {-5,0,5,7});      //val pos et neg
    }

    void testeCasSaisirEtTrier(int[] t, int[] result) {
        System.out.println("on met : "+Arrays.toString(t)+" en entré"+
        " et on met : "+Arrays.toString(result)+" en sortie");

        System.out.println("entrez les valeur a la main du premeier tableau affichié");
        int[] test = saisirEtTrier();

        if (Arrays.equals(test, result)) {
            System.out.println("OK");
        }
        else {
            System.out.println("ERREUR");
        }
    }
}