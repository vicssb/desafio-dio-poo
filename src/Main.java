import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso = new Curso();
        curso.setTitulo("curso java");
        curso.setDescricao("descricao curso java");
        curso.setCargaHoraria(8);
        Curso curso2 = new Curso();
        curso2.setTitulo("curso js");
        curso2.setDescricao("descricao curso js");
        curso2.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria("mentoria java",
                "descricao mentoria java",12, LocalDate.now());

        /*System.out.println(curso);
        System.out.println(curso2);
        System.out.println(mentoria);*/

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devCamila = new Dev();
        devCamila.setNome("Camila");
        devCamila.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos inscritos Camila: "+devCamila.getConteudosInscritos());
        devCamila.progredir();
        System.out.println("*");
        System.out.println("Conteúdos inscritos Camila: "+devCamila.getConteudosInscritos());
        System.out.println("Conteúdos concluídos Camila: "+devCamila.getConteudosConcluidos());

        Dev devVictor = new Dev();
        devVictor.setNome("Victor");
        devVictor.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos inscritos Camila: "+devVictor.getConteudosInscritos());
        devVictor.progredir();
        System.out.println("*");
        System.out.println("Conteúdos inscritos Camila: "+devVictor.getConteudosInscritos());
        System.out.println("Conteúdos concluídos Camila: "+devVictor.getConteudosConcluidos());

    }
}
