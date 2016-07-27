/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prueba;

/**
 *
 * @author tilecal
 */
public class Prueba {

    /**
     * @param args
     */
    public static void main(String[] args) {
        if(args.length == 0){
        System.out.print("Hello World!\n");
        } else{
        String outStr = "Hello World!";
        for(int i = 0; i < args.length; i++){
            outStr = outStr + " " + args[i];
        }
        System.out.println(outStr);
        }
    }
    
}
