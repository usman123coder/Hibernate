package Examples;

public class MsgWriter {
    private IMsgConverter iMsgConverter;
    public void msgWriter(String msg){
        String convertMsg = null;
        iMsgConverter = MsgConverterFactory.MsgConverterFactory("abc");
        convertMsg = iMsgConverter.covertMsg(msg);
        System.out.println(convertMsg);
    }
}
