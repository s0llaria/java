public class Principal {

    public static void main(String[] args) {
        Aluno aluno1 = new Aluno("João Silva", "Rua 123, Bairro Centro, Cidade XYZ", "(85) 9999-9999",
                "joaosilva@email.com", "123456789");
        Aluno aluno2 = new Aluno("Maria Souza", "Rua 456, Bairro Jardim, Cidade XYZ", "(85) 8888-8888",
                "mariasouza@email.com", "987654321");

        System.out.println(aluno1);
        System.out.println(aluno2);
    }
}