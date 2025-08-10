import java.util.ArrayList;
import java.util.List;

public class Banco {
    private String nome;
    private List<Conta> contas = new ArrayList<>();

    public Banco(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public List<Conta> getContas() {
        return contas;
    }

    public void adicionarConta(Conta conta) {
        contas.add(conta);
    }

    public void mostrarClientes() {
        System.out.println("Clientes do banco " + nome + ":");
        for (Conta conta : contas) {
            System.out.println(conta.getCliente().getNome());
        }
    }
}
