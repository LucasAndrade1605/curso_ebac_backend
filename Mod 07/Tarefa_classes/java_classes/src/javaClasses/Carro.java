package javaClasses;

/**
 * Representa um carro com características básicas como marca, modelo, cor e velocidade.
 */
public class Carro {

    private String marca;
    private String modelo;
    private String cor;
    private int velocidadeAtual;
    private int velocidadeMaxima;

    /**
     * Construtor para criar um objeto Carro com marca, modelo, cor e velocidade máxima.
     *
     * @param marca            Marca do carro.
     * @param modelo           Modelo do carro.
     * @param cor              Cor do carro.
     * @param velocidadeMaxima Velocidade máxima do carro.
     */
    public Carro(String marca, String modelo, String cor, int velocidadeMaxima) {
        this.marca = marca;
        this.modelo = modelo;
        this.cor = cor;
        this.velocidadeMaxima = velocidadeMaxima;
        this.velocidadeAtual = 0; // Inicia parado
    }
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

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public int getVelocidadeAtual() {
        return velocidadeAtual;
    }

    public void setVelocidadeAtual(int velocidadeAtual) {
        this.velocidadeAtual = velocidadeAtual;
    }

    public int getVelocidadeMaxima() {
        return velocidadeMaxima;
    }

    public void setVelocidadeMaxima(int velocidadeMaxima) {
        this.velocidadeMaxima = velocidadeMaxima;
    }

    /**
     * Acelera o carro em uma quantidade específica, sem ultrapassar a velocidade máxima.
     *
     * @param quantidade Quantidade a acelerar.
     */
    public void acelerar(int quantidade) {
        if ((velocidadeAtual + quantidade) > velocidadeMaxima) {
            velocidadeAtual = velocidadeMaxima;
        } else {
            velocidadeAtual += quantidade;
        }
        System.out.println("Velocidade atual: " + velocidadeAtual + " km/h");
    }

    /**
     * Reduz a velocidade do carro em uma quantidade específica, sem ir abaixo de 0.
     *
     * @param quantidade Quantidade a reduzir.
     */
    public void frear(int quantidade) {
        if ((velocidadeAtual - quantidade) < 0) {
            velocidadeAtual = 0;
        } else {
            velocidadeAtual -= quantidade;
        }
        System.out.println("Velocidade atual: " + velocidadeAtual + " km/h");
    }

    /**
     * Retorna as informações completas do carro.
     *
     * @return Informações do carro.
     */
    @Override
    public String toString() {
        return "Carro{" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", cor='" + cor + '\'' +
                ", velocidadeAtual=" + velocidadeAtual +
                ", velocidadeMaxima=" + velocidadeMaxima +
                '}';
    }
}

