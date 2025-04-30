
public class SistemaMedida {

    public static void main(String[] args) {

        String sigla = "A";

        // Usando o switch para verificar o sistema de medida
        switch (sigla) {
            case "p":
                System.out.println("Sistema Métrico Decimal");
                break;
            case "A":
                System.out.println("Sistema Imperial");
                break;
            default:
                System.out.println("Sistema não reconhecido");
        }

    }

}
