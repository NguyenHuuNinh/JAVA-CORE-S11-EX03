package vn.edu.rikkei.session11.ex03;

public class SmartSpeaker implements IPlayable, IRecordable {
    private String deviceName;

    public SmartSpeaker(String deviceName) {
        this.deviceName = deviceName;
    }

    public String getDeviceName() {
        return deviceName;
    }

    @Override
    public void playAudio(String trackName) {
        System.out.printf("| [Playable] Đang phát bài hát: %-24s|\n", trackName);
    }

    @Override
    public void recordVoice(int durationSeconds) {
        System.out.printf("| [Recordable] Đang ghi âm giọng nói trong: %d giây     |\n", durationSeconds);
    }
}
