import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {


        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("descrição curso java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso Js");
        curso2.setDescricao("descrição curso js");
        curso2.setCargaHoraria(2);


        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria java");
        mentoria.setDescricao("descrição mentoria java");
        mentoria.setData(LocalDate.now());


        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);


        Dev devAnderson = new Dev();
        devAnderson.setNome("Anderson");
        devAnderson.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos inscritos Anderson" + devAnderson.getConteudosInscritos());

        devAnderson.progredir();
        System.out.println("----------------------");

        System.out.println("Conteudos inscritos Anderson" + devAnderson.getConteudosInscritos());
        System.out.println("Conteudos Concluidos Anderson" + devAnderson.getConteudosConcluidos());
        System.out.println("XP:" + devAnderson.calcularTotalXp());


        System.out.println("----------------------");
        Dev devJoice = new Dev();
        devJoice.setNome("Joice");
        devJoice.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos inscritos Joice" + devJoice.getConteudosInscritos());

        devJoice.progredir();
        System.out.println("----------------------");

        System.out.println("Conteudos inscritos Joice" + devJoice.getConteudosInscritos());
        System.out.println("Conteudos Concluidos Joice" + devAnderson.getConteudosConcluidos());
        System.out.println("XP:" + devJoice.calcularTotalXp());




    }
}
