package entities;

public abstract class ElementoMultimediale {
    // --- ATTRIBUTI
    private String nome;

    // --- COSTRUTTORI
    public ElementoMultimediale(String nome){
        this.nome = nome;
    }

    // --- SETTER
    public String getNome() {
        return nome;
    }

    // --- STAMPA

    @Override
    public String toString() {
        return "ElementoMultimediale{" +
                "nome='" + nome + '\'' +
                '}';
    }
}
