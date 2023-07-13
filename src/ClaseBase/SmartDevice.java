package ClaseBase;

public class SmartDevice {

    public String marca;
    public String modelo;
    public double tamPantalla;
    public double bateria;
    public boolean destapable;
    public SmartDevice() {

    }
    public SmartDevice(String marca, String modelo, double tamPantalla, double bateria, boolean destapable) {
        this.marca = marca;
        this.modelo = modelo;
        this.tamPantalla = tamPantalla;
        this.bateria = bateria;
        this.destapable = destapable;
    }
}
