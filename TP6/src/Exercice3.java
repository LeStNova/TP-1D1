/**
 * @author Belbeoch Ewen
 */

import java.util.Arrays;

class Exercice3 {

    void principal() {
        testEliminerDouble();
    }

    /**
     * élimine les valeurs en plusieurs exemplaires dans un tableau
     * un élément présent plusieurs fois n’est plus qu’en un seul exemplaire
     * 
     * @param tab tableau d’entiers
     * @return le nombre d’éléments du tableau sans double
     */
    int eliminerDouble(int[] tab) {
        int t1Length = tab.length;
        int compteur = 0;
        boolean test = false;

        for (int j = 0; j <= 3; j++) {
            for (int i = 0; i < t1Length; i++) {
                if (tab[i] == j && test == true) {
                    compteur++;
                }
                if (tab[i] == j) {
                    test = true;
                }
            }
            test = false;
        }
        return compteur;
    }

    void testEliminerDouble() {
        System.out.println("methode test \t ****testeSaisirEtTrier****");
        testCasEliminerDouble(new int[] { 0, 0, 2, 3, 3 }, 2);
        testCasEliminerDouble(new int[] { 0, 0, 2, 3, 3, 1 }, 2);
        testCasEliminerDouble(new int[] { 1, 3, 3, 0 }, 1);
        testCasEliminerDouble(new int[] { -4, -4, 0, 2, 3, 3, 1, 1, 1, 6, 4, 4 ,6, 2 }, 4);
    }

    void testCasEliminerDouble(int[] t1, int result) {
        System.out.print(Arrays.toString(t1) + " a " +
        result + " de double \t = ");

        int test = eliminerDouble(t1);

        if (test == result) {
            System.out.println("OK");
        } else {
            System.out.println("ERREUR | compteur = " + test);
        }
    }
}