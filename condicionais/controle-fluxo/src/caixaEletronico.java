
public class caixaEletronico {

    public static void main(String[] args) throws Exception {

        double saldo = 25.0;
        double valorSolicitado = 10.0;

        if (valorSolicitado < saldo) {

            saldo -= valorSolicitado;

            System.out.println(saldo);

        }
    }
}