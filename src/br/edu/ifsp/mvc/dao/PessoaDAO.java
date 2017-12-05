/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifsp.mvc.dao;

import br.edu.ifsp.mvc.model.Pessoa;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

/**
 *
 * @author a1700677
 */
public class PessoaDAO {
    
    
    public boolean persistirPessoa(Pessoa pessoa) throws IOException{
        
        FileOutputStream fout = new FileOutputStream("teste");
        ObjectOutputStream oos = new ObjectOutputStream(fout);
        oos.writeObject(pessoa);
        return true;

    }

    
}
