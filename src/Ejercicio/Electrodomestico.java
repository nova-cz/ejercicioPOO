package Ejercicio;

public class Electrodomestico {
    protected double precioBase;
    protected String color;
    protected char consumoEnergetico;
    protected double peso;

    protected static final String[] COLORES_DISPONIBLES = {"blanco", "negro", "rojo", "azul", "gris"};
    protected static final char[] CONSUMOS_ENERGETICOS = {'A', 'B', 'C', 'D', 'E', 'F'};
    protected static final double PRECIO_BASE_DEFECTO = 100;
    protected static final double PESO_DEFECTO = 5;

    //Por defecto
    public Electrodomestico() {
        this.precioBase = PRECIO_BASE_DEFECTO;
        this.color = COLORES_DISPONIBLES[0];
        this.consumoEnergetico = CONSUMOS_ENERGETICOS[5];
        this.peso = PESO_DEFECTO;
    }

    //Constructor con el precio y peso.
    public Electrodomestico(double precioBase, double peso) {
        this.precioBase = precioBase;
        this.peso = peso;
    }

    //Con todos los atributos
    public Electrodomestico(double precioBase, String color, char consumoEnergetico, double peso) {
        this.precioBase = precioBase;
        this.color = color;
        this.consumoEnergetico = consumoEnergetico;
        this.peso = peso;
    }

    public double getPrecioBase() {
        return precioBase;
    }

    public String getColor(){
        return  color;
    }

    public char getConsumoEnergetico() {
        return consumoEnergetico;
    }

    public double getPeso() {
        return  peso;
    }

        //los zetas
    public void  setColor(String color){
        this.color = color;
    }

    public void setConsumoEnergetico(char consumoEnergetico) {
        this.consumoEnergetico = consumoEnergetico;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    private char comprobarComsumoEnergetico(char letra) {

        if(letra >= 'A' && letra <= 'F') {
            return letra;
        } else {
            return CONSUMOS_ENERGETICOS[5];
        }
    }

    private String comprobarColor(String color) {
        String[] colores = {"blanco", "negro", "rojo", "azul", "gris"};
        for (String c : colores){
            if (c.equals(color)){
                return c;
            }
        }
        return COLORES_DISPONIBLES[0];
    }

}
