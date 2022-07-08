public class Terreno
{
    protected int estrato;
    protected double area;
    protected double valorTotal;
    
     //Obtener el valor de estrato
    int getEstrato()
    {
        return this.estrato;
    }
    
    //Asignar un valor a estrato
    void setEstrato(int estrato)
    {
        this.estrato = estrato;
    }
    
    double getArea()
    {
        return this.area;
    }

    double getValorTotal()
    {
        return this.valorTotal;
    }
    
    double calcularValorTotal()
    {
        if(this.estrato == 1 || this.estrato == 2)
        {
            this.valorTotal = this.area * 2500000;
        }
        else if (this.estrato == 3 || this.estrato == 4)
        {
            this.valorTotal = this.area * 3250000;
        }
        else 
        {
            this.valorTotal = this.area * 4820000;
        }
        return this.valorTotal;
    }
    
    double calcularArea()
    {
        return 9999999;
    }
    
}
