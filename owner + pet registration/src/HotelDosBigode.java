import java.util.ArrayList;
import java.util.List;

class Cliente {
    private String nome;
    private String dataNascimento;
    private String endereco;
    private String email;
    private String celular;
    private String instagram;
    private String twitter;
    private String whatsapp;

    public Cliente(String nome, String dataNascimento, String endereco, String email, String celular,
                   String instagram, String twitter, String whatsapp) {
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.endereco = endereco;
        this.email = email;
        this.celular = celular;
        this.instagram = instagram;
        this.twitter = twitter;
        this.whatsapp = whatsapp;
    }

    
    public String toString() {
        return "Cliente{" +
                "nome='" + nome + '\'' +
                ", dataNascimento='" + dataNascimento + '\'' +
                ", endereco='" + endereco + '\'' +
                ", email='" + email + '\'' +
                ", celular='" + celular + '\'' +
                ", instagram='" + instagram + '\'' +
                ", twitter='" + twitter + '\'' +
                ", whatsapp='" + whatsapp + '\'' +
                '}';
    }
}

public class HotelDosBigode {
    private List<Cliente> clientes;

    public HotelDosBigode() {
        this.clientes = new ArrayList<>();
    }

    public void adicionarCliente(Cliente cliente) {
        clientes.add(cliente);
    }

    public void mostrarClientes() {
        for (Cliente cliente : clientes) {
            System.out.println(cliente);
        }
    }

    public static void main(String[] args) {
        HotelDosBigode sistema = new HotelDosBigode();

        
        Cliente cliente1 = new Cliente("João Silva", "01/01/1990", "Rua A, 123", "joao@example.com",
                "999999999", "joao_insta", "joao_twitter", "123456789");
        Cliente cliente2 = new Cliente("Maria Oliveira", "15/05/1985", "Rua B, 456", "maria@example.com",
                "888888888", "maria_insta", "maria_twitter", "987654321");

        sistema.adicionarCliente(cliente1);
        sistema.adicionarCliente(cliente2);

        sistema.mostrarClientes();
    }
}
