public class Removespace {
    public static void main(String[] args){
        String str ="He llo W orld";
        System.out.println("String with spaces: " + str);
        String str1 =str.replaceAll(" ", "");
        System.out.println("String without spaces: " + str1);
    }
}
