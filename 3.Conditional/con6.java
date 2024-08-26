
//nested switch case

import java.util.*;
public class con6{

        public static void main(String[] args)
          {
                Scanner sc = new Scanner(System.in);
                int empID = sc.nextInt();
                String pos = sc.next();
                switch(empID){
                    case 1:
                        System.out.println("Luis Diaz");
                        break;
                    case 2:
                        System.out.println("Allison Becker");
                    case 3:
                        switch(pos){
                            case "Forward":
                                System.out.println("Play as a forward");
                                break;
                            case "Goalkeeper":
                                System.out.println("Play as a goalkeeper");
                                break;
                            default:
                                System.out.println("No position");
                        }
                    default:
                        System.out.println("No employ");
                }
                 
          }
}
