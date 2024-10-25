/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cadastroaluno;
import java.util.ArrayList;
import java.util.UUID;
import javax.swing.JOptionPane;


/**
 *
 * @author LOWCOST
 */
public class CadastroAluno {

    // Lista para armazenar os alunos cadastrados
    private static ArrayList<Aluno> listaAlunos = new ArrayList<>();

    public static void main(String[] args) {
        while (true) {
            // Menu de opções
            String[] opcoes = {"Cadastrar Aluno", "Mostrar Alunos", "Limpar Campos", "Sair"};
            int escolha = JOptionPane.showOptionDialog(null, "Selecione uma opção:", "Cadastro de Alunos",
                    JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, opcoes, opcoes[0]);

            // Verifica a opção escolhida
            switch (escolha) {
                case 0: // Cadastrar Aluno
                    cadastrarAluno();
                    break;
                case 1: // Mostrar Alunos
                    mostrarAlunos();
                    break;
                case 2: // Limpar Campos
                    limparCampos();
                    break;
                case 3: // Sair
                    System.exit(0);
                default:
                    break;
            }
        }
    }

    private static void cadastrarAluno() {
        // Coleta as informações do aluno através de diálogos
        String endereco = JOptionPane.showInputDialog("Informe o endereço:");
        String idadeStr = JOptionPane.showInputDialog("Informe a idade:");
        String nome = JOptionPane.showInputDialog("Informe o nome:");

        // Converte a idade para inteiro
        int idade = Integer.parseInt(idadeStr);

        // Cria um novo aluno e adiciona à lista
        Aluno aluno = new Aluno(endereco, idade, nome);
        listaAlunos.add(aluno);

        // Mensagem de confirmação
        JOptionPane.showMessageDialog(null, "Aluno cadastrado com sucesso!");
    }

    private static void mostrarAlunos() {
        // Cria uma StringBuilder para formatar a mensagem
        StringBuilder mensagem = new StringBuilder("Alunos cadastrados:\n");
        
        for (Aluno aluno : listaAlunos) {
            mensagem.append(aluno.toString()).append("\n");
        }

        // Exibe os alunos cadastrados
        JOptionPane.showMessageDialog(null, mensagem.toString(), "Resultado", JOptionPane.INFORMATION_MESSAGE);
    }

    private static void limparCampos() {
        // Limpa a lista de alunos
        listaAlunos.clear();
        JOptionPane.showMessageDialog(null, "Todos os alunos foram removidos da lista.");
    }
}
