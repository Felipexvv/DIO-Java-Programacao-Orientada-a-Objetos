import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Engenharia de Java");
        curso1.setDescricao("Aprendendo java e praticando");
        curso1.setCargaHoraria(87);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso Engenharia de software");
        curso2.setDescricao("Aprendendo a projetar e gerenciar criacoes e desenvolvimento de projetos");
        curso1.setCargaHoraria(3000);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria de java");
        mentoria.setDescricao("Ensinando java");
        mentoria.setData(LocalDate.now());



        System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);


    }
}
