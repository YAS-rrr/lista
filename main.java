public class main {
    public static void main(String[] args) {
         nodo n1 = new nodo (5);
         nodo n2 = new nodo (2);
         nodo n3 = new nodo (3);
         nodo n4 = new nodo (4);
         nodo n5 = new nodo (0);
         nodo n22 = new nodo (2);
       
           lista l = new lista ();
        l.inserimentoordinato(n1);
        l.inserimentoordinato(n2);
        l.inserimentoordinato(n3);
        l.inserimentoordinato(n4);
        l.inserimentoordinato(n5);
        l.inserimentoordinato(n22);
       
        System.out.println(l.visita());
       
        /*  System.out.println(l.lettura(0));
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
           */ System.out.println("dopo eliminazione completa");
        l.eliminazionediunvalore(2);
        System.out.println(l.visita());
        /*
            System.out.println(l.lettura(0));
            System.out.println(l.lettura(1));
         nodo n0 = new nodo (0);
        l.inserimento(n0,2);
            System.out.println(l.lettura(2));*/
      
        
        

        
        
             



      
      
      
      
      
      
      
      
      
      
      
       }
    }