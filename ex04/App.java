
package Aula06CursoemVideo;

public class App {

    public static void main(String[] args) {
        
        ControleRemoto c = new ControleRemoto();
        
        c.ligar();
        c.maisVolume();
        c.play();
        c.abrirMenu();       
        c.fecharMenu();
    }
}
