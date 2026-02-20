import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //clase - objeto - instancia

        Scanner teclado = new Scanner(System.in);


    Vehiculo v1 = new Vehiculo();


    v1.setModelo("Mazda");
    v1.setNumMotor("abc123");
    v1.setSerial("123456789");

        System.out.println( v1.toString());

        v1.arrancar();
        System.out.println(v1.frenar());
        System.out.println("ESTOY TANQUEANDO " + v1.tanquear());
        System.out.println("ESTOY RETANQUEANDO " + v1.retanquear(28));


    Vehiculo v2 = new Vehiculo("ford", "xyz987", "xyx123456789");
        System.out.println( v2.toString());
        v2.arrancar();
        System.out.println(v2.frenar());
        System.out.println("ESTOY TANQUEANDO " + v2.tanquear());
        System.out.println("ESTOY RETANQUEANDO " + v2.retanquear(37));


        /*
        Vehiculo v3 = new Vehiculo();

        System.out.println("INGRESE EL MODELO DEL VEHICULO");
        v3.setModelo(teclado.next());

        System.out.println("INGRESE EL NUMERO DEL VEHICULO");
        v3.setNumMotor(teclado.next());

        System.out.println("INGRESE EL SERIAL DEL VEHICULO");
        v3.setSerial(teclado.next());


        System.out.println(v3.toString());
*/

    }
}