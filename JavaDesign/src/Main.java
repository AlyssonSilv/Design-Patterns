public class Main {
    public static void main(String[] args) {
        // Obtendo a instância do Singleton
        Singleton singleton1 = Singleton.getInstancia();
        singleton1.mostrarMensagem();

        // Obtendo outra referência à instância
        Singleton singleton2 = Singleton.getInstancia();

        // Verificando se ambas as referências são a mesma instância
        System.out.println("singleton1 == singleton2: " + (singleton1 == singleton2));
    }
}
