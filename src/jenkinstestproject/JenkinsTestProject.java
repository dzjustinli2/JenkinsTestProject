/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jenkinstestproject;

/**
 *
 * @author Justin
 */
public class JenkinsTestProject {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {

        int x = 0; 
        
        if(x == 0){
            System.out.println("All is good");
        } else {
            throw new Exception("Bad thing happened!!!!!!!!!!!!!");
        }
    }
    
}
