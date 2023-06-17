package org.example;

public class VeiculoVisitor implements Visitor {

    public String exibir(Veiculo veiculo) {
        return veiculo.aceitar(this);
    }

    @Override
    public String exibirInfoCarro(Carro carro) {
        return "Carro{" +
                "Marca=" + carro.getMarca() +
                ", Modelo='" + carro.getModelo() + '\'' +
                '}';
    }

    @Override
    public String exibirInfoMoto(Moto moto) {
        return "Moto{" +
                "Marca=" + moto.getMarca() +
                ", Modelo='" + moto.getModelo() + '\'' +
                '}';
    }
}
