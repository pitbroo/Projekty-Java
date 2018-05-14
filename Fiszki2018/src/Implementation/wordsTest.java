package Implementation;

import java.text.DecimalFormat;
import java.util.Random;
import java.util.Scanner;

public class wordsTest
{

    int licznik = 0;
    checkWord check = new checkWord();
    resoult resoult = new resoult();
    numberOfTries numberTries = new numberOfTries(0);
    numberOfGoodAnswers goodA = new numberOfGoodAnswers(0);
    public void testStudent(Word [] w)
    {
        String command;
        String[] lastWords = new String[3];
        System.out.println("Czy chcesz zaczac nauke?");
        for (String element: lastWords)
        {
            element = "";
        }
        int counter = 0;
        Scanner input = new Scanner(System.in);
        command = input.nextLine();
            while (!command.equals("nie"))
            {
                Random random = new Random();
                int index = random.nextInt(w.length);
                boolean isOccour = false;
                    for (int i = 0; i < lastWords.length; i++)
                    {
                        if (w[index].getwPol().equals(lastWords[i]))
                        {
                            isOccour = true;

                        }
                    }//sprawdzenie czy słowo występuje w tablicy trzech ostatnich słów
                if (isOccour == false)
                {

                            //sprawdzanie słowa pojedynczego
                            System.out.println(w[index].getwPol());
                            System.out.println("Podaj słowo: ");
                            String answer;
                            Scanner inp = new Scanner(System.in);

                            answer = inp.nextLine();

                            if(answer.equals(w[index].getwEng()))
                            {
                                System.out.println("Good answer!");
                                goodA.addGoodAnswers();
                            }
                            else
                            {
                                System.out.println("bad answer! n/good answer is: "+w[index].getwPol());

                            }




                    numberTries.addNumbersOfTries();
                    System.out.println("Kontynuowac?");
                    command = input.nextLine();
                }

            }

        resoult.calculateResoult(numberTries.numbersOfTries,goodA.goodAnswers);


        input.close();
    }
}
