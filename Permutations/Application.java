
class Application{

    public static void permutations(String str, String prefix){
        if(str.length() == 0){
            System.out.println(prefix);
        }

        for (int i = 0; i < str.length(); i++) {
            String remaining = str.substring(0, i) + str.substring(i+1);
            permutations(remaining, prefix+str.charAt(i));
        }
    }

    public static void main(String[] args) {
        permutations("12345", "");
    }
}