import java.util.HashMap;
class Marks{
    public static void main(String[] args){
    HashMap<String,Integer>names=new HashMap<String,Integer>();
    names.put("chaitra",97);
    names.put("maitra",84);
    names.put("rahul",45);
    names.put("namdni",87);
    names.put("ganga",67);
    System.out.println(names);
    System.out.println(names.get("chaitra"));
    names.remove("maitra");
    System.out.println(names);
    System.out.println(names.size());
    names.clear();
    System.out.println(names);
    }
}