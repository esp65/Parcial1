/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.parcial;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author USUARIO
 */
public class Clscomisiones {
   static int total=0;
    private static String[][] comisiones = new String[5][11];
    
    private static final int NOMBRE=0;
    private static final int ENERO=1;
    private static final int FEBRERO=2;
    private static final int MARZO=3;
    private static final int ABRIL=4;
    private static final int TOTALVENTAS=5;
    private static final int Comision_1=6;
    private static final int Comision_2=7;
    private static final int Venta_Final=8;
    private static final int ISR=9;
    private static final int LI=10;
    
    public static void cargaInformacion(int fila){

        Scanner t= new Scanner(System.in);
         try{

            System.out.println("Digite el nombre"+(fila+1));
        comisiones[fila][NOMBRE]= t.nextLine();
        
        inicializar();

        }

        catch (Exception e) { System.out.println("Podria ingresar un numero porfavor");  }
        
        
       
    }
    public static void imprimirDecorado(){
        for (int x=0; x< comisiones.length;x++){
            System.out.print("|");
             for(int y=0;y < comisiones[x].length;y++){
                 System.out.print(comisiones[x][y]);
                 if (y != comisiones[x].length -1){
                     System.out.print("\t");
                 }
             }
             System.out.println("|");
        }
    }
      static void inicializar(){
         Random r = new Random();
        for(int i=0;i<5;i++){
            for(int j=1;j<5;j++){
                
                    int p = r.nextInt(50, 3000);
                    
                    comisiones[i][j] = String.valueOf(p); 
                
                }
                 
                
                    
 
                }
                
            }
        

    public static void Calculos(){
        
        int total=0;
        int m=0;
        
        for(int i=0; i<5; i++){
            total= Integer.parseInt(comisiones[i][ENERO]);
            total= total + Integer.parseInt(comisiones[i][FEBRERO]);
            total= total + Integer.parseInt(comisiones[i][MARZO]);
            total= total + Integer.parseInt(comisiones[i][ABRIL]);
            comisiones[i][TOTALVENTAS]= String.valueOf(total);
           
             if (total < 2001 ){
            
            comisiones[i][Comision_1]= String.valueOf((total*20)/100);
           
            comisiones[i][Venta_Final]=String.valueOf( total-((total*20)/100));
            comisiones[i][ISR]=String.valueOf((total*5)/100);
            comisiones[i][LI]=String.valueOf(total-((total*20)/100)+((total*5)/100));
            
        
             }
             else {
             
             comisiones[i][Comision_2]=String.valueOf((total*35)/100);
             comisiones[i][Venta_Final]=String.valueOf( total-((total*35)/100));
             comisiones[i][ISR]=String.valueOf((total*5)/100);
             comisiones[i][LI]=String.valueOf(total-(((total*35)/100)+((total*5)/100)));
            
               
             }
              if(comisiones[i][Comision_1]== null){
              comisiones[i][Comision_1]="0";
              }
               if(comisiones[i][Comision_2]== null){
              comisiones[i][Comision_2]="0";
          
             } 
    }   }
    public static void ingresoDatos(){
        for(int i=0; i<5; i++){
            cargaInformacion(i);
            
        }}
    
     public static void max() {
         String v1="", v2="";
       int mayor=0, m=0;
       
        for(int i=0; i<5; i++){
 
     for(int j=0; j<5; j++){
 
     if(Integer.parseInt(comisiones[i][Comision_1])>mayor){
     mayor=Integer.parseInt(comisiones[i][Comision_1]); 
     v1 = comisiones[i][Comision_1-6];
      } 
     }


     }
       for(int i=0; i<5; i++){
 
       for(int j=0; j<5; j++){
 
       if(Integer.parseInt(comisiones[i][Comision_2])>m){
       m=Integer.parseInt(comisiones[i][Comision_2]); 
       v2 = comisiones[i][Comision_2-7];
        } 
       }


     }
        if(m>mayor){
        System.out.println("La mejore venta del vendedor es  " + v2 +  " su cantidad es: "+ m);
        }
     else
    {
      System.out.println("La mejore venta del vendedor es  " + v1 +  " su cantidad es: "+ mayor);
     }
}
  public static void menor() {
  String v1="", v2="";
		
		int mayor = Integer.parseInt(comisiones[0][Comision_1]), menor = Integer.parseInt(comisiones[0][Comision_2]); 

		
		for (int x = 0; x < comisiones.length; x++) {
			for (int y = 0; y < comisiones[x].length; y++) {
				int numero1 = Integer.parseInt(comisiones[x][Comision_1]);
                                int numero2 = Integer.parseInt(comisiones[x][Comision_2]);
                                
				if ( Integer.parseInt(comisiones[x][Comision_1])<menor && Integer.parseInt(comisiones[x][Comision_1]) != 0 || menor == 0) {
                 menor = Integer.parseInt(comisiones[x][Comision_1]);
         
       }
                                
				if ( Integer.parseInt(comisiones[x][Comision_2])<mayor && Integer.parseInt(comisiones[x][Comision_2]) != 0 || mayor == 0) {
                 mayor = Integer.parseInt(comisiones[x][Comision_2]);
        
       }
			}
                        v1 = comisiones[x][Comision_1-6];
                         v2 = comisiones[x][Comision_2-7];
		}
		
                if(menor<mayor){
                System.out.println("Al vendedor que le fue mal en las ventas es:" + v1 +  " su venta fue de: "+ menor );
                }
            
                else
                {
                  System.out.println("Al vendedor que le fue mal en las ventas es:" + v2 +  " su venta fue de: "+ mayor);
                }
               
 }
        
    
        
         public static void Minu(){
         
       Scanner sn = new Scanner(System.in);
       boolean sal = false;
       int opcion; 
        
       while(!sal){
            
           System.out.println("1. Genere la matriz ");
           System.out.println("2. El vendedor mas alto");
           System.out.println("3. El vendedor mas bajo");
           System.out.println("4. Resultado");
           System.out.println("5. Deseo Salir");
            
           System.out.println("Digite una opcion");
           opcion = sn.nextInt();
            
           switch(opcion){
               case 1 -> {
                   ingresoDatos();
                   Calculos();
               }
               case 2 -> max();
                   
               
                case 3 -> menor();
                case 4 -> imprimirDecorado();
                case 5 -> sal=true;
                default -> System.out.println("Numero entre 1 y 4");
           }
            
       }
        
    }
        
    
    public static void main (String[] args){
        Minu();
    } 
    
    
}
