public class Main {

    public static void main(String[] args) {
    
    Pessoa p = new Pessoa();
        p.nome = "João";
        p.cpf = "123.456.789-00";
        p.out.println("Pessoa: " + pessoa.nome + ", CPF: " + pessoa.cpf);
        p.Andar();
        p.Estudar();
        
        Funcionario f = new Funcionario();
        f.nome = "Maria";
        f.cpf = "987.654.321-00";
        f.setor = "TI";
        f.matricula = 12345;
        System.out.println("\nFuncionario: " + funcionario.nome + ", CPF: " + funcionario.cpf + ", Setor: " + funcionario.setor);
        f.Andar();
        f.Estudar();
        f.ReceberSalario();

        // Criando uma instância de Aluno
        Aluno a = new Aluno();
        a.nome = "Carlos";
        a.cpf = "111.222.333-44";
        a.matricula = 67890;
        System.out.println("\nAluno: " + aluno.nome + ", CPF: " + aluno.cpf + ", Matrícula: " + aluno.matricula);
        a.Andar();
        a.Estudar();

        // Criando uma instância de Bolsista
        Bolsista b = new Bolsista();
        b.nome = "Ana";
        b.cpf = "555.666.777-88";
        b.matricula = 11223;
        b.isAtleta = true;
        System.out.println("\nBolsista: " + bolsista.nome + ", CPF: " + bolsista.cpf + ", Matrícula: " + bolsista.matricula + ", Atleta: " + bolsista.isAtleta);
        b.Andar();
        b.Estudar();
        b.Trabalhar();
    }
}
