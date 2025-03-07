package Strings;

public class ReverseStringOfWords {
    public static String reverseWords(String s) {
        String res="", temp="";
        for(int i=s.length()-1; i>=0; i--){
            if(s.charAt(i)==' '){
                if(temp!=""){
                    res+=temp+" ";
                    temp="";
                }

            }
            else{
                temp=s.charAt(i)+temp;
            }
        }
        res =res+temp;
        res = res.trim();
        return res;
    }

    public static void main(String[] args) {
        String s = "  hello world  ";
        String res = reverseWords(s);
        System.out.println(res);
    }
}
