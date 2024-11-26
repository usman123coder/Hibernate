package Examples;

public class PDFMsgConverter implements IMsgConverter{
   @Override
    public String covertMsg(String msg){
       String convertmsg = null;
       convertmsg = "<pdf>"+msg+"</pdf>";
       return convertmsg;
   }
}

