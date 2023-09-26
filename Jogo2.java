public class Jogo2 {
    public static void main(String[] args) throws Exception {
        Personagem hunter = new Personagem("Mateus");
        while (true) {
            hunter.hunt();
            hunter.eat();
            hunter.sleep();
            Thread.sleep(2000);

        }
    }
}
