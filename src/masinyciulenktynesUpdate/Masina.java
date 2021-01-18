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
    
    public String pav;
    public int maxGreitis;
    public int kelias = 0;
    public int greitis;
    
    public Masina(String pav, int maxGreitis) {
        this.pav = pav;
        this.maxGreitis = maxGreitis;
        this.kelias = 0;
        this.greitis = 0;
    }
    
    public void gazuok(int kiek){
        
    }
    public void stabdyk(int kiek){
        
    }
    public int vaziuok(int speed){      
        return this.kelias += speed;
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
    
    @Override
    public String toString(){
        return "Masina{" +"pavadinimas=" + pav + ", maksimalus greitis=" + maxGreitis + ", nuvažiuotas kelias=" + kelias + '}';
    }
}
