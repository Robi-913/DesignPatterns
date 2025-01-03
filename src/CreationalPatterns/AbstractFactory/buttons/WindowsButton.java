package CreationalPatterns.AbstractFactory.buttons;

public class WindowsButton implements Button {
    @Override
    public void print() {
        System.out.println("You have created WindowsButton.");
    }
}
