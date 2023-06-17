package org.example;

public class Carro implements Veiculo {

    private String marca;
    private String modelo;

    public Carro(String marca, String modelo){
        this.marca = marca;
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }
    public String aceitar(Visitor visitor) {
        return visitor.exibirInfoCarro(this);
    }
}
