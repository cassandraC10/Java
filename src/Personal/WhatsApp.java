package Personal;


//import com.twilio.Twilio;
//import com.twilio.rest.api.v2022.account.Message;
//import com.twilio.type.PhoneNumber;
//
//public class WhatsApp {
//    public static final String ACCOUNT_SID = System.getenv("TWILIO_ACCOUNT_SID");
//    public static final String AUTH_TOKEN = System.getenv("TWILIO_AUTH_TOKEN");
//
//    public static void main(String[] args) {
//        Twilio.init(ACCOUNT_SID, AUTH_TOKEN);
//        Message message = Message.creator(
//                        new com.twilio.type.PhoneNumber("whatsapp:+234"),
//                        new com.twilio.type.PhoneNumber("whatsapp:+14155238886"),
//                        "Hello there!")
//                .create();
//
//        System.out.println(message.getSid());
//    }
//}
