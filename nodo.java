public class nodo {

String valore;
nodo next;


public nodo(String valore){
    this.valore = valore;
    this.next = null;
}




@Override
public String toString (){
    return "il valore contenente è: " + valore + " e il suo prossimo nodo è: " + next.valore;
}

}