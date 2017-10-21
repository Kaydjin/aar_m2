package entities;

import javax.persistence.*;
import java.util.List;

@Entity
public class Ville {

    @Id @GeneratedValue
    private int idVille;
    private String nom;

    @OneToMany(mappedBy = "depart", cascade = CascadeType.ALL)
    private List<Offre> offres_depart;
    @OneToMany(mappedBy = "arrive", cascade = CascadeType.ALL)
    private List<Offre> offres_arrive;
    @ManyToMany(mappedBy = "etapes", cascade = CascadeType.ALL)
    private List<Offre> offres_etapes;

    public Ville(){}

    public Ville(String nom){
        super();
        this.nom = nom;
    }
    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public List<Offre> getOffres_depart() {
        return offres_depart;
    }

    public void setOffres_depart(List<Offre> offres_depart) {
        this.offres_depart = offres_depart;
    }

    public List<Offre> getOffres_arrive() {
        return offres_arrive;
    }

    public void setOffres_arrive(List<Offre> offres_arrive) {
        this.offres_arrive = offres_arrive;
    }

    public List<Offre> getOffres_etapes() {
        return offres_etapes;
    }

    public void setOffres_etapes(List<Offre> offres_etapes) {
        this.offres_etapes = offres_etapes;
    }

    public int getIdVille() {
        return idVille;
    }

    public void setIdVille(int idVille) {
        this.idVille = idVille;
    }
}
