/**
 * Emailapp
 */
public class Emailapp {

    public static void main(String[] args) {
        Email e=new Email("pamal", "sahan");
        e.setMailBoxCapasity(500);

        System.out.println(e.showInfo());
    }
}