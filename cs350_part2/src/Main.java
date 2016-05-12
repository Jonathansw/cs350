import java.util.Scanner;

/**
 * Created by John on 5/7/2016.
 */
public class Main {

    private static String surveyLocation = "saves/survey";
    private static String testLocation = "saves/test";

    //Strings to cycle through for both menu_one and menu_two
    private static String[] menu_one ={"Create a new Survey", "Create a new Test", "Display a Survey",
            "Display a Test", "Load a Survey", "Load a Test","Save a Survey", "Save a Test", "Quit"};
    private static String[] menu_two ={"Add a new T/F question", "Add a new multiple choice question", "Add a new short answer question",
            "Add a new essay question", "Add a new ranking question", "Add a new matching question"};

    //loads Menu_one
    private static void menu_one(){
        int userInput;
        String menuOption;

        for (int i = 1; i <= menu_one.length; i++){
            System.out.println(Integer.toString(i) + ")" + menu_one[i - 1]);
        }

        Scanner s = new Scanner(System.in);
        System.out.println("Enter an input: ");
        userInput = s.nextInt();

        menuOption = menu_one[userInput - 1];

        switch (menuOption){
            case "Create a new Survey":{
                String surveyName;
                String temp = "survey";
                System.out.println("Create a new Survey");
                System.out.println("Enter the Survey Name: ");
                Scanner sur = new Scanner(System.in);
                surveyName = sur.nextLine();
                menu_two(temp, surveyName, surveyLocation);
                break;
            }
            case "Create a new Test":{
                String testName;
                String temp = "test";
                System.out.println("Create a new Test");
                System.out.println("Enter the Test Name: ");
                Scanner testIn = new Scanner(System.in);
                testName = testIn.nextLine();
                menu_two(temp, testName, testLocation);
                break;
            }
            case "Display a Survey":{
                System.out.println("Display a Survey");
                break;
            }
            case "Display a Test":{
                System.out.println("Display a Test");
                break;
            }
            case "Load a Survey":{
                System.out.println("Load a Survey");
                break;
            }
            case "Load a Test":{
                System.out.println("Load a Test");
                break;
            }
            case "Save a Survey":{
                System.out.println("Save a Survey");
                break;
            }
            case "Save a Test":{
                System.out.println("Save a Test");
                break;
            }
            case "Quit":{
                System.out.println("Quitting the Survey/Test Maker");
                break;
            }

        }

    }

    //Loads Menu_two
    protected static void menu_two(String check, String name, String location){
        int userInput;
        String menuOption;
        int numQuestions;
        Survey survey = new Survey();
        Test test = new Test();

        Scanner scanner  = new Scanner(System.in);
        System.out.println("Enter the total number of questions this " + check + " has: ");
        numQuestions = scanner.nextInt();

        System.out.println(check);
        System.out.println(name + "/" + location);

        if (check == "survey"){
            survey = new Survey(name, location);
        } else {
            test = new Test(name, location);
        }

        for (int x = 0; x < numQuestions; x++) {
            for (int i = 1; i <= menu_two.length; i++) {
                System.out.println(Integer.toString(i) + ")" + menu_two[i - 1]);
            }
            Scanner s = new Scanner(System.in);
            System.out.println("Enter an input: ");
            userInput = s.nextInt();

            menuOption = menu_two[userInput - 1];

            //checks to see if test or survey was created
            if(check == "survey"){
                switch (menuOption) {
                    case "Add a new True or False question": {
                        System.out.println("--True or False--");
                        survey.addQuestion(new TrueFalse());
                        break;
                    }
                    case "Add a new multiple choice question": {
                        System.out.println("--Multiple choice--");
                        survey.addQuestion(new MultipleChoice(1));
                        break;
                    }
                    case "Add a new short answer question": {
                        System.out.println("--Short Answer--");
                        survey.addQuestion(new ShortAnswer());
                        break;
                    }
                    case "Add a new essay question": {
                        System.out.println("--Essay--");
                        survey.addQuestion(new Essay());
                        break;
                    }
                    case "Add a new ranking question": {
                        System.out.println("--Ranking--");
                        break;
                    }
                    case "Add a new matching question": {
                        System.out.println("--Matching--");
                        break;
                    }
                }
            } else{
                switch (menuOption) {
                    case "Add a new True or False question": {
                        System.out.println("--True or False--");
                        test.addQuestion(new TrueFalse());
                        break;
                    }
                    case "Add a new multiple choice question": {
                        System.out.println("--Multiple choice--");
                        test.addQuestion(new MultipleChoice(1));
                        break;
                    }
                    case "Add a new short answer question": {
                        System.out.println("--Short Answer--");
                        test.addQuestion(new ShortAnswer());
                        break;
                    }
                    case "Add a new essay question": {
                        System.out.println("--Essay--");
                        test.addQuestion(new Essay());
                        break;
                    }
                    case "Add a new ranking question": {
                        System.out.println("--Ranking--");
                        break;
                    }
                    case "Add a new matching question": {
                        System.out.println("--Matching--");
                        break;
                    }
                }
            }
        }
    }

    public static void main(String[] args){
        System.out.println("////////////////////////////////////////////");
        System.out.println("Welcome to the Survey/Test maker");
        System.out.println("Choose one of the following to continue");
        System.out.println("////////////////////////////////////////////");

        menu_one();

    }

}
