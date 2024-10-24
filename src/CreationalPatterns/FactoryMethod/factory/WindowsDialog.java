package CreationalPatterns.FactoryMethod.factory;

import CreationalPatterns.FactoryMethod.buttons.Button;
import CreationalPatterns.FactoryMethod.buttons.WindowsButton;

public class WindowsDialog extends Dialog {
    @Override
    public Button crateButton() {
        return new WindowsButton();
    }
}
