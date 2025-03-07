package goldmansachsQuestions;

public class Q1 {
//    Given an excel sheet with column names mapped to column numbers as follows :
//    A-1 , B-2…..Z-26,AA-27…….AZ-52 and so on.
//
//    Now write a function to return the column name for a given column number.

    static String getColName(int colnumber){
        StringBuilder colname = new StringBuilder();
        while(colnumber>0){
            colnumber--;
            System.out.println('A'+colnumber%26);
            char letter = (char) ('A'+colnumber%26);
            colname.insert(0,letter);
            colnumber/=26;
        }
        return colname.toString();

    }
    public static void main(String[] args) {
        System.out.println(getColName(52));
        System.out.println(getColName(705));
    }
}
