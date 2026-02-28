package HashTable;

import java.util.ArrayList;

public class HashTable {
    private int size = 7;
    private Node[] datamap;
    class Node{
        private String key;
        private int value;
        private Node next;

        public Node(String key,int value){
            this.key = key;
            this.value = value;
        }
    }
    public HashTable(){
        datamap = new Node[size];
    }
    private int hash(String key){
        int hash = 0;
        char[] keychar = key.toCharArray();
        for(int i =0;i<keychar.length;i++){
            int ascii = keychar[i];
            hash = (hash + ascii *23) % 7;
        }
        return hash;
    }
    public void set(String key,int value){
        int index = hash(key);
        Node newNode = new Node(key,value);
        if(datamap[index] == null){
            datamap[index] = newNode;
        }else{
            Node temp = datamap[index];
            while(temp.next != null){
                temp = temp.next;
            }
            temp.next = newNode;
        }
    }
    public void printlist(){
        for(int i =0;i< datamap.length;i++){
            System.out.println(i+" :");
            Node temp = datamap[i];
            while(temp != null){
                System.out.println(" {"+temp.key+"= "+temp.value+"}");
                temp  = temp.next;
            }
        }
    }
    public int get(String key){
        int index = hash(key);
        Node temp  = datamap[index];
        while(temp!=null){
            if( key == temp.key) return temp.value;
            temp =temp.next;
        }
        return -1;
    }
    public ArrayList<String> keys(){
        ArrayList<String> list = new ArrayList<>();
        for(int i =0;i< datamap.length;i++){
            Node temp = datamap[i];
            while(temp != null){
                list.add(temp.key);
                temp = temp.next;

            }
        }
        return list;
    }
}
