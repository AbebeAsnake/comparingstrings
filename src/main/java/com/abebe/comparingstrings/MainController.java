package com.abebe.comparingstrings;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Scanner;

@RestController
public class MainController {
    @RequestMapping("/")
    public String compare(){

            Scanner sc = new Scanner(System.in);

            System.out.println("How is the weather?");
            String answer = sc.nextLine();

            if (answer.equalsIgnoreCase("rain") )
                System.out.println("Take your umbrella!");
            else if (answer.equalsIgnoreCase("windy"))
                System.out.println("Wear your jacket!");
            else if (answer.equalsIgnoreCase("snow") )
                System.out.println("Wear a coat and take a shovel!");
            else if(answer.equalsIgnoreCase("stormy")){
                System.out.println("You should stay inside");
            }
            else
                System.out.println("Enjoy your day!");
            return "aa";

    }
}
