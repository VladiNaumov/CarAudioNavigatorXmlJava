package navigation;


import interfaces.NavigationSystem;

public class Navitel implements NavigationSystem {
    public boolean createRoute() {

        System.out.println("Route was created by Garmin");

        return true;
    }
}
