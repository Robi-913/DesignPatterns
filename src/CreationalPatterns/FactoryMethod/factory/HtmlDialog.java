package CreationalPatterns.FactoryMethod.factory;

import CreationalPatterns.FactoryMethod.buttons.Button;
import CreationalPatterns.FactoryMethod.buttons.HtmlButton;

public class HtmlDialog extends Dialog {
    @Override
    public Button crateButton() {
        return new HtmlButton();
    }
}
