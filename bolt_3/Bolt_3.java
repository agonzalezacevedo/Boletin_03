package bolt_3;

import java.util.Scanner;

public class Bolt_3 {

    public static void main(String[] args) {
    Scanner xd = new Scanner (System.in);    
       consumo obxConsumo1 = new consumo();
       obxConsumo1.setKm(50F);
       obxConsumo1.setPGas(1.57F);
       obxConsumo1.amosar();
       consumo obxConsumo2 = new consumo(30,50,90.4F,7.3F);
//      obxConsumo2.amosar();
        float valor=obxConsumo2.consuMedio();
        System.out.println("Consumo medio= "+valor);
        obxConsumo2.setLitros(10);
//      float var=obxConsumo2.getVMed(); //se pondria var en su lugar
        System.out.println("Velocidade media= "+obxConsumo2.getVMed());
          System.out.println("Cantos litros: ");
          float litro = xd.nextFloat();
          obxConsumo1.setLitros(litro);
        System.out.println("Litros "+obxConsumo1.getLitros());
    
    
    }
    
}
