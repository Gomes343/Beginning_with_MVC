package exam.mvc.DAO;

import java.io.IOException;
import exam.mvc.model.Produto;

public interface GerenciaDAO{

    public boolean persistirObjeto(Produto produto) throws IOException;

}
