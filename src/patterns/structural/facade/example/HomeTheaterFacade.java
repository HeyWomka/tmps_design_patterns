package patterns.structural.facade.example;

public class HomeTheaterFacade {
    private TV tv;
    private SoundSystem soundSystem;
    private DVDPlayer dvdPlayer;

    public HomeTheaterFacade(TV tv, SoundSystem soundSystem, DVDPlayer dvdPlayer) {
        this.tv = tv;
        this.soundSystem = soundSystem;
        this.dvdPlayer = dvdPlayer;
    }

    public void watchMovie() {
        System.out.println("Getting ready to watch a movie...");
        tv.on();
        tv.setInputChannel();
        soundSystem.on();
        soundSystem.setVolume(5);
        dvdPlayer.on();
        dvdPlayer.play();
    }

    public void endMovie() {
        System.out.println("Shutting movie theater down...");
        dvdPlayer.stop();
        dvdPlayer.off();
        soundSystem.off();
        tv.off();
    }
}
