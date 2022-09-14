package day11_Switch_Scanner;

public class SelectedBrowser {

    public static void main(String[] args) {

        String browserName = "firefox";
        String result="";


        switch (browserName){
            case "chrome":
                result=browserName+" browser is selected";
                break;

            case "safari":
                result=browserName+" browser is selected";
                break;

            case "opera":
                result=browserName+" browser is selected";
                break;

            case "firefox":
                result=browserName+" browser is selected";
                break;

            case"edge":
                result=browserName+" browser is selected";
                break;

            default:
                result="Invalid Browser";

        }
        System.out.println(result);

    }
}


/*3.  write a program that can display the selected browser
3.1  declare a String variable called browserName
3.2  Assume that the valid browsers are: chrome, firefox,
opera, safari, edge
3.3 if the browser name does not match with the valid
browsers' names, out put should be: Invalid Browser
Do Not use if statement or ternary

 */