package Arrays.SlidingWindow;

import java.sql.Array;
import java.util.ArrayList;

public class FruitIntoBaskets {

    public static int optimizedTotalFruit(int[] fruits){
        int track=0, mc=0, basketCnt=2;
        int i =0;
        ArrayList<Integer> basket = new ArrayList();
        for(int j=0; j<fruits.length; j++){
            if(!basket.contains(fruits[j]) && track<basketCnt){
                basket.add(fruits[j]);
                track++;
            }
            else if (!basket.contains(fruits[j]) && track>=basketCnt){
                basket.remove(fruits[i]);
                i++;
                track--;
            }
            else {
                basket.add(fruits[i]);
            }


            mc = Math.max(mc, j-i+1);
        }
        return mc;
    }
    public static int totalFruit(int[] fruits) {
        int count =0;
        ArrayList<Integer> type1 = new ArrayList();
        ArrayList<Integer> type2 = new ArrayList();
        int baskets = 2;
        int track =0;
        int maxcount = 0;
        for(int i=0; i<fruits.length;i++){
            count=0;
            track=0;
            type1.clear();
            type2.clear();
            for(int j=i; j<fruits.length; j++){
                if(type1.isEmpty() && track<baskets){
                    type1.add(fruits[j]);
                    track++;
                    count++;
                }
                else if(type2.isEmpty() && track<baskets && !type1.contains(fruits[j])){
                    type2.add(fruits[j]);
                    track++;
                    count++;
                }
                else if(type1.contains(fruits[j])){
                    count++;
                }
                else if(type2.contains(fruits[j])){
                    count++;
                }
                else{
                    break;
                }
            }
            maxcount = Math.max(count,maxcount);

        }
        return maxcount;
    }
    public static void main(String[] args) {
        int fruits[] = {1,2,3,2,2};
        int res = optimizedTotalFruit(fruits);

        System.out.println(res);

    }
}
