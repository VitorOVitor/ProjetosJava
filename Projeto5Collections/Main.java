package Projeto5Collections;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
    
        
        
                Scanner scanner = new Scanner(System.in);
                List<Bootcamp> bootcamps = new ArrayList<>();
                List<Devs> devs = new ArrayList<>();
                List<Cursos> cursos = new ArrayList<>();
                List<Mentorias> mentorias = new ArrayList<>();
        
                int opcao;
                
                do {
                    System.out.println("Escolha uma operação:");
                    System.out.println("1. Adicionar Curso ao Bootcamp");
                    System.out.println("2. Adicionar Dev e Associar Mentoria");
                    System.out.println("3. Remover Curso de um Bootcamp");
                    System.out.println("4. Buscar e Atualizar Status de Dev");
                    System.out.println("0. Sair");
                    opcao = scanner.nextInt();
                    scanner.nextLine(); // Consumir a quebra de linha
        
                    switch (opcao) {
                        case 1: // Adicionar Curso ao Bootcamp
                            System.out.println("Digite o nome do Bootcamp:");
                            String nomeBootcamp = scanner.nextLine();
                            System.out.println("Digite o nome do curso:");
                            String nomeCurso = scanner.nextLine();
                            System.out.println("Digite a duração do curso em dias:");
                            int duracaoCurso = scanner.nextInt();
                            scanner.nextLine(); // Consumir a quebra de linha
                            System.out.println("Digite o conteúdo programático do curso:");
                            String conteudoCurso = scanner.nextLine();
        
                            Bootcamp bootcamp = new Bootcamp();
                            bootcamp.setNome(nomeBootcamp);
                            Cursos curso = new Cursos();
                            curso.setNome(nomeCurso);
                            curso.setduracaoDias(duracaoCurso);
                            curso.setConteudoProgramatico(conteudoCurso);
        
                            bootcamp.adicionarCurso(curso);
                            bootcamps.add(bootcamp);
                            cursos.add(curso);
                            System.out.println("Curso adicionado ao Bootcamp!");
                            break;
        
                        case 2: // Adicionar Dev e Associar Mentoria
                            System.out.println("Digite o nome do Dev:");
                            String nomeDev = scanner.nextLine();
                            System.out.println("Digite o email do Dev:");
                            String emailDev = scanner.nextLine();
                            System.out.println("Digite o status do Dev:");
                            String statusDev = scanner.nextLine();
        
                            Devs dev = new Devs();
                            dev.setNome(nomeDev);
                            dev.setEmail(emailDev);
                            dev.setStatus(statusDev);
                            devs.add(dev);
        
                            System.out.println("Digite a data da mentoria (ex: 10/03/2025):");
                            String dataMentoria = scanner.nextLine();
                            System.out.println("Digite a duração da mentoria em horas:");
                            int duracaoMentoria = scanner.nextInt();
                            scanner.nextLine(); // Consumir a quebra de linha
                            System.out.println("Digite os assuntos abordados na mentoria:");
                            String assuntosMentoria = scanner.nextLine();
        
                            Mentorias mentoria = new Mentorias();
                            mentoria.setData(dataMentoria);
                            mentoria.setDuracao(duracaoMentoria);
                            mentoria.setAssuntosAbordados(assuntosMentoria);
                            mentoria.associarMentor(dev);
                            mentorias.add(mentoria);
        
                            System.out.println("Mentoria associada ao Dev " + dev.getNome());
                            break;
        
                        case 3: // Remover Curso de um Bootcamp
                            System.out.println("Digite o nome do Bootcamp para remover um curso:");
                            nomeBootcamp = scanner.nextLine();
                            Bootcamp bootcampRemover = null;
                            for (Bootcamp b : bootcamps) {
                                if (b.getNome().equals(nomeBootcamp)) {
                                    bootcampRemover = b;
                                    break;
                                }
                            }
                            if (bootcampRemover != null) {
                                System.out.println("Digite o nome do curso a ser removido:");
                                String nomeCursoRemover = scanner.nextLine();
                                Cursos cursoRemover = null;
                                for (Cursos c : bootcampRemover.getCursos()) {
                                    if (c.getNome().equals(nomeCursoRemover)) {
                                        cursoRemover = c;
                                        break;
                                    }
                                }
                                if (cursoRemover != null) {
                                    bootcampRemover.getCursos().remove(cursoRemover);
                                    System.out.println("Curso " + nomeCursoRemover + " removido do Bootcamp!");
                                } else {
                                    System.out.println("Curso não encontrado!");
                                }
                            } else {
                                System.out.println("Bootcamp não encontrado!");
                            }
                            break;
        
                        case 4: // Buscar e Atualizar Status de Dev
                            System.out.println("Digite o nome do Dev para atualizar o status:");
                            String nomeDevBuscar = scanner.nextLine();
                            Devs devBuscar = null;
                            for (Devs d : devs) {
                                if (d.getNome().equals(nomeDevBuscar)) {
                                    devBuscar = d;
                                    break;
                                }
                            }
                            if (devBuscar != null) {
                                System.out.println("Status atual do Dev " + devBuscar.getNome() + ": " + devBuscar.getStatus());
                                System.out.println("Digite o novo status para " + devBuscar.getNome() + ":");
                                String novoStatus = scanner.nextLine();
                                devBuscar.atualizarStatus(novoStatus);
                                System.out.println("Status atualizado para: " + novoStatus);
                            } else {
                                System.out.println("Dev não encontrado!");
                            }
                            break;
        
                        case 0: // Sair
                            System.out.println("Saindo...");
                            break;
        
                        default:
                            System.out.println("Opção inválida, tente novamente.");
                            break;
                    }
        
                } while (opcao != 0);
        
                scanner.close();
            }
        }
        
    






