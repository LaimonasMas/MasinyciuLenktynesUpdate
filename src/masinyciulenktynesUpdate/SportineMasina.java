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
public class SportineMasina extends Masina {

    protected boolean spoileris;

    public SportineMasina(String pav, int maxGreitis) {
        super(pav, maxGreitis);
        this.spoileris = false;
    }

    public void isSpoileris() {
        if (Math.random() > 0.5) {
            this.spoileris = true;
        }
    }

    @Override
    public void gazuok(int kiek) {
        if (!this.spoileris) {
            super.gazuok(kiek * 2);
        } else {
            super.gazuok(kiek);
        }

    }

    @Override
    public void stabdyk(int kiek) {
        if (this.spoileris) {
            super.stabdyk(kiek * 2);
        } else {
            super.stabdyk(kiek);
        }
    }

}
