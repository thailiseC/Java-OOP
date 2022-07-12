
package Aula11CursoemVideo;

public class App {

    public static void main(String[] args) {
        Aluno a1 = new Aluno();
        a1.setNome("Naruto");
        a1.setMatricula(1111);
        a1.setCurso("Ninjutsu");
        a1.setIdade(16);
        a1.setSexo("M");
        a1.pagarMensalidade();
        
        Bolsista b1 = new Bolsista();
        b1.setMatricula(1112);
        b1.setNome("Hinata");
        b1.setCurso("Genjutsu");
        b1.setIdade(16);
        b1.setBolsa(12.5f);
        b1.setSexo("F");
        b1.pagarMensalidade();
    }
}
