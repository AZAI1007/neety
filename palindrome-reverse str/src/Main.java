public class Main {
    public static void main(String[] args) {
        int x = 1251;
        String str = Integer.toString(x);
        String reverse = "";//empty string
        for(int i=0;i<str.length();i++){//for loop to cycle to each char
            reverse = str.charAt(i) + reverse;//adding each character to an empty string
        }
        System.out.println(reverse.equals(str));//print out true/false whether they're equivalent or not
    }
}