package les03;

import java.lang.ref.PhantomReference;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.SoftReference;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import java.util.WeakHashMap;

public class SimpleWeakHashap {
    public static void main(String[] args) {

        Map<String,String> weakHashMap= new WeakHashMap<>();
        Map<String,String> hashMap= new HashMap<>();

        String keyWeakHashMap= new String( "keyWeakHashMap");
        String keyHashMap= new String( "keyHashMap");

        weakHashMap.put(keyWeakHashMap,"weakHash");
        hashMap.put(keyHashMap,"Hash");

        System.out.println("Before gc, weak = "+weakHashMap.get("keyWeakHashMap")+ " ; hash = "
                +hashMap.get("keyHashMap"));

        keyWeakHashMap=null;
        keyHashMap=null;

        System.gc();
        System.out.println("After gc, weak = "+weakHashMap.get("keyWeakHashMap")+ " ; hash = "
                +hashMap.get("keyHashMap"));

//         //Strong reference
//        Integer test=1;
//        //SoftReference
//        SoftReference<Integer> softReference=new SoftReference<>(test);
//        //test=null;
//        //Weak reference
//        WeakReference <Integer> weakReference=new WeakReference<>(test);
//        test=null;
//
//        //phantom ref
//        PhantomReference<Integer> phantomReference=new PhantomReference<>(test,new ReferenceQueue<>());

    }
}
