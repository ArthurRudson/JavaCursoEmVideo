package aula06;
public class ControleRemoto implements Controlador {
    // Atributos 
    private int volume;
    private boolean ligado;
    private boolean tocado;
    // Metodos Especiais 

    public ControleRemoto() {
        this.volume = 50;
        this.ligado = true;
        this.tocado = false;
    }

    private int getVolume() {
        return volume;
    }

    private void setVolume(int volume) {
        this.volume = volume;
    }

    private boolean getLigado() {
        return ligado;
    }

    private void setLigado(boolean ligado) {
        this.ligado = ligado;
    }

    private boolean getTocado() {
        return tocado;
    }

    private void setTocado(boolean tocado) {
        this.tocado = tocado;
    }
    
    // Metodos Abistratos 

    @Override
    public void ligar() {
        this.setLigado(true);
    }

    @Override
    public void desligar() {
        this.setLigado(false);
    }

    @Override
    public void abrirMenu() {
        System.out.println("-------- MENU ----------");
        System.out.println("Esta ligado? " + this.getLigado());
        System.out.println("Esta tocando? "+ this.getTocado());
        System.out.print("Volume " + this.getVolume());
        for (int i = 0; i <= this.getVolume(); i++){
            System.out.print("|");
        }
        System.out.println("");
    }

    @Override
    public void fecharMeno() {
        System.out.println("Fechando Menu...");
    }

    @Override
    public void maisVolume() {
        if (this.getLigado()){
            this.setVolume(this.getVolume() + 5);
        } else {
            System.out.println("Imposivel aumentar volume");
        }
    }

    @Override
    public void menosVolume() {
        if (this.getLigado()){
            this.setVolume(this.getVolume() - 5);
        } else {
            System.out.println("Impossivel diminuir volume");
        }
    }

    @Override
    public void ligarMudo() {
        if (this.getLigado() && this.getVolume() > 0){
            this.setVolume(0);
        }
    }

    @Override
    public void desligarMudo() {
        if (this.getLigado() && this.getVolume() == 0){
            this.setVolume(50);
        }
    }

    @Override
    public void play() {
        if (this.getLigado() && !(this.getTocado())){
            this.setTocado(true);
        } else {
            System.out.println("Nao consegui reproduzir");
        }
    }

    @Override
    public void pause() {
        if (this.getLigado() && this.getTocado()){
            this.setTocado(false);
        } else {
            System.out.println("Nao consegui pausar");
        }
    }
    
    
}