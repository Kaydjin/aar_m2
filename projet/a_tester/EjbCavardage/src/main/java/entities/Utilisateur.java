package entities;


import javax.persistence.*;
import java.util.Calendar;
import java.util.HashSet;
import java.util.Set;

import static javax.persistence.FetchType.EAGER;

@Entity
public class Utilisateur {


    @OneToMany (mappedBy = "emetteur")
    private Set<Commentaire> mes_commentaires;
    @OneToMany (mappedBy = "recepteur")
    private Set<Commentaire> commentaires;
    @OneToMany(mappedBy = "emetteur")
    private Set<Offre> mes_offres;
    @OneToMany (mappedBy = "emetteur")
    private Set<Demande> offres;

    @ElementCollection(fetch=EAGER)
    private Set<String> notifications;

    @Id
    @GeneratedValue
    private int id_utilisateur;
    private String email;
    private String nom;
    private String prenom;
    private String pseudo;
    private String mot_de_passe;
    private Calendar date_derniere_connection;

    public Utilisateur(){
        date_derniere_connection = Calendar.getInstance();
        mes_commentaires = new HashSet<Commentaire>();
        commentaires = new HashSet<Commentaire>();
        mes_offres = new HashSet<Offre>();
        offres = new HashSet<Demande>();
        notifications = new HashSet<String>();
    }

    public Set<Demande> getOffres() {
        return offres;
    }

    public void setOffres(Set<Demande> offres) {
        this.offres = offres;
    }

    public Utilisateur(String nom, String prenom, String pseudo, String mot_de_passe, String email){
        this();
        this.nom = nom;
        this.prenom = prenom;
        this.pseudo = pseudo;
        this.mot_de_passe = mot_de_passe;
        this.email = email;
        java.util.Date date = new java.util.Date();
        date_derniere_connection.setTimeInMillis(date.getTime());
        date_derniere_connection.add(Calendar.MONTH, -1);
    }

    public int getId_utilisateur() {
        return id_utilisateur;
    }

    public void setId_utilisateur(int id_utilisateur) {
        this.id_utilisateur = id_utilisateur;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getPseudo() {
        return pseudo;
    }

    public void setPseudo(String pseudo) {
        this.pseudo = pseudo;
    }

    public String getMot_de_passe() {
        return mot_de_passe;
    }

    public void setMot_de_passe(String mot_de_passe) {
        this.mot_de_passe = mot_de_passe;
    }

    public Calendar getDate_derniere_connection() {
        return date_derniere_connection;
    }

    public void setDate_derniere_connection(Calendar date_derniere_connection) {
        this.date_derniere_connection = date_derniere_connection;
    }

    public Set<Commentaire> getMes_commentaires() {
        return mes_commentaires;
    }

    public void setMes_commentaires(Set<Commentaire> mes_commentaires) {
        this.mes_commentaires = mes_commentaires;
    }

    public Set<Commentaire> getCommentaires() {
        return commentaires;
    }

    public void setCommentaires(Set<Commentaire> commentaires) {
        this.commentaires = commentaires;
    }

    public Set<Offre> getMes_offres() {
        return mes_offres;
    }

    public void setMes_offres(Set<Offre> mes_offres) {
        this.mes_offres = mes_offres;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Set<String> getNotifications() {
        return notifications;
    }

    public void setNotifications(Set<String> notifications) {
        this.notifications = notifications;
    }
}

