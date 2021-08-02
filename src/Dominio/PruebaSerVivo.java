
package Dominio;

public class PruebaSerVivo {
    public static void main(String[] args) {
        System.out.println("Seres Vivos y su alimentacion "
                + "(Ejemplos Particulares)");
        System.out.println("");
        Planta pl = new Planta ();
        pl.Nombre();
        pl.Alimentarse();
        System.out.println("------------------------------------------------");
        
        AnimalCarnivoro ac = new AnimalCarnivoro ();
        ac.Nombre();
        ac.Alimentarse();
        System.out.println("------------------------------------------------");
        
        AnimalHerbivoro ah = new AnimalHerbivoro ();
        ah.Nombre();
        ah.Alimentarse();
    }
}
