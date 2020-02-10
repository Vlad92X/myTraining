package les01;

import java.util.HashMap;
import java.util.Map;

public class SimpleMap {
    public static void main(String[] args) {
        Map<String,Integer> map=new HashMap<>();
        map.put("Wold",100);
        //System.out.println(map.size());
        map.put("Wold1",150);
        map.put("Wold2",250);
        //System.out.println(map.size());
        //System.out.println(map);

        for (Map.Entry<String,Integer> tmp:map.entrySet()){
            System.out.println(tmp.getKey()+" "+tmp.getValue());
        }
    }
}
