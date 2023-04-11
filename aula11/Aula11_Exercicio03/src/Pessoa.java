
public class Pessoa {

    String nome;
    int idade;
    double altura;

    public Pessoa(){

    }

    public Pessoa(String nome, int idade, double altura){
        this.nome = nome;
        this.idade = idade;
        this.altura = altura;
    }

    public String toString(){
        return "Nome: "+this.nome+ " | Idade: "+this.idade+ " | Altura: "+ this.altura+ "\n";
    }
}
