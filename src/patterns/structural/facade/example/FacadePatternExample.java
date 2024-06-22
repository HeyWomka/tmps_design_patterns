package patterns.structural.facade.example;

public class FacadePatternExample {
    public static void main(String[] args) {
        TV tv = new TV();
        SoundSystem soundSystem = new SoundSystem();
        DVDPlayer dvdPlayer = new DVDPlayer();

        HomeTheaterFacade homeTheater = new HomeTheaterFacade(tv, soundSystem, dvdPlayer);

        homeTheater.watchMovie();
        System.out.println();
        homeTheater.endMovie();
    }
}
