public class Paciente {    
    private int id;
    private String nome;
    private String email;
    //M�todos de Acesso
    //Log - procedimento - retorno vazio (void)
    public void setNome(String nome){
        this.nome = nome;
    }
    //Log - fun��o - retorno String, int, double...
    public String getNome(){
        return nome;
    }
    /* diferen�a entre construtor e m�todo set
     * 
     * O m�todo n�o faz tudo que o construtor faz
     * Mas o construtor faz tudo que o set faz
     * 
     * met�do set - atribue valor
     * construtor - cria o objeto e atribue valor
     * 
     * m�todo get - recupera o valor
     * 
     * toString() - m�todo da classe Object
     * sobrescrever (polimorfismo) - reutilizar
     * Imprime as caracter�sticas do objeto
     * 
     * toString()  - get
     * 
     * Construtor com sobrecarga - atribuir todos
     * ou alguns.
     * 
     * Construtor - set 
     */
    //Crie o set e o get do email


}