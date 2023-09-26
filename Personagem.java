public class Personagem {
    // Variáveis de instância => A instância é sinônimo de um objeto
    private String nome;
    private int energia;
    private int fome;
    private int sono;

    // Tipos de retorno e lista de parâmetros
    public Personagem(String nome, int energia, int fome, int sono) {
        this.nome = nome;
        this.energia = energia;
        this.fome = fome;
        this.sono = sono;
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
        if (fome >= 1) {
            fome -= 1;
            energia += 1;
            energia = Math.min(energia + 1, 10);
            System.out.printf("%s se alimentou e tem %d de energia.\n", nome, energia);
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
            sono -= 1;
            energia += 1;
            System.out.println(nome + " foi dormir, e está com " + sono + " de sono e " + energia + " de energia.\n");
        } else {
            System.out.println(nome + " está sem sono!\n");
        }
    }

}