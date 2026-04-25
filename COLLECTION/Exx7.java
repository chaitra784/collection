import java.util .LinkedHashMap;
class Exx7{
    public static void main(String[] args){
    LinkedHashMap<String,String> HM= new LinkedHashMap<>();
    HM.put("key2","value2");
    HM.put("key4","value4");
    HM.put("key3","value3");
    HM.put("key1","value1");
    System.out.println(HM);
    System.out.println(HM.get("key1"));
    HM.remove("key1");
    System.out.println(HM);
    System.out.println(HM.size());
    HM.clear();
    System.out.println(HM);
    }
}