import java.util.*;

public class Sera{
    static LinkedList<String> contact = new LinkedList<>();
    static LinkedList<String> email = new LinkedList<>();
    static LinkedList<String> number = new LinkedList<>();


    static void AddContact(String name, String address, String num){
        contact.add(name);
        email.add(address);
        number.add(num);
    }
    static void DeleteContact(String name){
        int x = contact.indexOf(name);
        contact.remove(name);
        email.remove(x);
        number.remove(x);
    }
    static void SearchContact(String name){
        if (contact.contains(name)){
            int x = contact.indexOf(name);
            System.out.println(name);
            System.out.println(email.get(x));
            System.out.println(number.get(x));
        }
        else{
            System.out.println("No");
        }
    }
    static void SearchEmail(String address){
        if (email.contains(address)){
            int x = email.indexOf(address);
            System.out.println(contact.get(x));
            System.out.println(address);
            System.out.println(number.get(x));
        }
        else{
            System.out.println("No");
        }
    }
    static void SearchNumber(String num){
        if (number.contains(num)){
            int x = number.indexOf(num);
            System.out.println(contact.get(x));
            System.out.println(email.get(x));
            System.out.println(num);
        }
        else{
            System.out.println("No");
        }
    }
    static void PrintList(){
        System.out.print("Contacts = ");
        for (String s : contact) {
            System.out.print(s + "      ");
        }
        System.out.println();
        System.out.print("Email = ");
        for (String s : email) {
            System.out.print(s + "      ");
        }
        System.out.println();
        System.out.print("Number = ");
        for (String s : number) {
            System.out.print(s + "      ");
        }
        System.out.println();
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        boolean x = true;
        while (x) {
            System.out.println("************************************");
            System.out.println("1. Add Contact");
            System.out.println("2. Delete Contact");
            System.out.println("3. Search Name");
            System.out.println("4. Search Email");
            System.out.println("5. Search Number");
            System.out.println("6. Print List");
            System.out.println("7. Quit");
            System.out.print("Enter Command = ");
            String a = sc.nextLine();
            switch (a) {
                case "1" -> {
                    System.out.print("Enter name: ");
                    String b = sc.nextLine();
                    System.out.print("Enter email: ");
                    String c = sc.nextLine();
                    System.out.print("Enter number: ");
                    String d = sc.nextLine();
                    AddContact(b, c, d);
                }
                case "2" -> {
                    System.out.print("Enter name: ");
                    String b = sc.nextLine();
                    DeleteContact(b);
                }
                case "3" -> {
                    System.out.print("Enter name: ");
                    String b = sc.nextLine();
                    SearchContact(b);
                }
                case "4" -> {
                    System.out.print("Enter email: ");
                    String b = sc.nextLine();
                    SearchEmail(b);
                }
                case "5" -> {
                    System.out.print("Enter number: ");
                    String b = sc.nextLine();
                    SearchNumber(b);
                }
                case "6" -> PrintList();
                case "7" -> x = false;
            }
        }
    }
}



