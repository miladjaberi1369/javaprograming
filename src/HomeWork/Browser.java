package HomeWork;

public class Browser {
    public static void main(String[] args) {
        String browserName = "firefox";
        String selected_browser = " ";
        if (browserName == "chrome" || browserName == "firefox" || browserName == "opera" || browserName == "safari" || browserName == "edge"){
            if (browserName == "chrome") {
               // System.out.println("You selected Browser is " + browserName); this is correct too, but not the best practice
                selected_browser  = "chrome";
            }
            else if (browserName == "firefox"){
             selected_browser = "firefox";
            }
            else if (browserName == "opera"){
                selected_browser = "opera";
            }
            else if (browserName == "safari"){
                selected_browser = "safari";
            }
            else {
                selected_browser = "edge";
            }
        }
        else{
            browserName = "invalid browser Name";
        }
        System.out.println (browserName + " is selected");
    }
}

//2. Create a class called Browser. Write a program that can display the name of selected browser
//        1. declare a String variable named browserName
//        2. Assume that the valid browsers are: chrome, firefox, opera, safari, edge.
//        3. if the browser name does not match with the valid browser names, out put should be: Invalid Browser Name
//
//        Ex:
//            String browser = "chrome";
//
//        Output:
//            Chrome Browser is selected
//
//        Note: MUST use nested if