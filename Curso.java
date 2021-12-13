package desafiopoodio;

// NESTE CODIGO PRIMEIRAMENTE EXISTIA ALGUNS ATRIBUTOS;
// MAS FORAM RETIRADOS, POIS FOI REALIZADA A ATRIBUIÇÃO DE HERANÇA
// ONDE MENTORIA RECEBE OS ATRIBUTOS ATRAVÉS DA CLASSE CONTEUDO;
public class Curso extends Conteudo {
    
    private int cargaHoraria;
    
    
    public Curso() {
        
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    @Override
    public double calcularXp() {
        return XP_PADRAO * cargaHoraria;
    }

    @Override
    public String toString() {
        return "Curso{" + "cargaHoraria= " + cargaHoraria + 
                ", titulo= " + getTitulo() + 
                ", descricao= " + getDescricao() + '}';
    }
    
    
    
    
    
}
