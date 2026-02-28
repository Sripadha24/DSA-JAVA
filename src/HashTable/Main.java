package HashTable;

public class Main {
    public static void main(String[] args) {
        HashTable hash = new HashTable();
        hash.set("doors",5);
        hash.set("doorbells",6);
        hash.set("windows",8);
        hash.set("ac",2);
        hash.set("study tables",3);
        hash.set("laptops",5);
        hash.printlist();
        System.out.println("the value :"+hash.get("doorbells"));
        System.out.println(hash.keys());
    }
}
