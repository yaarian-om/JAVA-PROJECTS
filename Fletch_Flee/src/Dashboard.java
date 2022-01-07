import java.awt.Color;
import java.awt.Image;
import java.io.FileNotFoundException;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class Dashboard extends javax.swing.JFrame {

    Utility util = new Utility();
    private int COLOR_R = 39;
    private int COLOR_G = 71;
    private int COLOR_B = 109;
    
    public static String GAP = "                        ";
    public static String SECONDARY_GAP = "             ";
    public static String newLine = "\n";
    public static String name;
    public static String date;
    public static String startPos;
    public static String destination;
    public static String train;
    public static String passenger;
    public static String seats;
    public static String time;
    public static String classs;
    public static String price;
    public static String AC;
    public static String TRAIN_NAME;
    public static String ACCOUNT_NUMBER;
    public String[] UserInfo = new String[2];
    
    private static String PRINT_TIME_DATE;
    private static String PRINT_LINE;
    public static double T_Price = 0;
    public static int members ;
    public static double TOTAL_Price ;
    public static String TRAIN_CLASS;
    public static String SEAT_NUMBERS;
    private static int HIGHLIGHT_CONTROLER = 0;
    private static String USERNAME;
    
        
    private void nextButtonEnabled(){
        if(name != "" && date != "" && passenger != ""){
            next_jButton.setEnabled(true);
        }
    }
    
    public void setMembers(){
        members = Integer.parseInt(passenger);
    }
    
    public void setTOTAL_PRICE(){
        TOTAL_Price = T_Price*members;
    }
    
    private void BankTrasferInputBox(String Bank){
        //Bkash, Nogod, Upay, Credit Card, Debit Card, Visa Card, Bank Transfer, Cash on Arrival
        if(Bank.contains("Bank Transfer")){
            ACCOUNT_NUMBER = JOptionPane.showInputDialog("Enter Bank Number", DISPOSE_ON_CLOSE);
        }else if(Bank.contains("Card")){
            ACCOUNT_NUMBER = JOptionPane.showInputDialog("Enter "+Bank+" Number", DISPOSE_ON_CLOSE);
        }else if(Bank.contains("Cash on Arrival")){}
        else{
            ACCOUNT_NUMBER = JOptionPane.showInputDialog("Enter "+Bank+" Number", DISPOSE_ON_CLOSE);
        }
    }
    
    public void getUserInfo() throws FileNotFoundException{
        UserInfo = util.getUserInfo(USERNAME);
    }
    
    
    private void initComponents2(){
        setLocationRelativeTo(null); // Set the start position to center
        username_jLabel.setText(util.getUSERNAME());
        dashboard_panel.setVisible(true);
        book_a_Ticket_jPanel.setVisible(false);
        book_a_Ticket_2_jPanel.setVisible(false);
        next_jButton.setEnabled(false);
        payment_jPanel.setVisible(false);
        safeJourney_jLabel.setVisible(false);
        
        TRAIN_NAME = util.getRandomTrain();
        train_Name_jLabel.setText(TRAIN_NAME);
        USERNAME = util.getUSERNAME();
    }
    
    private void initComponent3(){
        name_jLabel.setText("");
        date_jLabel.setText("");
        startingFrom_jLabel.setText("");
        destination_jLabel.setText("");
        train_jLabel.setText("");
        passengerNum_jLabel.setText("");
        seats_jLabel.setText("");
        time_jLabel.setText("");
        classs_jLabel.setText("");
        price_jLabel.setText("");
        
        payment_total_Cost_jLabel.setText("");
    }
    
    
    public Dashboard() {
        initComponents();
        initComponents2();
        initComponent3();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        class_buttonGroup = new javax.swing.ButtonGroup();
        background_jPanel = new javax.swing.JPanel();
        left_jPanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        dashBoard_jButton = new javax.swing.JButton();
        profile_jButton = new javax.swing.JButton();
        bookATicket_jButton = new javax.swing.JButton();
        payment_jButton = new javax.swing.JButton();
        username_jLabel = new javax.swing.JLabel();
        book_a_Ticket_2_jPanel = new javax.swing.JPanel();
        jLabel21 = new javax.swing.JLabel();
        train_Name_jLabel = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        seat_Numbers_jLabel = new javax.swing.JLabel();
        couch_jPanel = new javax.swing.JPanel();
        bogiName_jLabel = new javax.swing.JLabel();
        two_jLabel = new javax.swing.JLabel();
        three_jLabel = new javax.swing.JLabel();
        one_jLabel = new javax.swing.JLabel();
        six_jLabel = new javax.swing.JLabel();
        five_jLabel = new javax.swing.JLabel();
        four_jLabel = new javax.swing.JLabel();
        seven_jLabel = new javax.swing.JLabel();
        eight_jLabel = new javax.swing.JLabel();
        nine_jLabel = new javax.swing.JLabel();
        ten_jLabel = new javax.swing.JLabel();
        eleven_jLabel = new javax.swing.JLabel();
        twelve_jLabel = new javax.swing.JLabel();
        thirteen_jLabel = new javax.swing.JLabel();
        nineteen_jLabel = new javax.swing.JLabel();
        twenty_jLabel = new javax.swing.JLabel();
        fourteen_jLabel = new javax.swing.JLabel();
        fifteen_jLabel = new javax.swing.JLabel();
        twentyone_jLabel = new javax.swing.JLabel();
        sixteen_jLabel = new javax.swing.JLabel();
        twentytwo_jLabel = new javax.swing.JLabel();
        twentythree_jLabel = new javax.swing.JLabel();
        seventeen_jLabel = new javax.swing.JLabel();
        eightteen_jLabel = new javax.swing.JLabel();
        twentyfour_jLabel = new javax.swing.JLabel();
        twentyfive_jLabel = new javax.swing.JLabel();
        twentysix_jLabel = new javax.swing.JLabel();
        twentyseven_jLabel = new javax.swing.JLabel();
        thirtyone_jLabel = new javax.swing.JLabel();
        thirtytwo_jLabel = new javax.swing.JLabel();
        thirtythree_jLabel = new javax.swing.JLabel();
        twentyeight_jLabel = new javax.swing.JLabel();
        thirtyfour_jLabel = new javax.swing.JLabel();
        thirtyfive_jLabel = new javax.swing.JLabel();
        twentynine_jLabel = new javax.swing.JLabel();
        thirty_jLabel = new javax.swing.JLabel();
        thirtysix_jLabel = new javax.swing.JLabel();
        thirtyseven_jLabel = new javax.swing.JLabel();
        thirtyeight_jLabel = new javax.swing.JLabel();
        thirtynine_jLabel = new javax.swing.JLabel();
        forty_jLabel = new javax.swing.JLabel();
        fortyone_jLabel = new javax.swing.JLabel();
        fortytwo_jLabel = new javax.swing.JLabel();
        fortyeight_jLabel = new javax.swing.JLabel();
        fortyseven_jLabel = new javax.swing.JLabel();
        fortysix_jLabel = new javax.swing.JLabel();
        fortyfive_jLabel = new javax.swing.JLabel();
        fortyfour_jLabel = new javax.swing.JLabel();
        fortythree_jLabel = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        back_jButton = new javax.swing.JButton();
        book_a_Ticket_jPanel = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        date_jTextField = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        starting_jComboBox = new javax.swing.JComboBox<>();
        destination_jComboBox = new javax.swing.JComboBox<>();
        jLabel17 = new javax.swing.JLabel();
        passenger_jTextField = new javax.swing.JTextField();
        time_jComboBox = new javax.swing.JComboBox<>();
        jLabel18 = new javax.swing.JLabel();
        name_jTextField = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        economic_jRadioButton = new javax.swing.JRadioButton();
        ac_jCheckBox = new javax.swing.JCheckBox();
        business_jRadioButton = new javax.swing.JRadioButton();
        firstClass_jRadioButton = new javax.swing.JRadioButton();
        next_jButton = new javax.swing.JButton();
        dashboard_panel = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        name_jLabel = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        date_jLabel = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        startingFrom_jLabel = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        destination_jLabel = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        passengerNum_jLabel = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        time_jLabel = new javax.swing.JLabel();
        classs_jLabel = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        seats_jLabel = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        price_jLabel = new javax.swing.JLabel();
        print_jButton = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        train_jLabel = new javax.swing.JLabel();
        profile_jPanel = new javax.swing.JPanel();
        user_jLabel = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        profile_Username_jLabel = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        profile_Password_jLabel = new javax.swing.JLabel();
        payment_jPanel = new javax.swing.JPanel();
        jLabel24 = new javax.swing.JLabel();
        payment_total_Cost_jLabel = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        payment_jComboBox = new javax.swing.JComboBox<>();
        confirm_Payment_jButton = new javax.swing.JButton();
        safeJourney_jLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        background_jPanel.setBackground(new java.awt.Color(51, 51, 51));

        left_jPanel.setBackground(new java.awt.Color(102, 102, 102));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/myUser.png"))); // NOI18N

        dashBoard_jButton.setBackground(new java.awt.Color(102, 102, 102));
        dashBoard_jButton.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        dashBoard_jButton.setForeground(new java.awt.Color(255, 255, 255));
        dashBoard_jButton.setText("Dashboard");
        dashBoard_jButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        dashBoard_jButton.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                dashBoard_jButtonFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                dashBoard_jButtonFocusLost(evt);
            }
        });
        dashBoard_jButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dashBoard_jButtonActionPerformed(evt);
            }
        });

        profile_jButton.setBackground(new java.awt.Color(102, 102, 102));
        profile_jButton.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        profile_jButton.setForeground(new java.awt.Color(255, 255, 255));
        profile_jButton.setText("Profile");
        profile_jButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        profile_jButton.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                profile_jButtonFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                profile_jButtonFocusLost(evt);
            }
        });
        profile_jButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                profile_jButtonActionPerformed(evt);
            }
        });

        bookATicket_jButton.setBackground(new java.awt.Color(102, 102, 102));
        bookATicket_jButton.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        bookATicket_jButton.setForeground(new java.awt.Color(255, 255, 255));
        bookATicket_jButton.setText("Book a Ticket");
        bookATicket_jButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bookATicket_jButton.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                bookATicket_jButtonFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                bookATicket_jButtonFocusLost(evt);
            }
        });
        bookATicket_jButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bookATicket_jButtonActionPerformed(evt);
            }
        });

        payment_jButton.setBackground(new java.awt.Color(102, 102, 102));
        payment_jButton.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        payment_jButton.setForeground(new java.awt.Color(255, 255, 255));
        payment_jButton.setText("Payment");
        payment_jButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        payment_jButton.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                payment_jButtonFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                payment_jButtonFocusLost(evt);
            }
        });
        payment_jButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                payment_jButtonActionPerformed(evt);
            }
        });

        username_jLabel.setBackground(new java.awt.Color(51, 51, 51));
        username_jLabel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        username_jLabel.setForeground(new java.awt.Color(255, 255, 255));
        username_jLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        username_jLabel.setText("username");
        username_jLabel.setToolTipText("username");

        javax.swing.GroupLayout left_jPanelLayout = new javax.swing.GroupLayout(left_jPanel);
        left_jPanel.setLayout(left_jPanelLayout);
        left_jPanelLayout.setHorizontalGroup(
            left_jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(dashBoard_jButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(profile_jButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(bookATicket_jButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(payment_jButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(left_jPanelLayout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(75, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, left_jPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(username_jLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(99, 99, 99))
        );
        left_jPanelLayout.setVerticalGroup(
            left_jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(left_jPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(username_jLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(126, 126, 126)
                .addComponent(dashBoard_jButton, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bookATicket_jButton, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(payment_jButton, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 153, Short.MAX_VALUE)
                .addComponent(profile_jButton, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        book_a_Ticket_2_jPanel.setBackground(new java.awt.Color(51, 51, 51));
        book_a_Ticket_2_jPanel.setForeground(new java.awt.Color(255, 255, 255));

        jLabel21.setBackground(new java.awt.Color(51, 51, 51));
        jLabel21.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(255, 255, 255));
        jLabel21.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel21.setText("Train Name");

        train_Name_jLabel.setBackground(new java.awt.Color(51, 51, 51));
        train_Name_jLabel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        train_Name_jLabel.setForeground(new java.awt.Color(255, 255, 255));
        train_Name_jLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        train_Name_jLabel.setText("Your Train Name");

        jLabel23.setBackground(new java.awt.Color(51, 51, 51));
        jLabel23.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(255, 255, 255));
        jLabel23.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel23.setText("Seat Numbers");

        seat_Numbers_jLabel.setBackground(new java.awt.Color(51, 51, 51));
        seat_Numbers_jLabel.setForeground(new java.awt.Color(255, 255, 255));
        seat_Numbers_jLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        seat_Numbers_jLabel.setText("Your Seat Numbers");

        couch_jPanel.setBackground(new java.awt.Color(153, 153, 153));

        bogiName_jLabel.setBackground(new java.awt.Color(0, 0, 0));
        bogiName_jLabel.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        bogiName_jLabel.setForeground(new java.awt.Color(0, 51, 51));
        bogiName_jLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        bogiName_jLabel.setText("Bogi Name");

        two_jLabel.setBackground(new java.awt.Color(51, 51, 51));
        two_jLabel.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        two_jLabel.setForeground(new java.awt.Color(255, 255, 255));
        two_jLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        two_jLabel.setText("2");

        three_jLabel.setBackground(new java.awt.Color(51, 51, 51));
        three_jLabel.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        three_jLabel.setForeground(new java.awt.Color(255, 255, 255));
        three_jLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        three_jLabel.setText("3");

        one_jLabel.setBackground(new java.awt.Color(51, 51, 51));
        one_jLabel.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        one_jLabel.setForeground(new java.awt.Color(255, 255, 255));
        one_jLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        one_jLabel.setText("1");

        six_jLabel.setBackground(new java.awt.Color(51, 51, 51));
        six_jLabel.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        six_jLabel.setForeground(new java.awt.Color(255, 255, 255));
        six_jLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        six_jLabel.setText("6");

        five_jLabel.setBackground(new java.awt.Color(51, 51, 51));
        five_jLabel.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        five_jLabel.setForeground(new java.awt.Color(255, 255, 255));
        five_jLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        five_jLabel.setText("5");

        four_jLabel.setBackground(new java.awt.Color(51, 51, 51));
        four_jLabel.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        four_jLabel.setForeground(new java.awt.Color(255, 255, 255));
        four_jLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        four_jLabel.setText("4");

        seven_jLabel.setBackground(new java.awt.Color(51, 51, 51));
        seven_jLabel.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        seven_jLabel.setForeground(new java.awt.Color(255, 255, 255));
        seven_jLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        seven_jLabel.setText("7");

        eight_jLabel.setBackground(new java.awt.Color(51, 51, 51));
        eight_jLabel.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        eight_jLabel.setForeground(new java.awt.Color(255, 255, 255));
        eight_jLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        eight_jLabel.setText("8");

        nine_jLabel.setBackground(new java.awt.Color(51, 51, 51));
        nine_jLabel.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        nine_jLabel.setForeground(new java.awt.Color(255, 255, 255));
        nine_jLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        nine_jLabel.setText("9");

        ten_jLabel.setBackground(new java.awt.Color(51, 51, 51));
        ten_jLabel.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        ten_jLabel.setForeground(new java.awt.Color(255, 255, 255));
        ten_jLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ten_jLabel.setText("10");

        eleven_jLabel.setBackground(new java.awt.Color(51, 51, 51));
        eleven_jLabel.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        eleven_jLabel.setForeground(new java.awt.Color(255, 255, 255));
        eleven_jLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        eleven_jLabel.setText("11");

        twelve_jLabel.setBackground(new java.awt.Color(51, 51, 51));
        twelve_jLabel.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        twelve_jLabel.setForeground(new java.awt.Color(255, 255, 255));
        twelve_jLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        twelve_jLabel.setText("12");

        thirteen_jLabel.setBackground(new java.awt.Color(51, 51, 51));
        thirteen_jLabel.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        thirteen_jLabel.setForeground(new java.awt.Color(255, 255, 255));
        thirteen_jLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        thirteen_jLabel.setText("13");

        nineteen_jLabel.setBackground(new java.awt.Color(51, 51, 51));
        nineteen_jLabel.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        nineteen_jLabel.setForeground(new java.awt.Color(255, 255, 255));
        nineteen_jLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        nineteen_jLabel.setText("19");

        twenty_jLabel.setBackground(new java.awt.Color(51, 51, 51));
        twenty_jLabel.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        twenty_jLabel.setForeground(new java.awt.Color(255, 255, 255));
        twenty_jLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        twenty_jLabel.setText("20");

        fourteen_jLabel.setBackground(new java.awt.Color(51, 51, 51));
        fourteen_jLabel.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        fourteen_jLabel.setForeground(new java.awt.Color(255, 255, 255));
        fourteen_jLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        fourteen_jLabel.setText("14");

        fifteen_jLabel.setBackground(new java.awt.Color(51, 51, 51));
        fifteen_jLabel.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        fifteen_jLabel.setForeground(new java.awt.Color(255, 255, 255));
        fifteen_jLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        fifteen_jLabel.setText("15");

        twentyone_jLabel.setBackground(new java.awt.Color(51, 51, 51));
        twentyone_jLabel.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        twentyone_jLabel.setForeground(new java.awt.Color(255, 255, 255));
        twentyone_jLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        twentyone_jLabel.setText("21");

        sixteen_jLabel.setBackground(new java.awt.Color(51, 51, 51));
        sixteen_jLabel.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        sixteen_jLabel.setForeground(new java.awt.Color(255, 255, 255));
        sixteen_jLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        sixteen_jLabel.setText("16");

        twentytwo_jLabel.setBackground(new java.awt.Color(51, 51, 51));
        twentytwo_jLabel.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        twentytwo_jLabel.setForeground(new java.awt.Color(255, 255, 255));
        twentytwo_jLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        twentytwo_jLabel.setText("22");

        twentythree_jLabel.setBackground(new java.awt.Color(51, 51, 51));
        twentythree_jLabel.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        twentythree_jLabel.setForeground(new java.awt.Color(255, 255, 255));
        twentythree_jLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        twentythree_jLabel.setText("23");

        seventeen_jLabel.setBackground(new java.awt.Color(51, 51, 51));
        seventeen_jLabel.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        seventeen_jLabel.setForeground(new java.awt.Color(255, 255, 255));
        seventeen_jLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        seventeen_jLabel.setText("17");

        eightteen_jLabel.setBackground(new java.awt.Color(51, 51, 51));
        eightteen_jLabel.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        eightteen_jLabel.setForeground(new java.awt.Color(255, 255, 255));
        eightteen_jLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        eightteen_jLabel.setText("18");

        twentyfour_jLabel.setBackground(new java.awt.Color(51, 51, 51));
        twentyfour_jLabel.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        twentyfour_jLabel.setForeground(new java.awt.Color(255, 255, 255));
        twentyfour_jLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        twentyfour_jLabel.setText("24");

        twentyfive_jLabel.setBackground(new java.awt.Color(51, 51, 51));
        twentyfive_jLabel.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        twentyfive_jLabel.setForeground(new java.awt.Color(255, 255, 255));
        twentyfive_jLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        twentyfive_jLabel.setText("25");

        twentysix_jLabel.setBackground(new java.awt.Color(51, 51, 51));
        twentysix_jLabel.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        twentysix_jLabel.setForeground(new java.awt.Color(255, 255, 255));
        twentysix_jLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        twentysix_jLabel.setText("26");

        twentyseven_jLabel.setBackground(new java.awt.Color(51, 51, 51));
        twentyseven_jLabel.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        twentyseven_jLabel.setForeground(new java.awt.Color(255, 255, 255));
        twentyseven_jLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        twentyseven_jLabel.setText("27");

        thirtyone_jLabel.setBackground(new java.awt.Color(51, 51, 51));
        thirtyone_jLabel.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        thirtyone_jLabel.setForeground(new java.awt.Color(255, 255, 255));
        thirtyone_jLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        thirtyone_jLabel.setText("31");

        thirtytwo_jLabel.setBackground(new java.awt.Color(51, 51, 51));
        thirtytwo_jLabel.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        thirtytwo_jLabel.setForeground(new java.awt.Color(255, 255, 255));
        thirtytwo_jLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        thirtytwo_jLabel.setText("32");

        thirtythree_jLabel.setBackground(new java.awt.Color(51, 51, 51));
        thirtythree_jLabel.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        thirtythree_jLabel.setForeground(new java.awt.Color(255, 255, 255));
        thirtythree_jLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        thirtythree_jLabel.setText("33");

        twentyeight_jLabel.setBackground(new java.awt.Color(51, 51, 51));
        twentyeight_jLabel.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        twentyeight_jLabel.setForeground(new java.awt.Color(255, 255, 255));
        twentyeight_jLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        twentyeight_jLabel.setText("28");

        thirtyfour_jLabel.setBackground(new java.awt.Color(51, 51, 51));
        thirtyfour_jLabel.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        thirtyfour_jLabel.setForeground(new java.awt.Color(255, 255, 255));
        thirtyfour_jLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        thirtyfour_jLabel.setText("34");

        thirtyfive_jLabel.setBackground(new java.awt.Color(51, 51, 51));
        thirtyfive_jLabel.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        thirtyfive_jLabel.setForeground(new java.awt.Color(255, 255, 255));
        thirtyfive_jLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        thirtyfive_jLabel.setText("35");

        twentynine_jLabel.setBackground(new java.awt.Color(51, 51, 51));
        twentynine_jLabel.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        twentynine_jLabel.setForeground(new java.awt.Color(255, 255, 255));
        twentynine_jLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        twentynine_jLabel.setText("29");

        thirty_jLabel.setBackground(new java.awt.Color(51, 51, 51));
        thirty_jLabel.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        thirty_jLabel.setForeground(new java.awt.Color(255, 255, 255));
        thirty_jLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        thirty_jLabel.setText("30");

        thirtysix_jLabel.setBackground(new java.awt.Color(51, 51, 51));
        thirtysix_jLabel.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        thirtysix_jLabel.setForeground(new java.awt.Color(255, 255, 255));
        thirtysix_jLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        thirtysix_jLabel.setText("36");

        thirtyseven_jLabel.setBackground(new java.awt.Color(51, 51, 51));
        thirtyseven_jLabel.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        thirtyseven_jLabel.setForeground(new java.awt.Color(255, 255, 255));
        thirtyseven_jLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        thirtyseven_jLabel.setText("37");

        thirtyeight_jLabel.setBackground(new java.awt.Color(51, 51, 51));
        thirtyeight_jLabel.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        thirtyeight_jLabel.setForeground(new java.awt.Color(255, 255, 255));
        thirtyeight_jLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        thirtyeight_jLabel.setText("38");

        thirtynine_jLabel.setBackground(new java.awt.Color(51, 51, 51));
        thirtynine_jLabel.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        thirtynine_jLabel.setForeground(new java.awt.Color(255, 255, 255));
        thirtynine_jLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        thirtynine_jLabel.setText("39");

        forty_jLabel.setBackground(new java.awt.Color(51, 51, 51));
        forty_jLabel.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        forty_jLabel.setForeground(new java.awt.Color(255, 255, 255));
        forty_jLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        forty_jLabel.setText("40");

        fortyone_jLabel.setBackground(new java.awt.Color(51, 51, 51));
        fortyone_jLabel.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        fortyone_jLabel.setForeground(new java.awt.Color(255, 255, 255));
        fortyone_jLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        fortyone_jLabel.setText("41");

        fortytwo_jLabel.setBackground(new java.awt.Color(51, 51, 51));
        fortytwo_jLabel.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        fortytwo_jLabel.setForeground(new java.awt.Color(255, 255, 255));
        fortytwo_jLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        fortytwo_jLabel.setText("42");

        fortyeight_jLabel.setBackground(new java.awt.Color(51, 51, 51));
        fortyeight_jLabel.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        fortyeight_jLabel.setForeground(new java.awt.Color(255, 255, 255));
        fortyeight_jLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        fortyeight_jLabel.setText("48");

        fortyseven_jLabel.setBackground(new java.awt.Color(51, 51, 51));
        fortyseven_jLabel.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        fortyseven_jLabel.setForeground(new java.awt.Color(255, 255, 255));
        fortyseven_jLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        fortyseven_jLabel.setText("47");

        fortysix_jLabel.setBackground(new java.awt.Color(51, 51, 51));
        fortysix_jLabel.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        fortysix_jLabel.setForeground(new java.awt.Color(255, 255, 255));
        fortysix_jLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        fortysix_jLabel.setText("46");

        fortyfive_jLabel.setBackground(new java.awt.Color(51, 51, 51));
        fortyfive_jLabel.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        fortyfive_jLabel.setForeground(new java.awt.Color(255, 255, 255));
        fortyfive_jLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        fortyfive_jLabel.setText("45");

        fortyfour_jLabel.setBackground(new java.awt.Color(51, 51, 51));
        fortyfour_jLabel.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        fortyfour_jLabel.setForeground(new java.awt.Color(255, 255, 255));
        fortyfour_jLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        fortyfour_jLabel.setText("44");

        fortythree_jLabel.setBackground(new java.awt.Color(51, 51, 51));
        fortythree_jLabel.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        fortythree_jLabel.setForeground(new java.awt.Color(255, 255, 255));
        fortythree_jLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        fortythree_jLabel.setText("43");

        jLabel22.setBackground(new java.awt.Color(102, 102, 102));
        jLabel22.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(0, 0, 0));
        jLabel22.setText("Bogi Name");

        javax.swing.GroupLayout couch_jPanelLayout = new javax.swing.GroupLayout(couch_jPanel);
        couch_jPanel.setLayout(couch_jPanelLayout);
        couch_jPanelLayout.setHorizontalGroup(
            couch_jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(couch_jPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(couch_jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(couch_jPanelLayout.createSequentialGroup()
                        .addComponent(seven_jLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(eight_jLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(nine_jLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(ten_jLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(eleven_jLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(twelve_jLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(couch_jPanelLayout.createSequentialGroup()
                        .addComponent(thirteen_jLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(fourteen_jLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(fifteen_jLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(sixteen_jLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(seventeen_jLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(eightteen_jLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(couch_jPanelLayout.createSequentialGroup()
                        .addComponent(nineteen_jLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(twenty_jLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(twentyone_jLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(twentytwo_jLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(twentythree_jLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(twentyfour_jLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(couch_jPanelLayout.createSequentialGroup()
                        .addComponent(twentyfive_jLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(twentysix_jLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(twentyseven_jLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(twentyeight_jLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(twentynine_jLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(thirty_jLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(couch_jPanelLayout.createSequentialGroup()
                        .addComponent(thirtyone_jLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(thirtytwo_jLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(thirtythree_jLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(thirtyfour_jLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(thirtyfive_jLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(thirtysix_jLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(couch_jPanelLayout.createSequentialGroup()
                        .addComponent(thirtyseven_jLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(thirtyeight_jLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(thirtynine_jLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(forty_jLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(fortyone_jLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(fortytwo_jLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(couch_jPanelLayout.createSequentialGroup()
                        .addComponent(fortythree_jLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(fortyfour_jLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(fortyfive_jLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(fortysix_jLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(fortyseven_jLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(fortyeight_jLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(couch_jPanelLayout.createSequentialGroup()
                        .addGroup(couch_jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, couch_jPanelLayout.createSequentialGroup()
                                .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(bogiName_jLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(couch_jPanelLayout.createSequentialGroup()
                                .addComponent(one_jLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(two_jLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(three_jLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
                        .addComponent(four_jLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(five_jLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(six_jLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        couch_jPanelLayout.setVerticalGroup(
            couch_jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(couch_jPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(couch_jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bogiName_jLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17)
                .addGroup(couch_jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(two_jLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(three_jLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(one_jLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(five_jLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(six_jLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(four_jLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(couch_jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(eight_jLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nine_jLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(seven_jLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(eleven_jLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(twelve_jLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ten_jLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(couch_jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fourteen_jLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fifteen_jLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(thirteen_jLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(seventeen_jLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(eightteen_jLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sixteen_jLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(couch_jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(twenty_jLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(twentyone_jLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nineteen_jLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(twentythree_jLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(twentyfour_jLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(twentytwo_jLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(couch_jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(twentysix_jLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(twentyseven_jLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(twentyfive_jLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(twentynine_jLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(thirty_jLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(twentyeight_jLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(couch_jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(thirtytwo_jLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(thirtythree_jLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(thirtyone_jLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(thirtyfive_jLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(thirtysix_jLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(thirtyfour_jLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(couch_jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(thirtyeight_jLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(thirtynine_jLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(thirtyseven_jLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fortyone_jLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fortytwo_jLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(forty_jLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(couch_jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fortyfour_jLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fortyfive_jLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fortythree_jLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fortyseven_jLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fortyeight_jLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fortysix_jLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 6, Short.MAX_VALUE))
        );

        back_jButton.setBackground(new java.awt.Color(102, 102, 255));
        back_jButton.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        back_jButton.setForeground(new java.awt.Color(255, 255, 255));
        back_jButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/back.png"))); // NOI18N
        back_jButton.setText("Back");
        back_jButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                back_jButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout book_a_Ticket_2_jPanelLayout = new javax.swing.GroupLayout(book_a_Ticket_2_jPanel);
        book_a_Ticket_2_jPanel.setLayout(book_a_Ticket_2_jPanelLayout);
        book_a_Ticket_2_jPanelLayout.setHorizontalGroup(
            book_a_Ticket_2_jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(book_a_Ticket_2_jPanelLayout.createSequentialGroup()
                .addContainerGap(68, Short.MAX_VALUE)
                .addGroup(book_a_Ticket_2_jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, book_a_Ticket_2_jPanelLayout.createSequentialGroup()
                        .addGroup(book_a_Ticket_2_jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(book_a_Ticket_2_jPanelLayout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(seat_Numbers_jLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(book_a_Ticket_2_jPanelLayout.createSequentialGroup()
                                .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(train_Name_jLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(98, 98, 98))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, book_a_Ticket_2_jPanelLayout.createSequentialGroup()
                        .addComponent(couch_jPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(63, 63, 63))))
            .addGroup(book_a_Ticket_2_jPanelLayout.createSequentialGroup()
                .addGap(215, 215, 215)
                .addComponent(back_jButton)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        book_a_Ticket_2_jPanelLayout.setVerticalGroup(
            book_a_Ticket_2_jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(book_a_Ticket_2_jPanelLayout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(book_a_Ticket_2_jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(train_Name_jLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(book_a_Ticket_2_jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(seat_Numbers_jLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(couch_jPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(back_jButton, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(27, Short.MAX_VALUE))
        );

        book_a_Ticket_jPanel.setBackground(new java.awt.Color(51, 51, 51));

        jLabel13.setBackground(new java.awt.Color(51, 51, 51));
        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("Time");

        jLabel14.setBackground(new java.awt.Color(51, 51, 51));
        jLabel14.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setText("Departure Date");

        date_jTextField.setBackground(new java.awt.Color(102, 102, 102));
        date_jTextField.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        date_jTextField.setForeground(new java.awt.Color(255, 255, 255));
        date_jTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                date_jTextFieldActionPerformed(evt);
            }
        });

        jLabel15.setBackground(new java.awt.Color(51, 51, 51));
        jLabel15.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setText("Starting From");

        jLabel16.setBackground(new java.awt.Color(51, 51, 51));
        jLabel16.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel16.setText("Destination");

        starting_jComboBox.setBackground(new java.awt.Color(51, 51, 51));
        starting_jComboBox.setForeground(new java.awt.Color(255, 255, 255));
        starting_jComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Dhaka", "Faridpur", "Gazipur", "Gopalganj", "Jamalpur", "Kishoreganj", "Madaripur", "Manikganj", "Munshiganj", "Mymensingh", "Narayanganj", "Narsingdi", "Netrokona", "Rajbari", "Shariatpur", "Sherpur", "Tangail", "Bogra", "Joypurhat", "Naogaon", "Natore", "Nawabganj", "Pabna", "Rajshahi", "Sirajgonj", "Dinajpur", "Gaibandha", "Kurigram", "Lalmonirhat", "Nilphamari", "Panchagarh", "Rangpur", "Thakurgaon", "Barguna", "Barisal", "Bhola", "Jhalokati", "Patuakhali", "Pirojpur", "Bandarban", "Brahmanbaria", "Chandpur", "Chittagong", "Comilla", "Cox''s Bazar", "Feni", "Khagrachari", "Lakshmipur", "Noakhali", "Rangamati", "Habiganj", "Maulvibazar", "Sunamganj", "Sylhet", "Bagerhat", "Chuadanga", "Jessore", "Jhenaidah", "Khulna", "Kushtia", "Magura", "Meherpur", "Narail", "Satkhira" }));

        destination_jComboBox.setBackground(new java.awt.Color(51, 51, 51));
        destination_jComboBox.setForeground(new java.awt.Color(255, 255, 255));
        destination_jComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Dhaka", "Faridpur", "Gazipur", "Gopalganj", "Jamalpur", "Kishoreganj", "Madaripur", "Manikganj", "Munshiganj", "Mymensingh", "Narayanganj", "Narsingdi", "Netrokona", "Rajbari", "Shariatpur", "Sherpur", "Tangail", "Bogra", "Joypurhat", "Naogaon", "Natore", "Nawabganj", "Pabna", "Rajshahi", "Sirajgonj", "Dinajpur", "Gaibandha", "Kurigram", "Lalmonirhat", "Nilphamari", "Panchagarh", "Rangpur", "Thakurgaon", "Barguna", "Barisal", "Bhola", "Jhalokati", "Patuakhali", "Pirojpur", "Bandarban", "Brahmanbaria", "Chandpur", "Chittagong", "Comilla", "Cox''s Bazar", "Feni", "Khagrachari", "Lakshmipur", "Noakhali", "Rangamati", "Habiganj", "Maulvibazar", "Sunamganj", "Sylhet", "Bagerhat", "Chuadanga", "Jessore", "Jhenaidah", "Khulna", "Kushtia", "Magura", "Meherpur", "Narail", "Satkhira" }));
        destination_jComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                destination_jComboBoxActionPerformed(evt);
            }
        });

        jLabel17.setBackground(new java.awt.Color(51, 51, 51));
        jLabel17.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel17.setText("Number of Passengers");

        passenger_jTextField.setBackground(new java.awt.Color(102, 102, 102));
        passenger_jTextField.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        passenger_jTextField.setForeground(new java.awt.Color(255, 255, 255));
        passenger_jTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passenger_jTextFieldActionPerformed(evt);
            }
        });

        time_jComboBox.setBackground(new java.awt.Color(51, 51, 51));
        time_jComboBox.setForeground(new java.awt.Color(255, 255, 255));
        time_jComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "12:00 AM", "1:00 AM", "2:00 AM", "3:00 AM", "4:00 AM", "5:00 AM", "6:00 AM", "7:00 AM", "8:00 AM", "9:00 AM", "10:00 AM", "11:00 AM", "12:00 PM", "1:00 PM", "2:00 PM", "3:00 PM", "4:00 PM", "5:00 PM", "6:00 PM", "7:00 PM", "8:00 PM", "9:00 PM", "10:00 PM", "11:00 PM" }));
        time_jComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                time_jComboBoxActionPerformed(evt);
            }
        });

        jLabel18.setBackground(new java.awt.Color(51, 51, 51));
        jLabel18.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel18.setText("Name");

        name_jTextField.setBackground(new java.awt.Color(102, 102, 102));
        name_jTextField.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        name_jTextField.setForeground(new java.awt.Color(255, 255, 255));
        name_jTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                name_jTextFieldActionPerformed(evt);
            }
        });

        jLabel19.setBackground(new java.awt.Color(51, 51, 51));
        jLabel19.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel19.setText("Class");

        jLabel20.setBackground(new java.awt.Color(51, 51, 51));
        jLabel20.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel20.setText("AC");

        economic_jRadioButton.setBackground(new java.awt.Color(51, 51, 51));
        class_buttonGroup.add(economic_jRadioButton);
        economic_jRadioButton.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        economic_jRadioButton.setForeground(new java.awt.Color(255, 255, 255));
        economic_jRadioButton.setText("Economic Class");
        economic_jRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                economic_jRadioButtonActionPerformed(evt);
            }
        });

        ac_jCheckBox.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        ac_jCheckBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ac_jCheckBoxActionPerformed(evt);
            }
        });

        business_jRadioButton.setBackground(new java.awt.Color(51, 51, 51));
        class_buttonGroup.add(business_jRadioButton);
        business_jRadioButton.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        business_jRadioButton.setForeground(new java.awt.Color(255, 255, 255));
        business_jRadioButton.setText("Business Class");
        business_jRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                business_jRadioButtonActionPerformed(evt);
            }
        });

        firstClass_jRadioButton.setBackground(new java.awt.Color(51, 51, 51));
        class_buttonGroup.add(firstClass_jRadioButton);
        firstClass_jRadioButton.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        firstClass_jRadioButton.setForeground(new java.awt.Color(255, 255, 255));
        firstClass_jRadioButton.setText("First Class");
        firstClass_jRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                firstClass_jRadioButtonActionPerformed(evt);
            }
        });

        next_jButton.setBackground(new java.awt.Color(102, 102, 255));
        next_jButton.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        next_jButton.setForeground(new java.awt.Color(255, 255, 255));
        next_jButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/next_1.png"))); // NOI18N
        next_jButton.setText("Next");
        next_jButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        next_jButton.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        next_jButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                next_jButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout book_a_Ticket_jPanelLayout = new javax.swing.GroupLayout(book_a_Ticket_jPanel);
        book_a_Ticket_jPanel.setLayout(book_a_Ticket_jPanelLayout);
        book_a_Ticket_jPanelLayout.setHorizontalGroup(
            book_a_Ticket_jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, book_a_Ticket_jPanelLayout.createSequentialGroup()
                .addGroup(book_a_Ticket_jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(book_a_Ticket_jPanelLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(next_jButton, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(book_a_Ticket_jPanelLayout.createSequentialGroup()
                        .addGap(62, 62, 62)
                        .addGroup(book_a_Ticket_jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(book_a_Ticket_jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, book_a_Ticket_jPanelLayout.createSequentialGroup()
                                    .addGroup(book_a_Ticket_jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(77, 77, 77))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, book_a_Ticket_jPanelLayout.createSequentialGroup()
                                    .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(58, 58, 58)))
                            .addGroup(book_a_Ticket_jPanelLayout.createSequentialGroup()
                                .addGap(19, 19, 19)
                                .addGroup(book_a_Ticket_jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGroup(book_a_Ticket_jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(book_a_Ticket_jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(destination_jComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(book_a_Ticket_jPanelLayout.createSequentialGroup()
                                    .addGroup(book_a_Ticket_jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(book_a_Ticket_jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(date_jTextField)
                                            .addComponent(starting_jComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(name_jTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(passenger_jTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(0, 0, Short.MAX_VALUE)))
                            .addGroup(book_a_Ticket_jPanelLayout.createSequentialGroup()
                                .addGroup(book_a_Ticket_jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(firstClass_jRadioButton)
                                    .addComponent(business_jRadioButton)
                                    .addComponent(ac_jCheckBox)
                                    .addComponent(time_jComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(economic_jRadioButton))
                                .addGap(96, 96, 96)))))
                .addGap(35, 35, 35))
        );
        book_a_Ticket_jPanelLayout.setVerticalGroup(
            book_a_Ticket_jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, book_a_Ticket_jPanelLayout.createSequentialGroup()
                .addContainerGap(147, Short.MAX_VALUE)
                .addGroup(book_a_Ticket_jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(name_jTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, book_a_Ticket_jPanelLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 2, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(book_a_Ticket_jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(date_jTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(book_a_Ticket_jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(starting_jComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(book_a_Ticket_jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(destination_jComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(book_a_Ticket_jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(passenger_jTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(book_a_Ticket_jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(time_jComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addComponent(economic_jRadioButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(book_a_Ticket_jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(business_jRadioButton)
                    .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(book_a_Ticket_jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(book_a_Ticket_jPanelLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(firstClass_jRadioButton)
                        .addGap(18, 18, 18)
                        .addComponent(ac_jCheckBox, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, book_a_Ticket_jPanelLayout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(38, 38, 38)
                .addComponent(next_jButton, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24))
        );

        dashboard_panel.setBackground(new java.awt.Color(51, 51, 51));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/metro.jpg"))); // NOI18N

        jLabel3.setBackground(new java.awt.Color(51, 51, 51));
        jLabel3.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Name");

        name_jLabel.setBackground(new java.awt.Color(51, 51, 51));
        name_jLabel.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        name_jLabel.setForeground(new java.awt.Color(255, 255, 255));
        name_jLabel.setText("Your name");

        jLabel5.setBackground(new java.awt.Color(51, 51, 51));
        jLabel5.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Departure Date");

        date_jLabel.setBackground(new java.awt.Color(51, 51, 51));
        date_jLabel.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        date_jLabel.setForeground(new java.awt.Color(255, 255, 255));
        date_jLabel.setText("Departure Date");

        jLabel6.setBackground(new java.awt.Color(51, 51, 51));
        jLabel6.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Starting From");

        startingFrom_jLabel.setBackground(new java.awt.Color(51, 51, 51));
        startingFrom_jLabel.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        startingFrom_jLabel.setForeground(new java.awt.Color(255, 255, 255));
        startingFrom_jLabel.setText("Starting From");

        jLabel7.setBackground(new java.awt.Color(51, 51, 51));
        jLabel7.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Destination");

        destination_jLabel.setBackground(new java.awt.Color(51, 51, 51));
        destination_jLabel.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        destination_jLabel.setForeground(new java.awt.Color(255, 255, 255));
        destination_jLabel.setText("Your Destination");

        jLabel8.setBackground(new java.awt.Color(51, 51, 51));
        jLabel8.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Number of Passengers");

        passengerNum_jLabel.setBackground(new java.awt.Color(51, 51, 51));
        passengerNum_jLabel.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        passengerNum_jLabel.setForeground(new java.awt.Color(255, 255, 255));
        passengerNum_jLabel.setText("passenger");

        jLabel4.setBackground(new java.awt.Color(51, 51, 51));
        jLabel4.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Time");

        time_jLabel.setBackground(new java.awt.Color(51, 51, 51));
        time_jLabel.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        time_jLabel.setForeground(new java.awt.Color(255, 255, 255));
        time_jLabel.setText("Your Time");

        classs_jLabel.setBackground(new java.awt.Color(51, 51, 51));
        classs_jLabel.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        classs_jLabel.setForeground(new java.awt.Color(255, 255, 255));
        classs_jLabel.setText("Your Class");

        jLabel9.setBackground(new java.awt.Color(51, 51, 51));
        jLabel9.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Class");

        jLabel10.setBackground(new java.awt.Color(51, 51, 51));
        jLabel10.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Seats");

        seats_jLabel.setBackground(new java.awt.Color(51, 51, 51));
        seats_jLabel.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        seats_jLabel.setForeground(new java.awt.Color(255, 255, 255));
        seats_jLabel.setText("Your Seats");

        jLabel11.setBackground(new java.awt.Color(51, 51, 51));
        jLabel11.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Price (BDT)");

        price_jLabel.setBackground(new java.awt.Color(51, 51, 51));
        price_jLabel.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        price_jLabel.setForeground(new java.awt.Color(255, 255, 255));
        price_jLabel.setText("Your Price");

        print_jButton.setBackground(new java.awt.Color(51, 255, 0));
        print_jButton.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        print_jButton.setForeground(new java.awt.Color(51, 51, 51));
        print_jButton.setText("Print");
        print_jButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                print_jButtonActionPerformed(evt);
            }
        });

        jLabel12.setBackground(new java.awt.Color(51, 51, 51));
        jLabel12.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Train Name");

        train_jLabel.setBackground(new java.awt.Color(51, 51, 51));
        train_jLabel.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        train_jLabel.setForeground(new java.awt.Color(255, 255, 255));
        train_jLabel.setText("Train");

        javax.swing.GroupLayout dashboard_panelLayout = new javax.swing.GroupLayout(dashboard_panel);
        dashboard_panel.setLayout(dashboard_panelLayout);
        dashboard_panelLayout.setHorizontalGroup(
            dashboard_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dashboard_panelLayout.createSequentialGroup()
                .addGap(104, 104, 104)
                .addGroup(dashboard_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, dashboard_panelLayout.createSequentialGroup()
                        .addGroup(dashboard_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(dashboard_panelLayout.createSequentialGroup()
                        .addGap(0, 6, Short.MAX_VALUE)
                        .addGroup(dashboard_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, dashboard_panelLayout.createSequentialGroup()
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(112, 112, 112))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, dashboard_panelLayout.createSequentialGroup()
                                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(110, 110, 110)))
                        .addGroup(dashboard_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(dashboard_panelLayout.createSequentialGroup()
                                .addGroup(dashboard_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(classs_jLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(time_jLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(48, 48, 48))
                            .addGroup(dashboard_panelLayout.createSequentialGroup()
                                .addComponent(price_jLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(74, 74, 74))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, dashboard_panelLayout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addGroup(dashboard_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(date_jLabel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(destination_jLabel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(startingFrom_jLabel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(passengerNum_jLabel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(train_jLabel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(seats_jLabel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(name_jLabel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(20, 20, 20))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, dashboard_panelLayout.createSequentialGroup()
                        .addGroup(dashboard_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel12, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, dashboard_panelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(131, 131, 131))
            .addGroup(dashboard_panelLayout.createSequentialGroup()
                .addGap(230, 230, 230)
                .addComponent(print_jButton, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        dashboard_panelLayout.setVerticalGroup(
            dashboard_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dashboard_panelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(dashboard_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(name_jLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(dashboard_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(date_jLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(dashboard_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(startingFrom_jLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(dashboard_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(destination_jLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5)
                .addGroup(dashboard_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(train_jLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(dashboard_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(passengerNum_jLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(dashboard_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(seats_jLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(dashboard_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(time_jLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(dashboard_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(classs_jLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(dashboard_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(price_jLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(print_jButton, javax.swing.GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE)
                .addContainerGap())
        );

        profile_jPanel.setBackground(new java.awt.Color(51, 51, 51));

        user_jLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        user_jLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/profileUser.png"))); // NOI18N

        jLabel26.setBackground(new java.awt.Color(51, 51, 51));
        jLabel26.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(255, 255, 255));
        jLabel26.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel26.setText("Username");

        profile_Username_jLabel.setBackground(new java.awt.Color(51, 51, 51));
        profile_Username_jLabel.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        profile_Username_jLabel.setForeground(new java.awt.Color(255, 255, 255));
        profile_Username_jLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        profile_Username_jLabel.setText("Your username");

        jLabel28.setBackground(new java.awt.Color(51, 51, 51));
        jLabel28.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(255, 255, 255));
        jLabel28.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel28.setText("Password");

        profile_Password_jLabel.setBackground(new java.awt.Color(51, 51, 51));
        profile_Password_jLabel.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        profile_Password_jLabel.setForeground(new java.awt.Color(255, 255, 255));
        profile_Password_jLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        profile_Password_jLabel.setText("Your username");

        javax.swing.GroupLayout profile_jPanelLayout = new javax.swing.GroupLayout(profile_jPanel);
        profile_jPanel.setLayout(profile_jPanelLayout);
        profile_jPanelLayout.setHorizontalGroup(
            profile_jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, profile_jPanelLayout.createSequentialGroup()
                .addContainerGap(131, Short.MAX_VALUE)
                .addComponent(user_jLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 313, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(131, 131, 131))
            .addGroup(profile_jPanelLayout.createSequentialGroup()
                .addGap(68, 68, 68)
                .addGroup(profile_jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel28, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 99, Short.MAX_VALUE)
                .addGroup(profile_jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(profile_Username_jLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(profile_Password_jLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(65, 65, 65))
        );
        profile_jPanelLayout.setVerticalGroup(
            profile_jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(profile_jPanelLayout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(user_jLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 455, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(profile_jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel26, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(profile_Username_jLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(profile_jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel28, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(profile_Password_jLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(84, 84, 84))
        );

        payment_jPanel.setBackground(new java.awt.Color(51, 51, 51));
        payment_jPanel.setForeground(new java.awt.Color(255, 255, 255));

        jLabel24.setBackground(new java.awt.Color(51, 51, 51));
        jLabel24.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(255, 255, 255));
        jLabel24.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel24.setText("Total Cost");

        payment_total_Cost_jLabel.setBackground(new java.awt.Color(51, 51, 51));
        payment_total_Cost_jLabel.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        payment_total_Cost_jLabel.setForeground(new java.awt.Color(255, 255, 255));
        payment_total_Cost_jLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        payment_total_Cost_jLabel.setText("Your Cost");

        jLabel25.setBackground(new java.awt.Color(51, 51, 51));
        jLabel25.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(255, 255, 255));
        jLabel25.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel25.setText("Payment Method");

        payment_jComboBox.setBackground(new java.awt.Color(51, 51, 51));
        payment_jComboBox.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        payment_jComboBox.setForeground(new java.awt.Color(255, 255, 255));
        payment_jComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Bkash", "Nogod", "Upay", "Credit Card", "Debit Card", "Visa Card", "Bank Transfer", "Cash on Arrival" }));
        payment_jComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                payment_jComboBoxActionPerformed(evt);
            }
        });

        confirm_Payment_jButton.setBackground(new java.awt.Color(51, 255, 0));
        confirm_Payment_jButton.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        confirm_Payment_jButton.setForeground(new java.awt.Color(0, 0, 0));
        confirm_Payment_jButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/pay.png"))); // NOI18N
        confirm_Payment_jButton.setText("Pay");
        confirm_Payment_jButton.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        confirm_Payment_jButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirm_Payment_jButtonActionPerformed(evt);
            }
        });

        safeJourney_jLabel.setBackground(new java.awt.Color(0, 0, 0));
        safeJourney_jLabel.setFont(new java.awt.Font("Segoe UI Black", 1, 36)); // NOI18N
        safeJourney_jLabel.setForeground(new java.awt.Color(255, 255, 255));
        safeJourney_jLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        safeJourney_jLabel.setText("HAVE A SAFE JOURNEY");

        javax.swing.GroupLayout payment_jPanelLayout = new javax.swing.GroupLayout(payment_jPanel);
        payment_jPanel.setLayout(payment_jPanelLayout);
        payment_jPanelLayout.setHorizontalGroup(
            payment_jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(payment_jPanelLayout.createSequentialGroup()
                .addGroup(payment_jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(payment_jPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(safeJourney_jLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(payment_jPanelLayout.createSequentialGroup()
                        .addGap(71, 71, 71)
                        .addGroup(payment_jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(payment_jPanelLayout.createSequentialGroup()
                                .addGap(133, 133, 133)
                                .addComponent(confirm_Payment_jButton, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(payment_jPanelLayout.createSequentialGroup()
                                .addGroup(payment_jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(payment_jPanelLayout.createSequentialGroup()
                                        .addGap(42, 42, 42)
                                        .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(70, 70, 70)
                                .addGroup(payment_jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(payment_jComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(payment_total_Cost_jLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 93, Short.MAX_VALUE)))
                .addContainerGap())
        );
        payment_jPanelLayout.setVerticalGroup(
            payment_jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, payment_jPanelLayout.createSequentialGroup()
                .addGap(185, 185, 185)
                .addGroup(payment_jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(payment_total_Cost_jLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel24, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(payment_jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(payment_jComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(44, 44, 44)
                .addComponent(confirm_Payment_jButton, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 233, Short.MAX_VALUE)
                .addComponent(safeJourney_jLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22))
        );

        javax.swing.GroupLayout background_jPanelLayout = new javax.swing.GroupLayout(background_jPanel);
        background_jPanel.setLayout(background_jPanelLayout);
        background_jPanelLayout.setHorizontalGroup(
            background_jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(background_jPanelLayout.createSequentialGroup()
                .addComponent(left_jPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(dashboard_panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(background_jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, background_jPanelLayout.createSequentialGroup()
                    .addGap(280, 280, 280)
                    .addComponent(book_a_Ticket_jPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
            .addGroup(background_jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, background_jPanelLayout.createSequentialGroup()
                    .addGap(0, 281, Short.MAX_VALUE)
                    .addComponent(book_a_Ticket_2_jPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addGroup(background_jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, background_jPanelLayout.createSequentialGroup()
                    .addGap(0, 285, Short.MAX_VALUE)
                    .addComponent(payment_jPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addGroup(background_jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, background_jPanelLayout.createSequentialGroup()
                    .addGap(0, 278, Short.MAX_VALUE)
                    .addComponent(profile_jPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        background_jPanelLayout.setVerticalGroup(
            background_jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(left_jPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(dashboard_panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(background_jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(background_jPanelLayout.createSequentialGroup()
                    .addComponent(book_a_Ticket_jPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
            .addGroup(background_jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(book_a_Ticket_2_jPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(background_jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(payment_jPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(background_jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(profile_jPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background_jPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background_jPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void profile_jButtonFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_profile_jButtonFocusGained
        // TODO add your handling code here:
        profile_jButton.setBackground(new Color(COLOR_R, COLOR_G, COLOR_B));
    }//GEN-LAST:event_profile_jButtonFocusGained

    private void profile_jButtonFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_profile_jButtonFocusLost
        // TODO add your handling code here:
        profile_jButton.setBackground(new Color(102, 102, 102));
    }//GEN-LAST:event_profile_jButtonFocusLost

    private void dashBoard_jButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dashBoard_jButtonActionPerformed
        // TODO add your handling code here:
        book_a_Ticket_jPanel.setVisible(false);
        book_a_Ticket_2_jPanel.setVisible(false);
        payment_jPanel.setVisible(false);
        dashboard_panel.setVisible(true);
    }//GEN-LAST:event_dashBoard_jButtonActionPerformed

    private void dashBoard_jButtonFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_dashBoard_jButtonFocusLost
        // TODO add your handling code here:
        dashBoard_jButton.setBackground(new Color(102, 102, 102));
    }//GEN-LAST:event_dashBoard_jButtonFocusLost

    private void dashBoard_jButtonFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_dashBoard_jButtonFocusGained
        // TODO add your handling code here:
        dashBoard_jButton.setBackground(new Color(COLOR_R, COLOR_G, COLOR_B));
        //dashBoard_jButton.setForeground(Color.BLACK);
    }//GEN-LAST:event_dashBoard_jButtonFocusGained

    private void payment_jButtonFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_payment_jButtonFocusLost
        // TODO add your handling code here:
        payment_jButton.setBackground(new Color(102, 102, 102));
    }//GEN-LAST:event_payment_jButtonFocusLost

    private void payment_jButtonFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_payment_jButtonFocusGained
        // TODO add your handling code here:
        payment_jButton.setBackground(new Color(COLOR_R, COLOR_G, COLOR_B));
    }//GEN-LAST:event_payment_jButtonFocusGained

    private void bookATicket_jButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bookATicket_jButtonActionPerformed
        // TODO add your handling code here:
        dashboard_panel.setVisible(false);
        book_a_Ticket_jPanel.setVisible(true);
        book_a_Ticket_2_jPanel.setVisible(false);
        payment_jPanel.setVisible(false);
    }//GEN-LAST:event_bookATicket_jButtonActionPerformed

    private void bookATicket_jButtonFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_bookATicket_jButtonFocusLost
        // TODO add your handling code here:
        bookATicket_jButton.setBackground(new Color(102, 102, 102));
    }//GEN-LAST:event_bookATicket_jButtonFocusLost

    private void bookATicket_jButtonFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_bookATicket_jButtonFocusGained
        // TODO add your handling code here:
        bookATicket_jButton.setBackground(new Color(COLOR_R, COLOR_G, COLOR_B));
    }//GEN-LAST:event_bookATicket_jButtonFocusGained

    private void print_jButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_print_jButtonActionPerformed
        // TODO add your handling code here:

//***************************************** Fixing Time And Date ************************************
        LocalDate Ldate = LocalDate.now(); // Create a date object
        LocalTime Ltime = LocalTime.now();
        PRINT_TIME_DATE = "Issue Date = "+Ldate.getDayOfMonth()+"-"+Ldate.getMonth()+"-"+Ldate.getYear()+"\n"
                +"Issue Time = "+Ltime.getHour()+":"+Ltime.getMinute();
//******************************** Fixing All the info for ticket *************************************
        
        name = name_jLabel.getText();
        date = date_jLabel.getText();
        startPos = startingFrom_jLabel.getText();
        destination = destination_jLabel.getText();
        train = train_jLabel.getText();
        passenger = passengerNum_jLabel.getText();
        seats = seats_jLabel.getText();
        time = time_jLabel.getText();
        classs = classs_jLabel.getText();
        price = price_jLabel.getText();
        
        PRINT_LINE = newLine+newLine+GAP+"Name"+SECONDARY_GAP+"         "+name+newLine+GAP+"Travel Date"+SECONDARY_GAP+"  "+date+newLine
                +GAP+"Starting From"+SECONDARY_GAP+startPos+newLine+GAP+"Destination"+SECONDARY_GAP+"  "+destination+newLine
                +GAP+"Train Name"+SECONDARY_GAP+"   "+train+newLine+GAP+"Number of Passenger"+SECONDARY_GAP+passenger+newLine
                +GAP+"Seats"+SECONDARY_GAP+"        "+seats+newLine+GAP+"Travel Time"+SECONDARY_GAP+"  "+time+newLine
                +GAP+"Train Class"+SECONDARY_GAP+"  "+classs+newLine+GAP+"Cost"+SECONDARY_GAP+"         "+price+newLine
                +GAP+"AC/Non-AC"+SECONDARY_GAP+"    "+AC+newLine;
//******************************************* PRINTING ************************************************
        Utility util = new Utility();
        util.clearFile("travelInfo.txt");
        util.infoWriter(PRINT_TIME_DATE, "travelInfo.txt");
        util.infoWriter(PRINT_LINE, "travelInfo.txt");
         //System.out.println("Train name = "+util.getRandomTrain());
    }//GEN-LAST:event_print_jButtonActionPerformed

    private void date_jTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_date_jTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_date_jTextFieldActionPerformed

    private void passenger_jTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passenger_jTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passenger_jTextFieldActionPerformed

    private void time_jComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_time_jComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_time_jComboBoxActionPerformed

    private void name_jTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_name_jTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_name_jTextFieldActionPerformed

    private void ac_jCheckBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ac_jCheckBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ac_jCheckBoxActionPerformed

    private void payment_jButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_payment_jButtonActionPerformed
        // TODO add your handling code here:
        dashboard_panel.setVisible(false);
        book_a_Ticket_jPanel.setVisible(false);
        book_a_Ticket_2_jPanel.setVisible(false);
        payment_jPanel.setVisible(true);
    }//GEN-LAST:event_payment_jButtonActionPerformed

    private void profile_jButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_profile_jButtonActionPerformed
        // TODO add your handling code here:
        dashboard_panel.setVisible(false);
        book_a_Ticket_jPanel.setVisible(false);
        book_a_Ticket_2_jPanel.setVisible(false);
        payment_jPanel.setVisible(false);
        
        try {
            getUserInfo();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Dashboard.class.getName()).log(Level.SEVERE, null, ex);
        }
        profile_Username_jLabel.setText(UserInfo[0]);
        profile_Password_jLabel.setText(UserInfo[1]);
        
        
        if(UserInfo[0].contains("sudipta") && UserInfo[1].contains("sudipta112")){
            user_jLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/sudipta.jpg")));
        }else if(UserInfo[0].contains("admin") && UserInfo[1].contains("admin")){
            user_jLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/anik.jpg")));
        }else if(UserInfo[0].contains("developer") && UserInfo[1].contains("devs")){
            user_jLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/sudipta.jpg")));
        }else{
            user_jLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/profileUser.png")));
        }
    }//GEN-LAST:event_profile_jButtonActionPerformed

    private void next_jButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_next_jButtonActionPerformed
        // TODO add your handling code here:
        dashboard_panel.setVisible(false);
        book_a_Ticket_jPanel.setVisible(false);
        book_a_Ticket_jPanel.setVisible(false);
        book_a_Ticket_2_jPanel.setVisible(true);
        
        passenger = passenger_jTextField.getText();
        setMembers();
        System.out.println("Members = "+members);
        passengerNum_jLabel.setText(Integer.toString(members));
        
        
        String passenger_Name = name_jTextField.getText();
        name_jLabel.setText(passenger_Name);
        
        String date = date_jTextField.getText();
        date_jLabel.setText(date);
        
        String Staring_From = starting_jComboBox.getSelectedItem().toString();
        startingFrom_jLabel.setText(Staring_From);
        
        String End_Destination = destination_jComboBox.getSelectedItem().toString();
        destination_jLabel.setText(End_Destination);
        
        String timeTable = time_jComboBox.getSelectedItem().toString();
        time_jLabel.setText(timeTable);
        
        if(economic_jRadioButton.isSelected()){
            TRAIN_CLASS = "Economic Class";
        }else if(business_jRadioButton.isSelected()){
            TRAIN_CLASS = "Business Class";
        }else if(firstClass_jRadioButton.isSelected()){
            TRAIN_CLASS = "First Class";
        }
        classs_jLabel.setText(TRAIN_CLASS);
        System.out.println("Train Class = "+TRAIN_CLASS);
        
        train_jLabel.setText(TRAIN_NAME);
        
// ************************************* Price Calculations *******************************************
        
        if(ac_jCheckBox.isSelected()){
            AC = "AC";
            if(TRAIN_CLASS.contains("Economic Class")){
                T_Price = 250 + 1000;
            }else if(TRAIN_CLASS.contains("Business Class")){
                T_Price = 500 + 1000;
            }else{
                T_Price = 1000 + 1000;
            }
        }else{
            AC = "Non-AC";
            if(TRAIN_CLASS.contains("Economic Class")){
                T_Price = 250;
            }else if(TRAIN_CLASS.contains("Business Class")){
                T_Price = 500;
            }else{
                T_Price = 1000;
            }
        }
        setTOTAL_PRICE();
        System.out.println("total price = "+TOTAL_Price);
        price_jLabel.setText(String.valueOf(TOTAL_Price));
        payment_total_Cost_jLabel.setText(String.valueOf(TOTAL_Price));
        
//***************************************** Seat Number *********************************************

        if(HIGHLIGHT_CONTROLER < 1){
            System.out.println("Sending Seat number req");
            String[] seats = util.getSeatNumbers(members);
            String[] seat_highlighter = new String[members];
            for(int i=0;i<seats.length;i++){seat_highlighter[i] = seats[i].substring(1);}
            System.out.println("Got The seat numbers\n");
            //for(int i=0;i<members;i++){System.out.println(seats[i]);} //Printing
            StringBuffer sb = new StringBuffer();
            for(int i = 0; i < seats.length; i++) {sb.append(seats[i]+"  ");}// converting Array to String
            SEAT_NUMBERS = sb.toString();
            seat_Numbers_jLabel.setText(SEAT_NUMBERS);
            bogiName_jLabel.setText(util.COACH_NO);
            seats_jLabel.setText(SEAT_NUMBERS);
    // **************************************** Seat Highlighter ******************************************
            System.out.println("Req for highlighter Numbers");
            int[] seatHiglighterNumber = util.getSeatHilghlighterNumber(seat_highlighter);
            System.out.println("Got the highlighter Numbers");

            for(int i=0;i<seatHiglighterNumber.length;i++){
                System.out.println("Switch case Strating");
                switch(seatHiglighterNumber[i]){
                    case 1: {one_jLabel.setOpaque(true);one_jLabel.setBackground(Color.GREEN);break;}
                    case 2: {two_jLabel.setOpaque(true);two_jLabel.setBackground(Color.GREEN);break;}
                    case 3: {three_jLabel.setOpaque(true);three_jLabel.setBackground(Color.GREEN);break;}
                    case 4: {four_jLabel.setOpaque(true);four_jLabel.setBackground(Color.GREEN);break;}
                    case 5: {five_jLabel.setOpaque(true);five_jLabel.setBackground(Color.GREEN);break;}
                    case 6: {six_jLabel.setOpaque(true);six_jLabel.setBackground(Color.GREEN);break;}
                    case 7: {seven_jLabel.setOpaque(true);seven_jLabel.setBackground(Color.GREEN);break;}
                    case 8: {eight_jLabel.setOpaque(true);eight_jLabel.setBackground(Color.GREEN);break;}
                    case 9: {nine_jLabel.setOpaque(true);nine_jLabel.setBackground(Color.GREEN);break;}
                    case 10: {ten_jLabel.setOpaque(true);ten_jLabel.setBackground(Color.GREEN);break;}
                    case 11: {eleven_jLabel.setOpaque(true);eleven_jLabel.setBackground(Color.GREEN);break;}
                    case 12: {twelve_jLabel.setOpaque(true);twelve_jLabel.setBackground(Color.GREEN);break;}
                    case 13: {thirteen_jLabel.setOpaque(true);thirteen_jLabel.setBackground(Color.GREEN);break;}
                    case 14: {fourteen_jLabel.setOpaque(true);fourteen_jLabel.setBackground(Color.GREEN);break;}
                    case 15: {fifteen_jLabel.setOpaque(true);fifteen_jLabel.setBackground(Color.GREEN);break;}
                    case 16: {sixteen_jLabel.setOpaque(true);sixteen_jLabel.setBackground(Color.GREEN);break;}
                    case 17: {seventeen_jLabel.setOpaque(true);seventeen_jLabel.setBackground(Color.GREEN);break;}
                    case 18: {eightteen_jLabel.setOpaque(true);eightteen_jLabel.setBackground(Color.GREEN);break;}
                    case 19: {nineteen_jLabel.setOpaque(true);nineteen_jLabel.setBackground(Color.GREEN);break;}
                    case 20: {twenty_jLabel.setOpaque(true);twenty_jLabel.setBackground(Color.GREEN);break;}
                    case 21: {twentyone_jLabel.setOpaque(true);twentyone_jLabel.setBackground(Color.GREEN);break;}
                    case 22: {twentytwo_jLabel.setOpaque(true);twentytwo_jLabel.setBackground(Color.GREEN);break;}
                    case 23: {twentythree_jLabel.setOpaque(true);twentythree_jLabel.setBackground(Color.GREEN);break;}
                    case 24: {twentyfour_jLabel.setOpaque(true);twentyfour_jLabel.setBackground(Color.GREEN);break;}
                    case 25: {twentyfive_jLabel.setOpaque(true);twentyfive_jLabel.setBackground(Color.GREEN);break;}
                    case 26: {twentysix_jLabel.setOpaque(true);twentysix_jLabel.setBackground(Color.GREEN);break;}
                    case 27: {twentyseven_jLabel.setOpaque(true);twentyseven_jLabel.setBackground(Color.GREEN);break;}
                    case 28: {twentyeight_jLabel.setOpaque(true);twentyeight_jLabel.setBackground(Color.GREEN);break;}
                    case 29: {twentynine_jLabel.setOpaque(true);twentynine_jLabel.setBackground(Color.GREEN);break;}
                    case 30: {thirty_jLabel.setOpaque(true);thirty_jLabel.setBackground(Color.GREEN);break;}
                    case 31: {thirtyone_jLabel.setOpaque(true);thirtyone_jLabel.setBackground(Color.GREEN);break;}
                    case 32: {thirtytwo_jLabel.setOpaque(true);thirtytwo_jLabel.setBackground(Color.GREEN);break;}
                    case 33: {thirtythree_jLabel.setOpaque(true);thirtythree_jLabel.setBackground(Color.GREEN);break;}
                    case 34: {thirtyfour_jLabel.setOpaque(true);thirtyfour_jLabel.setBackground(Color.GREEN);break;}
                    case 35: {thirtyfive_jLabel.setOpaque(true);thirtyfive_jLabel.setBackground(Color.GREEN);break;}
                    case 36: {thirtysix_jLabel.setOpaque(true);thirtysix_jLabel.setBackground(Color.GREEN);break;}
                    case 37: {thirtyseven_jLabel.setOpaque(true);thirtyseven_jLabel.setBackground(Color.GREEN);break;}
                    case 38: {thirtyeight_jLabel.setOpaque(true);thirtyeight_jLabel.setBackground(Color.GREEN);break;}
                    case 39: {thirtynine_jLabel.setOpaque(true);thirtynine_jLabel.setBackground(Color.GREEN);break;}
                    case 40: {forty_jLabel.setOpaque(true);forty_jLabel.setBackground(Color.GREEN);break;}
                    case 41: {fortyone_jLabel.setOpaque(true);fortyone_jLabel.setBackground(Color.GREEN);break;}
                    case 42: {fortytwo_jLabel.setOpaque(true);fortytwo_jLabel.setBackground(Color.GREEN);break;}
                    case 43: {fortythree_jLabel.setOpaque(true);fortythree_jLabel.setBackground(Color.GREEN);break;}
                    case 44: {fortyfour_jLabel.setOpaque(true);fortyfour_jLabel.setBackground(Color.GREEN);break;}
                    case 45: {fortyfive_jLabel.setOpaque(true);fortyfive_jLabel.setBackground(Color.GREEN);break;}
                    case 46: {fortysix_jLabel.setOpaque(true);fortysix_jLabel.setBackground(Color.GREEN);break;}
                    case 47: {fortyseven_jLabel.setOpaque(true);fortyseven_jLabel.setBackground(Color.GREEN);break;}
                    case 48: {fortyeight_jLabel.setOpaque(true);fortyeight_jLabel.setBackground(Color.GREEN);break;}
                    default:{}
                }
            }
            HIGHLIGHT_CONTROLER++;
        }


    }//GEN-LAST:event_next_jButtonActionPerformed

    private void back_jButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_back_jButtonActionPerformed
        // TODO add your handling code here:
        dashboard_panel.setVisible(false);
        book_a_Ticket_jPanel.setVisible(false);
        book_a_Ticket_jPanel.setVisible(true);
        book_a_Ticket_2_jPanel.setVisible(false);
    }//GEN-LAST:event_back_jButtonActionPerformed

    private void destination_jComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_destination_jComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_destination_jComboBoxActionPerformed

    private void economic_jRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_economic_jRadioButtonActionPerformed
        // TODO add your handling code here:
        nextButtonEnabled();
        T_Price = 250;
    }//GEN-LAST:event_economic_jRadioButtonActionPerformed

    private void business_jRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_business_jRadioButtonActionPerformed
        // TODO add your handling code here:
        nextButtonEnabled();
        T_Price = 500;
    }//GEN-LAST:event_business_jRadioButtonActionPerformed

    private void firstClass_jRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_firstClass_jRadioButtonActionPerformed
        // TODO add your handling code here:
        nextButtonEnabled();
        T_Price = 1000;
    }//GEN-LAST:event_firstClass_jRadioButtonActionPerformed

    private void payment_jComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_payment_jComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_payment_jComboBoxActionPerformed

    private void confirm_Payment_jButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirm_Payment_jButtonActionPerformed
        // TODO add your handling code here:
        
        String payment_Option = payment_jComboBox.getSelectedItem().toString();
        BankTrasferInputBox(payment_Option);
        safeJourney_jLabel.setVisible(true);
    }//GEN-LAST:event_confirm_Payment_jButtonActionPerformed

    
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Dashboard().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox ac_jCheckBox;
    private javax.swing.JButton back_jButton;
    private javax.swing.JPanel background_jPanel;
    private javax.swing.JLabel bogiName_jLabel;
    private javax.swing.JButton bookATicket_jButton;
    private javax.swing.JPanel book_a_Ticket_2_jPanel;
    private javax.swing.JPanel book_a_Ticket_jPanel;
    private javax.swing.JRadioButton business_jRadioButton;
    private javax.swing.ButtonGroup class_buttonGroup;
    private javax.swing.JLabel classs_jLabel;
    private javax.swing.JButton confirm_Payment_jButton;
    private javax.swing.JPanel couch_jPanel;
    private javax.swing.JButton dashBoard_jButton;
    private javax.swing.JPanel dashboard_panel;
    private javax.swing.JLabel date_jLabel;
    private javax.swing.JTextField date_jTextField;
    private javax.swing.JComboBox<String> destination_jComboBox;
    private javax.swing.JLabel destination_jLabel;
    private javax.swing.JRadioButton economic_jRadioButton;
    private javax.swing.JLabel eight_jLabel;
    private javax.swing.JLabel eightteen_jLabel;
    private javax.swing.JLabel eleven_jLabel;
    private javax.swing.JLabel fifteen_jLabel;
    private javax.swing.JRadioButton firstClass_jRadioButton;
    private javax.swing.JLabel five_jLabel;
    private javax.swing.JLabel forty_jLabel;
    private javax.swing.JLabel fortyeight_jLabel;
    private javax.swing.JLabel fortyfive_jLabel;
    private javax.swing.JLabel fortyfour_jLabel;
    private javax.swing.JLabel fortyone_jLabel;
    private javax.swing.JLabel fortyseven_jLabel;
    private javax.swing.JLabel fortysix_jLabel;
    private javax.swing.JLabel fortythree_jLabel;
    private javax.swing.JLabel fortytwo_jLabel;
    private javax.swing.JLabel four_jLabel;
    private javax.swing.JLabel fourteen_jLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel left_jPanel;
    private javax.swing.JLabel name_jLabel;
    private javax.swing.JTextField name_jTextField;
    private javax.swing.JButton next_jButton;
    private javax.swing.JLabel nine_jLabel;
    private javax.swing.JLabel nineteen_jLabel;
    private javax.swing.JLabel one_jLabel;
    private javax.swing.JLabel passengerNum_jLabel;
    private javax.swing.JTextField passenger_jTextField;
    private javax.swing.JButton payment_jButton;
    private javax.swing.JComboBox<String> payment_jComboBox;
    private javax.swing.JPanel payment_jPanel;
    private javax.swing.JLabel payment_total_Cost_jLabel;
    private javax.swing.JLabel price_jLabel;
    private javax.swing.JButton print_jButton;
    private javax.swing.JLabel profile_Password_jLabel;
    private javax.swing.JLabel profile_Username_jLabel;
    private javax.swing.JButton profile_jButton;
    private javax.swing.JPanel profile_jPanel;
    private javax.swing.JLabel safeJourney_jLabel;
    private javax.swing.JLabel seat_Numbers_jLabel;
    private javax.swing.JLabel seats_jLabel;
    private javax.swing.JLabel seven_jLabel;
    private javax.swing.JLabel seventeen_jLabel;
    private javax.swing.JLabel six_jLabel;
    private javax.swing.JLabel sixteen_jLabel;
    private javax.swing.JLabel startingFrom_jLabel;
    private javax.swing.JComboBox<String> starting_jComboBox;
    private javax.swing.JLabel ten_jLabel;
    private javax.swing.JLabel thirteen_jLabel;
    private javax.swing.JLabel thirty_jLabel;
    private javax.swing.JLabel thirtyeight_jLabel;
    private javax.swing.JLabel thirtyfive_jLabel;
    private javax.swing.JLabel thirtyfour_jLabel;
    private javax.swing.JLabel thirtynine_jLabel;
    private javax.swing.JLabel thirtyone_jLabel;
    private javax.swing.JLabel thirtyseven_jLabel;
    private javax.swing.JLabel thirtysix_jLabel;
    private javax.swing.JLabel thirtythree_jLabel;
    private javax.swing.JLabel thirtytwo_jLabel;
    private javax.swing.JLabel three_jLabel;
    private javax.swing.JComboBox<String> time_jComboBox;
    private javax.swing.JLabel time_jLabel;
    private javax.swing.JLabel train_Name_jLabel;
    private javax.swing.JLabel train_jLabel;
    private javax.swing.JLabel twelve_jLabel;
    private javax.swing.JLabel twenty_jLabel;
    private javax.swing.JLabel twentyeight_jLabel;
    private javax.swing.JLabel twentyfive_jLabel;
    private javax.swing.JLabel twentyfour_jLabel;
    private javax.swing.JLabel twentynine_jLabel;
    private javax.swing.JLabel twentyone_jLabel;
    private javax.swing.JLabel twentyseven_jLabel;
    private javax.swing.JLabel twentysix_jLabel;
    private javax.swing.JLabel twentythree_jLabel;
    private javax.swing.JLabel twentytwo_jLabel;
    private javax.swing.JLabel two_jLabel;
    private javax.swing.JLabel user_jLabel;
    private javax.swing.JLabel username_jLabel;
    // End of variables declaration//GEN-END:variables
}
