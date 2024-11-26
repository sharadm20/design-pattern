package facade;

public class HomeTheaterTestDrive {
    public static void main(String[] args) {
    // instantiate components here
    Amplifier amp = new Amplifier();
    Tuner tuner = new Tuner();
    StreamingPlayer player = new StreamingPlayer();
    Projector projector = new Projector();
    TheaterLights lights = new TheaterLights();
    Screen screen = new Screen();
    PopcornPopper popper = new PopcornPopper();
    HomeTheaterFacade homeTheater =
    new HomeTheaterFacade(amp, tuner, player,
    projector, screen, lights, popper);
    homeTheater.watchMovie("Raiders of the Lost Ark");
    homeTheater.endMovie();
    }
}