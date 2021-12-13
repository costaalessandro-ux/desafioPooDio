package desafiopoodio;

import java.time.LocalDate;

// NESTE CODIGO PRIMEIRAMENTE EXISTIA ALGUNS ATRIBUTOS;
// MAS FORAM RETIRADOS, POIS FOI REALIZADA A ATRIBUIÇÃO DE HERANÇA
// ONDE MENTORIA RECEBE OS ATRIBUTOS ATRAVÉS DA CLASSE CONTEUDO;

public class Mentoria extends Conteudo{
   
    private LocalDate data;
   
    
    public Mentoria() {
        
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }
    
    @Override
    public double calcularXp() {
      return XP_PADRAO + 20;
    }

    @Override
    public String toString() {
        return "Mentoria{" + "data= " + data + 
                ", titulo= " + getTitulo() + 
                ", descricao= " + getDescricao() + '}';
    }
    
    
    

}
