
package Aula12CursoemVideo;

public class App {
    
    public static void main(String[] args) {
    Mamifero m = new Mamifero();
    Reptil r = new Reptil();
    Peixe p =new Peixe();
    Ave a = new Ave();
    
    m.setPeso(35.3f);
    m.setCorPelo("Marrom");
    m.alimentar();
    m.locomover();
    m.emitirSom();
    
    r.locomover();
    p.locomover();
    a.locomover();
    
    Cachorro k = new Cachorro();
    
    k.emitirSom();
    }
}
