package vn.edu.rikkei.session11.ex03;

public class Main {
    public static void main(String[] args) {
        System.out.println("--- THỬ NGHIỆM TÍNH NĂNG SMART SPEAKER ---");
        System.out.println("Thiết bị: \"Rikkei Echo Dot\"");
        System.out.println("Lệnh 1: Phát bài hát \"Sơn Tùng M-TP - Lạc Trôi\"");
        System.out.println("Lệnh 2: Ghi âm cuộc họp 60 giây\n");

        SmartSpeaker speaker = new SmartSpeaker("Rikkei Echo Dot");

        System.out.println("+-------------------------------------------------------+");
        System.out.println("|             NHẬT KÝ ĐIỀU KHIỂN LOA THÔNG MINH         |");
        System.out.println("+-------------------------------------------------------+");
        System.out.printf("| Thiết bị: %-43s |\n", speaker.getDeviceName());
        System.out.println("|-------------------------------------------------------|");

        speaker.playAudio("Sơn Tùng M-TP - Lạc Trôi");
        speaker.recordVoice(60);

        System.out.println("+-------------------------------------------------------+");
    }
}
