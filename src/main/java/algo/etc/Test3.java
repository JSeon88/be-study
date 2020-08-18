package algo.etc;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Test3 {


    static int func(int[] stats) {
            int answer = 1;
            Map<Integer,Integer> hMap = new HashMap<>();
            hMap.put(stats[0],stats[0]);
            for(int i = 0; i<stats.length; ++i){
                Set<Integer> keys = hMap.keySet();
                for(int key : keys){
                    if(stats[i] < hMap.get(key)){
                        hMap.put(stats[i], stats[i]);
                        answer++;
                        break;
                    }else if(stats[i] > hMap.get(key)){
                        hMap.put(key, stats[i]);
                        break;
                    }
                }
            }
            return hMap.size();
        }


    public static void main(String[] args) {
//        [5, 3, 4, 6, 2, 1]	4
//            [6, 2, 3, 4, 1, 5]	3
        int[] arr = {5, 3, 4, 6, 2, 1};
        System.out.println(func(arr));

    }
}
