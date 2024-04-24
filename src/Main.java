import Ejercicio.Electrodomestico;
import Ejercicio.Lavadora;
import Ejercicio.Television;

        public class Main {
            public static void main(String[] args) {

                Electrodomestico[] electrodomesticos = new Electrodomestico[10];
                electrodomesticos[0] = new Lavadora(200, "blanco", 'B', 120, 60);
                electrodomesticos[1] = new Television(400, "rojo",'A' , 10, 10, false);
                electrodomesticos[2] = new Electrodomestico(150, "rojo",'E', 15);
                electrodomesticos[3] = new Lavadora(300, 40);
                electrodomesticos[4] = new Television(500, 30);
                electrodomesticos[5] = new Electrodomestico(200, "blanco", 'F', 80);
                electrodomesticos[6] = new Lavadora(250, "gris", 'A', 200, 35);
                electrodomesticos[7] = new Television(450,"negra" , 'F', 8, 50, true);
                electrodomesticos[8] = new Electrodomestico(350, 23);
                electrodomesticos[9] = new Lavadora(350, "blanco", 'B', 90, 50);

                for (int i = 0; i < electrodomesticos.length; i++) {
                    System.out.println("Electrodomestico #" + (i + 1) + ": " + electrodomesticos[i].toString());
                }
            }
        }


