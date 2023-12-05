import java.util.Scanner;
class Last{
    public int lenoflast(String s){
        int count=0;
        for(int i=s.length()-1;i>=0;i--){
            if(s.charAt(i)!=' '){
                count++;
            }
            else{
                break;
            }
        }
        return count;
    }

public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the string:");  
    String s=sc.nextLine();
    Last last=new Last();
    int result=last.lenoflast(s);
    System.out.println("Length of last word:"+result);   
    sc.close(); 


}
}