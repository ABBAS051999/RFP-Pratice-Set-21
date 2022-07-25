public class MoodAnalyser {
    private String msg;

    public MoodAnalyser() {
    }

    public MoodAnalyser(String msg) {
        this.msg = msg;
    }

    public String analyzeMood() {
        try {
            if (msg.contains("Sad")) {
                return "Sad";
            }
            return "Happy";
        } catch (NullPointerException e) {
            return "Happy";
        }
    }
}
