package entradablogctg;

/**
 * Clase para manejar las entradas de un blog.
 * @author Cristina Tremi�o
 * @version 2.3
 * @since 21/03/1999
 */
public class EntradaBlogCTG {
    /**
     *separador es el car�cter que separa ENTRADA DE del nombre del autor
     */	
	public static char separador=':';
	private int id;
	private String texto;
	private String autor;
	
    /**
     * Constructor de la clase.
     * 
     * @param id n�mero de entrada
     * @param autor nombre del autor de la entrada
     * @param texto texto que contiene la entrada
     * @throws IllegalArgumentException si el n�mero de entrada es negativo
     */
	public EntradaBlogCTG(int id,String autor,String texto)throws IllegalArgumentException{
		if(id<=0) throw new IllegalArgumentException("El id no puede ser negativo");
		this.id=id;
		this.autor=autor;
		this.texto=texto;
	}
        /** 
         * Imprime por pantalla ENTRADA DE: autor y texto de la entrada del blog
         * @return texto a mostrar por pantalla
         */
	@Override
	public String toString(){
		String cad="";
		cad+="\nENTRADA DE"+separador+autor;
		cad+="\n "+texto;
		return cad;
	}
	
     /**
     * Obtenci�n del n�mero de la entrada
     * @return n�mero de la entrada
     */
	public int getId(){
		return this.id;
	}
	
    /**
     * Obtenci�n del texto de la entrada
     * @return texto completo de la entrada
     */
	public String getTexto(){
		return this.texto;
	}
	
     /**
     * Obtenci�n del nombre del autor de la entrada
     * @return nombre del autor de la entrada en may�sculas
     */
	public String getAutor(){
		return this.autor.toUpperCase();
	}	

    /**
     * @deprecated Ya no se usa. Mejor ver getAutor
     * @return nombre del autor
     */
         public String devuelveAutor(){
		return this.autor;
	}
	
    /**
     * M�todo principal
     * @param args no tiene porqu� tener argumentos
     */
	public static void main(String[] args) {
		EntradaBlogCTG e1=new EntradaBlogCTG(-3,"ana","�ltimas noticias, est� disponible BixBy 2.0");
		System.out.println(e1);
	}    
}
