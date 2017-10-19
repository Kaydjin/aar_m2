package ejbs;

import javax.ejb.Local;
import java.util.Date;
import java.util.List;

@Local
public interface Facade {

    //?
    public void login(String login, String password);

    public void logout();

    public void inscrition(String login, String password, Utilisateur utilisateur);

    public String getCourantUtilisateur(String login);

    public List<Ville> getVillesDeserviees();

    public List<Offres> getOffresEnCours();

    public void addReservation(String login, Offres offre);

    //voir comment réduire la fonction
    //list de prix = etapes + 1
    public void addOffre(String login, Vehicule vehicule,
                         Ville depart, Date dateDepart,
                         Ville arrive, Date dateArrive,
                         List<Ville> etapes, List<Date> dateEtapes,
                         List<float> prix);

    public int prixMoyen(Ville depart, Ville arrive);

    public List<Float> prixParEtapes(Offres offre);

    public List<Ville> etapesDArrivees(Offres offre);

    public List<Demande> demandeEnCours(String login);

    public void reponseDemande(String login, Demande demande);

    public void addCommentaire(String login, Utilisateur utilisateur, String message, int etoile);

    public List<Commentaires> getCommentaire(String login);

    public void annulation(String login, Offres offre);

    public int getInscrit();

    public int getNbOffres();

    public int getPrixTotalReserve();


    //admin
    public void addGabarits(String login, String gabarit);
    public void removeGabarits(String login, String gabarit);
    public void addVilleDeservies(String login, String ville);
    public void removeVilleDeservies(String login, String ville);


}
