public class lista{

    nodo[] nodi;
    int size;
    nodo head;
    nodo cursor = head;

        public lista(int size){
          this.size = size;
          nodi = new nodo[size];
          head = null;
          cursor = head;
        }   
   

    public int inserimento(nodo n, int indice){
        if(nodi[indice] == null){
        nodi[indice] = n;
        n.next = nodi[indice + 1];
        cursor = n;
        if(nodi[indice - 1] != null){
        nodi[indice-1].next = n;
        }
        else{
            n = head;
            cursor = head;
        }
        }
     
         return 0;
        
    }
   


   public int eliminazione(int indice){
        if(nodi[indice] != null){
            nodi[indice] = null;
        }
            return 0;
        }


   public String lettura (int indice){
        if(nodi[indice] != null){
            return nodi[indice].toString();
        }
        else{
            return "Nessun nodo presente in questa posizione";
        }
    }



    public void eliminazionecompleta(nodo n){
        for(int i = 0; i < size; i++){
            if(nodi[i].valore == n.valore){
                nodi[i] = null;
            }
        }
        
    }


    public void accodamento(nodo n){
        for(int i = 0; i < size; i++){
            if(nodi[i] == null){
                nodi[i] = n;
            }
        }
   }


     
    public int ricerca(String valore){
        for(int indice = 0; indice < size; indice++){
            if(nodi[indice].valore == valore){
                return indice;
            }
        }
        return -1;
    }




    public String visita(){
        for(int i = 0; i < size; i++){
            if(nodi[i] != null){
                return nodi[i].toString();
            }
        }
        return "Nessun nodo presente nella lista";
    }

       


}