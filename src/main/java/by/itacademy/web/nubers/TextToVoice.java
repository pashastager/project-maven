package by.itacademy.web.nubers;

import com.sun.speech.freetts.Voice;
import com.sun.speech.freetts.VoiceManager;

public class TextToVoice {
    public void textToVoice (String text) {
        Voice voice = VoiceManager.getInstance().getVoice("kevin16");
        voice.allocate();
        voice.speak(text);
        voice.deallocate();

    }
}
