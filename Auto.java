public class Auto
{
    private String marke = "UNKN";
    private int ps = 20;
    private boolean elektrisch = false;
    
    public Auto(String neuMarke, int neuPs, boolean neuElektrisch)
    {
        setMarke(neuMarke);
        setPs(neuPs);
        setElektrisch(neuElektrisch);
    }
    
    public void setMarke(String marke)
    {
        this.marke = marke;
    }
    
    public void setPs(int ps)
    {
        if ((ps >= 20) && (ps <= 1500))
        {
            this.ps = ps;
        }
        else
        {
            System.out.println("Fehler: ungültige PS!");
            this.ps = 20;
        }
    }
    
    public void setElektrisch(boolean elektrisch)
    {
        this.elektrisch = elektrisch;
    }
    
    public String getMarke()
    {
        return marke;
    }
    
    public int getPs()
    {
        return ps;
    }
    
    public boolean getElektrisch()
    {
        return elektrisch;
    }
}