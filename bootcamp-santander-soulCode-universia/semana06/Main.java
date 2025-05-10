package semana06;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println();
        System.out.println(
                "(Pizzaria Soulcode) Crie uma classe para representar uma pizza: tamanho (P, M, G, GG), uma lista de sabores, o status da pizza (pronta, em cozimento, pendente, entregue), comBorda;\r\n"
                        + //
                        "O atributo status deve ser privado;\r\n" + //
                        "Deve haver um método para alterar o status;\r\n" + //
                        "Crie um método para calcular o preço final da pizza. Sendo que o preço da P = 20, M = 40, G = 60 e GG = 80. Para cada sabor adicional na lista de sabores acrescente 5 reais. Se a pizza tiver borda acrescente 3 reais;\r\n"
                        + //
                        "Crie um objeto a partir da classe e utilize todas as funcionalidades;\r\n" + //
                        "Por exemplo, se a pizza é M e possui borda e 4 sabores, o cálculo é = 40 (preço base) + 3 (borda) + 3 (sabores adicionais) * 5 (preço de cada sabor adicional)");

        System.out.println();

        Pizza pizza = new Pizza(TamanhoPizza.M, Arrays.asList("Margherita", "Pepperoni", "Calabresa","Alite"), true);
        pizza.alterarStatus(StatusPizza.EM_COZIMENTO);
        System.out.println(pizza.getDescricao());
        System.out.println("Preço final da pizza: R$" + pizza.calcularPrecoFinal());
        System.out.println();

        Pizza pizza1 = new Pizza(TamanhoPizza.P, Arrays.asList("Gamurra", "Alite", "Mussarella"), false);
        pizza.alterarStatus(StatusPizza.ENTREGUE);
        System.out.println(pizza1.getDescricao());
        System.out.println("Preço final da pizza: R$" + pizza1.calcularPrecoFinal());
        System.out.println();

        Pizza pizza2 = new Pizza(TamanhoPizza.GG, Arrays.asList("Avelã com Brócolis"), true);
        pizza.alterarStatus(StatusPizza.PENDENTE);
        System.out.println(pizza2.getDescricao());
        System.out.println("Preço final da pizza: R$" + pizza2.calcularPrecoFinal());
        System.out.println();

        Pizza pizza3 = new Pizza(TamanhoPizza.G, Arrays.asList("Goiabada"), false);
        pizza.alterarStatus(StatusPizza.ENTREGUE);
        System.out.println(pizza3.getDescricao());
        System.out.println("Preço final da pizza: R$" + pizza3.calcularPrecoFinal());
        System.out.println("-------------------------------------------------------------");


        System.out.println("-------------------------------------------------------------");
        System.out.println("(Sistema SoulJava) Crie uma classe para representar um sistema. Ele possui um atributo status (execução, falha, pausado);\r\n" + //
                "O atributo status deve ser privado;\r\n" + //
                "Deve haver um método para alterar o status do sistema;\r\n" + //
                "Deve haver um método notificar que dependendo do status emite uma mensagem diferente.");
        Sistema vefificarSistema = new Sistema();

        vefificarSistema.alterarStatus("Oculto");

        vefificarSistema.alterarStatus(StatusSistema.PAUSADO);
        vefificarSistema.notificar();

    }
}
