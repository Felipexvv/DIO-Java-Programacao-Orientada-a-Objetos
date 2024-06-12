public class Main {
    public static void main(String[] args) {

        Cliente felix = new Cliente("Paulo");

        Cliente doquinha = new Cliente("Laura");

        Conta cc = new ContaCorrente(felix);
        Conta cp = new ContaPoupanca(doquinha);

        cc.imprimirExtrato();
        cc.depositar(500);
        cc.transferir(150, cp);
        cp.imprimirExtrato();
    }
}
