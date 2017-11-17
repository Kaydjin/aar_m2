package entities;

import javax.persistence.*;
import java.util.*;

import static javax.persistence.FetchType.EAGER;

@Entity
public class Offre {

    @OneToMany (mappedBy = "offre")
    private List<Demande> demandes;
    @ManyToOne
    private Ville depart;
    @ManyToOne
    private Ville arrivee;
    @ManyToOne
    private Vehicule vehicule;
    @ManyToOne
    private Utilisateur emetteur;
    @ManyToMany
    private List<Ville> etapes;

    @ElementCollection(fetch=EAGER)
    private Set<Float> tarif;
    private float tarif_complet;

    @ElementCollection(fetch=EAGER)
    private Set<Date> horaire;
    @Temporal(TemporalType.TIMESTAMP)
    private Date horaire_depart;
    @Temporal(TemporalType.TIMESTAMP)
    private Date horaire_arrivee;


    @Id @GeneratedValue
    private int id_offre;
    private int limite_places;
    private boolean voyage_partitionner;
    @Temporal(TemporalType.DATE)
    private Date date;

    public Offre() {
        etapes = new ArrayList<>();
        demandes = new ArrayList<>();
        tarif = new HashSet<>();
        horaire = new HashSet<>();
    }

    public Offre(Ville depart, Ville arrivee, Vehicule vehicule, Utilisateur emetteur,
                 Date horaire_depart, Date horaire_arrivee, int limite_places,
                 boolean voyage_partitionner, Date date, float tarif_complet) {
        this();
        this.depart = depart;
        this.arrivee = arrivee;
        this.vehicule = vehicule;
        this.emetteur = emetteur;
        this.horaire_depart = horaire_depart;
        this.horaire_arrivee = horaire_arrivee;
        this.limite_places = limite_places;
        this.voyage_partitionner = voyage_partitionner;
        this.date = date;
        this.tarif_complet = tarif_complet;
    }

    public int getId_offre() {
        return id_offre;
    }

    public void setId_offre(int id_offre) {
        this.id_offre = id_offre;
    }

    public int getLimite_places() {
        return limite_places;
    }

    public void setLimite_places(int limite_places) {
        this.limite_places = limite_places;
    }

    public Ville getDepart() {
        return depart;
    }

    public void setDepart(Ville depart) {
        this.depart = depart;
    }

    public Ville getArrivee() {
        return arrivee;
    }

    public void setArrivee(Ville arrivee) {
        this.arrivee = arrivee;
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

    public Utilisateur getEmetteur() {
        return emetteur;
    }

    public void setEmetteur(Utilisateur emetteur) {
        this.emetteur = emetteur;
    }

    public Set<Float> getTarif() {
        return tarif;
    }

    public void setTarif(Set<Float> tarif) {
        this.tarif = tarif;
    }

    public boolean isVoyage_partitionner() {
        return voyage_partitionner;
    }

    public void setVoyage_partitionner(boolean voyage_partitionner) {
        this.voyage_partitionner = voyage_partitionner;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Set<Date> getHoraire() {
        return horaire;
    }

    public void setHoraire(Set<Date> horaire) {
        this.horaire = horaire;
    }

    public List<Demande> getDemandes() {
        return demandes;
    }

    public void setDemandes(List<Demande> demandes) {
        this.demandes = demandes;
    }

    public Date getHoraire_depart() {
        return horaire_depart;
    }

    public void setHoraire_depart(Date horaire_depart) {
        this.horaire_depart = horaire_depart;
    }

    public Date getHoraire_arrivee() {
        return horaire_arrivee;
    }

    public void setHoraire_arrivee(Date horaire_arrivee) {
        this.horaire_arrivee = horaire_arrivee;
    }

    public float getTarif_complet() {
        return tarif_complet;
    }

    public void setTarif_complet(float tarif_complet) {
        this.tarif_complet = tarif_complet;
    }
}
