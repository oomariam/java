/**
 * Write a description of class TextAuthor here.
 * 
 * @ ODEBODE OLAITAN MARIAM U16/FNS/CSC/2079
 */
public class TestAuthor {
   public static void main(String[] args) {
      Author auth = new Author("ODEBODE OLAITAN MARIAM", "olaitanmariam00@gmail.com", 'm');
      System.out.println(auth); 
      auth.setEmail("7sgeneral@yahoo.com");
      System.out.println(auth);
      System.out.println("name is: " + auth.getName());
      System.out.println("gender is: " + auth.getGender());
      System.out.println("email is: " + auth.getEmail());
   }
}