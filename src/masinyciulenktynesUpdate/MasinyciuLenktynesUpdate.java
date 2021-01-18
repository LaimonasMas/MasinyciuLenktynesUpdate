/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package masinyciulenktynesUpdate;

public class MasinyciuLenktynesUpdate {

    public static void main(String[] args) {
            Masina m1 = new Masina("Pirma", 140);
            Masina m2 = new Masina("Antra", 160);
            Masina m3 = new Masina("Trecia", 180);
            Masina m4 = new Masina("Ketvirta", 220);
            Masina sm5 = new SportineMasina("Sportine1", 300);
            Masina sm6 = new SportineMasina("Sportine2", 300);
            Masina sm7 = new SportineMasina("Sportine3", 300);
            Masina sm8 = new SportineMasina("Sportine4", 300);
        Masina[] race = {m1, m2, m3, m4, sm5, sm6, sm7, sm8};
//        int tempSpeed = (int)(Math.random() * 100 * 1);
//        System.out.println(tempSpeed);
//        int[] masinos = new int[8];
        int interm = 100;
        boolean doRace = true;
        while (doRace) {
            for (int i = 0; i < race.length; i++) {
                race[i].vaziuok(race[i].setGreitis());   
                race[i].gazuok(race[i].setPagreitis());
                race[i].stabdyk(race[i].setStabdymas());
//                race[i].kelias += (int)(Math.random() * race[i].maxGreitis);
            }
            boolean printInterm = false;
            int intermWinner = 0;
            int intermWinnerKm = 0;
            for (int i = 0; i < race.length; i++) {
                if (race[i].getKelias() > intermWinnerKm) {
                    intermWinner = i;
                    intermWinnerKm = race[i].getKelias();
                }
                if (race[i].getKelias() >= interm) {
                    printInterm = true;
                    interm += 100;
                }
            }
            if (printInterm) {
                for (int i = 0; i < race.length; i++) {
                    System.out.print(race[i].getKelias() + "\t");
                }
                System.out.println();
                System.out.println("Pirmauja " + race[intermWinner].getPav() + " nuvaziavo " + intermWinnerKm);
            }
            for (int i = 0; i < race.length; i++) {
                if (race[i].getKelias() >= 1000) {
//                    System.out.println("Laimejo " + (i + 1) + " masina");
                    doRace = false;
                    break;
                }
            }
        }
        for (int i = 0; i < race.length - 1; i++) {
            for (int j = i + 1; j < race.length; j++) {
                if (race[i].getKelias() < race[j].getKelias()) {
//                    int tmp = race[i].getKelias();
//                    race[i].kelias = race[j].kelias;
//                    race[j].kelias = tmp;
                    Masina tmp = race[i];
                    race[i] = race[j];
                    race[j] = tmp;
                }
            }
        }
        for (int i = 0; i < race.length; i++) {
//            System.out.print(race[i].getKelias() + " ");
//            System.out.println(" ");
System.out.println(race[i]);
        }
    }
}
