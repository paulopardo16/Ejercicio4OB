package ClasesHijas;

import ClaseBase.SmartDevice;

public class SmartPhone extends SmartDevice {

     public int camaraPrin;
     public int camaraFron;
     public int numCamaras;
     public boolean lapiz;

     public SmartPhone() {
     }

     public SmartPhone(String marca, String modelo, double tamPantalla, double bateria, boolean destapable, int camaraPrin, int camaraFron, int numCamaras, boolean lapiz) {
          super(marca, modelo, tamPantalla, bateria, destapable);
          this.camaraPrin = camaraPrin;
          this.camaraFron = camaraFron;
          this.numCamaras = numCamaras;
          this.lapiz = lapiz;
     }
}
