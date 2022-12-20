package separation.of.concerns.main;

public class Application {
    public static void main(Staring[] args){
        Presentation presentation = new Presentation(
            new BusinessLogic(
                new Database()
            )
        );

        presentation.doPresentation();

    }
}
