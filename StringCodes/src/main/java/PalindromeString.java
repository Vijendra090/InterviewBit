public class PalindromeString {
    static {
        System.out.println("Input the test string through command line:");
    }

    public static boolean isCharOrDigit(char ch){
        return (ch>='a' && ch<='z')||(ch>='A' && ch<='Z')||(ch>='0' && ch<='9');
    }

    public static void main (String[] args){
        String str = args[0];
        System.out.println("Input String: "+str);

        Integer sindex= 0;
        Integer eindex= str.length()-1;
        Integer flag =0;
        while(sindex < eindex){
            while(sindex <= eindex && isCharOrDigit(str.charAt(sindex))==false)
                sindex++;
            while(eindex>=sindex && isCharOrDigit(str.charAt(eindex))==false)
                eindex--;
            if((sindex<=eindex && eindex>=sindex) && Character.toLowerCase(str.charAt(sindex))!=Character.toLowerCase(str.charAt(eindex))){
                flag=1;
                break;
            }
            sindex++;
            eindex--;
        }
        if(flag == 1){
            System.out.println("Entered string :"+ str+" is not palindrome");
        }else{
            System.out.println("Entered string :"+ str+" is palindrome");
        }
    }
}
