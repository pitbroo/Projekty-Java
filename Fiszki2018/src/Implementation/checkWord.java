package Implementation;

import java.util.Scanner;

public class checkWord
{
    public checkWord()
    {

    }
   // numberOfGoodAnswers numberGoodAnswers = new numberOfGoodAnswers(0);

   // public numberOfGoodAnswers getNumberGoodAnswers() {
    //    return numberGoodAnswers;
   // }

    public  void checkWord(Word w)
    {
        System.out.println(w.getwPol());
        System.out.println("Podaj słowo: ");
        String answer;
        Scanner input = new Scanner(System.in);

        answer = input.nextLine();

        if(answer.equals(w.getwEng()))
        {
            //return ("Good answer!");
            System.out.println("Good answer!");
        }
        else
        {
            //return ("bad answer! n/good answer is: "+w.getwPol());
            System.out.println("bad answer!" +"n/" + "good answer is: "+w.getwPol());
        }

    }

}
