public class main {
    public static void main(String[] args) {



        nodo n1 = new nodo("a");
        nodo n2 = new nodo("b");
        nodo n3 = new nodo("c");

        lista lista1 = new lista(10);
        lista1.inserimento(n1, 0);
        lista1.inserimento(n2, 1);
        lista1.inserimento(n3, 2);
        System.out.println(lista1.lettura(0));
        System.out.println(lista1.lettura(1));
        System.out.println(lista1.lettura(2));

        lista1.eliminazione(1);
        System.out.println(lista1.lettura(1));




      
      
      
      
      
      
      
      
      
      
      
       }
    }