public class ListaPrincipal {
    public static void main(String args[]){
    ListaSimplesEncadeada listaEncadeada = new ListaSimplesEncadeada();
    ListaPrincipal listaPrincipal = new ListaPrincipal();

    listaPrincipal.adicionarPessoa(listaEncadeada);
    listaPrincipal.remover(listaEncadeada);
    System.out.println("Lista de alunos - Grupo 2 - Estrutura de Dados");
        while(listaEncadeada.temProximo()){
            System.out.println(listaEncadeada.getPosAtual().getValor());
        }
    } 

    private void adicionarPessoa(ListaSimplesEncadeada listaEncadeada){ 
        Pessoa p1 = new Pessoa(1, "Julio", "julioortiz.aluno@unipampa.edu.br"); 
        Pessoa p2 = new Pessoa(2, "Rafael", "rafaellezama.aluno@unipampa.edu.br"); 
        Pessoa p3 = new Pessoa(3, "Tadeu", "tadeubrasil.aluno@unipampa.edu.br"); 
        Pessoa p4 = new Pessoa(4, "William", "williamchristopher.aluno@unipampa.edu.br"); 
        Pessoa p5 = new Pessoa(5, "Alan (F)", "alanfarias.aluno@unipampa.edu.br"); 
        listaEncadeada.adicionar(p1); 
        listaEncadeada.adicionar(p2);
        listaEncadeada.adicionar(p3);
        listaEncadeada.adicionar(p4);
        listaEncadeada.adicionar(p5); 
    }

    private void remover(ListaSimplesEncadeada listaEncadeada){
    }
}

