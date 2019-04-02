public class MultPractice implements StudyPractice
{
    private final int first;
    private int second;
    public MultPractice(int i, int j)
    {
        first = i;
        second = j;
    }
    public String getProblem()
    {
        return first + " TIMES " + second;
    }
    public void nextProblem()
    {
        second++;
    }
}