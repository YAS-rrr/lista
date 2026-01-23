public class nodo {

private String valore;
private nodo next;

    public nodo getNext() {
        return next;
    }

    public void setNext(nodo next) {
        this.next = next;
    }

    public String getValore() {
        return valore;
    }

    public void setValore(String valore) {
        this.valore = valore;
    }




public nodo(String valore){
    this.valore = valore;
    this.next = null;
}




@Override
public String toString (){
    return "il valore contenente è: " + valore ; 
}

}