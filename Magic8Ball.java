import java.security.SecureRandom;

import javax.swing.JOptionPane;

public class GUI {


    private final static SecureRandom randomNumber = new SecureRandom();
    private final static String answers[] = {
        "It is certain",
        "It is decidedly so",
        "Without a doubt",
        "Yes - definitely",
        "You may rely on it",
        "As I see it, yes",
        "Most likely",
        "Outlook good",
        "Signs point to yes",
        "Yes",
        "Reply hazy, try again",
        "Ask again later",
        "Better not tell you now",
        "Cannot predict now",
        "Concentrate and ask again",
        "Don't count on it",
        "My reply is no",
        "My sources say no",
        "Outlook not so good",
        "Very doubtful" };
   
        public static void main(String[] args) {
            boolean askQuestion = true;

            while (askQuestion) {
                String question = getUserQuestion();
                String randomAnswer = getRandomQuestion();

                displayAnswer(question, randomAnswer);
                askQuestion = userWantsToAskAnotherQuestion();

            }

            showExitMessage();
        }

        private static String getUserQuestion() {
            return JOptionPane.showInputDialog(null, 
            "Please enter a yes or no question:", 
            "WELCOME: Have your questions answered", JOptionPane.INFORMATION_MESSAGE);
        }

        private static String getRandomQuestion() {
            return answers[randomNumber.nextInt(answers.length)];
        }

        private static void displayAnswer(String question, String randomAnswer) {
            JOptionPane.showMessageDialog(null, question + "\n" + randomAnswer, "The Magic eight ball has responded.", JOptionPane.PLAIN_MESSAGE);
        }

        private static boolean userWantsToAskAnotherQuestion() {
            return 0 == JOptionPane.showConfirmDialog(null, "", "would you like to ask another question", JOptionPane.PLAIN_MESSAGE);
        }

        private static void showExitMessage() {
            JOptionPane.showMessageDialog(null, "programmed by Alim Apekov, with help from google :) ", "GoodBye", JOptionPane.PLAIN_MESSAGE );
        }
    
    
}
