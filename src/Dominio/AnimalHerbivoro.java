
package Dominio;

public class AnimalHerbivoro extends Animal {

    @Override
    public void Nombre() {
        System.out.println("Vaca");
    }

    @Override
    public void Alimentarse() {
        System.out.println("Se alimenta de Hierba (Herbivoro)");
    }
    
    
}
