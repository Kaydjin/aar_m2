package entities;

import javax.persistence.*;
import java.util.List;

@Entity
public class Offre {

    @Id @GeneratedValue
    private int idOffre;
    private int nbrRestants;

    @ManyToOne
    private Ville depart;
    @ManyToOne
    private Ville arrive;
    private Vehicule vehicule;
    @ManyToMany
    private List<Ville> etapes;
    private Utilisateur emmeteur;
    private Float tarif;

    /**
     * J'ai mis les attributs mais j'ai pas géré les
     * manytoone ...etc pour les liens entre offre et
     * utilisateur.
     *
     */
    public int getIdOffre() {
        return idOffre;
    }

    public void setIdOffre(int idOffre) {
        this.idOffre = idOffre;
    }

    public int getNbrRestants() {
        return nbrRestants;
    }

    public void setNbrRestants(int nbrRestants) {
        this.nbrRestants = nbrRestants;
    }

    public Ville getDepart() {
        return depart;
    }

    public void setDepart(Ville depart) {
        this.depart = depart;
    }

    public Ville getArrive() {
        return arrive;
    }

    public void setArrive(Ville arrive) {
        this.arrive = arrive;
    }

    public Vehicule getVehicule() {
        return vehicule;
    }

    public void setVehicule(Vehicule vehicule) {
        this.vehicule = vehicule;
    }

    public List<Ville> getEtapes() {
        return etapes;
    }

    public void setEtapes(List<Ville> etapes) {
        this.etapes = etapes;
    }

    public Utilisateur getEmmeteur() {
        return emmeteur;
    }

    public void setEmmeteur(Utilisateur emmeteur) {
        this.emmeteur = emmeteur;
    }

    public Float getTarif() {
        return tarif;
    }

    public void setTarif(Float tarif) {
        this.tarif = tarif;
    }
}
