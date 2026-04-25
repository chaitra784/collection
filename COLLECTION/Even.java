import java.util.LinkedHashSet;
class Even{
    public static void main(String[] args){
        LinkedHashSet<String> names=new LinkedHashSet<String>();

        names.add("alice");
    names.add("chaitra");
    names.add("bob");
    names.add("alice");
    System.out.println(names);
    System.out.println(names.contains("bob"));
    names.remove("bob");
    
    System.out.println(names);
    System.out.println(names.size());
    names.clear();
    System.out.println(names);
}
    }
