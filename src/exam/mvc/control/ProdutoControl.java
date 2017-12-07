package exam.mvc.control;

import java.io.IOException;
import exam.mvc.DAO.ProdutoDAO;
import exam.mvc.model.Produto;

public class ProdutoControl implements GerenciaControl{

    @Override
    public boolean cadastrarProduto(int codigo,String nome, float valor, String fabricante)
        throws IOException{
    
    Produto produto = new Produto(codigo,nome,valor,fabricante);
    
    dao.persistirObjeto(produto);

    return true;
    }
    
}
