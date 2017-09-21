
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author diasc
 */
public class Pratica31 {
    private static String meuNome;
    private static Date inicio;
    private static Date fim;
    
   public static void main(String[] args) {

        inicio = new Date();
        meuNome = "Gabriel Dias de Camargo";
       
        System.out.println(meuNome.toUpperCase());
        char primeiro = meuNome.charAt(0);
        char segundo = meuNome.charAt(8);
        String Ultimo = meuNome.substring(17);
        Ultimo = meuNome.charAt(16)+Ultimo;
        System.out.println(Ultimo + "," + Character.toUpperCase(primeiro) + "." + Character.toUpperCase(segundo));
        GregorianCalendar dataNascimento = new GregorianCalendar(1994, Calendar.MAY, 10);
        GregorianCalendar hoje = new GregorianCalendar();
        double dias = hoje.getTimeInMillis() - dataNascimento.getTimeInMillis();
        dias = dias / (24 * 60 * 60 * 1000);
        System.out.println(Math.round(dias));
        fim = new Date();
        long ms = fim.getTime() - inicio.getTime();
        System.out.println(ms);
        
    }
}

