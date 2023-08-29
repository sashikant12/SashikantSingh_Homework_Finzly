import java.util.HashMap;
import java.util.HashSet;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        CheckKar k = new CheckKar();
        TreeMap<String, HashMap<String, HashMap<String, HashSet<AllCity>>>> w = k.al();
        System.out.println(w.get("India").get("Maharashtra").get("Pune"));


    }
}