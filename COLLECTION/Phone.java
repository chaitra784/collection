import java.util.HashMap;
class Phone{
    public static void main(String[] args){
    HashMap<String,String>names=new HashMap<>();
    names.put("chaitra","9789764454");
    names.put("maitra","84784321");
    names.put("rahul","4598765673");
    names.put("namdni","876789543");
    names.put("ganga","6789423412");
    System.out.println(names);
    System.out.println(names.containsKey("rahul"));
    System.out.println(names);
    }
}