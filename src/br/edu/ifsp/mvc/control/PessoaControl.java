package br.edu.ifsp.mvc.control;
import br.edu.ifsp.mvc.model.Pessoa;
import br.edu.ifsp.mvc.dao.PessoaDAO;
import java.io.IOException;

public class PessoaControl {
    
    PessoaDAO dao = new PessoaDAO();
    
    public boolean CadastrarPessoa(String nome, String telefone) throws IOException{

        Pessoa pessoa = new Pessoa();
        
        pessoa.setNome(nome);
        pessoa.setTelefone(telefone);     
        
        dao.persistirPessoa(pessoa);
        
        return true;
        
   }


}
