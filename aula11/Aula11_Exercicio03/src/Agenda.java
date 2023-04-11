import java.util.ArrayList;
import java.util.Objects;

public class Agenda {

    ArrayList<Pessoa> listaPessoa = new ArrayList<>();

    public void armazenaPessoa(String nome, int idade, double altura){
        Pessoa novaPessoa = new Pessoa(nome, idade, altura);
        this.listaPessoa.add(novaPessoa);
    }

    public void removePessoa(String nome){
        for (int i = 0; i < listaPessoa.size(); i++){

            if (Objects.equals(listaPessoa.get(i).nome, nome)){
                listaPessoa.remove(i);
            }
        }
    }

    public int buscaPessoa(String nome){
        for (int i = 0; i < listaPessoa.size(); i++){
            if (Objects.equals(listaPessoa.get(i).nome, nome)){
                return i;
            }
        }
        return -1;
    }

    public void imprimeAgenda(){
        System.out.println("------ CONTATOS ------");
        System.out.println(listaPessoa.toString());
    }

    public void imprimePessoa(int index){
        if (listaPessoa.get(index) != null){
            System.out.println(listaPessoa.get(index));

        }else {
            System.out.println("Pessoa não encontrada!");
        }
    }
}