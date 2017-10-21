package entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Vehicule {

    @Id @GeneratedValue
    private int idVehicule;
    private String type;
    private int nbrPlacesMax;

    public int getIdVehicule() {
        return idVehicule;
    }

    public void setIdVehicule(int idVehicule) {
        this.idVehicule = idVehicule;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getNbrPlacesMax() {
        return nbrPlacesMax;
    }

    public void setNbrPlacesMax(int nbrPlacesMax) {
        this.nbrPlacesMax = nbrPlacesMax;
    }
}
