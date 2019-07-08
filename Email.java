import java.util.Scanner;

/**
 * Email
 */
public class Email {

    private String firstName;
    private String lastName;
    private String password;
    private int defaultpassword=8;
    private String email;
    private String companySufix="awscompany.com";
    private String department;
    private int mailboxCapasity;
    private String alternateEmail;

   


    // contructor return first name and the last name 
    public Email(String fName, String lName){
        this.firstName=fName;
        this.lastName=lName;
        System.out.println("Email was Created :"+this.firstName +" "+ this.lastName);
        this.department=setDepartment(); //use this key word other wise get an 
       
        // set password
        this.password=randomPassword(defaultpassword);
      //  System.out.println(password);

        //set Email
        this.email=firstName.toLowerCase()+"."+lastName.toLowerCase()+"@"+department+"."+companySufix;

    }

    // ask for the department
    private String setDepartment(){
        System.out.println("Enter your Department:");
        System.out.println("1.Sales");
        System.out.println("2.Developments");
        System.out.println("3.Accounting");
        System.out.println("0.for none");
        System.out.println("Enter your code:");
        Scanner in=new Scanner(System.in);
        int DepCode=in.nextInt();
        in.close(); 
        // we can close the other wise it gives an error resources leak it is not 
        //for when excuting.
        //resource leak mean loss of memory needlessly


        switch (DepCode) {
            case 1:
                return "Sales"; 
              
            case 2:
                return "Developments";
               
            case 3:
                return "Accounting";
                
            default:
                return "none";
               

                //we do not have to use break because we use return key word so after 
                //comming to the return code will terminate

        }

    }

    // set generate random password
    private String randomPassword(int length){
        String passwordChar="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String passwordNum="1234567890";
        char[] password=new char[length];
        password[0]='#';
        password[3]='@';

        for (int i = 1; i <3; i++) {
           int rand=(int) (Math.random()*passwordChar.length());
           password[i]=passwordChar.charAt(rand);
           
        }
        for(int j=4;j<length;j++){
            int rd=(int) (Math.random()*passwordNum.length());
            password[j]=passwordNum.charAt(rd);
           
            
        }
        //have to convert char array in to string so we have to 
        String word=new String(password); // constructor eke valueOf kiyana function eka use karanawa
        //we can use String.valueOf(password); also
        return word; //or we can use new String(password);


    }

    //set the mailbox mailboxCapasity
    public void setMailBoxCapasity(int capasity){
        this.mailboxCapasity=capasity;

    }


    //set the alternateEmail
    public void setAlternateEmail(String altEmail){
        this.alternateEmail=altEmail;

    }

    //change the password
    public void changePassword(String password){
        this.password=password;

    }

    //get mailboxCapasity
    public int getMailBoxCapasity(){
        return mailboxCapasity;
    }

    //get alternative email address
    public String getAlternativeEmail(){
        return alternateEmail;
    }

    //get password 
    public String getPassword(){
        return password;
    }

    public String showInfo(){
        return "DISPLAY NAME :"+firstName+" " +lastName + "\n" + "DEPARTMENT NAME :" +department  +"\n"+"EMAIL ADDRESS :"+email+"\n" +"MAILBOX CAPASITY :" + mailboxCapasity +"mb" +"\n" +"CURRENT PASSWORD :"+password;
    }
    
}