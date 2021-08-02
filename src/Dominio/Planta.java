
package Dominio;

public class Planta extends SerVivo {

    @Override
    public void Nombre() {
        System.out.println("Geranio (Planta Ornamental)");
    }
    
    @Override
    public void Alimentarse() {
        System.out.println("Se alimenta de los nutrientes del suelo "
                + "y la luz solar");
    }

}
