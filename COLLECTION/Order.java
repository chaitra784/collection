import java.util.ArrayList;
class Order{
    public static void main(String[] args){
    ArrayList<String>names=new ArrayList<String>();
    names.add("order101");
    names.add("order102");
    names.add("order103");
    names.add("order104");
    System.out.println(names);
    names.remove("order102");
    System.out.println(names);
}
}