package entities;

public class Audio extends Riproducibile {
    // --- COSTRUTTORI
    public Audio(String nome, int volume){
        super(nome, volume);
    }

    public Audio(String nome){
        super(nome);
    }

    public Audio(String nome, int volume, int durata){
      super(nome, volume, durata);
    }

    // --- METODI
    @Override
    public void play() {
        String valVolume = "";
       for (int i = 0; i<this.getVolume(); i++){
           valVolume = valVolume + "!";
       }
       for (int i = 0; i<this.getDurata(); i++) {
           System.out.println(this.getNome() + valVolume);
       }
    }

    // --- STAMPA
    @Override
    public String toString() {
        return "Audio{" +
                "nome=" + this.getNome() +
                ", volume=" + this.getVolume() +
                ", durata=" + this.getDurata() +
                '}';
    }
}
