public class Hand {
    public static final int GU = 1;
    public static final int CHOKI = 2;
    public static final int PA = 3;

    public static String getHandName(int hand) {
        String handName = "";
        if (hand == GU) handName = "�O�[";
        else if (hand == CHOKI) handName = "�`���L";
        else if (hand == PA) handName = "�p�[";
        return handName;
    }
}