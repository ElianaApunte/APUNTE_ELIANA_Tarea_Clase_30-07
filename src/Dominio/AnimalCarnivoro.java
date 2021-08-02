
package Dominio;

public class AnimalCarnivoro extends Animal{

    @Override
    public void Nombre() {
        System.out.println("Cocodrilo");
    }

    @Override
    public void Alimentarse() {
        System.out.println("Se alimenta de Carne (Carnivoro)");
    }

    
}
