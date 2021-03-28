/**
 * class that all screens will extend, contains basic fields such as the AppController instance, as well as a setter for that field
 */
public class Screen {
    private AppController appController;

    /*
    GETTERS AND SETTERS
    */

    public void setAppController(AppController appController){
        this.appController = appController;
    }

}
