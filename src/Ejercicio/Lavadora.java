/*---------------------------------------------------------------------------------------------------------------------------------------------------------
 * Crearemos una subclase llamada Lavadora con las siguientes características: Su atributo es carga,
*  ademas de los atributos heredados. ✓
*
* Por defecto, la carga es de 5 kg.✓
* Usa una constante para ello.✓
*
* Los constructores que se implementaran serán:
* Un constructor por defecto.✓
* Un constructor con el precio y peso.✓
* El resto por defecto.✓
* Un constructor con la carga y el resto de atributos heredados.✓
*
* Recuerda que debes llamar al constructor de la clase padre.✓
* Los métodos que se implementara serán:✓
* Método get de carga.✓
* precioFinal():, si tiene una carga mayor de 30 kg, aumentara el precio 50 €, sino es así no se incrementara el precio.✓
*
* Llama al método padre y añade el código necesario.
*  Recuerda que las condiciones que hemos visto en la clase Electrodomestico también deben afectar al precio.✓
*
* ---------------------------------------------------------------------------------------------------------------------------------------------------------
*/
package Ejercicio;

public class Lavadora extends Electrodomestico{
    private double carga;
    private static final double cargaDefault = 5;        //constante

    /* Constructor por defecto.*/
    public Lavadora() {
        super();
        this.carga = cargaDefault;
    }

    public Lavadora(double precioBase, double peso) {
        super(precioBase, peso);
    }

    // constructor con carga y el resto de atributos heredados
    public Lavadora(double precioBase, String color, char consumoEnergetico, double peso, double carga) {
        super(precioBase, color, consumoEnergetico, peso);
        this.carga = carga;
    }

    public double getCarga(){
        return carga;
    }

    /*
La anotación @Override en Java
 se utiliza para indicar que un método está sobrescribiendo un
método de su clase padre (superclase).
 Esto ayuda a mejorar la legibilidad del código y
proporciona una verificación adicional por parte
del compilador para asegurarse de que el método está
sobrescribiendo correctamente un método de la superclase. */

    @Override
    public double getPrecioBase(){
        double precioFinal = super.getPrecioBase();
        if (carga>30){
            precioFinal += 50;
        }
        return precioFinal;
    }


}
