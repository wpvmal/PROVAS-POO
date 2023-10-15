import java.util.ArrayList;
import java.util.List;

public class BancoDeDados {

    private List<Funcionario> funcionarios;

    public BancoDeDados() {
        funcionarios = new ArrayList<>();
    }

    public void incializarParaTeste(){
        funcionarios.add(new Funcionario("William", 70));
        funcionarios.add(new Funcionario("Rhuan", 38));
        funcionarios.add(new Funcionario("Victor", 22));        
    }

    public List<String> getFunc(){
        List<String> funcionariosString = new ArrayList<>();

        for(int i = 0; i < funcionarios.size(); i++){
            funcionariosString.add(new String(funcionarios.get(i).getNome()
                                                + "#" 
                                                + funcionarios.get(i).getIdade()));
        }

        return funcionariosString;
    }
    
}
