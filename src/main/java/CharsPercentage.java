import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/*
 * This application counts the percentage of the chars in the provided file
 */
public class CharsPercentage {
   
		float count(String string) {
			int charsCount=0;
			for (int i = 0; i < string.length(); i++) {
				if (Character.isAlphabetic(string.charAt(i))) 
			    charsCount++;
			  	}
			return (float)charsCount*100/string.length();
			
	  		}
		
		String readFromFile(String file) throws FileNotFoundException{
			Scanner input;
			input = new Scanner(new File(file));
			String str="";
			while(input.hasNext())
			{
				str= str + input.next();
			}
			input.close();
			System.out.println(str);
			return str;
		}
		
		
		String askUserForAPath() {
			System.out.println("Give me a path");
			Scanner in=new Scanner(System.in);			
			return in.nextLine();
		}
		
		public static void main(String[] args) throws FileNotFoundException {
			CharsPercentage obj = new CharsPercentage();
			System.out.format("The percentage of Chars in the file is - %.2f%%", obj.count(obj.readFromFile(obj.askUserForAPath())));		
			
		}
}



