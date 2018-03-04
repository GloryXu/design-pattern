package facade;

public interface LetterProcess {

    // 首先要写信的内容
    void writeContext(String context);

    // 其次写信封
    void fillEnvelope(String address);

    // 把信放到信封里
    void letterInoteEnvelope();

    // 然后邮递
    void sendLetter();
}
