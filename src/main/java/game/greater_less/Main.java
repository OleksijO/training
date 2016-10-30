package game.greater_less;

import game.greater_less.model.Model;

/**
 * Created by oleksij.onysymchuk@gmail on 29.10.2016.
 */
public class Main {

    public static void main(String... args) {

        Controller controller = new Controller(new Model(), new View());
        controller.playGame();
    }
}
