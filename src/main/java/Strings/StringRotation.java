package Strings;

public class StringRotation {

    public static boolean checkRotations(String s, String goal){
        if(s.length() != goal.length()) return false;
        String news = "";
        for(int i=0; i<s.length(); i++){
            news = s.charAt(s.length()-1) + s.substring(0,s.length()-1);
            s = news;
            if(s.equals(goal)) return true;
        }
        return false;
    }

    public static void main(String[] args){
        String a = "abcde";
        String goal = "dceab";
        boolean res = checkRotations(a, goal);
        System.out.println(res);
    }

}
