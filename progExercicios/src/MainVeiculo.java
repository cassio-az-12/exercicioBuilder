import builders.VeiculoBuilder;
import entidades.Veiculo;

import java.sql.SQLOutput;

public class MainVeiculo {
    public static void main(String[] args) {
        Veiculo astra = new VeiculoBuilder()
                .setTipo("carro")
                .setCor("vermelho")
                .setRodas(4)
                .build();

        Veiculo MT03 = new VeiculoBuilder()
                .setTipo("moto")
                .setCor("azul")
                .setRodas(2)
                .build();

        System.out.println(astra.toString());
        System.out.println(MT03.toString());
    }
}
