import java.util.ArrayList;
import java.util.Random;

public class DominoPile {

    private ArrayList<Domino> pile;

    public DominoPile()
    {
        pile = new ArrayList<Domino>();
    }

    public ArrayList<Domino> getPile()
    {
        return pile;
    }

    public void newStack6()
    {
        for(int i = 0; i < 7; i++)
        {
            for(int j = 0; j < 7; j++)
            {
                boolean contains = false;

                for(int l = 0; l < pile.size(); l++)
                {
                    if(pile.get(l).getTop() == j && pile.get(l).getBottom() == i)
                    {
                        contains = true;
                        break;
                    }
                }
                if(!contains)
                    pile.add(new Domino(i, j));
            }
        }
    }

    public void shuffle()
    {
        for(int i = 0; i < 200; i++)
        {
            Random rand = new Random();
            int randInd1 = rand.nextInt(pile.size());
            int randInd2 = rand.nextInt(pile.size());
            Domino temp = pile.get(randInd1);
            pile.set(randInd1, pile.get(randInd2));
            pile.set(randInd2, temp);
        }
    }
}
