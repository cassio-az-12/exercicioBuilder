import builders.RelatorioBuilder;
import entidades.Relatorio;

public class MainRelatorio {
    public static void main(String[] args) {
        Relatorio relatorio = new RelatorioBuilder()
                .setTitulo("Relatorio de compras")
                .setCorpo("corpo teste")
                .setRodape("Baliticos")
                .build();
        System.out.println(relatorio.toString());
    }
}
