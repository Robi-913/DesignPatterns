package CreationalPatterns.AbstractFactory.buttons;

public class MacOSButton implements Button {
    @Override
    public void print() {
        System.out.println("You have created MacOSButton.");
    }
}
