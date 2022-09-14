package day11_Switch_Scanner;

public class Browser {


    public static void main(String[] args) {


        String browserName="Firefox";

        String result="";

        boolean validBrowser= browserName=="Chrome" || browserName=="Firefox"|| browserName=="Opera"|| browserName==
                "Safari"||browserName=="Edge";


        if(validBrowser){

            if (browserName=="Chrome"){
                result="Chrome Browser is selected";

            }

            else if(browserName=="Firefox"){
                result="Firefox Browser is selected";
            }

            else if(browserName=="Opera"){

                result="Opera Browser is selected";
            }
            else if(browserName=="Safari"){

                result="Safari Browser is selected";
            }
            else{
                result="Edge Browser is selected";
            }




        }else {
            result="Invalid Browser";
        }


        System.out.println(result);

    }
}
