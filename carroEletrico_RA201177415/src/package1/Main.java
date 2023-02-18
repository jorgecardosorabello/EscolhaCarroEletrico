package package1;

import java.util.Scanner;

public class Main {
    
    /**
     * @param args
     */
    public static void main(String[] args) {
        int opc;
        int anoDeFabricacao;
        int velocidadeMaxima;
        int autonomia;
        int tempoDeCarregamento;
        float preco;
        String marca;
        String modelo;


        Oficina novaOficina = new Oficina();
        Carro novoCarro = new Carro();
        
        Scanner teclado = new Scanner(System.in);


        do{
            System.out.println("\n------------------------");
            System.out.println("       MENU");
            System.out.println("Escolha uma opção:");
            System.out.println("1 - Cadastrar novo carro.");
            System.out.println("2 - Apresentar Carros.");
            System.out.println("0 - Sair.");
            System.out.println("------------------------");

            opc = teclado.nextInt();
            teclado.nextLine();

            switch (opc){
                case 1:
                    System.out.println("Insira os dados do novo carro.\n");

                    System.out.println("Marca:");
                    marca = teclado.nextLine();

                    System.out.println("Modelo:");
                    modelo = teclado.nextLine();

                    System.out.println("Ano de Fabricação:");
                    anoDeFabricacao = teclado.nextInt();
                    teclado.nextLine();

                    System.out.println("Velocidade Máxima(Km/h): ");
                    velocidadeMaxima = teclado.nextInt();
                    teclado.nextLine();

                    System.out.println("Autonomia(Km): ");
                    autonomia = teclado.nextInt();
                    teclado.nextLine();

                    System.out.println("Tempo de carregamento(h): ");
                    tempoDeCarregamento = teclado.nextInt();
                    teclado.nextLine();

                    System.out.println("Preço:");
                    preco = teclado.nextInt();
                    teclado.nextLine();


                    novoCarro = new Carro(marca, modelo, anoDeFabricacao, velocidadeMaxima, autonomia, tempoDeCarregamento, preco);
                    
                    novaOficina.insereCarro(novoCarro);
                    
                    break;
                case 2:
                    novaOficina.listarSituacoes();
                    break;
                case 0:
                    System.out.println("Programa encerrado!");
                    break;
                default:
                System.out.println("Digite uma opção válida!");
            }

        }while(opc != 0);
    }
}
