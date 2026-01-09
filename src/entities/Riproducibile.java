package entities;

public abstract class Riproducibile extends ElementoMultimediale{

    // --- ATTRIBUTI
    private int volume;
    private int durata;

    // --- COSTRUTTORI
    public Riproducibile(String nome){
        super(nome);
        this.volume = 5;
        this.durata = 5;
    }

    public Riproducibile(String nome, int volume){
        super(nome);
        if (volume < 0) {
            this.volume = 0;
        } else if (volume > 15){
            this.volume = 15;
        } else {
            this.volume = volume;
        }
        this.durata = 5;
    }

    public Riproducibile(String nome, int volume, int durata){
        super(nome);
        if (volume < 0) {
            this.volume = 0;
        } else if (volume > 15){
            this.volume = 15;
        } else {
            this.volume = volume;
        }

        if(durata < 1) this.durata = 1;
        else this.durata = durata;
    }

    // --- SETTER
    public void setVolume(int volume) {
        this.volume = volume;
    }

    public void setDurata(int durata) {
        this.durata = durata;
    }

    // --- GETTER
    public int getVolume() {
        return volume;
    }

    public int getDurata() {
        return durata;
    }

    // --- METODI
    public void alzaVolume(int vol) {
        int volumeFinale = this.volume + vol;
        if(volumeFinale < 0 || volumeFinale > 15) System.out.println("Valore non valido");
        else this.volume = volumeFinale;
    }

    public void abbassaVolume(int vol) {
        int volumeFinale = this.volume - vol;
        if(volumeFinale < 0 || volumeFinale > 15) System.out.println("Valore non valido");
        else this.volume = volumeFinale;
    }

    public abstract void play();

    // --- STAMPA
    @Override
    public String toString() {
        return "Riproducibile{" +
                "nome=" + this.getNome() +
                ", volume=" + volume +
                ", durata=" + durata +
                '}';
    }
}
