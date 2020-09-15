/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boundscore;

import java.util.Scanner;

/**
 *
 * @author siraphat
 */
public class BoundScore {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MyproportyBean mySoucre = new MyproportyBean();
        Listener1 L1 = new Listener1();
        Listener2 L2 = new Listener2();
        mySoucre.addPropertyChangeListener(L1);
        mySoucre.addPropertyChangeListener(L2);
        while(true){
        System.out.print("Please Enter Score =>");  
        String score = sc.nextLine();
        if(score.isEmpty()) {
           break;
        }
        System.out.println("Enter Score : "+score);
        mySoucre.setValue(score);
        mySoucre.setValue(score);
        
        }
        
    }
    
}
