package entities;

import javax.persistence.*;

@Entity
public class Demande {

    @ManyToOne
    private Utilisateur emetteur;
    @ManyToOne
    private Offre offre;

    @Id @GeneratedValue
    private int id_demande;
    private boolean accepter;
    private boolean commente;
    private int places;

    public Demande() {}

    public Demande(Utilisateur emetteur, Offre offre, int places, boolean accepter, boolean commente) {
        this.emetteur = emetteur;
        this.offre = offre;
        this.places = places;
        this.accepter = accepter;
        this.commente = commente;
    }

    public int getId_demande() {return id_demande;}

    public void setId_demande(int id_demande) {this.id_demande = id_demande; }

    public Utilisateur getEmetteur() {
        return emetteur;
    }

    public void setEmetteur(Utilisateur emetteur) {
        this.emetteur = emetteur;
    }

    public Offre getOffre() {
        return offre;
    }

    public void setOffre(Offre offre) {
        this.offre = offre;
    }

    public int getPlaces() {
        return places;
    }

    public void setPlaces(int places) {
        this.places = places;
    }

    public boolean isAccepter() {
        return accepter;
    }

    public void setAccepter(boolean accepter) {
        this.accepter = accepter;
    }

    public boolean isCommente() {
        return commente;
    }

    public void setCommente(boolean commente) {
        this.commente = commente;
    }
}
