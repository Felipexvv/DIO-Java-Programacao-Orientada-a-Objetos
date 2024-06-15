import br.com.dio.desafio.dominio.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Aprendendo java e praticando");
        curso1.setCargaHoraria(7);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso Engenharia de software");
        curso2.setDescricao("Aprendendo a projetar e gerenciar criacoes e desenvolvimento de projetos");
        curso2.setCargaHoraria(30);


        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria de java");
        mentoria.setDescricao("Ensinando java");
        mentoria.setData(LocalDate.now());


//        System.out.println(curso1);
//        System.out.println(curso2);
//        System.out.println(mentoria);

        BootCamp bootCamp = new BootCamp();
        bootCamp.setNome("Bootcamp Java Developer");
        bootCamp.setDescricao("Descricao Bootcamp Java Developer");
        bootCamp.getConteudos().add(curso1);
        bootCamp.getConteudos().add(curso2);
        bootCamp.getConteudos().add(mentoria);

        Dev dev1 = new Dev();
        dev1.setNome("Felipe");
        dev1.inscreverBootcamp(bootCamp);
        System.out.println("Conteudo Inscritos Felipe: " + dev1.getConteudoInscritos());
        dev1.progredir();
        dev1.progredir();

        System.out.println("Conteudo Concluidos Felipe: " + dev1.getConteudoConcluidos());

        System.out.println("-");
        System.out.println("Conteudo Inscritos Felipe: " + dev1.getConteudoInscritos());
        System.out.println("Xp atual de Felipe: " + dev1.calcularTolalXp());

        System.out.println("-------------");

        Dev dev2 = new Dev();
        dev2.setNome("Paulo");
        dev2.inscreverBootcamp(bootCamp);
        System.out.println("Conteudo Inscritos Paulo: " + dev2.getConteudoInscritos());
        dev2.progredir();

        System.out.println("-");
        System.out.println("Conteudo Concluidos Paulo: " + dev2.getConteudoConcluidos());
        System.out.println("Xp atual de Paulo: " + dev2.calcularTolalXp());




    }
}
