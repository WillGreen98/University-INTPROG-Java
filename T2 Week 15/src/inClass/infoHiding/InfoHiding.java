package inClass.infoHiding;

/**
 * @author Will
 * In Class Week 15
 */

public class InfoHiding {
    public String notSecretString; /** Breaking the rules here - only for demo purposes! */
    private String verySecretString;
    
    public InfoHiding() {
        verySecretString = "My password is 'Incorrect'";
        notSecretString = "My name is 'Alice'";
    }
}