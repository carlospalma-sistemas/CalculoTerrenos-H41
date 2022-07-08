import javax.swing.JOptionPane;
import java.text.DecimalFormat;

public class Arranque
{
    public static void main(String [] args)
    {
        DecimalFormat formato = new DecimalFormat("#,###.##");
        int opcion;
        do
        {
            opcion = Integer.parseInt(JOptionPane.showInputDialog(null, "Escoja tipo de terreno\n1. Rectangular\n2. Trapezoidal\n3. Triangular\n4. Salir"));
            double ancho;
            int estrato;
            Terreno t;
            switch(opcion)
            {
                case 1:
                    double largo = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese largo del terreno rectangular"));
                    ancho = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese ancho del terreno rectangular"));
                    estrato  = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese estrato del terreno rectangular"));
                    t = new TerrenoRectangular(largo, ancho, estrato);
                    JOptionPane.showMessageDialog(null, "El área del terreno rectangular es: "+t.calcularArea()+ "\nEl valor del terreno rectangular es: $"+formato.format(t.calcularValorTotal()));
                    break;
                    
                case 2:
                    double largoMayor = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese largo mayor del terreno trapezoidal"));
                    double largoMenor = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese largo menor del terreno trapezoidal"));
                    ancho = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese ancho del terreno trapezoidal"));
                    estrato  = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese estrato del terreno trapezoidal"));
                    t = new TerrenoTrapezoidal(largoMayor, largoMenor, ancho, estrato);
                    JOptionPane.showMessageDialog(null, "El área del terreno trapezoidal es: "+t.calcularArea()+ "\nEl valor del terreno trapezoidal es: $"+formato.format(t.calcularValorTotal()));
                    break;
                    
                case 3:
                    double ladoa = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese lado a del terreno triangular"));
                    double ladob = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese lado b del terreno triangular"));
                    double ladoc = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese lado c del terreno triangular"));
                    estrato  = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese estrato del terreno triangular"));
                    t = new TerrenoTriangular(ladoa, ladob, ladoc, estrato);
                    JOptionPane.showMessageDialog(null, "El área del terreno triangular es: "+t.calcularArea()+ "\nEl valor del terreno triangular es: $"+formato.format(t.calcularValorTotal()));
                    break;
                    
                case 4:
                    JOptionPane.showMessageDialog(null, "Gracias");  
                    break;
                    
                default:
                    JOptionPane.showMessageDialog(null, "la opción es incorrecta");  
            }
        }
        while(opcion != 4);
    }
}
