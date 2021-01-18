/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package masinyciulenktynesUpdate;

/**
 *
 * @author Laimonas
 */
public class Masina {

    protected String pav;
    protected int maxGreitis;
    protected int kelias = 0;
    protected int greitis;
    protected int pagreitis;
    protected int stabdymas;

    public Masina(String pav, int maxGreitis) {
        this.pav = pav;
        this.maxGreitis = maxGreitis;
        this.kelias = 0;
        this.greitis = (int)((Math.random()*this.maxGreitis)+1);
        this.pagreitis = (int)((Math.random()*10)+1);
        this.stabdymas = (int)((Math.random()*10)+1)/2;
    }

    public String getPav() {
        return this.pav;
    }

    public int getKelias() {
        return this.kelias;
    }

    public int setGreitis() {
        return this.greitis;
    }

    public int setPagreitis() {
        return this.pagreitis;
    }

    public int setStabdymas() {
        return this.stabdymas;
    }

    public void vaziuok(int speed) {
        this.kelias += speed;
    }

    public void gazuok(int kiek) {
        if (Math.random() <= 0.5) {
            this.kelias += kiek;
        }
    }

    public void stabdyk(int kiek) {
        if (Math.random() <= 0.3) {
            this.kelias -= kiek;
        }
    }

    @Override
    public String toString() {
        return "Masina{" + "pavadinimas=" + pav + ", maksimalus greitis=" + maxGreitis + ", nuvažiuotas kelias=" + kelias + '}';
    }

//    Jei sportine masina
//    50% kad pasikeis spoilerio pozicija
//   
//   
//    30% stabdys 1-5
//    50% gazuos 1-10
//    20% nekeis greicio
//   
//   
//    SportineMasina
//   
//    gazuok() jei spoileris nuleistas - gazuoja 2x greiciau
//    stabdyk() jei spoileris pakeltas - stabdo 2x greiciau
//   
//    spoileris true - pakeltas, false - nuleistas
}
