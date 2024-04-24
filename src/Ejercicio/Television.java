package Ejercicio;
public class Television extends  Electrodomestico {
    private float resolucion;
    private boolean sintonizadorTDT;

    public Television() {
        super();
        this.resolucion = 20.0f;
        this.sintonizadorTDT = false;
    }

    public  Television(float precio, float peso) {
        super(precio, peso);
    }

    public Television(double precioBase, String color, char consumoEnergetico,
                      double peso, float resolucion, boolean sintonizadorTDT) {
        super(precioBase, color, consumoEnergetico, peso);
        this.resolucion = resolucion;
        this.sintonizadorTDT = sintonizadorTDT;
    }

    public float getResolucion() {
        return resolucion;
    }

    public void setResolucion(float resolucion) {
        this.resolucion = resolucion;
    }

    public boolean isSintonizadorTDT() {
        return sintonizadorTDT;
    }

    public void setSintonizadorTDT(boolean sintonizadorTDT) {
        this.sintonizadorTDT = sintonizadorTDT;
    }

    @Override
    public double getPrecioBase(){
        double precioFinal = super.getPrecioBase();
        double nuevoPrecio = (30 * precioFinal) / 100;

        if (resolucion > 40){
            precioFinal += nuevoPrecio;
        }

        if (sintonizadorTDT) {
            precioFinal += 50;
        };

        return precioFinal;
    }
}
