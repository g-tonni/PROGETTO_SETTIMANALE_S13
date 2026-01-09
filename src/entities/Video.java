package entities;

import interfaces.Luminosi;

public class Video extends Riproducibile implements Luminosi {
    // --- ATTRIBUTI
    private int luminosita;

    // --- COSTRUTTORI
    public Video(String nome, int volume){
        super(nome, volume);
        this.luminosita = 10;
    }

    public Video(String nome){
        super(nome);
        this.luminosita = 10;
    }

    public Video(String nome, int volume, int durata){
        super(nome, volume, durata);
        this.luminosita = 10;
    }

    public Video(String nome, int volume, int durata, int luminosita){
        super(nome, volume, durata);
        if (luminosita < 0) {
           this.luminosita = 0;
        } else if (luminosita > 20) {
           this.luminosita = 20;
        } else {
           this.luminosita = luminosita;
        }
    }

    // --- METODI
    @Override
    public void aumentaLuminosita(int luminosita) {
        int lumFinale = this.luminosita + luminosita;
        if(lumFinale < 0 || lumFinale > 20) System.out.println("Valore non valido");
        else this.luminosita = lumFinale;
    }

    @Override
    public void abbassaLuminosita(int luminosita) {
        int lumFinale = this.luminosita - luminosita;
        if(lumFinale < 0 || lumFinale > 20) System.out.println("Valore non valido");
        else this.luminosita = lumFinale;
    }

    @Override
    public void play() {
        String valVolume = "";
        String valLum = "";
        for (int i = 0; i<this.getVolume(); i++){
            valVolume = valVolume + "!";
        }
        for (int i = 0; i< this.luminosita; i++){
            valLum = valLum + "*";
        }
        for (int i = 0; i<this.getDurata(); i++) {
            System.out.println(this.getNome() + valVolume + valLum);
        }
    }

    // --- STAMPA
    @Override
    public String toString() {
        return "Video{" +
                "nome=" + this.getNome() +
                ", durata=" + this.getDurata() +
                ", volume=" + this.getVolume() +
                ", luminosità=" + this.luminosita +
                '}';
    }

}
