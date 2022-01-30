import br.com.dio.desafio.dominio.Curso;
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

        System.out.println(curso);
        System.out.println(curso2);
        System.out.println(mentoria);
    }
}
