package navigation;

import interfaces.NavigationSystem;

public class Garmin  implements NavigationSystem {
    public boolean createRoute() {

        System.out.println("Route was created by Garmin");

        return true;
    }
}
