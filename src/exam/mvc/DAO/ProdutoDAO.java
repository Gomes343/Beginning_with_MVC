package exam.mvc.DAO;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import exam.mvc.model.Produto;
import exam.mvc.control.ProdutoControl;

public class ProdutoDAO implements GerenciaDAO{
    
    @Override
    public boolean persistirObjeto(Produto produto) throws IOException{
        
        FileOutputStream arq = new FileOutputStream(".\\Produto.Ser");
        ObjectOutputStream obj = new ObjectOutputStream(arq);
        obj.writeObject(produto);

        return true;
    }


}
