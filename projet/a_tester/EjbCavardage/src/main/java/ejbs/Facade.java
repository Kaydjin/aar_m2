package ejbs;

import entities.*;

import javax.ejb.Local;
import java.util.Date;
import java.util.List;

@Local
public interface Facade {

    //FAIT
    public Utilisateur login(String login, String password);

    //FAIT
    public void logout();


    //SI j'ai bien compris c'est l'inscription sur le site??
    //Si c'est le cas je me permet de modifier la fonction je l'a laisse en commentaire
    //public void inscription(String login, String password, Utilisateur utilisateur);
    //FAIT
    public Utilisateur inscription(String login, String pass, String name, String firstName);

    /**
     * Vérifier lors de l'inscription qu'un utilisateur n'a pas deja le même login ou mot de passe
     * @param login
     * @param userPass
     * @return retourne false si le login ou mot de passe est déjà pris
     */

    public boolean verificationInscriptionDoublon(String login, String userPass);


    //FAIT
    public Utilisateur getUtilisateur(String login);

    public List<Ville> getVillesDeserviees(int id_offre);

    public List<Offre> getOffresEnCours();

    public void addReservation(String login, Offre offre);

    //voir comment réduire la fonction
    //list de prix = etapes + 1
    public void addOffre(String login, Vehicule vehicule,
                         Ville depart, Date dateDepart,
                         Ville arrive, Date dateArrive,
                         List<Ville> etapes, List<Date> dateEtapes,
                         List<Float> prix);

    public int prixMoyen(Ville depart, Ville arrive);

    public List<Float> prixParEtapes(Offre offre);

    public List<Ville> etapesDArrivees(Offre offre);

    public List<Demande> demandeEnCours(String login);

    public void reponseDemande(String login, Demande demande);

    //src et dest sont des logins
    //FAIT
    public void addCommentaire(String src, String dest, String message, int etoile);

    //FAIT
    public List<Commentaire> getSentComments(String login);

    //FAIT
    public List<Commentaire> getRecieveComment(String login);

    public void annulation(String login, Offre offre);

    //FAIT
    public List<Utilisateur> getInscrits();

    public int getNbOffres();

    public int getPrixTotalReserve();


    //admin
    public void addGabarits(String login, String gabarit);
    public void removeGabarits(String login, String gabarit);
    public void addVilleDeservies(String login, String ville);
    public void removeVilleDeservies(String login, String ville);

}
