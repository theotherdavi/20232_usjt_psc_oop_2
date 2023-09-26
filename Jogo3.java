import java.util.Random;
import java.lang.Thread;

public class Jogo3 {
    public static void main(String[] args) throws Exception {
        Personagem hunter = new Personagem("Mateus");
        var gerador = new Random();
        for (;;) {
            int choice = gerador.nextInt(3) + 1;

            switch (choice) {
                case 1:
                    hunter.hunt();
                    break;

                case 2:
                    hunter.sleep();
                    break;

                case 3:
                    hunter.eat();
                    break;
            }
            Thread.sleep(2000);
        }
    }
}
