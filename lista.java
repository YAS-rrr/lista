public class lista{

    int size;
    nodo head;
    nodo cursor = head;

        public lista(){
         this.size = 0 ;
         this.head = null;
         this.cursor = head;
        }   
   

  public int inserimento(nodo n, int indice) {

    if (indice < 0 || indice > size) {
        throw new IndexOutOfBoundsException();
    }


    if (indice == 0) {
        head = n;
        cursor = head;
        size++;
        return 0;
    }

   

    for (int i = 0; i < indice - 1; i++) {
        cursor = cursor.next;
    }

    n.next = cursor.next;
    cursor.next = n;
    size++;
    return 0;
}
   

   public void eliminazione(int indice){
        cursor = head;
        for(int i = 0; i < indice - 1; i++){
            cursor = cursor.next;
        }
        cursor.next = cursor.next.next;
        size--;
    }


   public String lettura (int indice){
       cursor = head;
       for(int i = 0; i < indice; i++){
           cursor = cursor.next;
       }
       return cursor.valore;
    }



    public void eliminazionecompleta(nodo n){
        head = null;
        size = 0;
        
    }


    public void accodamento(nodo n){
        if (head == null) {
            head = n;
        } else {
            cursor = head;
            while (cursor.next != null) {
                cursor = cursor.next;
            }
            cursor.next = n;
        }
        size++;
   }


     
    public int ricerca(String valore){
        cursor = head;
        for(int i = 0; i < size; i++){
            if(cursor.valore.equals(valore)){
                return i;
            }
            cursor = cursor.next;
        }
        return -1;
      
    }




    public String visita(){
        String result = "";
        cursor = head;
        while (cursor != null) {
            result += cursor.valore + " ";
            cursor = cursor.next;
        }
        return result.trim();
    }

}