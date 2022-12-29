package Metier;

public class Produit {
    private long id;
    private String Nom;
    private String marque;
    private double prix;
    private String Description;
    private int nbr_Stock;

    public Produit() {
    }

    public Produit(long id, String nom, String marque, double prix, String description, int nbr_Stock) {
        this.id = id;
        Nom = nom;
        this.marque = marque;
        this.prix = prix;
        Description = description;
        this.nbr_Stock = nbr_Stock;
    }

    public long getId() {
        return id;
    }

    public String getNom() {
        return Nom;
    }

    public String getMarque() {
        return marque;
    }

    public double getPrix() {
        return prix;
    }

    public String getDescription() {
        return Description;
    }

    public int getNbr_Stock() {
        return nbr_Stock;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setNom(String nom) {
        Nom = nom;
    }

    public void setMarque(String marque) {
        this.marque = marque;
    }

    public void setPrix(double prix) {
        this.prix = prix;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public void setNbr_Stock(int nbr_Stock) {
        this.nbr_Stock = nbr_Stock;
    }

    @Override
    public String toString() {
        return "Produit{" +
                "id=" + id +
                ", Nom='" + Nom + '\'' +
                ", marque='" + marque + '\'' +
                ", prix=" + prix +
                ", Description='" + Description + '\'' +
                ", nbr_Stock=" + nbr_Stock +
                '}';
    }
}