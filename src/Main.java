import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;
import br.com.dio.desafio.dominio.Perfil;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("curso java");
        curso1.setDescricao("descrição curso java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("curso js");
        curso2.setDescricao("descrição curso js");
        curso2.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria de java");
        mentoria.setDescricao("descrição mentoria java");
        mentoria.setData(LocalDate.now());

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);
        
        Perfil perfil = new Perfil();

        Dev devUm = new Dev();
        devUm.setNome("Christopher Tracy");
        devUm.inscreverBootcamp(bootcamp);
        devUm.progredir(); 
        devUm.progredir(); 
        perfil.mostrarInformacoes(devUm);
        perfil.contarHorasEstudadas(devUm);
        perfil.listarMentoriasConcluidas(devUm);
        
        System.out.println("-------");

        Dev devDois = new Dev();
        devDois.setNome("XL");
        devDois.inscreverBootcamp(bootcamp);
        devDois.progredir(); 
        devDois.progredir(); 
        devDois.progredir(); 
        perfil.mostrarInformacoes(devDois);
        perfil.contarHorasEstudadas(devDois);
        perfil.listarMentoriasConcluidas(devDois);
    }
}