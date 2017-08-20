/**
Classe que possui opera��es de uma lista
 simplesmente encadeada
*/
public class ListaLigada{
	private No inicio;
	/**
	Construtor
	*/
	public ListaLigada(){
		inicio = null;
	}
	/**
	M�todo que verifica se a lista est� vazia
	@return se lista est� vazia retorna true
	        caso contr�rio false 
	*/
	public boolean vazia(){
	   return inicio==null;
	}
   
	/**
	M�todo que adiciona um n� com o novo elemento
	no in�cio da lista
	@param valor � o novo elemento
	*/
	public void adicionaInicio(int valor){
	    No novo = new No(valor);
		 novo.prox = inicio;
		 inicio = novo;
	}
   
   
	/**
	M�todo que remove o primeiro elemento
	da lista
	@return retorna o elemento removido
	*/
	public int removeInicio(){
		int r=-1;
		if (vazia()){
		System.out.println("ERRO! Lista Vazia!");
		}
		else {
			r=inicio.dado;
			inicio = inicio.prox;
		}
		return r;
 	}
 
 
	public String percorre(){
		String r="";
		No aux=inicio;
   
		while (aux != null){
			r = r + " " + aux.dado;
			aux = aux.prox;
		}
		return r;
 }

 /**
 M�todo que adiciona novo elemento no final de uma lista
 @param e novo elemento
 */
	public void adicionaFinal(int e){
		if (!(inicio==null)){
			No aux = inicio;
			while (aux.prox!=null){
				aux=aux.prox;
			}
			aux.prox=new No(e);
		} else {
			inicio = new No(e);
		}
	}
 /**
 M�todo que busca o final da lista.
 @param aux � o n� que deve ser verificado
 */
	public No buscaFinal (No aux){
		if (aux.prox == null){
			return aux;
		}
		return buscaFinal(aux.prox);
	}
 /**
 M�todo que remove um elemento do final da lista
 @return elemento removido
 */
	public int removeFinal(){
		int r=-1;
		if (vazia())
			System.out.println("ERRO!Lista Vazia!");
		else if (inicio.prox==null) {
			r=inicio.dado;
			inicio=null;
		} else {
			No aux1=inicio;
			No aux2=null;
			while (aux1.prox != null){
				aux2=aux1;
				aux1=aux1.prox;
			}
			r=aux1.dado;
			aux2.prox=null;
		}
	    return r;
	 }
 
	public void adiciona(int e, int p){
		if (p==1){
			adicionaInicio(e);
		}else {
			if (vazia()) {
				System.out.println("ERRO! Use a 1a. posi��o");		
			} else {
				No aux=inicio;
				int conta=1;
				while (aux.prox!=null && conta<p-1){
					aux=aux.prox;
					conta++;
				}
				if (conta==p-1){
				   No novo = new No(e);
				   novo.prox=aux.prox;
				   aux.prox=novo;
				} else {
				   System.out.println("Posi��o N�o Existe");
				}
			}	
		}
 }=
}
