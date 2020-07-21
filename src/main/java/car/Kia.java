package car;

import interfaces.AudioSystem;
import interfaces.Car;
import interfaces.NavigationSystem;

public class Kia implements Car {
    private AudioSystem audioSystem;
    private NavigationSystem navigationSystem;

    public Kia() {
    }

    public Kia(AudioSystem audioSystem, NavigationSystem navigationSystem) {
        this.audioSystem = audioSystem;
        this.navigationSystem = navigationSystem;
    }

    public void move() {

        System.out.println("KIA in action");

    }

    public AudioSystem getAudioSystem() {
        return audioSystem;
    }

    public void setAudioSystem(AudioSystem audioSystem) {
        this.audioSystem = audioSystem;
    }

    public NavigationSystem getNavigationSystem() {
        return navigationSystem;
    }

    public void setNavigationSystem(NavigationSystem navigationSystem) {
        this.navigationSystem = navigationSystem;
    }


}
