package package1;

public class Carro {
    int anoDeFabricacao, velocidadeMaxima, autonomia, tempoDeCarregamento;
    String marca, modelo;
    float preco, situacao;
    double economia, valorKmRodado;

    public Carro(){
    }

    public Carro(String marca, String modelo, int anoDeFabricacao, int velocidadeMaxima,int autonomia, int tempoDeCarregamento, float preco){
        setMarca(marca);
        setModelo(modelo);
        setAnoDeFabricacao(anoDeFabricacao);
        setVelocidadeMaxima(velocidadeMaxima);
        setAutonomia(autonomia);
        setTempoDeCarregamento(tempoDeCarregamento);
        setPreco(preco);
        valorKm();
        calculoEconomia();
    }

    //getters e setters de nomes, modelos, ano, autonomia, velocidadeMaxima
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    
    
    public int getAnoDeFabricacao() {
        return anoDeFabricacao;
    }

    public void setAnoDeFabricacao(int anoDeFabricacao) {
        this.anoDeFabricacao = anoDeFabricacao;
    }
    
    public int getVelocidadeMaxima() {
        return velocidadeMaxima;
    }

    public void setVelocidadeMaxima(int velocidadeMaxima) {
        this.velocidadeMaxima = velocidadeMaxima;
    }
    
    public int getAutonomia() {
        return autonomia;
    }

    public void setAutonomia(int autonomia) {
        this.autonomia = autonomia;
    }
    
    public int getTempoDeCarregamento() {
        return tempoDeCarregamento;
    }

    public void setTempoDeCarregamento(int tempoDeCarregamento) {
        this.tempoDeCarregamento = tempoDeCarregamento;
    }
    
    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }
    
    // METODOS
    //listar situacoes referente as notas
    void mostraSituacao(){
        System.out.println("------------------------------");
        System.out.println("\nMarca: " + this.marca);
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Ano de Fabricação: " + this.anoDeFabricacao);
        System.out.println("Velocidade Máxima: " + this.velocidadeMaxima + "Km/h");
        System.out.println("Autonomia: " + this.autonomia + "Km");
        System.out.println("Tempo de Carregamento: " + this.tempoDeCarregamento + "h");
        System.out.println("Preço: R$" + this.preco);
        System.out.println("\nCusto por km rodado: R$ " + this.valorKmRodado );
        System.out.println("Economia: " + this.economia);
    }

    void valorKm(){
        /*
        * valor da energia gasta no tempoDeCarregamento é de R$ 0,90 por hora.
        * valor gasto para carregar uma bateria: 0,90 * tempo de tempoDeCarregamento
        * valor por km rodado: valor gasto para carregar uma bateria / autonomia.
        *
        *valorKmRodado = (  R$   *         h         ) /    Km
        *valorKmRodado = R$ h/ Km
        */            
        valorKmRodado = ((0.9) * tempoDeCarregamento) / autonomia;
    }

    void calculoEconomia(){
        /*
         * Atual R$ 200,00 por mês com combustível.
         * Primeiro descubra quanto André vai passa a gastar para percorrer 400 km: valor do km rodado * 400.
         * depois descubra o valor economizado por mês: 200 - valor para percorrer 400 km.
         * economia = R$ - ( R$ h/ Km) / R$
         */
         economia = 200 - (valorKmRodado * 400);
    }
}
