public class main {
    public static void main(String[] args) {
        nodo n1 = new nodo ("primo");
        nodo n2 = new nodo ("secondo");
        nodo n3 = new nodo ("terzo");
        nodo n4 = new nodo ("quarto");
        nodo n22 = new nodo ("secondo");
        lista l = new lista ();
        l.inserimento(n1,0);
        l.inserimento(n2,1);
        l.inserimento(n3,2);
        l.inserimento(n22,3);
        System.out.println(l.lettura(0));
        System.out.println(l.lettura(1));
        System.out.println(l.lettura(2));
        System.out.println(l.lettura(3));
        System.out.println("dopo eliminazione");
        l.eliminazione(1);
        System.out.println(l.lettura(0));
        System.out.println(l.lettura(1));
        System.out.println(l.lettura(2));
        System.out.println("dopo accodamento");
        l.accodamento(n4);
        l.accodamento(n22);
        System.out.println(l.lettura(0));
        System.out.println(l.lettura(1));
        System.out.println(l.lettura(2));
        System.out.println(l.lettura(3));
        System.out.println(l.lettura(4));
        System.out.println("dopo eliminazione completa");
        l.eliminazionecompleta("secondo");
        System.out.println(l.lettura(0));
        System.out.println(l.lettura(1));
        

        
        
             



      
      
      
      
      
      
      
      
      
      
      
       }
    }