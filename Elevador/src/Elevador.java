public class Elevador {

    private int andarAtual;
    private int totalAndares;
    private boolean portaAberta;

    public Elevador(int totalAndares) {
        this.totalAndares = totalAndares;
        this.andarAtual = 0;
        this.portaAberta = false;
    }

    public void abrirPorta() {
        if (!portaAberta) {
            portaAberta = true;
            System.out.println("Porta aberta.");
        } else {
            System.out.println("A porta já está aberta.");
        }
    }

    public void fecharPorta() {
        if (portaAberta) {
            portaAberta = false;
            System.out.println("Porta fechada.");
        } else {
            System.out.println("A porta já está fechada.");
        }
    }

    public void subir() {
        if (portaAberta) {
            System.out.println("Não é possível subir com a porta aberta.");
        } else if (andarAtual < totalAndares) {
            andarAtual++;
            System.out.println("Subiu para o andar: " + andarAtual);
        } else {
            System.out.println("Já está no último andar.");
        }
    }

    public void descer() {
        if (portaAberta) {
            System.out.println("Não é possível descer com a porta aberta.");
        } else if (andarAtual > 0) {
            andarAtual--;
            System.out.println("Desceu para o andar: " + andarAtual);
        } else {
            System.out.println("Já está no térreo.");
        }
    }

    public void mostrarPorta() {
        System.out.println("Porta está " + (portaAberta ? "aberta" : "fechada"));
    }

    public void mostrarAndarAtual() {
        System.out.println("Andar atual: " + andarAtual);
    }
}