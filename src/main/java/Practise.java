class Practise{


    public static void main(String args[]) {
        int[] nums = new int[] {3,2,1,0,4};

        int pos = 0;
        int n = nums.length;
        while (pos<=n-1){
            if (nums[pos]== 0){
                System.out.println("False");
                break;
            }
            else{
                pos = pos + nums[pos];
            }

  
        }
        if( pos > n-1) System.out.println("False");
        else System.out.println("True");
    }
}

