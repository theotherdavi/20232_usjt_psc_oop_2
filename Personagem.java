public class Personagem {
    // Variáveis de instância => A instância é sinônimo de um objeto
    private String nome;
    private int energia = 10;
    private int fome = 0;
    private int sono = 0;
    private int inventory = 0;
    private boolean alive = true;

    // Tipos de retorno e lista de parâmetros
    public Personagem(String name) {
        this.nome = name;
    }

    public Personagem(int energia, int fome, int sono, int inventory) {
        this.energia = energia;
        this.fome = fome > 10 || fome < 0 ? this.fome : fome;
        this.sono = sono;
        this.alive = true;
        this.inventory = inventory > 10 || inventory < 0 ? this.inventory : inventory;
        ;
    }

    /*
     * Quando o personagem caça, ele gasta dois pontos de energia. Ele somente pode
     * caçar caso tenha pelo menos dois pontos de energia. Em qualquer caso, seus
     * níveis de fome e sono sobem de um ponto.
     */
    void hunt() {
        if (energia >= 2) {
            energia -= 2;
            System.out.println(nome + " foi caçar, e tem " + energia + " de energia.");
            inventory += 1;
        } else
            System.out.println(nome + " está sem energia!");
        fome = Math.min(fome + 1, 10);
        sono = sono + 1 > 10 ? 10 : sono + 1;
    }

    /*
     * Quando o personagem come, ele reduz de 1 ponto seu nível de fome. Além disso,
     * seu nível de energia aumenta de 1. Ele somente come se tiver nível de fome
     * maior ou igual a 1.
     */
    void eat() {
        if (fome >= 1 && inventory >= 1) {
            fome--;
            energia++;
            energia = Math.min(energia + 1, 10);
            inventory -= 1;
            System.out.printf("%s se alimentou e tem %d de energia e %d alimentos..\n", nome, energia, inventory);
        } else if (fome >= 1 && inventory < 1) {
            System.out.println(nome + " não tem o que comer!");
        } else
            System.out.println(nome + " está sem fome!");
    }

    /*
     * Quando o personagem dorme, ele reduz de 1 ponto seu nível de sono. Além
     * disso, seu nível de energia aumenta de 1. Ele somente dorme se tiver nível de
     * sono maior ou igual a 1.
     */
    void sleep() {
        if (sono >= 1) {
            sono--;
            energia++;
            energia = Math.min(energia + 1, 10);
            System.out.println(nome + " foi dormir, e está com " + sono + " de sono e " + energia + " de energia.\n");
        } else {
            System.out.println(nome + " está sem sono!\n");
        }
    }

    boolean isAlive() {
        if (sono == 10 || fome == 10 || energia == 0)
            die();
        return alive;
    }

    void die() {
        alive = false;
        System.out.println("Oh não! " + nome + " morreu.");
    }

}