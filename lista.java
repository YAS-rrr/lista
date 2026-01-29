public class lista{

    private int size;
    private nodo head;
    private nodo cursor = head;

        public lista(){
         this.size = 0 ;
         this.head = null;
         this.cursor = head;
        }   
   

  public int inserimento(nodo n, int indice) {

    if (indice < 0 || indice > size) {
        throw new IndexOutOfBoundsException();
    }

        if (indice == 0 && head == null) {
        head = n;
        cursor = head;
        size++;
        return 0;
    }

    cursor = head;

    for (int i = 0; i < indice -1; i++) {
     
        cursor = cursor.getNext();
        }
    n.setNext(cursor.getNext());
    cursor.setNext(n);
    size++; 

    return 0;
 
}
   

   public void eliminazione(int indice){
        cursor = head;
        for(int i = 0; i < indice - 1; i++){
            cursor = cursor.getNext();
        }
        cursor.setNext(cursor.getNext().getNext());
        size--;
    }


   public String lettura(int indice){
        cursor = head;
        for(int i = 0; i < indice; i++){
            cursor = cursor.getNext();
        }
        return cursor.toString();
       
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
  




