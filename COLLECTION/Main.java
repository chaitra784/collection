import java.util.ArrayList;
class Main{
    public static void main(String[] args){
    ArrayList<String>names=new ArrayList<String>();
    names.add("alice");
    names.add("bob");
    names.add("chaitra");
    names.add(2,"Saniya");
    System.out.println(names);
    System.out.println(names.get(0));
    names.set(3,"david");
    names.remove(3);
    System.out.println(names);
    System.out.println(names.size());
    names.clear();
    System.out.println(names);
}
}