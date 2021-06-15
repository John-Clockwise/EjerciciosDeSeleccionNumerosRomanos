package numerosromanos;

import java.util.Scanner;

public class NumerosRomanos {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int numero;
        int miles, centenas, decenas, unidades, residuo;
        String romano = "";
        // do while usado para el rango de 1 a 1000
        try {
            do {

                System.out.println("Da el numero del 1 al 1000 para representar en numero romano");
                numero = leer.nextInt();
                residuo = numero;

                miles = residuo / 1000;
                residuo = residuo % 1000;

                centenas = residuo / 100;
                residuo = residuo % 100;

                decenas = residuo / 10;
                residuo = residuo % 10;

                unidades = residuo;

                for (int i = 1; i <= miles; i++) {
                    romano += "M";
                }
                switch (centenas) {
                    // casos de las centenas
                    case 1:
                        romano += "C";
                        break;
                    case 2:
                        romano += "CC";

                        break;
                    case 3:
                        romano += "CCC";

                        break;
                    case 4:
                        romano += "CD";

                        break;
                    case 5:
                        romano += "D";

                        break;
                    case 6:
                        romano += "DC";

                        break;
                    case 7:
                        romano += "DCC";

                        break;
                    case 8:
                        romano += "DCCC";

                        break;
                    case 9:
                        romano += "CM";

                        break;
                }
                switch (decenas) {
                    // casos de las decenas
                    case 1:
                        romano += "X";
                        break;
                    case 2:
                        romano += "XX";

                        break;
                    case 3:
                        romano += "XXX";

                        break;
                    case 4:
                        romano += "XL";

                        break;
                    case 5:
                        romano += "L";

                        break;
                    case 6:
                        romano += "LX";

                        break;
                    case 7:
                        romano += "LXX";

                        break;
                    case 8:
                        romano += "LXXX";

                        break;
                    case 9:
                        romano += "XC";

                        break;
                }
                switch (unidades) {
                    // casos de las unidades
                    case 1:
                        romano += "I";
                        break;
                    case 2:
                        romano += "II";

                        break;
                    case 3:
                        romano += "III";

                        break;
                    case 4:
                        romano += "IV";

                        break;
                    case 5:
                        romano += "V";

                        break;
                    case 6:
                        romano += "VI";

                        break;
                    case 7:
                        romano += "VII";

                        break;
                    case 8:
                        romano += "VIII";

                        break;
                    case 9:
                        romano += "IV";
                        break;
                }

                System.out.println("El numero en entero es = " + numero + " en numero en romano es = " + romano);
            } while (numero > 1000);
        } catch (java.util.InputMismatchException e) {
            System.out.println("Se necesita un numero entero");
        }

    }

}
