public class Main {
    public static void main(String[] args) {
        CircularList list=new CircularList();

        list.addNode(
                new Node("A");
//        );
//        list.addNode(
//                new Node("B")
//        );
//        list.addNode(
//                new Node("C")
//        );
//        list.addNode(
//                new Node("D")
//        );
        list.print();
        list.delete("D");
        System.out.println("**");
        list.print();

    }
}