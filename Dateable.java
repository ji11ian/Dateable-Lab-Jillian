public class Dateable {
 
   public static void main(String[] args) {
     
        Scanner age = new Scanner(System.in);
        System.out.println("Enter your age: ");
        int yourage = age.nextInt();
        int minage = (yourage/2) + 7;
        System.out.println(yourage + " year olds should data somebody who is at least " + minage + " years old.");
    }
}
