package Examples;

public class HtmlMsgConverterImpl implements IMsgConverter{
    @Override
    public String covertMsg(String msg){
        String convertMsg = null;
        convertMsg = "<html><body>"+msg+"</body></html";
        return convertMsg;
    }
}
