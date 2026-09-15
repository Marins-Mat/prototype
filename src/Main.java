import model.CartaoDeContato;

public class Main {
    public static void main(String[] args) {
        // Modelo-base já configurado com o padrão da empresa
        CartaoDeContato modelo = new CartaoDeContato("", "", "TechCorp", "azul");

        CartaoDeContato cartaoJoao = modelo.clone();
        cartaoJoao.setNome("João Silva");
        cartaoJoao.setTelefone("(71) 99999-0001");

        CartaoDeContato cartaoMaria = modelo.clone();
        cartaoMaria.setNome("Maria Souza");
        cartaoMaria.setTelefone("(71) 99999-0002");

        System.out.println(cartaoJoao);
        System.out.println(cartaoMaria);
    }
}