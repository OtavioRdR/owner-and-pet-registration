import java.util.Scanner;

public class PetCadastro {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bem-vindo ao cadastro de pets!");
        System.out.print("Informe o nome do pet: ");
        String nome = scanner.nextLine();

        System.out.print("Informe a data de nascimento do pet (DD/MM/AAAA): ");
        String dataNascimento = scanner.nextLine();

        System.out.print("Informe a raça do pet: ");
        String raca = scanner.nextLine();

        // Crie uma instância de Pet com os dados informados
        Pet pet = new Pet(nome, dataNascimento, raca);

        // Exiba as informações do pet cadastrado
        System.out.println("\nPet cadastrado com sucesso:");
        System.out.println("Nome: " + pet.getNome());
        System.out.println("Data de Nascimento: " + pet.getDataNascimento());
        System.out.println("Raça: " + pet.getRaca());

        scanner.close();
    }
}

class Pet {
    private String nome;
    private String dataNascimento;
    private String raca;

    public Pet(String nome, String dataNascimento, String raca) {
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.raca = raca;
    }

    public String getNome() {
        return nome;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public String getRaca() {
        return raca;
    }
}
