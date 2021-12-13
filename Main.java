
package desafiopoodio;

import java.time.LocalDate;


public class Main {

    public static void main(String[] args) {

        Curso curso = new Curso();
        curso.setTitulo("Curso Logica de Programação");
        curso.setDescricao("descrição sobre logica de programação");
        curso.setCargaHoraria(20);
   
        Curso curso2 = new Curso();
        curso2.setTitulo("Curso Java POO");
        curso2.setDescricao("descrição sobre Java POO");
        curso2.setCargaHoraria(20);
        
        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria de Java");
        mentoria.setDescricao("Mentoria sobre a linguagem Java");
        mentoria.setData(LocalDate.now());
 
        BootCamp bootcamp = new BootCamp();
        bootcamp.setNome("BootCamp Java Developer");
        bootcamp.setDescricao("BootCamp para programadores Java");
        bootcamp.getConteudos().add(curso);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);
        
        Dev dev = new Dev();
        dev.setNome("Alessandro");
        dev.inscreverBootCamp(bootcamp);
        System.out.println("Conteudos Inscritos Alessandro" + dev.getConteudoInscricao());
        dev.progredir();
        System.out.println("----");
        System.out.println("Conteudos Online Alessandro" + dev.getConteudoInscricao());
        System.out.println("Conteudos Concluidos Alessandro" + dev.getConteudoConcluidos());
        System.out.println("XP: "+dev.calcularTotalXp());
        //System.out.println("XP: "+dev.calcularXp());
        
        
        System.out.println("----------");
        
        Dev dev2 = new Dev();
        dev.setNome("Fernanda");
        dev2.inscreverBootCamp(bootcamp);
        System.out.println("Conteudos Inscritos Fernanda" + dev2.getConteudoInscricao());
        dev2.progredir();
        System.out.println("----");
        System.out.println("Conteudos Online Fernanda" + dev2.getConteudoInscricao());
        System.out.println("Conteudos Concluidos Fernanda" + dev2.getConteudoConcluidos());
        System.out.println("XP: "+dev2.calcularTotalXp());
        
        
    }
    
}
