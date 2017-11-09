package Entity;

import java.io.Serializable;

/**
 * Created by user on 11/9/2017.
 */
public class Person implements Serializable {
    private String name;
    private String family;
    private int kodemeli;
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
