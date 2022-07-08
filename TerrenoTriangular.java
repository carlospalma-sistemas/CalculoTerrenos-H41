public class TerrenoTriangular extends Terreno
{
    private double ladoa;
    private double ladob;
    private double ladoc;
    
    TerrenoTriangular(double ladoa, double ladob, double ladoc, int estrato)
    {
        this.ladoa = ladoa;
        this.ladob = ladob;
        this.ladoc = ladoc;
        this.estrato = estrato;
    }
    
    void setLadoa(double ladoa)
    {
        this.ladoa = ladoa;
    }
    
    void setLadob(double ladob)
    {
        this.ladob = ladob;
    }
    
    void setLadoc(double ladoc)
    {
        this.ladoc = ladoc;
    }
    
    double getLadoa()
    {
        return this.ladoa;
    }
    
    double getLadob()
    {
        return this.ladob;
    }
    
    double getLadoc()
    {
        return this.ladoc;
    }
    
    //Metodos
    double calcularArea()
    {
        double s = (this.ladoa + this.ladob + this.ladoc)/2;
        this.area = Math.sqrt(s*(s-this.ladoa)*(s-this.ladob)*(s-this.ladoc));
        return this.area;
    }
}
