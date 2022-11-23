/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cahh;
import java.awt.BorderLayout;
import java.util.*;

/**
 *
 * @author Ronnel
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Questionnaire questionnaire = new Questionnaire();
        Scanner scanner = new Scanner(System.in);
        System.out.println(questionnaire.getQuestion1());
        String answer1 = scanner.nextLine();
        
        switch(answer1){
            case "Sunderland" -> System.out.println("Nightmare mode");
            case "South Shields" -> System.out.println("You are a sand bender");
            default -> System.out.println("You are safe");
        }
    }
    
}
