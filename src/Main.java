public class Main {
    public static void main(String[] args) {
        Cliente venilton = new Cliente("Venilton");

        Conta cc = new ContaCorrente(venilton);
        Conta poupanca = new ContaPoupanca(venilton);

        Banco banco = new Banco("Banco Legal");
        banco.adicionarConta(cc);
        banco.adicionarConta(poupanca);

        cc.depositar(100);
        cc.transferir(100, poupanca);

        cc.imprimirExtrato();
        poupanca.imprimirExtrato();

        banco.mostrarClientes();
    }
}
