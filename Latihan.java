package LatihanLinkedList;

import java.util.LinkedList;

public class Latihan {
    public static void main(String[] args) {
        LinkedList<String> hewan = new  LinkedList<String>();
        hewan.add("Sapi");
        hewan.add("Sapi");
        hewan.add("Kelinci");
        hewan.add("Kambing");
        hewan.add("Unta");
        hewan.add("Domba");

        LinkedList<String> deleteHewan = new  LinkedList<String>();
        deleteHewan.add("Unta");
        deleteHewan.add("Kambing");
        deleteHewan.add("Sapi");

        System.out.println("Data Awal Hewan:");
        System.out.println(hewan);

        for (int j = 0; j < deleteHewan.size(); j++) {
            hewan.remove(deleteHewan.get(j));
        }

        System.out.println("Data yang dihapus:");
        System.out.println(deleteHewan);

        System.out.println("Output Hewan:");
        System.out.println(hewan);
    }
}