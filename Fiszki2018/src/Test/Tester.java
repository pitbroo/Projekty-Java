package Test;

import Implementation.*;

public class Tester
{
    public static void main(String [] args)
    {

         Word[] words = new Word[5];
        words[0] = new Word("Polska","Poland");
        words[1] = new Word("koniec","finish");
        words[2] = new Word("niebieski","blue");
        words[3] = new Word("wiosna","spring");
        words[4] = new Word("pies","dog");
      //  words[5] = new Word("piłka","ball");
        //check.checkWord(words[0]);\

        wordsTest test = new wordsTest();
       // checkWord check = new checkWord();
        test.testStudent(words);
        //check.checkWord(words[3]);

    }
}
