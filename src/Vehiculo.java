public class Vehiculo {
    //ATRIBUTOS
    private String modelo;
    private String numMotor;
    private String serial;

    //constructor vacio


    public Vehiculo() {
    }

    //CONTRUCTOR con todos los parametros


    public Vehiculo(String modelo, String numMotor, String serial) {
        this.modelo = modelo;
        this.numMotor = numMotor;
        this.serial = serial;
    }

//GETTER AND SETTER

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getNumMotor() {
        return numMotor;
    }

    public void setNumMotor(String numMotor) {
        this.numMotor = numMotor;
    }

    public String getSerial() {
        return serial;
    }

    public void setSerial(String serial) {
        this.serial = serial;
    }

    //TO STRING


    @Override
    public String toString() {
        return "Vehiculo{" +
                "modelo='" + modelo + '\'' +
                ", numMotor='" + numMotor + '\'' +
                ", serial='" + serial + '\'' +
                '}';
    }
    //METODOS PROPIOS
    public void arrancar(){
        System.out.println("SOY UN CARRO Y VOY A ARRANCAR");
    }

public String frenar(){

        return "ESTOY FRENANDO";
}
public int tanquear (){
        return 56;
}
public int retanquear (int cantidad){

        int c = 56;

        return c + cantidad;

}


}
