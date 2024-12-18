
/*
* File: Solution.java
* Author: Dargai Dániel
* Copyright: 2024, Dargai Dániel
* Group: Szoft II-N
* Date: 2024-12-18
* Github: https://github.com/danidargai/
* Licenc: MIT
*/

import java.util.Scanner;

public class Solution {
    public void doit() {
        System.out.println("Kör alapú henger felszín számító!\n");
        Scanner sc = new Scanner(System.in);

        System.out.println("Adja meg a henger hosszát: ");
        double height = sc.nextDouble();

        System.out.println("\nAdja meg a henger sugarát: ");
        double r = sc.nextDouble();

        double S = 2 * Math.PI * r * (r + height);
        sc.close();

        System.out.println("\nA henger felszine: " + S + " cm2");
    }
}
