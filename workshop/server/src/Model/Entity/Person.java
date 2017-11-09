package Model.Entity;

import java.io.Serializable;
import java.rmi.Remote;

/**
 * Created by user on 11/9/2017.
 */
public class Person implements Serializable {
    private int id;
    private String name;
    private String family;
    private int kodemeli;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFamily() {
        return family;
    }

    public void setFamily(String family) {
        this.family = family;
    }

    public int getKodemeli() {
        return kodemeli;
    }

    public void setKodemeli(int kodemeli) {
        this.kodemeli = kodemeli;
    }
}
