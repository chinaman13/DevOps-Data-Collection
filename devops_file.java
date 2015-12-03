/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package devops;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JOptionPane;

/**
 *
 * @author logan
 */
public class devops_file {
   
    
    public static void main(String []args) throws IOException {
        
        //String thisIsSomeVariableName;
        
        int option = 0;
        
        boolean ShowMenu = true;
       
        String choose = "";
        String choose1 = "";
        
        String q1 = "Do you check your code in?", 
               q2 = "How often do you review code? Enter the percentage: ",
               q3 = "Do you have and utilise style guides? Enter percantage of time: ",
               q4 = "Test Driven Development?",
               q5 = "How many automated builds have you done this sprint?",
               q6 = "How many automated tests have you done this sprint?",
               q7 = "How many automated deploys have you done this sprint?";

        
        String menu =  "***** DEVOPS DATA COLLECTION ***** \n\r\n\r";
               menu += " 1. Homely \n\r";
               menu += " 2. 3CDP \n\r";
               menu += " 3. ESP \n\r";
               menu += " 4. ID & V \n\r\n\r";
               menu += " 5. EXIT ";
               
       // while (!showmenu) {
               
       while (ShowMenu) {
           
                option = Integer.parseInt(JOptionPane.showInputDialog(menu));


            if(option == 1) {

                JOptionPane.showMessageDialog(null, "Homely please answer the following questions...");
                
                /*
                String name = "Dan";
                int howMuchOfSuper = 10;
                String danIsSuperCool = name + " is " + howMuchOfSuper + " cool!"; 
                String danIsElite = String.format("%s is %d cool!", name, howMuchOfSuper);
                */
                
                System.out.println("DEVOPS DATA COLLECTION: ");
                System.out.println("");
                System.out.println("HOMELY");
                
                 
            //code checking
                
                int codecheck = JOptionPane.showConfirmDialog(null, q1);
                    /*
                    switch (codecheck) {
                        case 0: // other stuff
                        case 1: // stuff 
                        default:
                    }*/
                    
                    
                    if(codecheck == 0){

                        choose = "YES";

                    }
                    else if(codecheck == 1){
                        
                        choose = "NO";
                        
                    }  
                    
                    System.out.println("Code Checking: " + choose);
                    
                //code reviewing    
                    
                int codereview = Integer.parseInt(JOptionPane.showInputDialog(q2));
                
                System.out.println("Code Reviewing " + codereview + "% of the time");
                
                //style guide
                
                int style = Integer.parseInt(JOptionPane.showInputDialog(q3));
                
                System.out.println("Have and use style guides " + style + "% of the time");
                
                //test driven dev
                
                int dev = JOptionPane.showConfirmDialog(null, q4);
                
                    if(dev == 0) {

                        System.out.println("TDD: YES");

                    }
                    else if(dev == 1){
                        
                        System.out.println("TDD: NO");
                        
                    }
                    
                    //automated builds
                    
                    int builds = Integer.parseInt(JOptionPane.showInputDialog(q5));
    
                    System.out.println("Automated Builds in sprint: " + builds);
                    
                    //automated tests
                    
                    int tests = Integer.parseInt(JOptionPane.showInputDialog(q6));
    
                    System.out.println("Automated Tests in sprint: " + tests);
                    
                    //automated deploys
                    
                    int deploys = Integer.parseInt(JOptionPane.showInputDialog(q7));
    
                    System.out.println("automated Deploys in sprint: " + deploys);
                    
                    
			String content = "Code Checking: "   + choose       + "\r\n"    +           //CODECHECKING
                                         "Code Review: "     + codereview   + "%"       + "\r\n" +  //code reviewing
                                         "Style guides: "    + style        + "%"       + "\r\n" +  //use of style
                                         "Test Driven Dev: " + choose1      + "\r\n"    +           //TDD
                                         "# of Builds: "     + builds       + "\r\n"    +           //builds 
                                         "# of Tests: "      + tests        + "\r\n"    +           //tests
                                         "# of Deploys: "    + deploys      + "\r\n"    ;           //deploys
                        
                        /*
                        StringBuilder builder = new StringBuilder();
                        
                        builder.append("Code Checking: "   + choose       + "\r\n")
                               .append("Code Review: "     + codereview   + "%"       + "\r\n");*/
                        
                        
                        try {   
                              
			File file = new File("documents/Homely.txt");

			// if file doesnt exists, then create it
                        
			if (!file.exists()) {
                            
				file.createNewFile();
			}

			FileWriter fw = new FileWriter(file.getAbsoluteFile());
                        
			BufferedWriter bw = new BufferedWriter(fw);
                        
			bw.write(content);
                        
			bw.close();

		}
            
                catch (IOException e) {
                    
			e.printStackTrace();
                        
		}

            }

            else if(option == 2) {

                JOptionPane.showMessageDialog(null, "3DCP please answer the following questions..."); 
                
                System.out.println("");
                System.out.println("3CDP: ");
                
            //code checking
                
                int codecheck = JOptionPane.showConfirmDialog(null, q1);
                
                    if(codecheck == 0){

                        choose = "YES";

                    }
                    else if(codecheck == 1){
                        
                        choose = "NO";
                        
                    }
                    
                    System.out.println("Code Checking: " + choose);
                    
                //code reviewing    
                    
                int codereview = Integer.parseInt(JOptionPane.showInputDialog(q2));
                
                System.out.println("Code Reviewing " + codereview + "% of the time");
                
                //style guide
                
                int style = Integer.parseInt(JOptionPane.showInputDialog(q3));
                
                System.out.println("Have and use style guides " + style + "% of the time");
                
                //test driven dev
                
                int dev = JOptionPane.showConfirmDialog(null, q4);
                
                    if(dev == 0){

                        choose1 = "YES";

                    }
                    else if(dev == 1){
                        
                        choose1 = "NO";
                        
                    }
                    
                    System.out.println("TDD: " + choose1);
                    
                    //automated builds
                    
                    int builds = Integer.parseInt(JOptionPane.showInputDialog(q5));
    
                    System.out.println("Automated Builds in sprint: " + builds);
                    
                    //automated tests
                    
                    int tests = Integer.parseInt(JOptionPane.showInputDialog(q6));
    
                    System.out.println("Automated Tests in sprint: " + tests);
                    
                    //automated deploys
                    
                    int deploys = Integer.parseInt(JOptionPane.showInputDialog(q7));
    
                    System.out.println("Automated Deploys in sprint: " + deploys);
                    

			String content = "Code Checking: "   + choose       + "\r\n"    +           //CODECHECKING
                                         "Code Review: "     + codereview   + "%"       + "\r\n" +  //code reviewing
                                         "Style guides: "    + style        + "%"       + "\r\n" +  //use of style
                                         "Test Driven Dev: " + choose1      + "\r\n"    +           //TDD
                                         "# of Builds: "     + builds       + "\r\n"    +           //builds 
                                         "# of Tests: "      + tests        + "\r\n"    +           //tests
                                         "# of Deploys: "    + deploys      + "\r\n"    ;           //deploys
                        
                        try {
 
			File file = new File("documents/3CDP.txt");

			// if file doesnt exists, then create it
                        
			if (!file.exists()) {
                            
                            file.createNewFile();
                            
			}

			FileWriter fw = new FileWriter(file.getAbsoluteFile());
                        
			BufferedWriter bw = new BufferedWriter(fw);
                        
			bw.write(content);
                        
			bw.close();

		}
            
                catch (IOException e) {
                    
			e.printStackTrace();
                        
		}
                
            }

            else if(option == 3) {
                
                JOptionPane.showMessageDialog(null, "ESP please answer the following questions...");

                System.out.println("");
                System.out.println("ESP: ");

            //code checking
                
                int codecheck = JOptionPane.showConfirmDialog(null, q1);
                
                    if(codecheck == 0){

                        choose = "YES";

                    }
                    else if(codecheck == 1){
                        
                        choose = "NO";
                        
                    }
                    
                    System.out.println("Code Checking: " + choose);

                //code reviewing    
                    
                int codereview = Integer.parseInt(JOptionPane.showInputDialog(q2));
                
                System.out.println("Code Reviewing " + codereview + "% of the time");
                
                //style guide
                
                int style = Integer.parseInt(JOptionPane.showInputDialog(q3));
                
                System.out.println("Have and use style guides " + style + "% of the time");
                
                //test driven dev
                
                int dev = JOptionPane.showConfirmDialog(null, q4);
                
                    if(dev == 0){

                        choose1 = "YES";

                    }
                    else if(dev == 1){
                        
                        choose1 = "NO";
                        
                    }
                    
                    System.out.println("TDD: " + choose1);
                    
                    //automated builds
                    
                    int builds = Integer.parseInt(JOptionPane.showInputDialog(q5));
    
                    System.out.println("Automated Builds in sprint: " + builds);
                    
                    //automated tests
                    
                    int tests = Integer.parseInt(JOptionPane.showInputDialog(q6));
    
                    System.out.println("Automated Tests in sprint: " + tests);
                    
                    //automated deploys
                    
                    int deploys = Integer.parseInt(JOptionPane.showInputDialog(q7));
    
                    System.out.println("Automated Deploys in sprint: " + deploys);
                    

			String content = "Code Checking: "   + choose       + "\r\n"    +           //CODECHECKING
                                         "Code Review: "     + codereview   + "%"       + "\r\n" +  //code reviewing
                                         "Style guides: "    + style        + "%"       + "\r\n" +  //use of style
                                         "Test Driven Dev: " + choose1      + "\r\n"    +           //TDD
                                         "# of Builds: "     + builds       + "\r\n"    +           //builds 
                                         "# of Tests: "      + tests        + "\r\n"    +           //tests
                                         "# of Deploys: "    + deploys      + "\r\n"    ;           //deploys

                        try {
                        
			File file = new File("documents/ESP.txt");

			// if file doesnt exists, then create it
                        
			if (!file.exists()) {
                            
				file.createNewFile();
			}

			FileWriter fw = new FileWriter(file.getAbsoluteFile());
                        
			BufferedWriter bw = new BufferedWriter(fw);
                        
			bw.write(content);
                        
			bw.close();

		}
            
                catch (IOException e) {
                    
			e.printStackTrace();
                        
		}
                
            }
            
            else if(option == 4) {
                
                JOptionPane.showMessageDialog(null, "ID & V please answer the following questions...");

                System.out.println("");
                System.out.println("ID & V: ");
                 
            //code checking
                
                int codecheck = JOptionPane.showConfirmDialog(null, q1);
                
                    if(codecheck == 0){

                        choose = "YES";

                    }
                    else if(codecheck == 1){
                        
                        choose = "NO";
                        
                    }
                    
                    System.out.println("Code Checking: " + choose);
                    
                //code reviewing    
                    
                int codereview = Integer.parseInt(JOptionPane.showInputDialog(q2));
                
                System.out.println("Code Reviewing " + codereview + "% of the time");
                
                //style guide
                
                int style = Integer.parseInt(JOptionPane.showInputDialog(q3));
                
                System.out.println("Have and use style guides " + style + "% of the time");
                
                //test driven dev
                
                int dev = JOptionPane.showConfirmDialog(null, q4);
                
                    if(dev == 0){

                        choose1 = "YES";

                    }
                    else if(dev == 1){
                        
                        choose1 = "NO";
                        
                    }
                    
                    System.out.println("TDD: " + choose1);
                    
                    //automated builds
                    
                    int builds = Integer.parseInt(JOptionPane.showInputDialog(q5));
    
                    System.out.println("Automated Builds in sprint: " + builds);
                    
                    //automated tests
                    
                    int tests = Integer.parseInt(JOptionPane.showInputDialog(q6));
    
                    System.out.println("Automated Tests in sprint: " + tests);
                    
                    //automated deploys
                    
                    int deploys = Integer.parseInt(JOptionPane.showInputDialog(q7));
    
                    System.out.println("Automated Deploys in sprint: " + deploys);
                    

			String content = "Code Checking: "   + choose       + "\r\n"    +           //CODECHECKING
                                         "Code Review: "     + codereview   + "%"       + "\r\n" +  //code reviewing
                                         "Style guides: "    + style        + "%"       + "\r\n" +  //use of style
                                         "Test Driven Dev: " + choose1      + "\r\n"    +           //TDD
                                         "# of Builds: "     + builds       + "\r\n"    +           //builds 
                                         "# of Tests: "      + tests        + "\r\n"    +           //tests
                                         "# of Deploys: "    + deploys      + "\r\n"    ;           //deploys
                        
                        try {  
                        
			File file = new File("documents/ID&V.txt");

			// if file doesnt exists, then create it
                        
			if (!file.exists()) {
                            
				file.createNewFile();
			}

			FileWriter fw = new FileWriter(file.getAbsoluteFile());
                        
			BufferedWriter bw = new BufferedWriter(fw);
                        
			bw.write(content);
                        
			bw.close();

		}
            
                catch (IOException e) {
                    
			e.printStackTrace();
                        
		}
                
            }
            
            else if(option == 5) {
                
                ShowMenu = false;
                
            }

       }//end of while
               
    }//end of main
    
}//end of class

