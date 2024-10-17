package br.com.dio.desafio.dominio;

import java.util.*;

public class Perfil {
    Dev dev = new Dev();
    Curso curso = new Curso();
    Mentoria mentoria = new Mentoria();
    
    public void mostrarInformacoes(Dev dev){
        System.out.println("Conteúdos Inscritos: " + dev.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos: " + dev.getConteudosConcluidos().size());
        System.out.println("XP: " + dev.calcularTotalXp());
    }
        
    public void contarHorasEstudadas(Dev dev) {
        int horasTotais = 0;
        for (Conteudo conteudo : dev.getConteudosConcluidos()) {
            // Verifica se o conteúdo é uma instância de Curso
            if (conteudo instanceof Curso) {
                Curso curso = (Curso) conteudo;
                horasTotais += curso.getCargaHoraria();
            } 
        }
        System.out.println("Total de horas estudadas: " + horasTotais);
    }
    
    public void listarMentoriasConcluidas(Dev dev) {
        boolean encontrouMentoria = false; // Variável de controle
        for (Conteudo conteudo : dev.getConteudosConcluidos()) {
            // Verifica se o conteúdo é uma instância de Mentoria
            if (conteudo instanceof Mentoria) {
                Mentoria mentoria = (Mentoria) conteudo;
                System.out.println("Mentorias Concluídas: " + mentoria.getTitulo());
                encontrouMentoria = true; // Marca que encontrou uma mentoria
            }
        }

        // Se não encontrou nenhuma mentoria, exibe a mensagem
        if (!encontrouMentoria) {
            System.out.println("Nenhuma Mentoria Concluída.");
        }
    }
}