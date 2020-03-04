package teste.model;

public class NoListaModulos {
	private int codigo; 
    private String descricaoModulo; 
    private String moduloBasico; 
    private float precoModulo;
    private NoListaModulos proximo;
    public NoListaModulos() { 

    } 

    public NoListaModulos(int codigo, String descricaoModulo, String moduloBasico, float precoModulo) { 
         this.codigo = codigo; 
         this.descricaoModulo= descricaoModulo; 
         this.moduloBasico = moduloBasico;
         this.precoModulo = precoModulo;
    } 
    
    public void setProximo(NoListaModulos proximo) {
        this.proximo = proximo;
    }
    //Retorna nó anterior.

    public NoListaModulos getProcimo() {
        return proximo;
    }

    public int getCodigo() { 
         return codigo; 
    } 

    public void setCodigo(int codigo) { 
         this.codigo = codigo; 
    } 

    public String getDescricaoModulo() { 
         return descricaoModulo; 
    } 

    public void setDescricaoModulo(String descricaoModulo) { 
         this.descricaoModulo = descricaoModulo; 
    } 

    public String getModuloBasico() { 
         return moduloBasico; 
    } 

    public void setModuloBasico(String moduloBasico) { 
         this.moduloBasico = moduloBasico; 
    } 
    
    public float getPrecoModulo() { 
        return precoModulo; 
   } 

   public void setPrecoModulo(String moduloBasico) { 
        this.precoModulo = precoModulo; 
   } 

    /*@Override 
    public String toString() { 
         return "Pessoa [id=" + id + ", nome=" + nome + ", email=" + email + "]"; 
    }*/ 
} 

