import java.util.Scanner;
public class validatingEmail {
	
    public static void main(String[] args) 
    { 
      String[] strArray = new String[6];
      strArray[0]= "ronaldo@yahoo.com";
      strArray[1]= "messik@yahoo.com"; 
      strArray[2]= "light@yahoo.com"; 
      strArray[3]= "zoro@gmail.com"; 
      strArray[4]= "luffy@gmail.com";
      strArray[5]= "asta@gmail.com"; 
      
        boolean found = false;
        int index = 0;
        
        Scanner Str=new Scanner(System.in);
        System.out.println("Enter the Email ID:");
        String a= Str.nextLine(); 
       for (int i = 0; i <strArray.length; i++) {
       if(a.equals(strArray[i])) {
            index = i; found = true; 
            }
        }
       if(found)
          System.out.println("\n" +a +" located email in the array in index "+index);
        else
          System.out.println("\n" +a +" email not located in the array");
 
    }
}