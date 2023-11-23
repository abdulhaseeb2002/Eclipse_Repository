package k213883_lab5;
import java.util.Scanner;
public class K213883_Q2 
{
    public static void main(String[] args) throws invalidCharacter {
            Scanner scan = new Scanner(System.in);
            boolean check1 = true;
            System.out.println("Enter string : ");
            String str = scan.next();
            char ch[] = str.toCharArray();
            for (int i = 0; i < str.length(); i++) {
                if(!Character.isLetter(ch[i])){
                    check1 = false;
                    break;
                }
            }
            if(check1 == false)
                throw new invalidCharacter("Some error occured!");         
    }}
class invalidCharacter extends Exception{
    public invalidCharacter(String message){
        super(message);
    }}
