package test;

public class MessageWriter {
    private IMessageConverter iMessageConverter;
    public void messageWriter(String message){
        String convertMsg = null;
        iMessageConverter = new PDFMessageConverterImpl();
        convertMsg = iMessageConverter.convertMessage(message);
        System.out.println(convertMsg);

    }
}
