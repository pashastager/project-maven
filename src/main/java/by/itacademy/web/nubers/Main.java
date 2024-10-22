package by.itacademy.web.nubers;
import com.sun.speech.freetts.Voice;
import com.sun.speech.freetts.VoiceManager;

public class Main {
    public static void main(String[] args) {
        int number = 0;
        String numberAsAString = "";
        StringBuilder stringBuilder=new  StringBuilder();
        for (int i=0 ; i<10;i++) {
            stringBuilder.append(i);
            stringBuilder.append(" ");
        }
        TextToVoice textToVoice=new TextToVoice();
        textToVoice.textToVoice(String.valueOf(stringBuilder));

    }
}
