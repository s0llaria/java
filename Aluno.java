public class Aluno {

    private String nome;
    private String enderecoResidencial;
    private String telefoneContato;
    private String email;
    private String matricula;

    public Aluno(String nome, String enderecoResidencial, String telefoneContato, String email, String matricula) {
        this.nome = nome;
        this.enderecoResidencial = enderecoResidencial;
        this.telefoneContato = telefoneContato;
        this.email = email;
        this.matricula = matricula;
    }

    @Override
    public String toString() {
        return "Aluno{" +
                "nome='" + nome + '\'' +
                ", enderecoResidencial='" + enderecoResidencial + '\'' +
                ", telefoneContato='" + telefoneContato + '\'' +
                ", email='" + email + '\'' +
                ", matricula='" + matricula + '\'' +
                '}';
    }
}
