import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, Fono");
        Exercicio ex = new Exercicio("Soprar bolinhas de algod�o",
                                     "Usar canudo para soprar bolinhas por um caminho at� um alvo",
                                     "/",
                                     2,
                                     "/");
        Exercicio ex1 = new Exercicio("Vibrar l�bios",
                                      "Fazer os l�bios vibrarem, como um som de motor de carro, para relaxar a musculatura e aquecer a voz",
                                      "brrrrr - som de motor");
        
        System.out.println("nome:"+ex.getNome());
        System.out.println("descri��o:"+ex.getDescricao());
        System.out.println("som:"+ex.getSom());
        System.out.println("tempo m�nimo:"+ex.getTempoMin());
        System.out.println("exemplo:"+ex.getExemplo());

        System.out.println("nome:"+ex1.getNome());
        System.out.println("descri��o:"+ex1.getDescricao());
        System.out.println("exemplo:"+ex1.getExemplo());

        
/*Crie mais dois objetos exercicicos - construtor e get
 * Crie mais dois objetos clinica - construtor e get 
 * Crie mais dois objetos paciente - construtor e get
 * Crie mais dois objetos profissional - construtor e get
 */
    
 Exercicio ex2 = new Exercicio("Apito do Navio");
 System.out.println("Nome:"+ex2.getNome());

 Clinica c1 = new Clinica("FonoTech","1234567895236");
 System.out.println(c1.getNome());
 System.out.println(c1.getCnpj());

 Profissional p1 = new Profissional("Jacobson","61987789876");
 System.out.println("nome: "+p1.getNome()+ "\ntelefone:"+p1.getTelefone());

    }
}


