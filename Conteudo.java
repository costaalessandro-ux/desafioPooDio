
package desafiopoodio;


// CLASSE ABSTRACT.
// A CLASSE ABSTRACT DIZ QUE NÃO É POSSIVEL CRIAR UM CONTEUDO.
public abstract class Conteudo {
    
    // FOI CRIADA UMA VARIAVEL CONSTANTE.
    protected static final double XP_PADRAO = 10;
   
    private String titulo;
    private String descricao;
    
    
    public abstract double calcularXp();

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
