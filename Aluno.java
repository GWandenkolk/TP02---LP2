*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cadastroaluno;
import java.util.UUID;
/**
 *
 * @author LOWCOST
 */

public class Aluno {
    private String endereco;
    private int idade;
    private String nome;
    private UUID uuid;

    // Construtor
    public Aluno(String endereco, int idade, String nome) {
        this.endereco = endereco;
        this.idade = idade;
        this.nome = nome;
        this.uuid = UUID.randomUUID(); // Gera um UUID único para cada aluno
    }

    // Método para retornar a representação em String do aluno
    @Override
    public String toString() {
        return "Id: " + uuid.toString() + " Nome: " + nome;
    }

    // Getters
    public String getEndereco() {
        return endereco;
    }

    public int getIdade() {
        return idade;
    }

    public String getNome() {
        return nome;
    }

    public UUID getUuid() {
        return uuid;
    }

    // Setters
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setUuid(UUID uuid) {
        this.uuid = uuid;
    }
}
