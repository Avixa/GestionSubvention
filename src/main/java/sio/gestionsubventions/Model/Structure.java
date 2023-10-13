package sio.gestionsubventions.Model;

public class Structure
{
    private String nomStructure;
    private int montant;

    public Structure(String nomStructure, int montant) {
        this.nomStructure = nomStructure;
        this.montant = montant;
    }

    public String getNomStructure() {
        return nomStructure;
    }

    public int getMontant() {
        return montant;
    }
}
