import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
   public static void main(String[] args) {

       Curso curso1 = new Curso();
       curso1.setTitulo("Curso java");
       curso1.setDescricao("Descrição curso java");
       curso1.setCargaHoraria(8);

       Curso curso2 = new Curso();
       curso2.setTitulo("Curso js");
       curso2.setDescricao("Descrição curso js");
       curso2.setCargaHoraria(4);

       Mentoria mentoria = new Mentoria();

       mentoria.setTitulo("Mentoria de java");
       mentoria.setDescricao("Descrição mentoria java");
       mentoria.setData(LocalDate.now());

       /*System.out.println(curso1);
       System.out.println(curso2);*/

       Bootcamp bootcamp = new Bootcamp();
       bootcamp.setNome("Bootcamp Java Developer");
       bootcamp.setDescricao("Descrição Bootcamp Java Developer");
       bootcamp.getConteudos().add(curso1);
       bootcamp.getConteudos().add(curso2);
       bootcamp.getConteudos().add(mentoria);


       Dev devCaroline = new Dev();
       devCaroline.setNome("Caroline");
       devCaroline.inscreverBootcamp(bootcamp);
       System.out.println("Canteúdos inscritos Caroline" + devCaroline.getConteudosInscritos());

       devCaroline.progredir();
       devCaroline.progredir();
       System.out.println("--");

       System.out.println("Canteúdos inscritos Caroline" + devCaroline.getConteudosInscritos());
       System.out.println("Canteúdos concluidos Caroline" + devCaroline.getConteudosConcluidos());
       System.out.println("XP:" + devCaroline.calcularTotalXP());

       System.out.println("-------------");

       Dev devMatheus = new Dev();
       devMatheus.setNome("Matheus");
       devMatheus.inscreverBootcamp(bootcamp);
       System.out.println("Canteúdos inscritos Matheus" + devMatheus.getConteudosInscritos());

       devMatheus.progredir();
       devMatheus.progredir();
       devMatheus.progredir();
       System.out.println("--");

       System.out.println("Canteúdos inscritos Matheus" + devMatheus.getConteudosInscritos());
       System.out.println("Canteúdos concluidos Matheus" + devMatheus.getConteudosConcluidos());
       System.out.println("XP:" + devMatheus.calcularTotalXP());


    }
}
