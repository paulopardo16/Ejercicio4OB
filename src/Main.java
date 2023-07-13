import ClaseBase.SmartDevice;
import ClasesHijas.SmartPhone;
import ClasesHijas.SmartWatch;

public class Main {

    public static void main(String[] args) {

        SmartPhone iPhone12 = new SmartPhone("Apple","12",6.1,2815,false,12,12,3,false);

        SmartWatch GalaxyWatch4 = new SmartWatch("Samsung","Galaxy Watch 4",1.40,3.61,false,"Silicona",false);

        System.out.println(iPhone12.marca+"\n"+iPhone12.modelo);
        System.out.println(GalaxyWatch4.marca+"\n"+GalaxyWatch4.camara);
    }
}
