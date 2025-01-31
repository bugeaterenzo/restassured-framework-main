package utils;

import config.ConfigLoader;

public class ConfigUtility {

    public static String getEmailDomain() {
        return ConfigLoader.getProperty("email.domain");
    }

    public static String getEnvironment() {
        return ConfigLoader.getProperty("environment").trim().toUpperCase();
    }

    public static int getTokenExpirationMinutes() {
        return ConfigLoader.getIntProperty("token.expiration.minutes");
    }

    public static int getTimeOuts() {
        return ConfigLoader.getIntProperty("timeouts");
    }


    public static void main(String[] args) {
       String domain =  getEmailDomain();
       String env =  getEnvironment();
       int token_expiration =  getTokenExpirationMinutes();
       int time_out =  getTimeOuts();

        System.out.println("domain : " + domain);
        System.out.println("env : " + env);
        System.out.println("token_expiration : " + token_expiration);
        System.out.println("time_out : " + time_out);
    }

}
