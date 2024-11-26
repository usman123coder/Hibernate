package Examples;

public class MsgConverterFactory {
//    IMsgConverter iMsgConverter = null;
    public static IMsgConverter MsgConverterFactory(String type){
        IMsgConverter iMsgConverter1 = null;
        if (type.equals("html"))
            iMsgConverter1 = new HtmlMsgConverterImpl();
        else
            if(type.equals("pdf"))
                iMsgConverter1 = new PDFMsgConverter();
            else
                System.out.println("Something went wrong");
        return iMsgConverter1;
    }
}
