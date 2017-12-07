
package exam.mvc.model;

import java.io.Serializable;

public class Produto implements Serializable {
    
    int codigo;
    
    String nome;
    
    float valor;

    String fabricante;

    
    public Produto(int c, String n, float v, String f){
        codigo = c;
        nome = n;
        valor = v;
        fabricante = f;      
    }
    
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

}
