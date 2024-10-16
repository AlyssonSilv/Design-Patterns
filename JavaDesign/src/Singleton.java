public class Singleton {
    // Atributo privado estático para a única instância
    private static Singleton instancia;

    // Construtor privado para evitar instanciamento externo
    private Singleton() {
        // Inicialização, se necessário
    }

    // Método público estático para obter a instância
    public static Singleton getInstancia() {
        if (instancia == null) {
            instancia = new Singleton();
        }
        return instancia;
    }

    // Exemplo de método na classe Singleton
    public void mostrarMensagem() {
        System.out.println("Olá, sou uma instância Singleton!");
    }
}
