package test;

public class PDFMessageConverterImpl implements IMessageConverter{
    @Override
    public String convertMessage(String message){
        String pdfMsgConverter = null;
        pdfMsgConverter = "<pdf>" +message+ "</pdf";

        return pdfMsgConverter;
    }
}
