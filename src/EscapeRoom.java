
import javax.swing.*;




public class EscapeRoom {


    static JPanel panel;
    static JRadioButton toyCar, key, openCar, dresser, flashLight, screwDriver, safe, swipeCard, door, paintings, backButton;
    static JButton chooseButton;
    static JLabel introductionLabel, toyCarDialogueLabel, keyDialogueLabel, missingScrewDialogueLabel, dresserDialogueLabel, UVDialogueLabel, screwDriverDialogueLabel, paintingsDialogueLabel,
            invisibleInkDialogueLabel, safeDialogueLabel, codeDialogueLabel, doorDialogueLabel;
    static JTextField userInput;
    static ButtonGroup radios = new ButtonGroup();
    static int fL = 0, sD = 0, kY = 0, sC = 0, cD = 0;


    public static void main(String[] args) {

        EscapeRoomGUI();

    }

    public static void EscapeRoomGUI() {

        JFrame frame = new JFrame("Escape Room");
        frame.setSize(500, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);

        panel = new JPanel();

        backButton = new JRadioButton("Go Back to Main Menu");

        introductionLabel = new JLabel("WE are stuck try to find a way out!! Lets find a way out.");
        dresserDialogueLabel = new JLabel("lets open the closet wow there seems to be a UV light and screwDriver should we investigate them?</html>");
        UVDialogueLabel = new JLabel("Hmm isn't this used to see invisible ink? You Have Collected* ");
        screwDriverDialogueLabel = new JLabel("huh can we use this to open something? *You have collected*");

        toyCarDialogueLabel = new JLabel("Wow!! look there is a toy car. Wait! there is a Key inside of it let's open it!!");
        keyDialogueLabel = new JLabel("We got the key!! Yes now what can we use it on? * You have collected*");
        missingScrewDialogueLabel = new JLabel("Darn we can't open it. what can we use?");


        toyCar = new JRadioButton("Toy Car");
        openCar = new JRadioButton("Open the car");

        dresser = new JRadioButton("Dresser");
        flashLight = new JRadioButton("UV Light");
        screwDriver = new JRadioButton("Screw Driver");


        safe = new JRadioButton("Safe");
        paintings = new JRadioButton("Paintings");
        door = new JRadioButton("Door");
        chooseButton = new JButton("choose");


        panel.setLayout(null);
        introductionLabel.setBounds(100, 15, 400, 25);
        toyCar.setBounds(100, 50, 200, 25);
        dresser.setBounds(100, 75, 200, 25);
        safe.setBounds(100, 100, 200, 25);
        paintings.setBounds(100, 125, 200, 25);
        door.setBounds(100, 150, 200, 25);
    }
}
