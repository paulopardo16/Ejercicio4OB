package ClasesHijas;

import ClaseBase.SmartDevice;

public class SmartWatch extends SmartDevice {

    public String correa;
    public boolean camara;
    public SmartWatch() {
    }

    public SmartWatch(String marca, String modelo, double tamPantalla, double bateria, boolean destapable, String correa, boolean camara) {
        super(marca, modelo, tamPantalla, bateria, destapable);
        this.correa = correa;
        this.camara = camara;
    }
}
