import java.util.*;
class factorial{
    static Scanner scn = new Scanner(System.in);
    public static void main(String []args){
        int num = scn.nextInt();
        int ans = 1;
        if(num>=1 && num<=10){
            for(int i=num; i>=1; i--){
                ans = ans * i;
            }
        }else{
            return ;
        }
        
        System.out.println(ans);
    }
}