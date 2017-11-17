package entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * @author vogel jimmy
 */
@Entity
public class Vehicule {


    /**
     * Entity key
     */
    @Id @GeneratedValue
    private int id_vehicule;

    /**
     * Parameters descriptive of a car.
     */
    private String type;
    private int limite_places;

    /**
     * Empty constructor for the Entity manager.
     */
    public Vehicule(){}

    /**
     * Constructor with all the parameters of a new ville.
     * @param type the type of car(brand, model)
     * @param places numbers of places maximum in this car
     */
    public Vehicule(String type, Integer places){
        this.type = type;
        this.limite_places = places;
    }

    /**
     * Getter of the auto-increment id of the car
     * @return the id as an integer
     */
    public int getId_vehicule() {
        return id_vehicule;
    }

    /**
     * Setter of the id of the car.
     * @implNote should not be used
     * @param id_vehicule the new id as an int type
     */
    public void setId_vehicule(int id_vehicule) {
        this.id_vehicule = id_vehicule;
    }

    /**
     * Getter of the type of the car.
     * @return the type of the car as a string type
     */
    public String getType() {
        return type;
    }

    /**
     * Setter of the type of the car.
     * @param type the new type of the car as a String format
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * Getter of the number of maximum places in the car.
     * @return the limit of places as an int type
     */
    public int getLimite_places() {
        return limite_places;
    }

    /**
     * Setter of the number of places in the car.
     * @param limite_places the new limit of places as an int
     */
    public void setLimite_places(int limite_places) {
        this.limite_places = limite_places;
    }
}
