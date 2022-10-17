/**
 * @author Belbeoch Ewen
 */

import java.util.Arrays;

class Exercice2 {

    void principal() {
        testSontTousDiff();
    }

    /**
     * vérifie si deux tableaux n’ont aucune valeur commune
     * @param tab1 premier tableau
     * @param tab2 deuxième tableau
     * @return vrai si les tableaux tab1 et tab2 n’ont aucune valeur commune, faux sinon */
    boolean sontTousDiff (int[] tab1, int[] tab2) {
        int t1length = tab1.length;
        int t2length = tab2.length;
        boolean ret = true;
        int i = 0;
        int j = 0;

        if (t1length == 0 && t2length == 0) {
            ret = false;
        }

        while (i < t1length && ret != false) {
            int tmp = tab1[i];
            j = 0;
            while (j < t2length && ret != false) {
                if (tmp == tab2[j]) {
                    ret = false;
                }
            j++;
            }
        i++;
        }
        return ret;
    }

    void testSontTousDiff() {
        System.out.println("methode test \t ****testeSaisirEtTrier****");
        testCasSontTousDiff(new int[] {1, 2, 3}, new int[] {4}, true);
        testCasSontTousDiff(new int[] {}, new int[] {3, 4}, true); 
        testCasSontTousDiff(new int[] {1}, new int[] {}, true);
        testCasSontTousDiff(new int[] {}, new int[] {}, false);
        testCasSontTousDiff(new int[] {-4, 0, 6}, new int[] {-4, 15}, false);
        testCasSontTousDiff(new int[] {1, 2, 3}, new int[] {1, 2, 3}, false);
    }

    void testCasSontTousDiff(int[] t1, int[] t2, boolean result) {
        System.out.print(Arrays.toString(t1) + " est diff de " +
        Arrays.toString(t2) + " \t = ");

        boolean test = sontTousDiff(t1, t2);

        if (test == result) {
            System.out.println("OK");
        } else {
            System.out.println("ERREUR");
        }
    }
}