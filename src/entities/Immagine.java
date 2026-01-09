package entities;

import interfaces.Luminosi;

public class Immagine extends ElementoMultimediale implements Luminosi {
    // --- ATTRIBUTI
    private int luminosita;

    // --- COSTRUTTORI
    public Immagine(String nome){
        super(nome);
        this.luminosita = 10;
    }

    public Immagine(String nome, int luminosita){
        super(nome);
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

    public void show(){
        String valLum = "";
        for (int i = 0; i< this.luminosita; i++){
            valLum = valLum + "*";
        }
        System.out.println(this.getNome() +  valLum);
    }

    // --- STAMPA
    @Override
    public String toString() {
        return "Immagine{" +
                "nome=" + this.getNome() +
                ", luminosita=" + luminosita +
                '}';
    }
}
