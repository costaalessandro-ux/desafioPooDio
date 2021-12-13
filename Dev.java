
package desafiopoodio;

import java.util.Set;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Optional;

public class Dev {
    private String nome;
    private Set<Conteudo> conteudoInscricao = new LinkedHashSet<>();
    private Set<Conteudo> conteudoConcluidos = new LinkedHashSet<>();
    
    public void inscreverBootCamp(BootCamp bootcamp){
        this.conteudoInscricao.addAll(bootcamp.getConteudos());
        bootcamp.getDevsInscritos().add(this);
    }
    
    public void progredir(){
        Optional<Conteudo> conteudo = this.conteudoInscricao.stream().findFirst();
        if(conteudo.isPresent()){
            this.conteudoConcluidos.add(conteudo.get());
            this.conteudoInscricao.remove(conteudo.get());
        }else{
            System.err.println("Você não está matriculado em nenhum conteudo! ");
        } 
    }
    
    public double calcularTotalXp(){
        return this.conteudoConcluidos.stream().mapToDouble(conteudo -> conteudo.calcularXp()).sum();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Set<Conteudo> getConteudoInscricao() {
        return conteudoInscricao;
    }

    public void setConteudoInscricao(Set<Conteudo> conteudoInscricao) {
        this.conteudoInscricao = conteudoInscricao;
    }

    public Set<Conteudo> getConteudoConcluidos() {
        return conteudoConcluidos;
    }

    public void setConteudoConcluidos(Set<Conteudo> conteudoConcluidos) {
        this.conteudoConcluidos = conteudoConcluidos;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 89 * hash + Objects.hashCode(this.nome);
        hash = 89 * hash + Objects.hashCode(this.conteudoInscricao);
        hash = 89 * hash + Objects.hashCode(this.conteudoConcluidos);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Dev other = (Dev) obj;
        if (!Objects.equals(this.nome, other.nome)) {
            return false;
        }
        if (!Objects.equals(this.conteudoInscricao, other.conteudoInscricao)) {
            return false;
        }
        if (!Objects.equals(this.conteudoConcluidos, other.conteudoConcluidos)) {
            return false;
        }
        return true;
    }
    
}
