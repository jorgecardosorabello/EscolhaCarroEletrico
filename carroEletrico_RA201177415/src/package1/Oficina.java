package package1;

import java.util.ArrayList;

public class Oficina {
    ArrayList<Carro> listaDeCarros;

    public Oficina() {
        this.listaDeCarros = new ArrayList<>(); 
    }

    void insereCarro(Carro novoCarro){
        listaDeCarros.add(novoCarro);
    }

    void listarSituacoes(){
        System.out.println("\nSituações de todos carros:");

        for(Carro carroNaLista:listaDeCarros){
            carroNaLista.mostraSituacao();
        }
    }
    
}

