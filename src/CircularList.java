public class CircularList {
    private Node head;

    public void addNode(Node node){
        if(head==null){ //Enlazo el nodo asi mismo, ya que la cabeza es nula
            head=node;
            head.setNext(head);
            head.setPrevious(head);
        }
        else{
            Node tail=head.getPrevious();//Guardo el nodo previo a la cabeza
            node.setNext(head);//Lo siguiente al nodo que voy a agregar, será la cabeza (node->head)
            head.setPrevious(node);//Lo anterior a la cabeza, sera el nodo. (node<-head)
            tail.setNext(node);//Lo siguiente a la cola será el nodo.(tail ->node)
            node.setPrevious(tail);//Lo anterior al nodo, será la cola. (tail <-node)
        }
    }
    public void print(){
        if(head==null) {
            System.out.println("Lista vacia");
        }
        print(head);
    }
    private void print(Node current){
        if(current==head.getPrevious()){
            System.out.println(current.getName());
            return;
        }
        System.out.println(current.getName());
        print(current.getNext());
    }
    public void delete(String goal){
        if(head==null) {
            System.out.println("Empty list");
        }
        else if(head=head.getNext()){//Si la lista solo tiene un elemento
            head=null;
        }
        else {
            delete(head, goal);
        }
    }
    public void delete(Node current, String goal){
        if(current.getName().equals(goal)) {
            if (current == head) {
                Node prev = head.getPrevious();
                Node next = head.getNext();
                next.setPrevious(prev);
                prev.setNext(next);
                head = next;
            } else {
                Node prev = current.getPrevious();
                Node next = current.getNext();
                next.setPrevious(prev);
                prev.setNext(next);
            }
            return;
        }
            if (current.getNext()==head){
                return;
        }
        delete(current.getNext(),goal);
    }
}
