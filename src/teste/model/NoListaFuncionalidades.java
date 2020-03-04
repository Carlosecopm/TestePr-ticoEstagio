package teste.model;

public class NoListaFuncionalidades {
	private String descricao;
	private int codigo; 
    private NoListaFuncionalidades proximo;
    //Define nó anterior

    public void setAnterior(NoListaFuncionalidades proximo) {
        this.proximo = proximo;
    }
    public NoListaFuncionalidades(int codigo, String descricao) { 
        this.codigo = codigo; 
        this.descricao= descricao; 
       
   } 
    //Define valor do nó

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    
    //Retorna valor do nó

    public int getCodigo() {
        return codigo;
    }
    
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    
    //Retorna valor do nó

    public String getDescricao() {
        return descricao;
    }
    
}
