public class Palindrome {
    private String name;
    private boolean isP=true;

    public Palindrome(String s) {
        name = s.toLowerCase();
    }

    public boolean getP() {
        for(int i=0; i<name.length()/2; i++)
            if(name.charAt(i)!=name.charAt(name.length()-i-1))
                isP=false;
        return isP;
    }
}