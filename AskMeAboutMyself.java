import java.util.Scanner;

public class AskMeAboutMyself {

	public static void main(String[] args) {
		// Make an interactive, futuristic resume so the employer can ask it questions

		String askMe = "Please ask me a question. You can say" + " 'all' " + 
		"for a list of all the current commands";

		System.out.println(askMe);
		
		// Create scanner to recognize the answer
		String answer = new Scanner(System.in).nextLine(); //Input to String
		
		//int result = Integer.parseInt(answer);
		System.out.println("You said " + answer);
		
		String all = "All";
		String capAll = "all";
		//int compAll = Integer.parseInt(all);
		//System.out.println(all);
		
		if (answer.equals(all)||answer.equals(capAll))
			System.out.print("okay..."
					+ "Name, Test2, Test3");
		
		String userAnswer = new Scanner(System.in).nextLine(); //Input to String
		
		//int result = Integer.parseInt(answer);
		System.out.println("You said " + userAnswer);
		
		String name = "My name is Garry Moyer";
		String qName = name;
		switch (userAnswer){
		case "Name": System.out.println(qName);
		}
		
		
		
	}

}
