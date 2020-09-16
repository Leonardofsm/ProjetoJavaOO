
package PacoteJavaOO;

public class Pessoa {
    //criando atributos da classe Pessoa
    private String nome;
    private String email;
    private String telefone;
    private int idade;
    private String sexo;
    
    //criar os getters e setters - alt+insert
    
 //criando metodo construtor

    public Pessoa() {
    }
    

    //pegar as informações da variável = ler
    public String getNome() {
        return nome;
    }

    //pegar as informações e passar para a varável - escreve
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

}
