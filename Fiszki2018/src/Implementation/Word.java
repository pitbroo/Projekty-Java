package Implementation;

import java.util.Random;
import java.util.Scanner;

public class Word
{
    private String wPol;
    private String wEng;
    private float numberOfTries=0;
    private float goodAnswers=0;


    public Word ()
    {

    }
    public Word(String wPol, String wEng)
    {
        this.wPol = wPol;
        this.wEng = wEng;
    }

    public String getwPol() {
        return wPol;
    }
    public void setGoodAnswers(int goodAnswers) {
        this.goodAnswers = goodAnswers;
    }

    public String getwEng() {
        return wEng;
    }

    public void setwPol(String wPol)
    {
        this.wPol = wPol;
    }

    public void setwEng(String wEng)
    {
        this.wEng = wEng;
    }

    @Override
    public String toString()
    {
        return "Implementation.Word{" +
                "wPol='" + wPol + '\'' +
                ", wEng='" + wEng + '\'' +
                '}';
    }
}
