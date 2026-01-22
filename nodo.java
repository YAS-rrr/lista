public class nodo {

String valore;
nodo next;




@Override
public String toString (){
    return "il valore contenente è: " + valore + " e il suo prossimo nodo è: " + next.valore;
}

}