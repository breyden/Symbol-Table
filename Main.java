/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author breydenmonyemoratho
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException, IOException {
        // TODO code application logic here
                BufferedReader br = null;
		FileReader fr = null;
		fr = new FileReader(args[0]);
		br = new BufferedReader(fr);
		String sCurrentLine;
                Symbol s=new  Symbol ();
		while ((sCurrentLine = br.readLine()) != null) {
				
                                String [] arrOfStr = sCurrentLine.split(" ");
                    switch(arrOfStr[0])
                    {
                        case "beginscope" :
                                // Statements
                           s.beginscope();
                           System.out.println("beginscope");
                                break; // optional

                        case  "define" :
                                // Statements
                            s.define(arrOfStr[1],arrOfStr[2]);
                            System.out.println("define "+arrOfStr[1]+" "+arrOfStr[2]);
                             break; // optional
                        case "use":
                            System.out.println(s.use(arrOfStr[1]));
                            break; // 
                        case "endscope":
                            s.endscope();
                            System.out.println("endscope");
                            break;
                             
                    }
                    
                         }
    }
  
    
}
