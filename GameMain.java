public class GameMain {
    public static void main(String[] args) {
        System.out.println("1:�O�[ 2:�`���L 3:�p�[");
        System.out.println("����񂯂�...");

        int playerHand = Player.decidesPlayerHand();
        System.out.println("�v���C���[ : " + Hand.getHandName(playerHand));

        int computerHand = Computer.decidesComputerHand();
		System.out.println("�R���s���[�^ : " + Hand.getHandName(computerHand));

    }
}