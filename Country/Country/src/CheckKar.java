import java.util.*;

public class CheckKar {

    TreeMap<String, HashMap<String, HashMap<String, HashSet<AllCity>>>> al() {
        AllCity d1 = new AllCity("Pune");
        AllCity d2 = new AllCity("kolkata");
        AllCity d3 = new AllCity("ShivajiNagar");
        AllCity d4 = new AllCity("Dehu");
        AllCity d5 = new AllCity("Dum Dum");
        AllCity d6 = new AllCity("Barrrackpore");
        AllCity d7 = new AllCity("Barasat");
        AllCity d8 = new AllCity("Kanchrapara");
        AllCity d9 = new AllCity("Bhor");
        AllCity d10 = new AllCity("Maval");
        AllCity d11 = new AllCity("Jaipur");
        AllCity d12 = new AllCity("Phulera");
        AllCity d13 = new AllCity("Amer");
        AllCity d14 = new AllCity("Govindgarh");
        AllCity d15= new AllCity("chomu");

        HashSet<AllCity> puneDistrict = new HashSet<>();
        puneDistrict.add(d1);
        puneDistrict.add(d3);
        puneDistrict.add(d4);
        puneDistrict.add(d9);
        puneDistrict.add(d10);
        HashSet<AllCity> jaipurDistrict = new HashSet<>();
        jaipurDistrict.add(d11);
        jaipurDistrict.add(d12);
        jaipurDistrict.add(d13);
        jaipurDistrict.add(d14);
        jaipurDistrict.add(d15);
        HashSet<AllCity> kolkataDistrict = new HashSet<>();
        kolkataDistrict.add(d2);
        kolkataDistrict.add(d6);
        kolkataDistrict.add(d7);
        kolkataDistrict.add(d8);
        kolkataDistrict.add(d5);

        //district
        HashMap<String,HashSet<AllCity>>pune = new HashMap<>();
        pune.put("Pune",puneDistrict);
        HashMap<String,HashSet<AllCity>>kolkata = new HashMap<>();
        kolkata.put("Kolkata",kolkataDistrict);
        HashMap<String,HashSet<AllCity>>jaipur = new HashMap<>();
        jaipur.put("Jaipur",jaipurDistrict);
//      States
        HashMap<String,HashMap<String,HashSet<AllCity>>> state = new HashMap<>();
        state.put("Maharashtra",pune);
        state.put("West Bengal",kolkata);
        state.put("Rajasthan",jaipur);
//      Country
        TreeMap<String,HashMap<String,HashMap<String,HashSet<AllCity>>>> country = new TreeMap<>();
        country.put("India" , state);
        return country;


    }

    public static void main(String[] args) {
        CheckKar k = new CheckKar();
        System.out.println(k.al());
    }
}