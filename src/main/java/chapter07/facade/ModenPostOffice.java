package chapter07.facade;

public class ModenPostOffice {
    private LetterProcess letterProcess = new LetterProcessImpl();

    private Police letterPolice = new Police();

    public void sendLetter(String context, String address) {
        letterProcess.writeContext(context);

        letterProcess.fillEnvelope(address);

        // 警察要检查信件了
        letterPolice.checkLetter(letterProcess);

        letterProcess.letterInoteEnvelope();

        letterProcess.sendLetter();
    }
}
