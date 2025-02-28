/*
EN LA EMPRESA "LA 14" SE VA A PAGAR EL SUELDO A SUS EMPLEADOS SOBRE UN BÁSICO DE $1.500.000. SE PAGA POR DÍAS LABORADOS,
SE TIENE UN DESCUENTO DEL 8% DEL SEGURO MEDICO, UN SUBSIDIO DE TRANSPORTE DE $200.000, UN AHORRO DEL 2% SOBRE EL VALOR TRABAJADO
IMPRIMIR NOMBRE EMPRESA, NOMBRE EMPLEADO, SUELDO LABORADO, DESCUENTO MEDICO, VALOR AHORRO, VALOR A PAGAR O NETO A PAGAR.
VARIABLES
nomEmpr     string   asignar
nomEmpl     string   entrada
suelBas     double   asignar
valAPagar   double   operar
totalDesc   double   operar
valtrab     double   operar
valDescMed  double   operar
valDescAho  double   operar
valTransp  double   operar
transp     double   asignar
diasLabo    int      entrada
descMed     float    asignar
descAho     float    asignar

 */
package LA14;

import java.util.Scanner;

/**
 *
 * @author alejandro gil
 * 28/02/2025
 */
public class La14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    String nomEmpr = "LA 14", nomEmpl;
    double suelBas = 1500000, valAPagar, totalDesc, valTrab, transp = 200000, valDescMed, valDescAho, valTransp ;
    int diasLabo;
    float descMed = 0.08f, descAho = 0.02f ;
    
    Scanner CC = new Scanner(System.in);
    System.out.println("===Sueldo Empleados===");
    System.out.println("========================");
    System.out.println(             );
    System.out.println("Ingrese Nombre Empleado:");
    nomEmpl = CC.nextLine();
    System.out.println("Ingrese Días Laborados:");
    diasLabo = CC.nextInt();
    
    valTrab = (suelBas / 30) * diasLabo;
    valTransp = (transp / 30) * diasLabo;
    valDescMed = valTrab * descMed;
    valDescAho = valTrab * descAho;
    totalDesc = valDescMed + valDescAho;
    valAPagar = (valTrab + valTransp) - totalDesc;
    
    
    System.out.println("\nNomina a Pagar");
    System.out.println("             "+nomEmpr);
    System.out.println("Nombre Empleado:        "+nomEmpl);
    System.out.println("Días Laborados:          "+diasLabo);
    System.out.println("Sueldo Laborado:        $"+valTrab);
    System.out.println("Auxilio Transporte      $"+Math.ceil(valTransp));
    System.out.println("Descuento Medico:       $"+Math.ceil(valDescMed));
    System.out.println("Valor Ahorro:           $"+Math.ceil(valDescAho));
    System.out.println("Total Descuentos:       $"+Math.ceil(totalDesc));
    System.out.println("Total Suelto a Pagar:   $"+Math.round(valAPagar));
    
    }
    
}
