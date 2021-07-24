public class ListaSimplesEncadeada {
    private Celula primeiro;
    private Celula ultimo;
    private Celula posAtual;

    // Adicionar uma pessoa ao final da lista
    public void adicionar(Pessoa valor){
        Celula celula = new Celula();
        celula.setValor(valor);

        if(primeiro == null && ultimo == null){
            primeiro = celula;
            ultimo = celula;
        } else{
            ultimo.setProximo(celula);
            ultimo = celula;
        }
    }

    // Remove uma pessoa do final da lista
    public void remover(){
        if(primeiro.getProximo() != null){
            Celula celula = this.recuperarPenultimo(this.primeiro);
            ultimo = celula;
            celula.setProximo(null);
        } else {
            primeiro = ultimo = null;
        }
    }

    // Recupera o penúltimo item da lista
    private Celula recuperarPenultimo(Celula celula){ 
        if(celula.getProximo().equals(ultimo)){ 
             return celula; 
        } 
        return recuperarPenultimo(celula.getProximo()); 
   }

   public boolean temProximo(){
       if(primeiro == null){
           return false;
       } else if(posAtual == null) {
           posAtual = primeiro;
           return true;
       } else {
            boolean temProximo = posAtual.getProximo() != null ? true : false;
            posAtual = posAtual.getProximo();
            return temProximo;
       }
   }

   public Celula getPosAtual(){
       return this.posAtual;
   }
}


