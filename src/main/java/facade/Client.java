package facade;

public class Client {
    public static void main(String[] args) {
        // 创建一个处理信件的过程
        LetterProcess letterProcess = new LetterProcessImpl();

        letterProcess.writeContext("Hello,It's me,do you know who I am?");

        letterProcess.fillEnvelope("Happy Road No. 666");

        letterProcess.letterInoteEnvelope();

        letterProcess.sendLetter();
    }
}
