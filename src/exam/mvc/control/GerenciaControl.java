package exam.mvc.control;

import java.io.IOException;
import exam.mvc.DAO.ProdutoDAO;

public interface GerenciaControl {
    
    ProdutoDAO dao = new ProdutoDAO();
   
    public boolean cadastrarProduto(int codigo,String nome, float valor, String fabricante) 
            throws IOException;
    
}
