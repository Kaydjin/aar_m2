package entities;

import javax.persistence.*;
import java.util.List;

/**
 * @author vogel jimmy
 */
@Entity
public class Ville {

    /**
     * The different attributes linked to others entity
     * owner and child relationship:
     * - offer of car transport which begins by this city.
     * - offer of car transport which ends by this city.
     * - offer of car transport which pass by this city.
     */
    @OneToMany(mappedBy = "depart", cascade = CascadeType.ALL)
    private List<Offre> offres_departs;
    @OneToMany(mappedBy = "arrivee", cascade = CascadeType.ALL)
    private List<Offre> offres_arrivees;
    @ManyToMany(mappedBy = "etapes", cascade = CascadeType.ALL)
    private List<Offre> offres_etapes;

    /**
     * Entity key
     */
    @Id @GeneratedValue
    private int id_ville;

    /**
     * Parameters descriptive of a city.
     */
    private String nom;

    /**
     * Empty constructor for the Entity manager.
     */
    public Ville(){}

    /**
     * Constructor with all the descriptive parameters of a new city.
     * @param nom the name of the ville
     */
    public Ville(String nom){
        this.nom = nom;
    }

    /**
     * Getter of the auto-increment id of the city.
     * @return the id as an int type
     */
    public int getId_ville() {
        return id_ville;
    }

    /**
     * Setter of the auto-increment id of the city.
     * @implNote should not be used
     * @param id_ville the new id as an int type
     */
    public void setId_ville(int id_ville) {
        this.id_ville = id_ville;
    }

    /**
     * Getter of the name of the city
     * @return the name as a string format
     */
    public String getNom() {
        return nom;
    }

    /**
     * Setter of the name of the city
     * @param nom the new name as a string format
     */
    public void setNom(String nom) {
        this.nom = nom;
    }

    /**
     * Getter of all of the offers of car transport which starts by this city.
     * @return a List type which contains the offers
     */
    public List<Offre> getOffres_departs() {
        return offres_departs;
    }

    /**
     * Setter of all of the offers of car transport which starts by this city.
     * @param offres_departs the new List type which contains the offers
     */
    public void setOffres_departs(List<Offre> offres_departs) {
        this.offres_departs = offres_departs;
    }

    /**
     * Getter of all of the offers of car transport which ends by this city.
     * @return a List type which contains the offers
     */
    public List<Offre> getOffres_arrivees() {
        return offres_arrivees;
    }

    /**
     * Setter of all of the offers of car transport which ends by this city.
     * @param offres_arrivees the new List type which contains the offers
     */
    public void setOffres_arrivees(List<Offre> offres_arrivees) {
        this.offres_arrivees = offres_arrivees;
    }

    /**
     * Getter of all of the offers of car transport which pass by this city.
     * @return a List type which contains the offers
     */
    public List<Offre> getOffres_etapes() {
        return offres_etapes;
    }

    /**
     * Setter of all of the offers of car transport which pass by this city.
     * @param offres_etapes the new List type which contains the offers
     */
    public void setOffres_etapes(List<Offre> offres_etapes) {
        this.offres_etapes = offres_etapes;
    }
}
