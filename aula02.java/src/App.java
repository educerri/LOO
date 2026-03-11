public class App {
    public static void main(String[] args) {
        Carro carro1 = new Carro("Toyota", "Corolla", 2020);
        Carro carro2 = new Carro("Honda", "Civic", 2019);
        
        System.out.println("Informações do Carro 1:");
        carro1.exibirInformacoes();
        
        System.out.println("\nInformações do Carro 2:");
        carro2.exibirInformacoes();}
    }
