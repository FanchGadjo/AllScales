/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package allscales;

/**
 *
 * @author fkerisit
 */

public class Noeud {
    
    public static final int N = 12;
    
    public Noeud droit; //droit
    public Noeud gauche; //gauche
    public int valeur; //valeur
    public boolean flag; //flag

    public Noeud(Noeud droit, Noeud gauche, int valeur, boolean flag) {
        this.droit = droit;
        this.gauche = gauche;
        this.valeur = valeur;
        this.flag = flag;
    }

    public Noeud() {
    }
    
        
    public static Noeud construireArbre(int i, boolean flag) {
        
        if (i < N) {
            
            System.out.println("i = " + i);
            Noeud nd = new Noeud();
            nd.droit = construireArbre(i+1, true);
            nd.gauche = construireArbre(i+1, false);
            nd.valeur = i;
            nd.flag = flag;
            
            return nd;
            
//            return new Noeud( construireArbre(int i-1, true), construireArbre(int i-1, false));
        } else {
            return null;
        }
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        
        Noeud racine = new Noeud();
        
        Noeud.construireArbre(0, true);
    }
}
