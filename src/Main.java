import entities.Audio;
import entities.ElementoMultimediale;
import entities.Immagine;
import entities.Video;

void main() {
    Scanner scanner = new Scanner(System.in);
    ElementoMultimediale[] lettoreMusicale = new ElementoMultimediale[5];

    // --- SCELTA INIZIALE ( 1 - Audio, 2 - Immagine, 3 - Video )
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
            System.out.println("Luminosità del Video (da 0 a 20): ");
            int luminosita = Integer.parseInt(scanner.nextLine());
            lettoreMusicale[i] = new Video(nome, volume, durata, luminosita);
        } else {
            System.out.println("Valore non valido");
        }
    }

    // System.out.println(Arrays.toString(lettoreMusicale));

    // --- RIPRODUZIONE (da 1 a 5 per scegliere l'elemento, 0 per uscire, se si premono numeri diversi il ciclo ricomincia)
    while (true) {
        System.out.println("Scegli un numero da 1 a 5 per riprodurre un file multimediale, premere 0 per uscire: ");
        int scelta = Integer.parseInt(scanner.nextLine());
        if (scelta == 0) break;
        if (scelta < 0 || scelta > 5) {
            System.out.println("Valore non valido");
            continue;
        }
        if (lettoreMusicale[scelta - 1] instanceof Immagine){
           Immagine immagine = (Immagine) lettoreMusicale[scelta - 1];
           System.out.println("------- ELEMENTO SCELTO: " + immagine);
           immagine.show();
        } else if (lettoreMusicale[scelta - 1] instanceof Audio){
           Audio audio = (Audio) lettoreMusicale[scelta - 1];
           System.out.println("------- ELEMENTO SCELTO: " + audio);
           audio.play();
        } else if (lettoreMusicale[scelta - 1] instanceof Video){
           Video video = (Video) lettoreMusicale[scelta - 1];
           System.out.println("------- ELEMENTO SCELTO: " + video);
           video.play();
        }
    }
}