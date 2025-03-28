package alquila;

import java.util.Scanner;

public class alquila{

    public static void main(String[] args) {
   
     String nomEmp="alquile ltda", nomCli, tipoTra;   
     int tipoSeg,valMoto=100000,valCar=120000,canHoras;
     float porDtoMo=0.02f,porDtoCa=0.04f,porSeg1=0.02f,porSeg2=0.04f;
     double canToHoras=0,valDto=0,valSeg=0,valNeto=0,valBas=0;
     
     Scanner Tc = new Scanner (System.in);
        System.out.println("**Alquiler de Transporte**");
        System.out.println("==========================");
        System.out.println("Ingresa tu nombre:");
        nomCli = Tc.nextLine();
        System.out.println("Ingrese Tipo de Transporte Carro o Moto:");
        tipoTra = Tc.nextLine();
        System.out.println("Cuantas horas:");
        canHoras = Tc.nextInt();
        System.out.println("Ingrese Tipo de Seguro 1 o 2:");
        tipoSeg = Tc.nextInt();
        
        if (tipoTra.equalsIgnoreCase("Moto")) 
        {
            valBas = valMoto * canHoras;
            valDto = valBas * porDtoMo;
        }
        else
            if (tipoTra.equalsIgnoreCase("Carro")) 
            {
                valBas = valCar * canHoras;
                valDto = valBas * porDtoCa;
            }
             else
                 {
                     System.out.println("Error de Vehiculo....");
                 }
        if (tipoSeg == 1) 
        {
           valSeg = valBas * porSeg1;
        }
        else
            if (tipoSeg == 2) 
            {
               valSeg = valBas * porSeg2;
            }
             else
                 {
                     System.out.println("Error Tipo de Seguro....");
                 }
        valNeto = valBas + valSeg - valDto;
        
       if (tipoTra.equalsIgnoreCase("Moto") || tipoTra.equalsIgnoreCase("Carro")) 
        {
            System.out.println("             **Factura Final**"
                + "\n               "+nomEmp
                + "\nCliente:                        "+nomCli
                + "\nTipo de Transporte:             "+tipoTra
                + "\nCantidad de Horas:              "+canHoras
                + "\nValor descuento:                "+Math.round(valDto)
                + "\nValor de Seguro:                "+Math.round(valSeg)
                + "\nValor Neto a Pagar:             "+Math.round(valNeto));
        } 
        
        
    }
    
}