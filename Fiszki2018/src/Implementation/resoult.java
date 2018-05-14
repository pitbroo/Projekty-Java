package Implementation;

import java.text.DecimalFormat;

public class resoult
{
    int answers;
    int goodAnswers;

    public resoult(int answers, int goodAnswers)
    {
        int a = answers;
        int b = goodAnswers;
    }
    public resoult()
    {

    }

    public void calculateResoult(int a, int b)
    {
        double aa = (double)a;
        double bb = (double)b;
        double resoult = bb/aa;
        DecimalFormat decimalFormat = new DecimalFormat("#%");
        //decimalFormat.format(resoult);
        System.out.println("Your number of tries: "+a);
        System.out.println("Your good answers: "+b);
        System.out.print("Your resoult: "+decimalFormat.format(resoult));


    }
}
