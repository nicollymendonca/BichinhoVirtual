public class Animais{
    private String nome, classe, familia;
    private int caloria, idade;
    private boolean estado;
    public int forca;

    public Animais(String nome, String classe, String familia){
        this.nome = nome;
        this.classe = classe;
        this.familia = familia;
        forca = 10;
        caloria = 10;
        idade = 0;
        estado = true;

    }

    public void comer() {
        if (caloria < 100 && estado) {
            caloria = caloria + 10;
            forca = forca - 2;
            System.out.println( " O animal comeu e agora sua força é de " + forca +" e suas calorias valem " + caloria );
        }
        else{
            System.out.println(" Seu animal está satisfeito!! :)  ");
        }
    }
    
    public void correr() {
        if (estado && caloria != 0) {
            forca = forca - 5;
            caloria = caloria - 5;
            System.out.println( " O animal está correndo!! Agora sua força é de " + forca + " e suas calorias valem " + caloria );
        }
        else{
            System.out.println(" Seu animal está cansado :( ");
        }
    }

    public void dormir() {
        if (estado){
            forca = forca + 10;
            caloria = caloria - 2;
            System.out.println(" O animal está dormindo agora! Sua força aumentou para " + forca + " e suas calorias aumentaram para " + caloria);
        }
        else{
            System.out.println("Seu animal morreu!!:( ");
        }
    }
        public String toString() {
        return " O animal se chama " + this.nome + " é da classe " + this.classe + " da família " + this.familia + ". O animal possui força de " + forca + ", caloria de " + caloria + " e idade de " +idade;
    }

    public void morrer() {
        forca = 0;
        estado = false;
        System.out.println(" O animal morreu! ");
    }
}