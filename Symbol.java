/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */



import java.util.ArrayList;
import java.util.Arrays;
import java.util.Stack;

/**
 *
 * @author breydenmonyemoratho
 */
public class Symbol {
     Stack myStack;
     int level=-1;
    
    Symbol () 
    {   myStack = new Stack();
    }
           
    
    public void beginscope()
    { 
      if (level==-1)
        { level++;
          Map<String,String> newTable=new Map<>();
          // push to the stack
          myStack.push(newTable);
     
      }
      else
      {  
            Map<String,String> newCopy=new Map<>();
    
            
            Map<String,String>  oldCopy=(Map<String,String>)myStack.peek();
 
            for (int i=0;i<5;i++)
            { 
                 newCopy.bucket.set(i,oldCopy.bucket.get(i)); 
               
                
            }
            myStack.push(newCopy);   

            level++;
      
      }  
    }
 
    public void define(String key,String value)
    {   // get the hashtable at the top of the stack and enter the entry
           Map<String,String> hashtable=(Map<String,String>)myStack.peek();
           hashtable.add(key, value);
          // myStack.push(hashtable2);
           
    }
    public void endscope()
    {  
        level--;
        myStack.pop();
    }
    public String use(String key)
    {   
       String result="";
        if (myStack.isEmpty())
        {   result= "use "+key+" = undefined";
        }
        else
        {  Map<String,String>  hashtable44=(Map<String,String>)myStack.peek();
            String temp =hashtable44.get(key);
            
                  

            if (temp==null)
            {  result= "use "+key+" = undefined"; 
            }
            else
            {   result="use "+key+" = "+temp;
            }
        }
        return result;
        
    }
}
