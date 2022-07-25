import br.com.dio.desafio.dominio.BootCamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso_dio = new Curso();
        curso_dio.setTitulo("Santander Code Girls");
        curso_dio.setDescricao("um curso de java muito massa");
        curso_dio.setCargaHoraria(62);

        Curso curso_bytelegend = new Curso();
        curso_bytelegend.setTitulo("Bytelegend");
        curso_bytelegend.setDescricao("Um jogo que ensina conceitos de programação em Java em 88 repos");
        curso_bytelegend.setCargaHoraria(20);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria top");
        mentoria.setDescricao("Uma mentoria para resolver todos os problemas");
        mentoria.setData(LocalDate.now());

        BootCamp bootcamp =  new BootCamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("um bootcamp para os melhores javeiros");
        bootcamp.getConteudosBootCamp().add(curso_dio);
        bootcamp.getConteudosBootCamp().add(curso_bytelegend);
        bootcamp.getConteudosBootCamp().add(mentoria);

        Dev devEmilly = new Dev();
        devEmilly.setNome("Emilly");
        devEmilly.inscreverBootCamp(bootcamp);
        devEmilly.progredir();
        devEmilly.progredir();
        System.out.println("Conteúdos Inscritos" + devEmilly.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos" + devEmilly.getConteudosConcluidos());
        System.out.println("XP: " + devEmilly.CalcularTotalXP());

        Dev devRebeca = new Dev();
        devRebeca.setNome("Rebeca");
        devRebeca.inscreverBootCamp(bootcamp);
        devRebeca.progredir();
        System.out.println("Conteúdos Inscritos" + devRebeca.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos" + devRebeca.getConteudosConcluidos());
        System.out.println("XP: " + devRebeca.CalcularTotalXP());

    }
}