package com.company;

public class Women extends Humen {
    @Override
    public boolean speak(Humen m1) {
        return true;
    }

    @Override
    public Humen relative(Humen m1) {
        if(m1.sex==false)
        return null;
        else return givebaby();
    }

    @Override
    public boolean terpeti(Humen m1) {
        if(m1.sex==false)
        return false;
        else return true;
    }

    @Override
    public boolean somethingtime(Humen m1) {
        return true;
    }
    public Women( String name,String surname,float casse,float weight)
    {
        this.name=name;
        this.casse=casse;
        this.sex=false;
        this.weight=weight;
        this.surname=surname;
    }
    public  Humen givebaby()
    {Humen m2=new Men();
        return m2;
    }
}
