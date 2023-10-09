import interfaces.CellphoneInterface;
import interfaces.MusicPlayerInterface;
import interfaces.WebBrowserInterface;

public class Iphone implements MusicPlayerInterface, CellphoneInterface, WebBrowserInterface{

    @Override
    public void showPage() {
        System.out.println("Showing page...");
    }

    @Override
    public void addNewPage() {
        System.out.println("Adding new page...");
    }

    @Override
    public void refreshPage() {
        System.out.println("Refreshing page..."); 
    }

    @Override
    public void call() {
        System.out.println("Making a call...");
    }

    @Override
    public void takeCall() {
        System.out.println("Takes a call...");
    }

    @Override
    public void startVoiceMail() {
        System.out.println("Starting voice mail...");
    }

    @Override
    public void play() {
        System.out.println("Playing music...");
    }

    @Override
    public void pause() {
        System.out.println("Pausing music...");
    }

    @Override
    public void selectMusic() {
        System.out.println("Selecting music to play...");
    }
    
}