package CreationalPatterns.FactoryMethod.factory;

import CreationalPatterns.FactoryMethod.buttons.Button;

public abstract class Dialog {

    public void renderWindow(){
        Button okButton = crateButton();
        okButton.render();
    }

    public abstract Button crateButton();

}
