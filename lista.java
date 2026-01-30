
public class lista{

    private int size;
    private nodo head;
    private nodo cursor;

        public lista(){
         this.size = 0 ;
         this.head = null;
         this.cursor = null;
        }   
   

 public int inserimento(nodo n, int indice) {
    if (indice < 0 || indice > size) {
        throw new IndexOutOfBoundsException();
    }

    if (indice == 0) {  // <-- semplifica così
        n.setNext(head);
        head = n;
        size++;
        return 0;
    }

    cursor = head;
    for (int i = 0; i < indice - 1; i++) {
        cursor = cursor.getNext();
    }
    n.setNext(cursor.getNext());
    cursor.setNext(n);
    size++; 
    return 0;
}
   

 public void eliminazione(int indice){
    if (indice == 0) { 
        head = head.getNext();
        size--;
        return;
    }
    
    cursor = head;
    for(int i = 0; i < indice - 1; i++){
        cursor = cursor.getNext();
    }
    cursor.setNext(cursor.getNext().getNext());
    size--;
}

   public String lettura(int indice){
        cursor = head;
        while (indice-- > 0 && cursor != null) {
            cursor = cursor.getNext();
        }
        if (cursor != null) {
            return cursor.toString();
        }
        return "Indice non valido";
    }



    public void eliminazionediunvalore(int valore){
        cursor = head;
        for(int i = 0; i < size; i++){
            if(cursor.getNext().getValore() == valore){
                cursor.setNext(cursor.getNext().getNext());
                size--;
                return;
            }
            cursor = cursor.getNext();
        }

    }


    public void accodamento(nodo n){
        if (head == null) {
            head = n;
        } else {
            cursor = head;
            while (cursor.getNext() != null) {
                cursor = cursor.getNext();
            }
            cursor.setNext(n);
        }
        size++;
   }


     
    public int  ricerca(int valore){
        cursor = head;
        for(int i = 0; i < size; i++){
            if(cursor.getValore() == valore){
                return i;
            }
            cursor = cursor.getNext();
        }
        return -1;
      
    }




    public String visita(){
        String result = "";
        cursor = head;
        while (cursor != null) {
            result += cursor.getValore() + " ";
            cursor = cursor.getNext();
        }
        return result.trim();
    }


    public void inserimentoordinato (nodo n){
        if (head == null || head.getValore() >= n.getValore()) {
            n.setNext(head);
            head = n;
        } else {
            cursor = head;
            while (cursor.getNext() != null && cursor.getNext().getValore() < n.getValore()) {
                cursor = cursor.getNext();
            }
            n.setNext(cursor.getNext());
            cursor.setNext(n);
        }
        size++;                 
    }

}
  




