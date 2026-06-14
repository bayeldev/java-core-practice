package practice.level15;

public class task15 {
    public static void main(String[] args) {
        System.out.println(ApplicationConfiguration.APPLICATION_DEFAULT_LANGUAGE);
    }
}

class ApplicationConfiguration {
    public static String APPLICATION_DEFAULT_LANGUAGE;

//    ApplicationConfiguration(String APPLICATION_DEFAULT_LANGUAGE) {
//
//    }

    static {
        String envLang = System.getenv("APP_LANG");
        if(envLang!=null) {
            APPLICATION_DEFAULT_LANGUAGE=envLang;
        } else {
            APPLICATION_DEFAULT_LANGUAGE="en";
        }
    }
}
