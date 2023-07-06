
public class Exercise1 {
    public static void main(String[] args) {
        String str1="gandhi";
        String Init=str1.substring(0,1);
        String rest=str1.substring(1);
        Init=Init.toUpperCase();
        str1=Init+rest;
        System.out.println(str1);
        String str2="Mohandas";
        String str3="Karamchand";
        String M=str2.substring(0,1);
        String K=str3.substring(0,1);
        System.out.println(M+"."+K+"."+str1);
    }
}
