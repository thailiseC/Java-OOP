
package Aula11CursoemVideo;

public final class Tecnico extends Aluno {
    
    private int registroProfissional;
    
    public void praticar() {
        System.out.println("Aluno técnico está no laboratório praticando...");
    }

    public int getRegistroProfissional() {
        return registroProfissional;
    }

    public void setRegistroProfissional(int registroProfissional) {
        this.registroProfissional = registroProfissional;
    }
}
