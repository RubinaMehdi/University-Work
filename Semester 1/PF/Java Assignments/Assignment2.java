import java.util.*; 
public class Assignment2 { 
    public static void main(String[] args) { 
        Scanner sc = new Scanner(System.in); 
        char repeat; 
        int option; 
        do { 
            System.out.println("\n--- Main Menu (Assignment-2) ---"); 
            System.out.println("1 – Question-1"); 
            System.out.println("2 – Question-2"); 
            System.out.println("3 – Question-3"); 
            System.out.println("4 – Question-4"); 
            System.out.println("5 – Question-5"); 
            System.out.println("0 – Exit"); 
            System.out.print("Press option (1-5) to execute the program and Press 0 to Exit: "); 
           option = sc.nextInt();  
            switch(option) { 
                case 1:{ 
                    do { 
                    Question1(); 
                    System.out.print("Do you want to execute Question-1 again? (y/n):"); 
                    repeat = sc.nextLine().toLowerCase().charAt(0); 
                    } while (repeat == 'y'); 
                    break; 
              }  
                case 2: { 
                    do { 
                    Question2(); 
                       System.out.print("Do you want to execute Question-2 again? (y/n):"); 
                    repeat = sc.nextLine().toLowerCase().charAt(0); 
                    } while(repeat == 'y'); 
                    break; 
                } 
 
                case 3: { 
                    do { 
                    Question3(); 
                    System.out.print("Do you want to execute Question-3 again? (y/n): "); 
                    repeat = sc.nextLine().toLowerCase().charAt(0); 
                    } while(repeat == 'y'); 
                    break; 
                }
                  case 4: { 
                    do { 
                    Question4(); 
                    System.out.print("Do you want to execute Question-4 again? (y/n): "); 
                    repeat = sc.nextLine().toLowerCase().charAt(0); 
                    } while(repeat == 'y'); 
                    break; 
                } 
 
                case 5: { 
                    do { 
                    Question5(); 
                    System.out.print("Do you want to execute Question-5 again? (y/n): "); 
                       repeat = sc.nextLine().toLowerCase().charAt(0); 
                    } while(repeat == 'y'); 
                    break; 
                } 
 
                case 0: 
                    System.out.println("Exiting..."); 
                    break; 
 
                default: 
                    System.out.println("Invalid option, try again."); 
            } 
 
            } while(option != 0); 
        }         
        // Question 1 – SSN Validation 
    public static void Question1() { 
        Scanner sc = new Scanner(System.in); 
        System.out.println("\n--- Executing Question – 1 ---"); 
        System.out.print("Enter a SSN: "); 
        String ssn = sc.nextLine(); 
 
        if (ssn.matches("\\d{3}-\\d{2}-\\d{4}")) { 
            System.out.println(ssn + " is a valid social security number"); 
        } else { 
            System.out.println(ssn + " is an invalid social security number"); 
            } 
        }
    // Question 2 – Major and Status 
    public static void Question2() { 
        Scanner sc = new Scanner(System.in); 
        System.out.println("\n--- Executing Question – 2 ---"); 
        System.out.print("Enter two characters (Major + Year): "); 
        String input = sc.nextLine().toUpperCase(); 
 
        if (input.length() != 2) { 
            System.out.println("Invalid input"); 
            return; 
        } 
 
        char majorChar = input.charAt(0); 
        char yearChar = input.charAt(1); 
        String major = ""; 
        String year = ""; 
 
        switch(majorChar) { 
            case 'M':  
                major = "Mathematics"; 
                 break; 
            case 'C': 
             major = "Computer Science";  
                break; 
            case 'I': 
             major = "Information Technology"; 
                 break; 
                 default: 
             System.out.println("Invalid input"); 
                 return; 
        } 
 
        switch(yearChar) { 
            case '1': 
             year = "Freshman";  
             break; 
            case '2': 
             year = "Sophomore"; 
              break; 
            case '3': 
             year = "Junior";  
             break; 
            case '4': 
             year = "Senior"; 
              break; 
            default: 
             System.out.println("Invalid input"); 
              return; 
        } 
 
        System.out.println(major + " " + year); 
    }
    // Question 3 – Generate Vehicle Plate Number 
    public static void Question3() { 
        System.out.println("\n--- Executing Question – 3 ---"); 
        Random rand = new Random(); 
 
        char letter1 = (char)('A' + rand.nextInt(26)); 
        char letter2 = (char)('A' + rand.nextInt(26)); 
        char letter3 = (char)('A' + rand.nextInt(26)); 
        int number = rand.nextInt(10000); 
        String plateNumber = "" + letter1 + letter2 + letter3 + "-" + String.format("%04d", number); 
 
        System.out.println("Generated Plate Number: " + plateNumber); 
    } 
 
    // Question 4 – Decimal to Binary 
    public static void Question4() { 
        Scanner sc = new Scanner(System.in); 
        System.out.println("\n--- Executing Question – 4 ---"); 
        System.out.print("Enter a decimal number: "); 
        int decimal = sc.nextInt(); 
 
        if(decimal == 0) { 
            System.out.println("Binary value: 0"); 
            return; 
        } 
 
        String binary = ""; 
          int number = decimal; 
        while(number > 0) { 
            binary = (number % 2) + binary; 
            number = number / 2; 
        } 
        System.out.println("Binary value: " + binary); 
    } 
 
    // Question 5 – Global Warming Quiz 
    public static void Question5() { 
        Scanner sc = new Scanner(System.in); 
        System.out.println("\n--- Executing Question – 5 ---"); 
 
        String[] questions = { 
            "1. Which gas is mainly responsible for global warming?\n1) Oxygen\n2) Carbon Dioxide\n3) Nitrogen\n4) Hydrogen", 
            "2. Global warming causes?\n1) Ice melting\n2) Rising sea levels\n3) Extreme weather\n4) All of the above", 
            "3. The 2007 Nobel Peace Prize was awarded to?\n1) Elon Musk\n2) Al Gore and IPCC\n3) Greta Thunberg\n4) NASA", 
            "4. A skeptic of global warming believes?\n1) It's natural\n2) It's man-made\n3) It will never happen\n4) All are false", 
            "5. Which of these helps reduce global warming?\n1) Planting trees\n2) Reducing fossil fuels\n3) Recycling\n4) All of the above" 
        }; 
 
        int[] answers = {2, 4, 2, 1, 4}; // Correct answers 
        int score = 0; 
 
        for(int i=0; i<questions.length; i++) {
              System.out.println(questions[i]); 
            System.out.print("Enter your answer (1-4): "); 
            int userAnswer = sc.nextInt(); 
            if(userAnswer == answers[i]) score++; 
        } 
 
        System.out.println("You got " + score + " out of 5 correct."); 
        if(score == 5) System.out.println("Excellent"); 
        else if(score == 4) System.out.println("Very good"); 
        else System.out.println("Time to brush up on your knowledge of global warming"); 
        System.out.println("Some websites used for facts: https://climate.nasa.gov/, https://www.ipcc.ch/"); 
    } 
}  