package PacoteJavaOO;

public class ProjetoJavaOO {
    public static void main(String[] args) {
        Pessoa ps;
        
        ps = new Pessoa();
        
        ps.setNome("Leonardo Mendonca");
        ps.setEmail("leo@leo.com");
        ps.setTelefone("11 951472888");
        ps.setIdade(22);
        ps.setSexo("Masculino");
        
        //String meuNome = ps.getNome();
        //String meuSexo = ps.getSexo();
        
        System.out.println("O nome inserido foi: " + ps.getNome() + "\n" + "Sexo: " + ps.getEmail());
    }
    
    
}
