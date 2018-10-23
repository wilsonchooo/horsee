package com.company;


public interface Horse
{
    String getName();
    // int getWeight();
}

public class horse extends HorseBarn
{
    private String name;
    private int weight;

    public horse(String name, int weight)
    {
        this.name = name;
        this.weight=weight;
    }
}


public class HorseBarn {

    private Horse[] spaces;



    public int findHorseSpace(String name)
    {
        for(int i=0;i<spaces.length;i++)
        {
            if(spaces[i].equals(name))
            {
                return i;
            }

        }
        return -1;

    }
    public void consolidate()
    {

        for(int i=0;i<spaces.length;i++)
        {
            if(spaces[i]==null)
            {
                spaces[i] = spaces[i+1];
                spaces[i+1]=null;
            }

        }

    }
}