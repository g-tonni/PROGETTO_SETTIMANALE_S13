import entities.Audio;
import entities.ElementoMultimediale;
import entities.Immagine;
import entities.Video;

void main() {
    Scanner scanner = new Scanner(System.in);
    ElementoMultimediale[] lettoreMusicale = new ElementoMultimediale[5];

    for(int i = 0; i<lettoreMusicale.length; i++){
        System.out.println("Scegli 1 per aggiungere un Audio, 2 per aggiungere un'Immagine o 3 per aggiungere un Video: ");
        int scelta = Integer.parseInt(scanner.nextLine());
        if (scelta == 1){
            System.out.println("Nome dell'Audio: ");
            String nome = scanner.nextLine();
            System.out.println("Volume dell'Audio (da 0 a 15): ");
            int volume = Integer.parseInt(scanner.nextLine());
            System.out.println("Durata dell'Audio (NON numeri negativi): ");
            int durata = Integer.parseInt(scanner.nextLine());
            lettoreMusicale[i] = new Audio(nome, volume, durata);
        } else if(scelta == 2) {
            System.out.println("Nome dell'Immagine: ");
            String nome = scanner.nextLine();
            System.out.println("Luminosità dell'Immagine (da 0 a 20): ");
            int luminosita = Integer.parseInt(scanner.nextLine());
            lettoreMusicale[i] = new Immagine(nome, luminosita);
        } else if(scelta == 3) {
            System.out.println("Nome del Video: ");
            String nome = scanner.nextLine();
            System.out.println("Volume del Video (da 0 a 15): ");
            int volume = Integer.parseInt(scanner.nextLine());
            System.out.println("Durata del Video (NON numeri negativi): ");
            int durata = Integer.parseInt(scanner.nextLine());
            System.out.println("Luminosità dell'Immagine (da 0 a 20): ");
            int luminosita = Integer.parseInt(scanner.nextLine());
            lettoreMusicale[i] = new Video(nome, volume, durata, luminosita);
        } else {
            System.out.println("Valore non valido");
        }
    }

    // System.out.println(Arrays.toString(lettoreMusicale));
}