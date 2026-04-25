import java.util.LinkedList;
class Odd{
    public static void main(String[] args){
        LinkedList<String> names=new LinkedList<String>();
        names.addFirst("saran");
        names.addFirst("iramma");
        names.addLast("alice");
        names.addFirst("Bob");
        System.out.println(names);
        System.out.println(names.getFirst());
        System.out.println(names.getLast());
        names.removeFirst();
        System.out.println(names);
        names.removeLast();
        System.out.println(names);
        
    }
}