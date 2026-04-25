import java.util.ArrayList;
class Cart{
    public static void main(String[] args){
    ArrayList<String>names=new ArrayList<String>();
    names.add("laptop");
    names.add("mouse");
    names.add("keyboard");
    names.add("monitor");
    for(String item: names)
        System.out.println(item);
}
}