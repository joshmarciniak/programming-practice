import java.awt.BasicStroke;
import java.awt.Font;
import java.awt.Graphics2D;
import java.awt.GridLayout;
import java.awt.RenderingHints;
import java.awt.TexturePaint;
import java.awt.event.*;
import java.awt.geom.Rectangle2D;
import java.awt.image.BufferedImage;
import java.awt.Color;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import javax.swing.*;

/**
 * 
 * @author Hovercraftfullofeels
 * link: https://stackoverflow.com/a/35351199/522444
 *
 */    
public class PlayingCardExample {

    private static void createAndShowGui() {
        PlayingCardPanel mainPanel = new PlayingCardPanel();

        JFrame frame = new JFrame("Playing Card Example");
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.getContentPane().add(mainPanel);
        frame.pack();
        frame.setLocationByPlatform(true);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            createAndShowGui();
        });
    }
}

@SuppressWarnings("serial")
class PlayingCardPanel extends JPanel {
    private static final Color BG = Color.GREEN.darker().darker();
    private static final int GAP = 15;
    private MyDeck myDeck = new MyDeck();

    public PlayingCardPanel() {
        setBackground(BG);
        int rows = Suit.values().length;
        int cols = Rank.values().length;
        setLayout(new GridLayout(rows, cols, GAP, GAP));
        setBorder(BorderFactory.createEmptyBorder(GAP, GAP, GAP, GAP));

        while (myDeck.size() > 0) {
            Card myCard = myDeck.deal();
            final CardLabel cardLabel = new CardLabel(myCard);
            add(cardLabel.getLabel());
            cardLabel.addMouseListener(new CardListener(cardLabel));
        }
    }
}

// class to allow us to flip cards on mouse press
class CardListener extends MouseAdapter {
    private CardLabel cardLabel;

    public CardListener(CardLabel cardLabel) {
        this.cardLabel = cardLabel;
    }

    @Override
    public void mousePressed(MouseEvent e) {
        boolean faceDown = ! cardLabel.isFaceDown();
        cardLabel.setFaceDown(faceDown);
    }
}

class CardLabel {
    private JLabel label = new JLabel();
    private Card myCard;
    private boolean faceDown = true;

    public CardLabel(Card myCard) {
        this.myCard = myCard;
        setFaceDown(true);
    }

    public void addMouseListener(MouseListener listener) {
        label.addMouseListener(listener);
    }

    public boolean isFaceDown() {
        return faceDown;
    }

    public void setFaceDown(boolean faceDown) {
        this.faceDown = faceDown;
        // get my singleton icon:
        Icon cardBackIcon = CardBack.getInstance().getIcon();
        Icon icon = faceDown ? cardBackIcon : myCard.getIcon();
        label.setIcon(icon);
    }

    public JLabel getLabel() {
        return label;
    }

    public Card getMyCard() {
        return myCard;
    }

}

// singleton class to create the backing image shared by all cards
class CardBack {
    private static final Color BG = Color.WHITE;
    private static final Color COLOR = Color.BLUE;
    private static final int W = 10;
    private static final float STROKE_WIDTH = 3f;
    private static CardBack instance = null;
    private BufferedImage image;
    private Icon icon;

    // singleton constructor is private and so is only called by this class itself
    private CardBack() {
        BufferedImage repeatImg = new BufferedImage(W, W, BufferedImage.TYPE_INT_ARGB);
        Graphics2D g2 = repeatImg.createGraphics();
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g2.setBackground(BG);
        g2.clearRect(0, 0, W, W);
        g2.setStroke(new BasicStroke(STROKE_WIDTH));
        g2.setColor(COLOR);
        g2.drawLine(0, 0, W, W);
        g2.drawLine(0, W, W, 0);
        g2.dispose();

        int width = Card.WIDTH;
        int height = Card.HEIGHT;
        int imageType = BufferedImage.TYPE_INT_ARGB;
        image = new BufferedImage(width, height, imageType);
        g2 = image.createGraphics();
        Rectangle2D anchor = new Rectangle2D.Double(0, 0, W, W);
        TexturePaint texturePaint = new TexturePaint(repeatImg, anchor);
        g2.setPaint(texturePaint);
        g2.fillRect(0, 0, width, height);
        g2.dispose();
        icon = new ImageIcon(image);
    }

    public BufferedImage getImage() {
        return image;
    }

    public Icon getIcon() {
        return icon;
    }

    public static CardBack getInstance() {
        // create the instance in a lazy fashion -- only create it if it has not
        // yet been created. Thus, it should only be created *once*
        if (instance == null) {
            instance = new CardBack();
        }
        return instance;
    }
}

class MyDeck {
    List<Card> cards = new ArrayList<>();

    public MyDeck() {
        initialize();
        shuffle();
    }

    public final void initialize() {
        cards.clear();
        for (Rank rank : Rank.values()) {
            for (Suit suit : Suit.values()) {
                cards.add(new Card(rank, suit));
            }
        }
    }

    public int size() {
        return cards.size();
    }

    public Card deal() {
        if (cards.size() > 0) {
            return cards.remove(0);
        } else {
            // TODO: better to use exceptions here!
            // String text = "cards size is " + cards.size();
            // throw new MyDeckException(text);
            return null;
        }
    }

    public void shuffle() {
        Collections.shuffle(cards);
    }
}

// Quick an dirty code below. If this were a "real" program,
// I'd probably create a class without image or icon
// and then use a wrapper or decorator class to add the image information
// since this would be GUI library specific
class Card {
    public static final int WIDTH = 50;
    public static final int HEIGHT = 70;
    private static final Font TEXT_FONT = new Font(Font.DIALOG, Font.BOLD, 14);
    private static final Font SYMBOL_FONT = TEXT_FONT.deriveFont(Font.PLAIN, 28f);
    private static final int NAME_X = 3;
    private static final int NAME_Y = 15;
    private static final int SYMBOL_X = 12;
    private static final int SYMBOL_Y = 45;
    private Rank rank;
    private Suit suit;
    private BufferedImage image;
    private Icon icon;

    public Card(Rank rank, Suit suit) {
        this.rank = rank;
        this.suit = suit;

        // create each card's image and icon once on Card creation
        image = createImage(rank, suit);
        icon = new ImageIcon(image);
    }

    private static BufferedImage createImage(Rank r, Suit s) {
        BufferedImage img = new BufferedImage(WIDTH, HEIGHT, BufferedImage.TYPE_INT_ARGB);
        Graphics2D g2 = img.createGraphics();
        g2.setRenderingHint(RenderingHints.KEY_TEXT_ANTIALIASING,
                RenderingHints.VALUE_TEXT_ANTIALIAS_ON);

        g2.setColor(java.awt.Color.WHITE);
        g2.fillRect(0, 0, WIDTH, HEIGHT);
        g2.setColor(java.awt.Color.BLACK);
        g2.drawRect(0, 0, WIDTH - 1, HEIGHT - 1);

        g2.setColor(s.getColor());
        g2.setFont(TEXT_FONT);
        g2.drawString(r.getName(), NAME_X, NAME_Y);

        g2.setFont(SYMBOL_FONT);
        g2.drawString(s.getSymbol(), SYMBOL_X, SYMBOL_Y);

        g2.dispose();
        return img;
    }

    public Rank getRank() {
        return rank;
    }

    public Suit getSuit() {
        return suit;
    }

    public BufferedImage getImage() {
        return image;
    }

    public Icon getIcon() {
        return icon;
    }
}

enum Rank {
    ACE("A"), TWO("2"), THREE("3"), FOUR("4"), FIVE("5"), SIX("6"), SEVEN("7"), EIGHT("8"), 
    NINE("9"), TEN("10"), JACK("J"), QUEEN("Q"), KING("K");
    private String name;

    private Rank(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

}

// Suit enum will hold its own color and symbol 
enum Suit {
    CLUB("Club", "\u2663", Color.BLACK), 
    DIAMOND("Diamond", "\u2666", Color.RED), 
    HEART("Heart", "\u2665", Color.RED), 
    SPADE("Spade", "\u2660", Color.BLACK);

    private String name;
    private String symbol;
    private Color color;

    private Suit(String name, String symbol, Color color) {
        this.name = name;
        this.symbol = symbol;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public String getSymbol() {
        return symbol;
    }

    public Color getColor() {
        return color;
    }

}