import static jeroo.CompassDirection.*;
import static jeroo.RelativeDirection.*;
import jeroo.*;

public class JerooApp {

    public static void main(String[] args) {
        // Specify the relative path to a .jev file the working directory
        Map.getInstance().loadMap("maps/mazes/drew.jev");
        runJerooCode();
        new JerooGUI();
    }

    public static void runJerooCode() {
        // Jeroo code goes here
        Jeroo kim = new Jeroo();
        while(!kim.hasFlower()){
            kim.moveTendingRight();
        }
    }
}
