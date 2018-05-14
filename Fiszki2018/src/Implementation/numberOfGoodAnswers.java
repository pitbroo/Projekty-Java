package Implementation;

public class numberOfGoodAnswers
{
    int goodAnswers = 0;

    public numberOfGoodAnswers(int goodAnswers)
    {
        this.goodAnswers = goodAnswers;
    }
    public void addGoodAnswers()
    {
        goodAnswers++;
    }
    public int getGoodAnswers() {
        return goodAnswers;
    }

}
