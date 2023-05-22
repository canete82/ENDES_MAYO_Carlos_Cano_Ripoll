package figuras;
/**
 * Clase para crear objetos de tipo Circulo y calcular su area y perimetro
 * @author Carlos
 * @version 1.0
 */
public class Circulo {

    private double radio;
    private String color;
    
    /**
     * Contructor por defecto de la clase Circulo.
     */
    public Circulo(){
        
    }
    /**
     * Constructor con parámetros de la clase circulo para instanciar objetos
     * de tipo Circulo.
     * @param radio De tipo double.
     * @param color De tipo String.
     */
    public Circulo(double radio, String color) {
        this.radio = radio;
        this.color = color;
    }
    /**
     * Método para obtener el valor del atributo radio.
     * @return Retorna el valor de tipo double.
     */
    
    public double getRadio() {
        return radio;
    }
    /**
     * Método para modificar el valor del atributo radio, recibe como parámetro
     * un valor de tipo double.
     * @param radio De tipo double.
     */
    public void setRadio(double radio) {
        this.radio = radio;
    }
    /**
     * Método para obtener el valor del atributo color.
     * @return Retorna el valor de tipo String.
     */
    public String getColor() {
        return color;
    }
    /**
     * Método para modificar el valor del atributo color, recibe como parámetro
     * un valor de tipo String.
     * @param color De tipo String.
     */
    public void setColor(String color) {
        this.color = color;
    }

    
    public static int numCirculos;
    /**
     * Método para clacular el area de un circulo.
     * @return Retorna un valor de tipo double con el resultado.
     */
    public double calculoArea() {
        if (this.radio < 0) {
            throw new IllegalArgumentException("Radio negativo");
        }
        return (Math.pow(radio, 2) * Math.PI);
    }
    /**
     * Métod para calcular el perímetro del un circulo.
     * @return Retorna un valor de tipo double con el resultado.
     * @throws Exception Excepción que lanza el método si se procuce un error si
     *         el valor es negativo o el radio es muy grande.
     */
    public double calculoPerimetro() throws Exception {
        if (this.radio < 0) {
            throw new Exception("Radio negativo");
        } else if (radio >= 100) {
            throw new Exception("Radio muy grande");
        } else {
            return (2 * Math.PI * this.radio);
        }
    }

}
