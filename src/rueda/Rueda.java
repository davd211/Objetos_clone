/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rueda;


/**
 *
 *
 */
class Rueda {
    private int anchura;
    private int perfil;
    private int diametroLlanta;

    public Rueda() {
    }

    public Rueda(int anchura, int perfil, int diametroLlanta) {
        this.anchura = anchura;
        this.perfil = perfil;
        this.diametroLlanta = diametroLlanta;
    }
    
    public Rueda (Rueda r){
        this.anchura=r.getAnchura();
        this.diametroLlanta=r.getDiametroLlanta();
        this.perfil= r.getPerfil();
    }

    public void setAnchura(int anchura) {
        this.anchura = anchura;
    }

    public void setPerfil(int perfil) {
        this.perfil = perfil;
    }

    public void setDiametroLlanta(int diametroLlanta) {
        this.diametroLlanta = diametroLlanta;
    }

    

    public int getAnchura() {
        return anchura;
    }

    public int getPerfil() {
        return perfil;
    }

    public int getDiametroLlanta() {
        return diametroLlanta;
    }
    
    @Override
    public String toString() {
        return "Rueda{" + "anchura=" + anchura + ", perfil=" + perfil + ", diametroLlanta=" + diametroLlanta + '}';
    }
    
}