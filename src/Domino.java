public class Domino {

    int top;
    int bottom;

    public Domino()
    {
        top = 0;
        bottom = 0;
    }

    public Domino(int s1, int s2)
    {
        top = s1;
        bottom = s2;
    }

    public int getTop()
    {
        return top;
    }

    public void setTop(int top)
    {
        this.top = top;
    }

    public int getBottom()
    {
        return bottom;
    }

    public void setBottom(int bottom)
    {
        this.bottom = bottom;
    }

    public void flip()
    {
        int temp = top;
        top = bottom;
        bottom = temp;
    }

    public void settle()
    {
        if (bottom < top)
            flip();
    }

    public int compareTo(Domino other)
    {
        this.settle();
        other.settle();
        if(top < other.getTop())
            return -1;
        if(top > other.getTop())
            return 1;
        else
        {
            if(bottom < other.getBottom())
                return -1;
            if(bottom > other.getBottom())
                return 1;
            return 0;
        }
    }

    public int compareToWeight(Domino other)
    {
        if(top + bottom > other.getTop() + other.getBottom())
            return 1;
        if(top + bottom < other.getTop() + other.getBottom())
            return -1;
        return 0;
    }

    public boolean canConnect(Domino other)
    {
        if(top == other.getTop() || top == other.getBottom() || bottom == other.getTop() || bottom == other.getBottom())
            return true;
        return false;
    }

    public String toString()
    {
        return top + "/" + bottom;
    }
}
