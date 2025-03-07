package Arrays.SlidingWindow;

import java.awt.image.ImageProducer;
import java.util.HashMap;

public class SubstringsContainingAllThreeChars {

    public static int noOfSubstrings(String s){
        HashMap<Character, Integer> lastSeenTrack = new HashMap<>();
        lastSeenTrack.put('a', -1);
        lastSeenTrack.put('b', -1);
        lastSeenTrack.put('c', -1);
        int count =0;
        for (int i=0; i<s.length(); i++){
            lastSeenTrack.put(s.charAt(i), i);
            if (lastSeenTrack.get('a')!=-1 && lastSeenTrack.get('b')!=-1 && lastSeenTrack.get('c')!=-1){
                int minidx = Math.min(Math.min(lastSeenTrack.get('a'), lastSeenTrack.get('b')), lastSeenTrack.get('c'));
                count+=minidx+1;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        String s ="abcabc";
        int res = noOfSubstrings(s);
        System.out.println(res);
    }
}
