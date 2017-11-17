package entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import java.util.Calendar;

@Entity
public class Commentaire {


    @ManyToOne
    private Utilisateur emetteur;
    @ManyToOne
    private Utilisateur recepteur;

    @Id
    @GeneratedValue
    private int id_commentaire;
    private String message;
    private int note;
    private Calendar date;

    public Commentaire(){ }

    public Commentaire(String message, Utilisateur emetteur, Utilisateur recepteur, int note){
        this();
        this.message=message;
        this.emetteur = emetteur;
        this.recepteur = recepteur;
        this.note=note;
        date = Calendar.getInstance();
    }

    public Utilisateur getEmetteur() {
        return emetteur;
    }

    public void setEmetteur(Utilisateur emetteur) {
        this.emetteur = emetteur;
    }

    public Utilisateur getRecepteur() {
        return recepteur;
    }

    public void setRecepteur(Utilisateur recepteur) {
        this.recepteur = recepteur;
    }

    public int getId_commentaire() {
        return id_commentaire;
    }

    public void setId_commentaire(int id_commentaire) {
        this.id_commentaire = id_commentaire;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public int getNote() {
        return note;
    }

    public void setNote(int note) {
        this.note = note;
    }

    public Calendar getDate() {
        return date;
    }

    public void setDate(Calendar date) {
        this.date = date;
    }
}
