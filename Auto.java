public class Auto
{
    private String marke = "UNKN";
    private int ps= 20;
    private boolean elektrisch = false;
    //setter
    public void setMarke(String neuMarke)
    {
        marke=neuMarke;
    }
    
    public void setPs(int neuPs)
    {
        if(neuPs >=20 && neuPs <=1500)
        {
            ps=neuPs;
        }
        else
        {
            System.out.println("Fehler: Ungültige PS!");
            ps=20;
            
        }
    }
    // Getter
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
    public Auto(String neuMarke, int neuPs, boolean neuElektrisch)
    {
    marke = neuMarke;
    setPs(neuPs);
    elektrisch = neuElektrisch;
    } 
}