import entidades.Pizza;
import builders.PizzaBuilder;
public class MainPizza {
    public static void main(String[] args) {
        Pizza bacon = new PizzaBuilder()
                .setMassa("padrao")
                .setTamanho("G").setIngrediente("Bacon")
                .build();

        System.out.println(bacon.toString());
    }
}
