import java.util.Random;

public class Jogo4 {
    public static void main(String[] args) throws Exception {
        Personagem hunter = new Personagem("Mateus");
        var gerador = new Random();
        while (hunter.isAlive()) {
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
            Thread.sleep(100);
        }
    }
}
