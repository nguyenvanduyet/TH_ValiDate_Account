public class TestMain {
    public static AccountExample accountExample;
    public static final String []validAccount =new String[]{ "123abc_", "_abc123", "______", "123456","abcdefgh"};
    public static final String []invalidAccount= new String[]{ ".@", "12345", "1234_", "abcde"};
    public static void main(String[] args) {
        accountExample = new AccountExample();
        for (String s: validAccount) {
            boolean isValid=accountExample.validate(s);
            System.out.println("Account is " + s +" is valid: "+ isValid);
        }
        for (String s: invalidAccount) {
            boolean isValid=accountExample.validate(s);
            System.out.println("Account is " + s +" is valid: "+ isValid);
        }
    }
}
