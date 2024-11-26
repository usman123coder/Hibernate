package test;

public class HTMLMessageConvertorImpl implements IMessageConverter{
  public String convertMessage(String message){
      String htmlMessage = null;
      htmlMessage = "<html><body>"+message+"</body></html>";
      return htmlMessage;
  }
}
