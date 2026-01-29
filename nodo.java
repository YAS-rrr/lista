public class nodo {

private int valore;
private nodo next;

    public nodo getNext() {
        return next;
    }

    public void setNext(nodo next) {
        this.next = next;
    }

    public int getValore() {
        return valore;
    }

    public void setValore(int valore) {
        this.valore = valore;
    }




public nodo(int valore){
    this.valore = valore;
    this.next = null;
}




@Override
public String toString (){
    return "il valore contenente è: " + valore ; 
}

}