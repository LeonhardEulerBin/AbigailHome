import java.time.*;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import javax.swing.ImageIcon;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.io.*;

import java.util.Scanner;
import java.io.IOException;
import java.io.File;
public class Stardew extends JFrame
{
//==================================================================
// import all da images
//==================================================================
    // bottom layer
    ImageIcon food = new ImageIcon("quartz.png");
    ImageIcon firstosp = new ImageIcon("springback.png");
    ImageIcon firstosu = new ImageIcon("summerback.png");
    ImageIcon firstofa = new ImageIcon("fallback.png");
    ImageIcon firstowii = new ImageIcon("winterback.png");
    // clocko layer
    ImageIcon ducko = new ImageIcon("Clocker.png");
    ImageIcon sun = new ImageIcon("sun.png");
    ImageIcon seasthemspr = new ImageIcon("spring.png");
    ImageIcon seasthemsum = new ImageIcon("summer.png");
    ImageIcon seasthemfaa = new ImageIcon("fall.png");
    ImageIcon seasthemnugin = new ImageIcon("winter.png");
    ImageIcon hearty = new ImageIcon("frined.png");
    ImageIcon ticker = new ImageIcon("sched.png");
    ImageIcon cal = new ImageIcon("datum.png");
    ImageIcon wow = new ImageIcon("questo.png");

    // quest laayer
    ImageIcon thirsty = new ImageIcon("Hofbuch.png");
    ImageIcon basket = new ImageIcon("qu.png");
    // caladnre layre
    ImageIcon cal0 = new ImageIcon("calcium0.png");
    ImageIcon cal1 = new ImageIcon("calcium1.png");
    ImageIcon cal2 = new ImageIcon("calcium2.png");
    ImageIcon cal3 = new ImageIcon("calcium3.png");
    ImageIcon cal4 = new ImageIcon("calcium4.png");
    ImageIcon cal5 = new ImageIcon("calcium5.png");
    ImageIcon cal6 = new ImageIcon("calcium6.png");
    // frined layer
    ImageIcon pentiofeesh = new ImageIcon("toggers.png");
    ImageIcon mark = new ImageIcon("mark.png");
    ImageIcon marknt = new ImageIcon("marknt.png");
    ImageIcon hearto0 = new ImageIcon("hearto0.png");
    ImageIcon hearto1 = new ImageIcon("hearto1.png");
    ImageIcon hearto2 = new ImageIcon("hearto2.png");
    ImageIcon hearto3 = new ImageIcon("hearto3.png");
    ImageIcon hearto4 = new ImageIcon("hearto4.png");
    ImageIcon hearto5 = new ImageIcon("hearto5.png");
    ImageIcon hearto6 = new ImageIcon("hearto6.png");
    ImageIcon hearto7 = new ImageIcon("hearto7.png");
    ImageIcon hearto8 = new ImageIcon("hearto8.png");
    ImageIcon hearto9 = new ImageIcon("hearto9.png");
    ImageIcon hearto10 = new ImageIcon("hearto10.png");
    public ImageIcon montegue;
    // schadule layer
    ImageIcon hex = new ImageIcon("slaveretta.png");
    ImageIcon scoo = new ImageIcon("paker.png");
    ImageIcon mightwork = new ImageIcon("hateraku.png");
    ImageIcon emile = new ImageIcon("pasttenseessen.png");
    ImageIcon leetboi = new ImageIcon("control.png");
    ImageIcon gemer = new ImageIcon("snacc.png");
    ImageIcon alphacentauri = new ImageIcon("hourlyspecial.png");
    ImageIcon zedzedzed = new ImageIcon("zedan.png");
    ImageIcon eraserhead = new ImageIcon("kingucrimson.png");
    ImageIcon pimpleszero = new ImageIcon("freizeit.png");
    
    
    // x
    ImageIcon thespot = new ImageIcon("exastley.png");

//==================================================================
// initilize all da vars
//==================================================================
    // Abigail Home Window
    public static final int WIDTH = 1380;
    public static final int HEIGHT = 806;
    // date and time
    public static LocalDateTime timefather = LocalDateTime.now();
    public static int month=timefather.getMonthValue();
    public static int day=timefather.getDayOfMonth();
    public static DayOfWeek dipe = DayOfWeek.from(timefather);
    public static String calmonth= ("" + timefather.getMonth());
    public static long tipperdo=System.currentTimeMillis();
    public static String timmy = ((((tipperdo)/1000)/60/60-5)%24 + ":" + ((tipperdo)/1000)/60%60 + ":" + ((tipperdo)/1000)%60);
    public static String datboi = ("      " + dipe.name() + " " + month + "/" + day);
    public static int weekindex= dayofweekindex(dipe.name());
    public static int weekstart= weekindex - day%7 + 1;

        // edit v dat value
    public static String chacha;
    // quest menu vars
    public static String blackberry;
    public static String blueberry;
    public static String strawberry;
    public static String elderberry;
    public static String salmonberry;
    public static String sweetgemberry;
    // calander menu vars

    // schedule menu vars
    public static int schedtypesetter = 0;
    public static int[][] schedmenudata = {
        {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 5, 1, 3, 1, 1, 0, 1, 1, 5, 0, 0, 0, 0},
        {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 5, 1, 1, 5, 0, 0, 0, 0},
        {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 5, 1, 3, 1, 1, 0, 1, 1, 5, 0, 0, 0, 0},
        {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 5, 1, 1, 5, 0, 0, 0, 0},
        {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 5, 1, 5, 0, 2, 2, 2, 2, 2, 2, 2, 2, 4},
        {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 5, 2, 2, 2, 2, 2, 2, 2, 2, 5},
        {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 6, 6, 5, 2, 2, 2, 2, 2, 2, 2, 2, 5, 0, 0},
    };
    // frined menu vars
    public static int[][] frinedmenudata = {
        {10, 0, 0, 0},
        {8, 1, 0, 0},
        {8, 1, 1, 0},
        {6, 1, 1, 0},
        {2, 1, 1, 1},
    };
    // management vars and such

//==================================================================
// initilize all da butts and labs
//==================================================================
    // main butts and labs
    JLabel backerst;
    JLabel clockyboi;
    JLabel dayo;
    JLabel tim;
    JLabel seas;
    JLabel wateriswet;
    JLabel cashola;
    JButton questo;
    JButton datum;
    JButton sched;
    JButton frined;
    JLabel frinedzone;
    JLabel schedzone;
    JLabel datumzone;
    JLabel questozone;
    JButton exegol;
    // quest menu butts and labs
    JLabel blackberrybasket;
    JLabel blueberrybasket;
    JLabel strawberrybasket;
    JLabel elderberrybasket;
    JLabel salmonberrybasket;
    JLabel sweetgemberrybasket;
    // calandas menu lab
    JLabel monthlol;
    // scheds menu butts
    JButton scoobutt;
    JButton mightworkbutt;
    JButton emilebutt;
    JButton leetboibutt;
    JButton gemerbutt;
    JButton alphacentauributt;
    JButton zedzedzedbutt;
    JButton eraserheadbutt;
    
    JButton Mon0butt;
    JButton Mon1butt;
    JButton Mon2butt;
    JButton Mon3butt;
    JButton Mon4butt;
    JButton Mon5butt;
    JButton Mon6butt;
    JButton Mon7butt;
    JButton Mon8butt;
    JButton Mon9butt;
    JButton Mon10butt;
    JButton Mon11butt;
    JButton Mon12butt;
    JButton Mon13butt;
    JButton Mon14butt;
    JButton Mon15butt;
    JButton Mon16butt;
    JButton Mon17butt;
    JButton Mon18butt;
    JButton Mon19butt;
    JButton Mon20butt;
    JButton Mon21butt;
    JButton Mon22butt;
    JButton Mon23butt;

    JButton Tue0butt;
    JButton Tue1butt;
    JButton Tue2butt;
    JButton Tue3butt;
    JButton Tue4butt;
    JButton Tue5butt;
    JButton Tue6butt;
    JButton Tue7butt;
    JButton Tue8butt;
    JButton Tue9butt;
    JButton Tue10butt;
    JButton Tue11butt;
    JButton Tue12butt;
    JButton Tue13butt;
    JButton Tue14butt;
    JButton Tue15butt;
    JButton Tue16butt;
    JButton Tue17butt;
    JButton Tue18butt;
    JButton Tue19butt;
    JButton Tue20butt;
    JButton Tue21butt;
    JButton Tue22butt;
    JButton Tue23butt;

    JButton Wed0butt;
    JButton Wed1butt;
    JButton Wed2butt;
    JButton Wed3butt;
    JButton Wed4butt;
    JButton Wed5butt;
    JButton Wed6butt;
    JButton Wed7butt;
    JButton Wed8butt;
    JButton Wed9butt;
    JButton Wed10butt;
    JButton Wed11butt;
    JButton Wed12butt;
    JButton Wed13butt;
    JButton Wed14butt;
    JButton Wed15butt;
    JButton Wed16butt;
    JButton Wed17butt;
    JButton Wed18butt;
    JButton Wed19butt;
    JButton Wed20butt;
    JButton Wed21butt;
    JButton Wed22butt;
    JButton Wed23butt;

    JButton Thu0butt;
    JButton Thu1butt;
    JButton Thu2butt;
    JButton Thu3butt;
    JButton Thu4butt;
    JButton Thu5butt;
    JButton Thu6butt;
    JButton Thu7butt;
    JButton Thu8butt;
    JButton Thu9butt;
    JButton Thu10butt;
    JButton Thu11butt;
    JButton Thu12butt;
    JButton Thu13butt;
    JButton Thu14butt;
    JButton Thu15butt;
    JButton Thu16butt;
    JButton Thu17butt;
    JButton Thu18butt;
    JButton Thu19butt;
    JButton Thu20butt;
    JButton Thu21butt;
    JButton Thu22butt;
    JButton Thu23butt;

    JButton Fri0butt;
    JButton Fri1butt;
    JButton Fri2butt;
    JButton Fri3butt;
    JButton Fri4butt;
    JButton Fri5butt;
    JButton Fri6butt;
    JButton Fri7butt;
    JButton Fri8butt;
    JButton Fri9butt;
    JButton Fri10butt;
    JButton Fri11butt;
    JButton Fri12butt;
    JButton Fri13butt;
    JButton Fri14butt;
    JButton Fri15butt;
    JButton Fri16butt;
    JButton Fri17butt;
    JButton Fri18butt;
    JButton Fri19butt;
    JButton Fri20butt;
    JButton Fri21butt;
    JButton Fri22butt;
    JButton Fri23butt;

    JButton Sat0butt;
    JButton Sat1butt;
    JButton Sat2butt;
    JButton Sat3butt;
    JButton Sat4butt;
    JButton Sat5butt;
    JButton Sat6butt;
    JButton Sat7butt;
    JButton Sat8butt;
    JButton Sat9butt;
    JButton Sat10butt;
    JButton Sat11butt;
    JButton Sat12butt;
    JButton Sat13butt;
    JButton Sat14butt;
    JButton Sat15butt;
    JButton Sat16butt;
    JButton Sat17butt;
    JButton Sat18butt;
    JButton Sat19butt;
    JButton Sat20butt;
    JButton Sat21butt;
    JButton Sat22butt;
    JButton Sat23butt;

    JButton Sun0butt;
    JButton Sun1butt;
    JButton Sun2butt;
    JButton Sun3butt;
    JButton Sun4butt;
    JButton Sun5butt;
    JButton Sun6butt;
    JButton Sun7butt;
    JButton Sun8butt;
    JButton Sun9butt;
    JButton Sun10butt;
    JButton Sun11butt;
    JButton Sun12butt;
    JButton Sun13butt;
    JButton Sun14butt;
    JButton Sun15butt;
    JButton Sun16butt;
    JButton Sun17butt;
    JButton Sun18butt;
    JButton Sun19butt;
    JButton Sun20butt;
    JButton Sun21butt;
    JButton Sun22butt;
    JButton Sun23butt;

    // frined menu labs
    JButton Agift1mark;
    JButton Agift2mark;
    JButton Atalkmark;
    JButton Bgift1mark;
    JButton Bgift2mark;
    JButton Btalkmark;
    JButton Cgift1mark;
    JButton Cgift2mark;
    JButton Ctalkmark;
    JButton Dgift1mark;
    JButton Dgift2mark;
    JButton Dtalkmark;
    JButton Egift1mark;
    JButton Egift2mark;
    JButton Etalkmark;
    JButton Aheartbutt;
    JButton Bheartbutt;
    JButton Cheartbutt;
    JButton Dheartbutt;
    JButton Eheartbutt;
//==================================================================
// construct da weendow
//==================================================================
    public static void main(String[] args) throws IOException
    {
        Runtime.getRuntime().addShutdownHook(new Thread(() -> writeArrayToFile("madscientist.txt")));
        Scanner readiboi = new Scanner(new File("madscientist.txt"));
        String databoi = readiboi.nextLine();
        databoi = readiboi.nextLine();
        chacha = databoi;
        databoi = readiboi.nextLine();
        databoi = readiboi.nextLine();
        blackberry = databoi;
        databoi = readiboi.nextLine();
        blueberry = databoi;
        databoi = readiboi.nextLine();
        strawberry = databoi;
        databoi = readiboi.nextLine();
        elderberry = databoi;
        databoi = readiboi.nextLine();
        salmonberry = databoi;
        databoi = readiboi.nextLine();
        sweetgemberry = databoi;
        databoi = readiboi.nextLine();
        for (int exxiboi=0; exxiboi < 5; exxiboi++) {
            databoi = readiboi.nextLine();
            for (int whyboi=0; whyboi < 4; whyboi++) {
            int merryground = readiboi.nextInt();
            frinedmenudata[exxiboi][whyboi]=merryground;
            };
            readiboi.nextLine();
        };
        readiboi.nextLine();
        for (int exxiboi=0; exxiboi < 7; exxiboi++) {
            databoi = readiboi.nextLine();
            for (int whyboi=0; whyboi < 24; whyboi++) {
            int merryground = readiboi.nextInt();
            schedmenudata[exxiboi][whyboi]=merryground;
            };
            readiboi.nextLine();
        };
        readiboi.close();
        Stardew window = new Stardew();
        window.setVisible(true);
        if (weekstart<0){
            weekstart=weekstart+7;
        }
        while(WIDTH>=1){
            
            tipperdo=System.currentTimeMillis();
            timmy = ((((tipperdo)/1000)/60/60-5)%24 + ":" + ((tipperdo)/1000)/60%60 + ":" + ((tipperdo)/1000)%60);
            timefather = LocalDateTime.now();
            month=timefather.getMonthValue();
            day=timefather.getDayOfMonth();
            dipe = DayOfWeek.from(timefather);
            datboi = ("      " + dipe.name() + " " + month + "/" + day);
        }

        
    }
//==================================================================
// the meat
//==================================================================
    public Stardew()
    {
        //==================================================================
        // startup
        //==================================================================
        super("Abigail Home");
        setIconImage(food.getImage());
        setSize(WIDTH, HEIGHT);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        Font Fontonio = new Font("Arial", Font.BOLD, 24);
        Font Fontonola = new Font("Arial", Font.PLAIN, 28);
        Font Fonchesca = new Font("Arial", Font.BOLD, 12);
        Font Quesadilla = new Font("Arial", Font.PLAIN, 32);
        //==================================================================
        // define ints if applicable (hint: they weren't)
        //==================================================================
        
        //==================================================================
        // define butts and labs bot to top
        //==================================================================
        // background and clock labs =========================================
        backerst=new JLabel(seasondeterminer(month));

        clockyboi=new JLabel(ducko);

        dayo=new JLabel(datboi);
        dayo.setFont(Fonchesca);

        tim=new JLabel(timmy);
        tim.setFont(Fontonio);

        seas=new JLabel(seasonicondeterminer(month));

        wateriswet=new JLabel(sun);

        cashola=new JLabel(chacha);
        cashola.setFont(Fontonola);

        // menu buttons =========================================
        questo = new JButton(wow);
        datum = new JButton(cal);
        sched = new JButton(ticker);
        frined = new JButton(hearty);

        frinedzone=new JLabel(pentiofeesh);
        schedzone=new JLabel(hex);
        datumzone=new JLabel(calpicker(weekstart));
        questozone=new JLabel(thirsty);

        exegol = new JButton(thespot);
        // menu butts and labs =========================================
        // quest menu
        blackberrybasket=new JLabel(blackberry);
        blackberrybasket.setFont(Quesadilla);
        

        blueberrybasket=new JLabel(blueberry);
        blueberrybasket.setFont(Quesadilla);

        strawberrybasket=new JLabel(strawberry);
        strawberrybasket.setFont(Quesadilla);

        elderberrybasket=new JLabel(elderberry);
        elderberrybasket.setFont(Quesadilla);

        salmonberrybasket=new JLabel(salmonberry);
        salmonberrybasket.setFont(Quesadilla);

        sweetgemberrybasket=new JLabel(sweetgemberry);
        sweetgemberrybasket.setFont(Quesadilla);
        // calar menu
        monthlol=new JLabel(calmonth);
        // schead menu
        scoobutt=new JButton(scoo);
        mightworkbutt=new JButton(mightwork);
        emilebutt=new JButton(emile);
        leetboibutt=new JButton(leetboi);
        gemerbutt=new JButton(gemer);
        alphacentauributt=new JButton(alphacentauri);
        zedzedzedbutt=new JButton(zedzedzed);
        eraserheadbutt=new JButton(eraserhead);
        
        
        Mon0butt=new JButton(schedsetter(schedmenudata[0][0]));
        Mon1butt=new JButton(schedsetter(schedmenudata[0][1]));
        Mon2butt=new JButton(schedsetter(schedmenudata[0][2]));
        Mon3butt=new JButton(schedsetter(schedmenudata[0][3]));
        Mon4butt=new JButton(schedsetter(schedmenudata[0][4]));
        Mon5butt=new JButton(schedsetter(schedmenudata[0][5]));
        Mon6butt=new JButton(schedsetter(schedmenudata[0][6]));
        Mon7butt=new JButton(schedsetter(schedmenudata[0][7]));
        Mon8butt=new JButton(schedsetter(schedmenudata[0][8]));
        Mon9butt=new JButton(schedsetter(schedmenudata[0][9]));
        Mon10butt=new JButton(schedsetter(schedmenudata[0][10]));
        Mon11butt=new JButton(schedsetter(schedmenudata[0][11]));
        Mon12butt=new JButton(schedsetter(schedmenudata[0][12]));
        Mon13butt=new JButton(schedsetter(schedmenudata[0][13]));
        Mon14butt=new JButton(schedsetter(schedmenudata[0][14]));
        Mon15butt=new JButton(schedsetter(schedmenudata[0][15]));
        Mon16butt=new JButton(schedsetter(schedmenudata[0][16]));
        Mon17butt=new JButton(schedsetter(schedmenudata[0][17]));
        Mon18butt=new JButton(schedsetter(schedmenudata[0][18]));
        Mon19butt=new JButton(schedsetter(schedmenudata[0][19]));
        Mon20butt=new JButton(schedsetter(schedmenudata[0][20]));
        Mon21butt=new JButton(schedsetter(schedmenudata[0][21]));
        Mon22butt=new JButton(schedsetter(schedmenudata[0][22]));
        Mon23butt=new JButton(schedsetter(schedmenudata[0][23]));

        Tue0butt=new JButton(schedsetter(schedmenudata[1][0]));
        Tue1butt=new JButton(schedsetter(schedmenudata[1][1]));
        Tue2butt=new JButton(schedsetter(schedmenudata[1][2]));
        Tue3butt=new JButton(schedsetter(schedmenudata[1][3]));
        Tue4butt=new JButton(schedsetter(schedmenudata[1][4]));
        Tue5butt=new JButton(schedsetter(schedmenudata[1][5]));
        Tue6butt=new JButton(schedsetter(schedmenudata[1][6]));
        Tue7butt=new JButton(schedsetter(schedmenudata[1][7]));
        Tue8butt=new JButton(schedsetter(schedmenudata[1][8]));
        Tue9butt=new JButton(schedsetter(schedmenudata[1][9]));
        Tue10butt=new JButton(schedsetter(schedmenudata[1][10]));
        Tue11butt=new JButton(schedsetter(schedmenudata[1][11]));
        Tue12butt=new JButton(schedsetter(schedmenudata[1][12]));
        Tue13butt=new JButton(schedsetter(schedmenudata[1][13]));
        Tue14butt=new JButton(schedsetter(schedmenudata[1][14]));
        Tue15butt=new JButton(schedsetter(schedmenudata[1][15]));
        Tue16butt=new JButton(schedsetter(schedmenudata[1][16]));
        Tue17butt=new JButton(schedsetter(schedmenudata[1][17]));
        Tue18butt=new JButton(schedsetter(schedmenudata[1][18]));
        Tue19butt=new JButton(schedsetter(schedmenudata[1][19]));
        Tue20butt=new JButton(schedsetter(schedmenudata[1][20]));
        Tue21butt=new JButton(schedsetter(schedmenudata[1][21]));
        Tue22butt=new JButton(schedsetter(schedmenudata[1][22]));
        Tue23butt=new JButton(schedsetter(schedmenudata[1][23]));

        Wed0butt=new JButton(schedsetter(schedmenudata[2][0]));
        Wed1butt=new JButton(schedsetter(schedmenudata[2][1]));
        Wed2butt=new JButton(schedsetter(schedmenudata[2][2]));
        Wed3butt=new JButton(schedsetter(schedmenudata[2][3]));
        Wed4butt=new JButton(schedsetter(schedmenudata[2][4]));
        Wed5butt=new JButton(schedsetter(schedmenudata[2][5]));
        Wed6butt=new JButton(schedsetter(schedmenudata[2][6]));
        Wed7butt=new JButton(schedsetter(schedmenudata[2][7]));
        Wed8butt=new JButton(schedsetter(schedmenudata[2][8]));
        Wed9butt=new JButton(schedsetter(schedmenudata[2][9]));
        Wed10butt=new JButton(schedsetter(schedmenudata[2][10]));
        Wed11butt=new JButton(schedsetter(schedmenudata[2][11]));
        Wed12butt=new JButton(schedsetter(schedmenudata[2][12]));
        Wed13butt=new JButton(schedsetter(schedmenudata[2][13]));
        Wed14butt=new JButton(schedsetter(schedmenudata[2][14]));
        Wed15butt=new JButton(schedsetter(schedmenudata[2][15]));
        Wed16butt=new JButton(schedsetter(schedmenudata[2][16]));
        Wed17butt=new JButton(schedsetter(schedmenudata[2][17]));
        Wed18butt=new JButton(schedsetter(schedmenudata[2][18]));
        Wed19butt=new JButton(schedsetter(schedmenudata[2][19]));
        Wed20butt=new JButton(schedsetter(schedmenudata[2][20]));
        Wed21butt=new JButton(schedsetter(schedmenudata[2][21]));
        Wed22butt=new JButton(schedsetter(schedmenudata[2][22]));
        Wed23butt=new JButton(schedsetter(schedmenudata[2][23]));

        Thu0butt=new JButton(schedsetter(schedmenudata[3][0]));
        Thu1butt=new JButton(schedsetter(schedmenudata[3][1]));
        Thu2butt=new JButton(schedsetter(schedmenudata[3][2]));
        Thu3butt=new JButton(schedsetter(schedmenudata[3][3]));
        Thu4butt=new JButton(schedsetter(schedmenudata[3][4]));
        Thu5butt=new JButton(schedsetter(schedmenudata[3][5]));
        Thu6butt=new JButton(schedsetter(schedmenudata[3][6]));
        Thu7butt=new JButton(schedsetter(schedmenudata[3][7]));
        Thu8butt=new JButton(schedsetter(schedmenudata[3][8]));
        Thu9butt=new JButton(schedsetter(schedmenudata[3][9]));
        Thu10butt=new JButton(schedsetter(schedmenudata[3][10]));
        Thu11butt=new JButton(schedsetter(schedmenudata[3][11]));
        Thu12butt=new JButton(schedsetter(schedmenudata[3][12]));
        Thu13butt=new JButton(schedsetter(schedmenudata[3][13]));
        Thu14butt=new JButton(schedsetter(schedmenudata[3][14]));
        Thu15butt=new JButton(schedsetter(schedmenudata[3][15]));
        Thu16butt=new JButton(schedsetter(schedmenudata[3][16]));
        Thu17butt=new JButton(schedsetter(schedmenudata[3][17]));
        Thu18butt=new JButton(schedsetter(schedmenudata[3][18]));
        Thu19butt=new JButton(schedsetter(schedmenudata[3][19]));
        Thu20butt=new JButton(schedsetter(schedmenudata[3][20]));
        Thu21butt=new JButton(schedsetter(schedmenudata[3][21]));
        Thu22butt=new JButton(schedsetter(schedmenudata[3][22]));
        Thu23butt=new JButton(schedsetter(schedmenudata[3][23]));

        Fri0butt=new JButton(schedsetter(schedmenudata[4][0]));
        Fri1butt=new JButton(schedsetter(schedmenudata[4][1]));
        Fri2butt=new JButton(schedsetter(schedmenudata[4][2]));
        Fri3butt=new JButton(schedsetter(schedmenudata[4][3]));
        Fri4butt=new JButton(schedsetter(schedmenudata[4][4]));
        Fri5butt=new JButton(schedsetter(schedmenudata[4][5]));
        Fri6butt=new JButton(schedsetter(schedmenudata[4][6]));
        Fri7butt=new JButton(schedsetter(schedmenudata[4][7]));
        Fri8butt=new JButton(schedsetter(schedmenudata[4][8]));
        Fri9butt=new JButton(schedsetter(schedmenudata[4][9]));
        Fri10butt=new JButton(schedsetter(schedmenudata[4][10]));
        Fri11butt=new JButton(schedsetter(schedmenudata[4][11]));
        Fri12butt=new JButton(schedsetter(schedmenudata[4][12]));
        Fri13butt=new JButton(schedsetter(schedmenudata[4][13]));
        Fri14butt=new JButton(schedsetter(schedmenudata[4][14]));
        Fri15butt=new JButton(schedsetter(schedmenudata[4][15]));
        Fri16butt=new JButton(schedsetter(schedmenudata[4][16]));
        Fri17butt=new JButton(schedsetter(schedmenudata[4][17]));
        Fri18butt=new JButton(schedsetter(schedmenudata[4][18]));
        Fri19butt=new JButton(schedsetter(schedmenudata[4][19]));
        Fri20butt=new JButton(schedsetter(schedmenudata[4][20]));
        Fri21butt=new JButton(schedsetter(schedmenudata[4][21]));
        Fri22butt=new JButton(schedsetter(schedmenudata[4][22]));
        Fri23butt=new JButton(schedsetter(schedmenudata[4][23]));

        Sat0butt=new JButton(schedsetter(schedmenudata[5][0]));
        Sat1butt=new JButton(schedsetter(schedmenudata[5][1]));
        Sat2butt=new JButton(schedsetter(schedmenudata[5][2]));
        Sat3butt=new JButton(schedsetter(schedmenudata[5][3]));
        Sat4butt=new JButton(schedsetter(schedmenudata[5][4]));
        Sat5butt=new JButton(schedsetter(schedmenudata[5][5]));
        Sat6butt=new JButton(schedsetter(schedmenudata[5][6]));
        Sat7butt=new JButton(schedsetter(schedmenudata[5][7]));
        Sat8butt=new JButton(schedsetter(schedmenudata[5][8]));
        Sat9butt=new JButton(schedsetter(schedmenudata[5][9]));
        Sat10butt=new JButton(schedsetter(schedmenudata[5][10]));
        Sat11butt=new JButton(schedsetter(schedmenudata[5][11]));
        Sat12butt=new JButton(schedsetter(schedmenudata[5][12]));
        Sat13butt=new JButton(schedsetter(schedmenudata[5][13]));
        Sat14butt=new JButton(schedsetter(schedmenudata[5][14]));
        Sat15butt=new JButton(schedsetter(schedmenudata[5][15]));
        Sat16butt=new JButton(schedsetter(schedmenudata[5][16]));
        Sat17butt=new JButton(schedsetter(schedmenudata[5][17]));
        Sat18butt=new JButton(schedsetter(schedmenudata[5][18]));
        Sat19butt=new JButton(schedsetter(schedmenudata[5][19]));
        Sat20butt=new JButton(schedsetter(schedmenudata[5][20]));
        Sat21butt=new JButton(schedsetter(schedmenudata[5][21]));
        Sat22butt=new JButton(schedsetter(schedmenudata[5][22]));
        Sat23butt=new JButton(schedsetter(schedmenudata[5][23]));

        Sun0butt=new JButton(schedsetter(schedmenudata[6][0]));
        Sun1butt=new JButton(schedsetter(schedmenudata[6][1]));
        Sun2butt=new JButton(schedsetter(schedmenudata[6][2]));
        Sun3butt=new JButton(schedsetter(schedmenudata[6][3]));
        Sun4butt=new JButton(schedsetter(schedmenudata[6][4]));
        Sun5butt=new JButton(schedsetter(schedmenudata[6][5]));
        Sun6butt=new JButton(schedsetter(schedmenudata[6][6]));
        Sun7butt=new JButton(schedsetter(schedmenudata[6][7]));
        Sun8butt=new JButton(schedsetter(schedmenudata[6][8]));
        Sun9butt=new JButton(schedsetter(schedmenudata[6][9]));
        Sun10butt=new JButton(schedsetter(schedmenudata[6][10]));
        Sun11butt=new JButton(schedsetter(schedmenudata[6][11]));
        Sun12butt=new JButton(schedsetter(schedmenudata[6][12]));
        Sun13butt=new JButton(schedsetter(schedmenudata[6][13]));
        Sun14butt=new JButton(schedsetter(schedmenudata[6][14]));
        Sun15butt=new JButton(schedsetter(schedmenudata[6][15]));
        Sun16butt=new JButton(schedsetter(schedmenudata[6][16]));
        Sun17butt=new JButton(schedsetter(schedmenudata[6][17]));
        Sun18butt=new JButton(schedsetter(schedmenudata[6][18]));
        Sun19butt=new JButton(schedsetter(schedmenudata[6][19]));
        Sun20butt=new JButton(schedsetter(schedmenudata[6][20]));
        Sun21butt=new JButton(schedsetter(schedmenudata[6][21]));
        Sun22butt=new JButton(schedsetter(schedmenudata[6][22]));
        Sun23butt=new JButton(schedsetter(schedmenudata[6][23]));
        
        // frined menu
        Agift1mark=new JButton(frentintil(Agift1mark, frinedmenudata[0][1]));
        Agift2mark=new JButton(frentintil(Agift2mark, frinedmenudata[0][2]));
        Atalkmark=new JButton(frentintil(Atalkmark, frinedmenudata[0][3]));
        Bgift1mark=new JButton(frentintil(Bgift1mark, frinedmenudata[1][1]));
        Bgift2mark=new JButton(frentintil(Bgift2mark, frinedmenudata[1][2]));
        Btalkmark=new JButton(frentintil(Btalkmark, frinedmenudata[1][3]));
        Cgift1mark=new JButton(frentintil(Cgift1mark, frinedmenudata[2][1]));
        Cgift2mark=new JButton(frentintil(Cgift2mark, frinedmenudata[2][2]));
        Ctalkmark=new JButton(frentintil(Ctalkmark, frinedmenudata[2][3]));
        Dgift1mark=new JButton(frentintil(Dgift1mark, frinedmenudata[3][1]));
        Dgift2mark=new JButton(frentintil(Dgift2mark, frinedmenudata[3][2]));
        Dtalkmark=new JButton(frentintil(Dtalkmark, frinedmenudata[3][3]));
        Egift1mark=new JButton(frentintil(Egift1mark, frinedmenudata[4][1]));
        Egift2mark=new JButton(frentintil(Egift2mark, frinedmenudata[4][2]));
        Etalkmark=new JButton(frentintil(Etalkmark, frinedmenudata[4][3]));
        Aheartbutt=new JButton(heartinitil(frinedmenudata[0][0]));
        Bheartbutt=new JButton(heartinitil(frinedmenudata[1][0]));
        Cheartbutt=new JButton(heartinitil(frinedmenudata[2][0]));
        Dheartbutt=new JButton(heartinitil(frinedmenudata[3][0]));
        Eheartbutt=new JButton(heartinitil(frinedmenudata[4][0]));

        //==================================================================
        // fill window top to bot
        //==================================================================
        getContentPane().setBackground(null);
        setLayout(null);
        // frined menu bits v ========================================
        addsecretbutton(Agift1mark);
        addsecretbutton(Agift2mark);
        addsecretbutton(Atalkmark);
        addsecretbutton(Bgift1mark);
        addsecretbutton(Bgift2mark);
        addsecretbutton(Btalkmark);
        addsecretbutton(Cgift1mark);
        addsecretbutton(Cgift2mark);
        addsecretbutton(Ctalkmark);
        addsecretbutton(Dgift1mark);
        addsecretbutton(Dgift2mark);
        addsecretbutton(Dtalkmark);
        addsecretbutton(Egift1mark);
        addsecretbutton(Egift2mark);
        addsecretbutton(Etalkmark);

        addsecretbutton(Aheartbutt);
        addsecretbutton(Bheartbutt);
        addsecretbutton(Cheartbutt);
        addsecretbutton(Dheartbutt);
        addsecretbutton(Eheartbutt);

        Agift1mark.addActionListener(new frinedboxtap());
        Agift2mark.addActionListener(new frinedboxtap());
        Atalkmark.addActionListener(new frinedboxtap());
        Bgift1mark.addActionListener(new frinedboxtap());
        Bgift2mark.addActionListener(new frinedboxtap());
        Btalkmark.addActionListener(new frinedboxtap());
        Cgift1mark.addActionListener(new frinedboxtap());
        Cgift2mark.addActionListener(new frinedboxtap());
        Ctalkmark.addActionListener(new frinedboxtap());
        Dgift1mark.addActionListener(new frinedboxtap());
        Dgift2mark.addActionListener(new frinedboxtap());
        Dtalkmark.addActionListener(new frinedboxtap());
        Egift1mark.addActionListener(new frinedboxtap());
        Egift2mark.addActionListener(new frinedboxtap());
        Etalkmark.addActionListener(new frinedboxtap());

        Aheartbutt.addActionListener(new heartbutttap());
        Bheartbutt.addActionListener(new heartbutttap());
        Cheartbutt.addActionListener(new heartbutttap());
        Dheartbutt.addActionListener(new heartbutttap());
        Eheartbutt.addActionListener(new heartbutttap());
        // schred menu bits v ========================================
        addsecretbutton(scoobutt);
        addsecretbutton(mightworkbutt);
        addsecretbutton(emilebutt);
        addsecretbutton(leetboibutt);
        addsecretbutton(gemerbutt);
        addsecretbutton(alphacentauributt);
        addsecretbutton(zedzedzedbutt);
        addsecretbutton(eraserheadbutt);
          //selector pannel
        scoobutt.addActionListener(new schedtypesettersetter());
        mightworkbutt.addActionListener(new schedtypesettersetter());
        emilebutt.addActionListener(new schedtypesettersetter());
        leetboibutt.addActionListener(new schedtypesettersetter());
        gemerbutt.addActionListener(new schedtypesettersetter());
        alphacentauributt.addActionListener(new schedtypesettersetter());
        zedzedzedbutt.addActionListener(new schedtypesettersetter());
        eraserheadbutt.addActionListener(new schedtypesettersetter());
        
        for (int retrival=0; retrival < 168; retrival++) {
        addsecretschedbutton(schednamereposity(retrival));
        };
        
        // caleanfae menu bits v ======================================
        addsecretlabel(monthlol);
        monthlol.setFont(Fontonola);
        // questo menu bits v =========================================
        add(blackberrybasket);
        blackberrybasket.setBounds(144, 122, 792, 86);

        add(blueberrybasket);
        blueberrybasket.setBounds(144, 212, 792, 86);

        add(strawberrybasket);
        strawberrybasket.setBounds(144, 302, 792, 86);

        add(elderberrybasket);
        elderberrybasket.setBounds(144, 392, 792, 86);

        add(salmonberrybasket);
        salmonberrybasket.setBounds(144, 482, 792, 86);

        add(sweetgemberrybasket);
        sweetgemberrybasket.setBounds(144, 572, 792, 86);
        // main bits v =========================================
        add(exegol);
        exegol.setBounds(944, 98, 36, 36);
        exegol.addActionListener(new exegoltap());

        add(questozone);
        questozone.setBounds(60, 30, 960, 648);

        addsecretlabel(frinedzone);

        addsecretlabel(schedzone);
        
        addsecretlabel(datumzone);
        // menu openers
        add(frined);
        frined.setBounds(1122, 262, 36, 40);
        frined.addActionListener(new frinedtap());

        add(sched);
        sched.setBounds(1170, 262, 36, 40);
        sched.addActionListener(new schedtap());

        add(datum);
        datum.setBounds(1218, 262, 36, 40);
        datum.addActionListener(new datumtap());

        add(questo);
        questo.setBounds(1266, 262, 36, 40);
        questo.addActionListener(new questotap());
        // clockyboi and additions
        add(cashola);
        add(tim);
        add(wateriswet);
        add(seas);
        add(dayo);
        add(clockyboi);

        cashola.setBounds(1120, 206, 192, 32);
        tim.setBounds(1190, 126, 156, 32);
        wateriswet.setBounds(1166, 74, 48, 40);
        seas.setBounds(1262, 74, 48, 40);
        dayo.setBounds(1158, 34, 156, 32);
        clockyboi.setBounds(1044, 10, 300, 300);
        // background
        add(backerst);
        backerst.setBounds(0, 0, 1366, 768);

        //tim.invalidate();
        //tim.validate();
        //tim.repaint();
    }
//==================================================================
// button functions
//==================================================================
private class frinedtap implements ActionListener
{
    @Override
    public void actionPerformed(ActionEvent event)
    {
        closerIhardlyknewer();
        frinedzone.setBounds(60, 30, 960, 652);
        exegol.setBounds(970, 80, 36, 36);

        // menuchanger
        Agift1mark.setBounds(766, 168, 28, 28);
        Agift2mark.setBounds(806, 168, 28, 28);
        Atalkmark.setBounds(902, 168, 28, 28);
        Bgift1mark.setBounds(766, 280, 28, 28);
        Bgift2mark.setBounds(806, 280, 28, 28);
        Btalkmark.setBounds(902, 280, 28, 28);
        Cgift1mark.setBounds(766, 392, 28, 28);
        Cgift2mark.setBounds(806, 392, 28, 28);
        Ctalkmark.setBounds(902, 392, 28, 28);
        Dgift1mark.setBounds(766, 504, 28, 28);
        Dgift2mark.setBounds(806, 504, 28, 28);
        Dtalkmark.setBounds(902, 504, 28, 28);
        Egift1mark.setBounds(766, 616, 28, 28);
        Egift2mark.setBounds(806, 616, 28, 28);
        Etalkmark.setBounds(902, 616, 28, 28);

        Aheartbutt.setBounds(386, 104, 344, 104);
        Bheartbutt.setBounds(386, 216, 344, 104);
        Cheartbutt.setBounds(386, 328, 344, 104);
        Dheartbutt.setBounds(386, 440, 344, 104);
        Eheartbutt.setBounds(386, 552, 344, 104);

        //temp timmy updateroo
        temptimmyupdateroo();
    }
}
private class schedtap implements ActionListener
{
    @Override
    public void actionPerformed(ActionEvent event)
    {
        closerIhardlyknewer();
        schedzone.setBounds(10, 30, 1225, 648);
        exegol.setBounds(1179, 98, 36, 36);
        
        scoobutt.setBounds(429, 600, 40, 56);
        mightworkbutt.setBounds(470, 600, 40, 56);
        emilebutt.setBounds(511, 600, 40, 56);
        leetboibutt.setBounds(552, 600, 40, 56);
        gemerbutt.setBounds(593, 600, 40, 56);
        alphacentauributt.setBounds(634, 600, 40, 56);
        zedzedzedbutt.setBounds(675, 600, 40, 56);
        eraserheadbutt.setBounds(716, 600, 40, 56);
        //dayopener
        for (int retrival=0; retrival < 24; retrival++) {
            schednamereposity(retrival).setBounds(111+retrival*44, 178, 40, 56);
        };
        for (int retrival=24; retrival < 48; retrival++) {
            schednamereposity(retrival).setBounds(111+(retrival-24)*44, 238, 40, 56);
        };
        for (int retrival=48; retrival < 72; retrival++) {
            schednamereposity(retrival).setBounds(111+(retrival-48)*44, 298, 40, 56);
        };
        for (int retrival=72; retrival < 96; retrival++) {
            schednamereposity(retrival).setBounds(111+(retrival-72)*44, 358, 40, 56);
        };
        for (int retrival=96; retrival < 120; retrival++) {
            schednamereposity(retrival).setBounds(111+(retrival-96)*44, 418, 40, 56);
        };
        for (int retrival=120; retrival < 144; retrival++) {
            schednamereposity(retrival).setBounds(111+(retrival-120)*44, 478, 40, 56);
        };
        for (int retrival=144; retrival < 168; retrival++) {
            schednamereposity(retrival).setBounds(111+(retrival-144)*44, 538, 40, 56);
        };

        frined.setBounds(1122, 262, 36, 0);
        sched.setBounds(1170, 262, 36, 0);

        //temp timmy updateroo
        temptimmyupdateroo();
    }
}
private class datumtap implements ActionListener
{
    @Override
    public void actionPerformed(ActionEvent event)
    {
        closerIhardlyknewer();
        datumzone.setBounds(60, 30, 960, 696);
        monthlol.setBounds(104, 70, 140, 20);
        exegol.setBounds(981, 54, 36, 36);

        //temp timmy updateroo
        temptimmyupdateroo();
    }
}
private class questotap implements ActionListener
{
    @Override
    public void actionPerformed(ActionEvent event)
    {
        closerIhardlyknewer();
        questozone.setBounds(60, 30, 960, 648);
        exegol.setBounds(944, 98, 36, 36);

        //menu changer
        blackberrybasket.setBounds(144, 122, 792, 86);
        blueberrybasket.setBounds(144, 212, 792, 86);
        strawberrybasket.setBounds(144, 302, 792, 86);
        elderberrybasket.setBounds(144, 392, 792, 86);
        salmonberrybasket.setBounds(144, 482, 792, 86);
        sweetgemberrybasket.setBounds(144, 572, 792, 86);

        //temp timmy updateroo
        temptimmyupdateroo();
    }
}
private class exegoltap implements ActionListener
{
    @Override
    public void actionPerformed(ActionEvent event)
    {
        closerIhardlyknewer();

        //temp timmy updateroo
        temptimmyupdateroo();
    }
}
//============================================================
// fined functions
//============================================================
public ImageIcon frentintil(JButton Jotaro, int Josuke)
{
    //ImageIcon Jolyene = new ImageIcon();
    Josuke=Josuke%2;
        if(Josuke==0){
            return mark;
        }
        else{
            return marknt;
        }
}
public int frinedmath(JButton Jonathan, int Joseph)
{
    Joseph=Joseph%2;
        if(Joseph==1){
            Jonathan.setIcon(mark);
        }
        else{
            Jonathan.setIcon(marknt);
        }
        ++Joseph;
        return Joseph;
}
private class frinedboxtap implements ActionListener
{
    @Override
    public void actionPerformed(ActionEvent event)
    {
        if (event.getSource()==Agift1mark) {
            frinedmenudata[0][1] = frinedmath(Agift1mark, frinedmenudata[0][1]);
        }
        else if (event.getSource()==Agift2mark) {
            frinedmenudata[0][2] = frinedmath(Agift2mark, frinedmenudata[0][2]);
        }
        else if (event.getSource()==Atalkmark) {
            frinedmenudata[0][3] = frinedmath(Atalkmark, frinedmenudata[0][3]);
        }
        else if (event.getSource()==Bgift1mark) {
            frinedmenudata[1][1] = frinedmath(Bgift1mark, frinedmenudata[1][1]);
        }
        else if (event.getSource()==Bgift2mark) {
            frinedmenudata[1][2] = frinedmath(Bgift2mark, frinedmenudata[1][2]);
        }
        else if (event.getSource()==Btalkmark) {
            frinedmenudata[1][3] = frinedmath(Btalkmark, frinedmenudata[1][3]);
        }
        else if (event.getSource()==Cgift1mark) {
            frinedmenudata[2][1] = frinedmath(Cgift1mark, frinedmenudata[2][1]);
        }
        else if (event.getSource()==Cgift2mark) {
            frinedmenudata[2][2] = frinedmath(Cgift2mark, frinedmenudata[2][2]);
        }
        else if (event.getSource()==Ctalkmark) {
            frinedmenudata[2][3] = frinedmath(Ctalkmark, frinedmenudata[2][3]);
        }
        else if (event.getSource()==Dgift1mark) {
            frinedmenudata[3][1] = frinedmath(Dgift1mark, frinedmenudata[3][1]);
        }
        else if (event.getSource()==Dgift2mark) {
            frinedmenudata[3][2] = frinedmath(Dgift2mark, frinedmenudata[3][2]);
        }
        else if (event.getSource()==Dtalkmark) {
            frinedmenudata[3][3] = frinedmath(Dtalkmark, frinedmenudata[3][3]);
        }
        else if (event.getSource()==Egift1mark) {
            frinedmenudata[4][1] = frinedmath(Egift1mark, frinedmenudata[4][1]);
        }
        else if (event.getSource()==Egift2mark) {
            frinedmenudata[4][2] = frinedmath(Egift2mark, frinedmenudata[4][2]);
        }
        else {
            frinedmenudata[4][3] = frinedmath(Etalkmark, frinedmenudata[4][3]);
        }
    }
}
public ImageIcon heartinitil(int heartval)
{
    int heartmod = heartval%11;
    if(heartmod==0){
        return hearto0;
    }
    if(heartmod==1){
        return hearto1;
    }
    if(heartmod==2){
        return hearto2;
    }
    if(heartmod==3){
        return hearto3;
    }
    if(heartmod==4){
        return hearto4;
    }
    if(heartmod==5){
        return hearto5;
    }
    if(heartmod==6){
        return hearto6;
    }
    if(heartmod==7){
        return hearto7;
    }
    if(heartmod==8){
        return hearto8;
    }
    if(heartmod==9){
        return hearto9;
    }
    else{
        return hearto10;
    }
}
private class heartbutttap implements ActionListener
{
    @Override
    public void actionPerformed(ActionEvent event)
    {
        if (event.getSource()==Aheartbutt) {
            ++frinedmenudata[0][0];
            Aheartbutt.setIcon(heartinitil(frinedmenudata[0][0]));
        }
        else if (event.getSource()==Bheartbutt) {
            ++frinedmenudata[1][0];
            Bheartbutt.setIcon(heartinitil(frinedmenudata[1][0]));
        }
        else if (event.getSource()==Cheartbutt) {
            ++frinedmenudata[2][0];
            Cheartbutt.setIcon(heartinitil(frinedmenudata[2][0]));
        }
        else if (event.getSource()==Dheartbutt) {
            ++frinedmenudata[3][0];
            Dheartbutt.setIcon(heartinitil(frinedmenudata[3][0]));
        }
        else{
            ++frinedmenudata[4][0];
            Eheartbutt.setIcon(heartinitil(frinedmenudata[4][0]));
        }
    }
}
//==================================================================
// sched functions
//==================================================================
public JButton schednamereposity(int quija) {
    if (quija==0){
        return Mon0butt;
    }
    else if (quija==1){
        return Mon1butt;
    }
    else if (quija==2){
        return Mon2butt;
    }
    else if (quija==3){
        return Mon3butt;
    }
    else if (quija==4){
        return Mon4butt;
    }
    else if (quija==5){
        return Mon5butt;
    }
    else if (quija==6){
        return Mon6butt;
    }
    else if (quija==7){
        return Mon7butt;
    }
    else if (quija==8){
        return Mon8butt;
    }
    else if (quija==9){
        return Mon9butt;
    }
    else if (quija==10){
        return Mon10butt;
    }
    else if (quija==11){
        return Mon11butt;
    }
    else if (quija==12){
        return Mon12butt;
    }
    else if (quija==13){
        return Mon13butt;
    }
    else if (quija==14){
        return Mon14butt;
    }
    else if (quija==15){
        return Mon15butt;
    }
    else if (quija==16){
        return Mon16butt;
    }
    else if (quija==17){
        return Mon17butt;
    }
    else if (quija==18){
        return Mon18butt;
    }
    else if (quija==19){
        return Mon19butt;
    }
    else if (quija==20){
        return Mon20butt;
    }
    else if (quija==21){
        return Mon21butt;
    }
    else if (quija==22){
        return Mon22butt;
    }
    else if (quija==23){
        return Mon23butt;
    }
    else if (quija==24){
        return Tue0butt;
    }
    else if (quija==25){
        return Tue1butt;
    }
    else if (quija==26){
        return Tue2butt;
    }
    else if (quija==27){
        return Tue3butt;
    }
    else if (quija==28){
        return Tue4butt;
    }
    else if (quija==29){
        return Tue5butt;
    }
    else if (quija==30){
        return Tue6butt;
    }
    else if (quija==31){
        return Tue7butt;
    }
    else if (quija==32){
        return Tue8butt;
    }
    else if (quija==33){
        return Tue9butt;
    }
    else if (quija==34){
        return Tue10butt;
    }
    else if (quija==35){
        return Tue11butt;
    }
    else if (quija==36){
        return Tue12butt;
    }
    else if (quija==37){
        return Tue13butt;
    }
    else if (quija==38){
        return Tue14butt;
    }
    else if (quija==39){
        return Tue15butt;
    }
    else if (quija==40){
        return Tue16butt;
    }
    else if (quija==41){
        return Tue17butt;
    }
    else if (quija==42){
        return Tue18butt;
    }
    else if (quija==43){
        return Tue19butt;
    }
    else if (quija==44){
        return Tue20butt;
    }
    else if (quija==45){
        return Tue21butt;
    }
    else if (quija==46){
        return Tue22butt;
    }
    else if (quija==47){
        return Tue23butt;
    }
    else if (quija==48){
        return Wed0butt;
    }
    else if (quija==49){
        return Wed1butt;
    }
    else if (quija==50){
        return Wed2butt;
    }
    else if (quija==51){
        return Wed3butt;
    }
    else if (quija==52){
        return Wed4butt;
    }
    else if (quija==53){
        return Wed5butt;
    }
    else if (quija==54){
        return Wed6butt;
    }
    else if (quija==55){
        return Wed7butt;
    }
    else if (quija==56){
        return Wed8butt;
    }
    else if (quija==57){
        return Wed9butt;
    }
    else if (quija==58){
        return Wed10butt;
    }
    else if (quija==59){
        return Wed11butt;
    }
    else if (quija==60){
        return Wed12butt;
    }
    else if (quija==61){
        return Wed13butt;
    }
    else if (quija==62){
        return Wed14butt;
    }
    else if (quija==63){
        return Wed15butt;
    }
    else if (quija==64){
        return Wed16butt;
    }
    else if (quija==65){
        return Wed17butt;
    }
    else if (quija==66){
        return Wed18butt;
    }
    else if (quija==67){
        return Wed19butt;
    }
    else if (quija==68){
        return Wed20butt;
    }
    else if (quija==69){
        return Wed21butt;
    }
    else if (quija==70){
        return Wed22butt;
    }
    else if (quija==71){
        return Wed23butt;
    }
    else if (quija==72){
        return Thu0butt;
    }
    else if (quija==73){
        return Thu1butt;
    }
    else if (quija==74){
        return Thu2butt;
    }
    else if (quija==75){
        return Thu3butt;
    }
    else if (quija==76){
        return Thu4butt;
    }
    else if (quija==77){
        return Thu5butt;
    }
    else if (quija==78){
        return Thu6butt;
    }
    else if (quija==79){
        return Thu7butt;
    }
    else if (quija==80){
        return Thu8butt;
    }
    else if (quija==81){
        return Thu9butt;
    }
    else if (quija==82){
        return Thu10butt;
    }
    else if (quija==83){
        return Thu11butt;
    }
    else if (quija==84){
        return Thu12butt;
    }
    else if (quija==85){
        return Thu13butt;
    }
    else if (quija==86){
        return Thu14butt;
    }
    else if (quija==87){
        return Thu15butt;
    }
    else if (quija==88){
        return Thu16butt;
    }
    else if (quija==89){
        return Thu17butt;
    }
    else if (quija==90){
        return Thu18butt;
    }
    else if (quija==91){
        return Thu19butt;
    }
    else if (quija==92){
        return Thu20butt;
    }
    else if (quija==93){
        return Thu21butt;
    }
    else if (quija==94){
        return Thu22butt;
    }
    else if (quija==95){
        return Thu23butt;
    }
    else if (quija==96){
        return Fri0butt;
    }
    else if (quija==97){
        return Fri1butt;
    }
    else if (quija==98){
        return Fri2butt;
    }
    else if (quija==99){
        return Fri3butt;
    }
    else if (quija==100){
        return Fri4butt;
    }
    else if (quija==101){
        return Fri5butt;
    }
    else if (quija==102){
        return Fri6butt;
    }
    else if (quija==103){
        return Fri7butt;
    }
    else if (quija==104){
        return Fri8butt;
    }
    else if (quija==105){
        return Fri9butt;
    }
    else if (quija==106){
        return Fri10butt;
    }
    else if (quija==107){
        return Fri11butt;
    }
    else if (quija==108){
        return Fri12butt;
    }
    else if (quija==109){
        return Fri13butt;
    }
    else if (quija==110){
        return Fri14butt;
    }
    else if (quija==111){
        return Fri15butt;
    }
    else if (quija==112){
        return Fri16butt;
    }
    else if (quija==113){
        return Fri17butt;
    }
    else if (quija==114){
        return Fri18butt;
    }
    else if (quija==115){
        return Fri19butt;
    }
    else if (quija==116){
        return Fri20butt;
    }
    else if (quija==117){
        return Fri21butt;
    }
    else if (quija==118){
        return Fri22butt;
    }
    else if (quija==119){
        return Fri23butt;
    }
    else if (quija==120){
        return Sat0butt;
    }
    else if (quija==121){
        return Sat1butt;
    }
    else if (quija==122){
        return Sat2butt;
    }
    else if (quija==123){
        return Sat3butt;
    }
    else if (quija==124){
        return Sat4butt;
    }
    else if (quija==125){
        return Sat5butt;
    }
    else if (quija==126){
        return Sat6butt;
    }
    else if (quija==127){
        return Sat7butt;
    }
    else if (quija==128){
        return Sat8butt;
    }
    else if (quija==129){
        return Sat9butt;
    }
    else if (quija==130){
        return Sat10butt;
    }
    else if (quija==131){
        return Sat11butt;
    }
    else if (quija==132){
        return Sat12butt;
    }
    else if (quija==133){
        return Sat13butt;
    }
    else if (quija==134){
        return Sat14butt;
    }
    else if (quija==135){
        return Sat15butt;
    }
    else if (quija==136){
        return Sat16butt;
    }
    else if (quija==137){
        return Sat17butt;
    }
    else if (quija==138){
        return Sat18butt;
    }
    else if (quija==139){
        return Sat19butt;
    }
    else if (quija==140){
        return Sat20butt;
    }
    else if (quija==141){
        return Sat21butt;
    }
    else if (quija==142){
        return Sat22butt;
    }
    else if (quija==143){
        return Sat23butt;
    }
    else if (quija==144){
        return Sun0butt;
    }
    else if (quija==145){
        return Sun1butt;
    }
    else if (quija==146){
        return Sun2butt;
    }
    else if (quija==147){
        return Sun3butt;
    }
    else if (quija==148){
        return Sun4butt;
    }
    else if (quija==149){
        return Sun5butt;
    }
    else if (quija==150){
        return Sun6butt;
    }
    else if (quija==151){
        return Sun7butt;
    }
    else if (quija==152){
        return Sun8butt;
    }
    else if (quija==153){
        return Sun9butt;
    }
    else if (quija==154){
        return Sun10butt;
    }
    else if (quija==155){
        return Sun11butt;
    }
    else if (quija==156){
        return Sun12butt;
    }
    else if (quija==157){
        return Sun13butt;
    }
    else if (quija==158){
        return Sun14butt;
    }
    else if (quija==159){
        return Sun15butt;
    }
    else if (quija==160){
        return Sun16butt;
    }
    else if (quija==161){
        return Sun17butt;
    }
    else if (quija==162){
        return Sun18butt;
    }
    else if (quija==163){
        return Sun19butt;
    }
    else if (quija==164){
        return Sun20butt;
    }
    else if (quija==165){
        return Sun21butt;
    }
    else if (quija==166){
        return Sun22butt;
    }
    else{
        return Sun23butt;
    }
}
public ImageIcon schedsetter(int schedval)
{
    if(schedval==0){
        return pimpleszero;
    }
    if(schedval==1){
        return scoo;
    }
    if(schedval==2){
        return mightwork;
    }
    if(schedval==3){
        return emile;
    }
    if(schedval==4){
        return leetboi;
    }
    if(schedval==5){
        return gemer;
    }
    if(schedval==6){
        return alphacentauri;
    }
    else{
        return zedzedzed;
    }
}
private class schedtypesettersetter implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent event){
        if (event.getSource()==scoobutt) {
            schedtypesetter=1;
        }
        else if (event.getSource()==mightworkbutt) {
            schedtypesetter=2;
        }
        else if (event.getSource()==emilebutt) {
            schedtypesetter=3;
        }
        else if (event.getSource()==leetboibutt) {
            schedtypesetter=4;
        }
        else if (event.getSource()==gemerbutt) {
            schedtypesetter=5;
        }
        else if (event.getSource()==alphacentauributt) {
            schedtypesetter=6;
        }
        else if (event.getSource()==zedzedzedbutt) {
            schedtypesetter=7;
        }
        else{
            schedtypesetter=0;
        }
    }
}
private class schedbutttap implements ActionListener
{
    @Override
    public void actionPerformed(ActionEvent event)
    {
        if (event.getSource()==Mon0butt) {
            schedmenudata[0][0]=schedtypesetter;
            Mon0butt.setIcon(schedsetter(schedtypesetter));
        }
        else if (event.getSource()==Mon1butt) {
            schedmenudata[0][1]=schedtypesetter;
            Mon1butt.setIcon(schedsetter(schedtypesetter));
        }
        else if (event.getSource()==Mon2butt) {
            schedmenudata[0][2]=schedtypesetter;
            Mon2butt.setIcon(schedsetter(schedtypesetter));
        }
        else if (event.getSource()==Mon3butt) {
            schedmenudata[0][3]=schedtypesetter;
            Mon3butt.setIcon(schedsetter(schedtypesetter));
        }
        else if (event.getSource()==Mon4butt) {
            schedmenudata[0][4]=schedtypesetter;
            Mon4butt.setIcon(schedsetter(schedtypesetter));
        }
        else if (event.getSource()==Mon5butt) {
            schedmenudata[0][5]=schedtypesetter;
            Mon5butt.setIcon(schedsetter(schedtypesetter));
        }
        else if (event.getSource()==Mon6butt) {
            schedmenudata[0][6]=schedtypesetter;
            Mon6butt.setIcon(schedsetter(schedtypesetter));
        }
        else if (event.getSource()==Mon7butt) {
            schedmenudata[0][7]=schedtypesetter;
            Mon7butt.setIcon(schedsetter(schedtypesetter));
        }
        else if (event.getSource()==Mon8butt) {
            schedmenudata[0][8]=schedtypesetter;
            Mon8butt.setIcon(schedsetter(schedtypesetter));
        }
        else if (event.getSource()==Mon9butt) {
            schedmenudata[0][9]=schedtypesetter;
            Mon9butt.setIcon(schedsetter(schedtypesetter));
        }
        else if (event.getSource()==Mon10butt) {
            schedmenudata[0][10]=schedtypesetter;
            Mon10butt.setIcon(schedsetter(schedtypesetter));
        }
        else if (event.getSource()==Mon11butt) {
            schedmenudata[0][11]=schedtypesetter;
            Mon11butt.setIcon(schedsetter(schedtypesetter));
        }
        else if (event.getSource()==Mon12butt) {
            schedmenudata[0][12]=schedtypesetter;
            Mon12butt.setIcon(schedsetter(schedtypesetter));
        }
        else if (event.getSource()==Mon13butt) {
            schedmenudata[0][13]=schedtypesetter;
            Mon13butt.setIcon(schedsetter(schedtypesetter));
        }
        else if (event.getSource()==Mon14butt) {
            schedmenudata[0][14]=schedtypesetter;
            Mon14butt.setIcon(schedsetter(schedtypesetter));
        }
        else if (event.getSource()==Mon15butt) {
            schedmenudata[0][15]=schedtypesetter;
            Mon15butt.setIcon(schedsetter(schedtypesetter));
        }
        else if (event.getSource()==Mon16butt) {
            schedmenudata[0][16]=schedtypesetter;
            Mon16butt.setIcon(schedsetter(schedtypesetter));
        }
        else if (event.getSource()==Mon17butt) {
            schedmenudata[0][17]=schedtypesetter;
            Mon17butt.setIcon(schedsetter(schedtypesetter));
        }
        else if (event.getSource()==Mon18butt) {
            schedmenudata[0][18]=schedtypesetter;
            Mon18butt.setIcon(schedsetter(schedtypesetter));
        }
        else if (event.getSource()==Mon19butt) {
            schedmenudata[0][19]=schedtypesetter;
            Mon19butt.setIcon(schedsetter(schedtypesetter));
        }
        else if (event.getSource()==Mon20butt) {
            schedmenudata[0][20]=schedtypesetter;
            Mon20butt.setIcon(schedsetter(schedtypesetter));
        }
        else if (event.getSource()==Mon21butt) {
            schedmenudata[0][21]=schedtypesetter;
            Mon21butt.setIcon(schedsetter(schedtypesetter));
        }
        else if (event.getSource()==Mon22butt) {
            schedmenudata[0][22]=schedtypesetter;
            Mon22butt.setIcon(schedsetter(schedtypesetter));
        }
        else if (event.getSource()==Mon23butt) {
            schedmenudata[0][23]=schedtypesetter;
            Mon23butt.setIcon(schedsetter(schedtypesetter));
        }
        else if (event.getSource()==Tue0butt) {
            schedmenudata[1][0]=schedtypesetter;
            Tue0butt.setIcon(schedsetter(schedtypesetter));
        }
        else if (event.getSource()==Tue1butt) {
            schedmenudata[1][1]=schedtypesetter;
            Tue1butt.setIcon(schedsetter(schedtypesetter));
        }
        else if (event.getSource()==Tue2butt) {
            schedmenudata[1][2]=schedtypesetter;
            Tue2butt.setIcon(schedsetter(schedtypesetter));
        }
        else if (event.getSource()==Tue3butt) {
            schedmenudata[1][3]=schedtypesetter;
            Tue3butt.setIcon(schedsetter(schedtypesetter));
        }
        else if (event.getSource()==Tue4butt) {
            schedmenudata[1][4]=schedtypesetter;
            Tue4butt.setIcon(schedsetter(schedtypesetter));
        }
        else if (event.getSource()==Tue5butt) {
            schedmenudata[1][5]=schedtypesetter;
            Tue5butt.setIcon(schedsetter(schedtypesetter));
        }
        else if (event.getSource()==Tue6butt) {
            schedmenudata[1][6]=schedtypesetter;
            Tue6butt.setIcon(schedsetter(schedtypesetter));
        }
        else if (event.getSource()==Tue7butt) {
            schedmenudata[1][7]=schedtypesetter;
            Tue7butt.setIcon(schedsetter(schedtypesetter));
        }
        else if (event.getSource()==Tue8butt) {
            schedmenudata[1][8]=schedtypesetter;
            Tue8butt.setIcon(schedsetter(schedtypesetter));
        }
        else if (event.getSource()==Tue9butt) {
            schedmenudata[1][9]=schedtypesetter;
            Tue9butt.setIcon(schedsetter(schedtypesetter));
        }
        else if (event.getSource()==Tue10butt) {
            schedmenudata[1][10]=schedtypesetter;
            Tue10butt.setIcon(schedsetter(schedtypesetter));
        }
        else if (event.getSource()==Tue11butt) {
            schedmenudata[1][11]=schedtypesetter;
            Tue11butt.setIcon(schedsetter(schedtypesetter));
        }
        else if (event.getSource()==Tue12butt) {
            schedmenudata[1][12]=schedtypesetter;
            Tue12butt.setIcon(schedsetter(schedtypesetter));
        }
        else if (event.getSource()==Tue13butt) {
            schedmenudata[1][13]=schedtypesetter;
            Tue13butt.setIcon(schedsetter(schedtypesetter));
        }
        else if (event.getSource()==Tue14butt) {
            schedmenudata[1][14]=schedtypesetter;
            Tue14butt.setIcon(schedsetter(schedtypesetter));
        }
        else if (event.getSource()==Tue15butt) {
            schedmenudata[1][15]=schedtypesetter;
            Tue15butt.setIcon(schedsetter(schedtypesetter));
        }
        else if (event.getSource()==Tue16butt) {
            schedmenudata[1][16]=schedtypesetter;
            Tue16butt.setIcon(schedsetter(schedtypesetter));
        }
        else if (event.getSource()==Tue17butt) {
            schedmenudata[1][17]=schedtypesetter;
            Tue17butt.setIcon(schedsetter(schedtypesetter));
        }
        else if (event.getSource()==Tue18butt) {
            schedmenudata[1][18]=schedtypesetter;
            Tue18butt.setIcon(schedsetter(schedtypesetter));
        }
        else if (event.getSource()==Tue19butt) {
            schedmenudata[1][19]=schedtypesetter;
            Tue19butt.setIcon(schedsetter(schedtypesetter));
        }
        else if (event.getSource()==Tue20butt) {
            schedmenudata[1][20]=schedtypesetter;
            Tue20butt.setIcon(schedsetter(schedtypesetter));
        }
        else if (event.getSource()==Tue21butt) {
            schedmenudata[1][21]=schedtypesetter;
            Tue21butt.setIcon(schedsetter(schedtypesetter));
        }
        else if (event.getSource()==Tue22butt) {
            schedmenudata[1][22]=schedtypesetter;
            Tue22butt.setIcon(schedsetter(schedtypesetter));
        }
        else if (event.getSource()==Tue23butt) {
            schedmenudata[1][23]=schedtypesetter;
            Tue23butt.setIcon(schedsetter(schedtypesetter));
        }
        else if (event.getSource()==Wed0butt) {
            schedmenudata[2][0]=schedtypesetter;
            Wed0butt.setIcon(schedsetter(schedtypesetter));
        }
        else if (event.getSource()==Wed1butt) {
            schedmenudata[2][1]=schedtypesetter;
            Wed1butt.setIcon(schedsetter(schedtypesetter));
        }
        else if (event.getSource()==Wed2butt) {
            schedmenudata[2][2]=schedtypesetter;
            Wed2butt.setIcon(schedsetter(schedtypesetter));
        }
        else if (event.getSource()==Wed3butt) {
            schedmenudata[2][3]=schedtypesetter;
            Wed3butt.setIcon(schedsetter(schedtypesetter));
        }
        else if (event.getSource()==Wed4butt) {
            schedmenudata[2][4]=schedtypesetter;
            Wed4butt.setIcon(schedsetter(schedtypesetter));
        }
        else if (event.getSource()==Wed5butt) {
            schedmenudata[2][5]=schedtypesetter;
            Wed5butt.setIcon(schedsetter(schedtypesetter));
        }
        else if (event.getSource()==Wed6butt) {
            schedmenudata[2][6]=schedtypesetter;
            Wed6butt.setIcon(schedsetter(schedtypesetter));
        }
        else if (event.getSource()==Wed7butt) {
            schedmenudata[2][7]=schedtypesetter;
            Wed7butt.setIcon(schedsetter(schedtypesetter));
        }
        else if (event.getSource()==Wed8butt) {
            schedmenudata[2][8]=schedtypesetter;
            Wed8butt.setIcon(schedsetter(schedtypesetter));
        }
        else if (event.getSource()==Wed9butt) {
            schedmenudata[2][9]=schedtypesetter;
            Wed9butt.setIcon(schedsetter(schedtypesetter));
        }
        else if (event.getSource()==Wed10butt) {
            schedmenudata[2][10]=schedtypesetter;
            Wed10butt.setIcon(schedsetter(schedtypesetter));
        }
        else if (event.getSource()==Wed11butt) {
            schedmenudata[2][11]=schedtypesetter;
            Wed11butt.setIcon(schedsetter(schedtypesetter));
        }
        else if (event.getSource()==Wed12butt) {
            schedmenudata[2][12]=schedtypesetter;
            Wed12butt.setIcon(schedsetter(schedtypesetter));
        }
        else if (event.getSource()==Wed13butt) {
            schedmenudata[2][13]=schedtypesetter;
            Wed13butt.setIcon(schedsetter(schedtypesetter));
        }
        else if (event.getSource()==Wed14butt) {
            schedmenudata[2][14]=schedtypesetter;
            Wed14butt.setIcon(schedsetter(schedtypesetter));
        }
        else if (event.getSource()==Wed15butt) {
            schedmenudata[2][15]=schedtypesetter;
            Wed15butt.setIcon(schedsetter(schedtypesetter));
        }
        else if (event.getSource()==Wed16butt) {
            schedmenudata[2][16]=schedtypesetter;
            Wed16butt.setIcon(schedsetter(schedtypesetter));
        }
        else if (event.getSource()==Wed17butt) {
            schedmenudata[2][17]=schedtypesetter;
            Wed17butt.setIcon(schedsetter(schedtypesetter));
        }
        else if (event.getSource()==Wed18butt) {
            schedmenudata[2][18]=schedtypesetter;
            Wed18butt.setIcon(schedsetter(schedtypesetter));
        }
        else if (event.getSource()==Wed19butt) {
            schedmenudata[2][19]=schedtypesetter;
            Wed19butt.setIcon(schedsetter(schedtypesetter));
        }
        else if (event.getSource()==Wed20butt) {
            schedmenudata[2][20]=schedtypesetter;
            Wed20butt.setIcon(schedsetter(schedtypesetter));
        }
        else if (event.getSource()==Wed21butt) {
            schedmenudata[2][21]=schedtypesetter;
            Wed21butt.setIcon(schedsetter(schedtypesetter));
        }
        else if (event.getSource()==Wed22butt) {
            schedmenudata[2][22]=schedtypesetter;
            Wed22butt.setIcon(schedsetter(schedtypesetter));
        }
        else if (event.getSource()==Wed23butt) {
            schedmenudata[2][23]=schedtypesetter;
            Wed23butt.setIcon(schedsetter(schedtypesetter));
        }
        else if (event.getSource()==Thu0butt) {
            schedmenudata[3][0]=schedtypesetter;
            Thu0butt.setIcon(schedsetter(schedtypesetter));
        }
        else if (event.getSource()==Thu1butt) {
            schedmenudata[3][1]=schedtypesetter;
            Thu1butt.setIcon(schedsetter(schedtypesetter));
        }
        else if (event.getSource()==Thu2butt) {
            schedmenudata[3][2]=schedtypesetter;
            Thu2butt.setIcon(schedsetter(schedtypesetter));
        }
        else if (event.getSource()==Thu3butt) {
            schedmenudata[3][3]=schedtypesetter;
            Thu3butt.setIcon(schedsetter(schedtypesetter));
        }
        else if (event.getSource()==Thu4butt) {
            schedmenudata[3][4]=schedtypesetter;
            Thu4butt.setIcon(schedsetter(schedtypesetter));
        }
        else if (event.getSource()==Thu5butt) {
            schedmenudata[3][5]=schedtypesetter;
            Thu5butt.setIcon(schedsetter(schedtypesetter));
        }
        else if (event.getSource()==Thu6butt) {
            schedmenudata[3][6]=schedtypesetter;
            Thu6butt.setIcon(schedsetter(schedtypesetter));
        }
        else if (event.getSource()==Thu7butt) {
            schedmenudata[3][7]=schedtypesetter;
            Thu7butt.setIcon(schedsetter(schedtypesetter));
        }
        else if (event.getSource()==Thu8butt) {
            schedmenudata[3][8]=schedtypesetter;
            Thu8butt.setIcon(schedsetter(schedtypesetter));
        }
        else if (event.getSource()==Thu9butt) {
            schedmenudata[3][9]=schedtypesetter;
            Thu9butt.setIcon(schedsetter(schedtypesetter));
        }
        else if (event.getSource()==Thu10butt) {
            schedmenudata[3][10]=schedtypesetter;
            Thu10butt.setIcon(schedsetter(schedtypesetter));
        }
        else if (event.getSource()==Thu11butt) {
            schedmenudata[3][11]=schedtypesetter;
            Thu11butt.setIcon(schedsetter(schedtypesetter));
        }
        else if (event.getSource()==Thu12butt) {
            schedmenudata[3][12]=schedtypesetter;
            Thu12butt.setIcon(schedsetter(schedtypesetter));
        }
        else if (event.getSource()==Thu13butt) {
            schedmenudata[3][13]=schedtypesetter;
            Thu13butt.setIcon(schedsetter(schedtypesetter));
        }
        else if (event.getSource()==Thu14butt) {
            schedmenudata[3][14]=schedtypesetter;
            Thu14butt.setIcon(schedsetter(schedtypesetter));
        }
        else if (event.getSource()==Thu15butt) {
            schedmenudata[3][15]=schedtypesetter;
            Thu15butt.setIcon(schedsetter(schedtypesetter));
        }
        else if (event.getSource()==Thu16butt) {
            schedmenudata[3][16]=schedtypesetter;
            Thu16butt.setIcon(schedsetter(schedtypesetter));
        }
        else if (event.getSource()==Thu17butt) {
            schedmenudata[3][17]=schedtypesetter;
            Thu17butt.setIcon(schedsetter(schedtypesetter));
        }
        else if (event.getSource()==Thu18butt) {
            schedmenudata[3][18]=schedtypesetter;
            Thu18butt.setIcon(schedsetter(schedtypesetter));
        }
        else if (event.getSource()==Thu19butt) {
            schedmenudata[3][19]=schedtypesetter;
            Thu19butt.setIcon(schedsetter(schedtypesetter));
        }
        else if (event.getSource()==Thu20butt) {
            schedmenudata[3][20]=schedtypesetter;
            Thu20butt.setIcon(schedsetter(schedtypesetter));
        }
        else if (event.getSource()==Thu21butt) {
            schedmenudata[3][21]=schedtypesetter;
            Thu21butt.setIcon(schedsetter(schedtypesetter));
        }
        else if (event.getSource()==Thu22butt) {
            schedmenudata[3][22]=schedtypesetter;
            Thu22butt.setIcon(schedsetter(schedtypesetter));
        }
        else if (event.getSource()==Thu23butt) {
            schedmenudata[3][23]=schedtypesetter;
            Thu23butt.setIcon(schedsetter(schedtypesetter));
        }
        else if (event.getSource()==Fri0butt) {
            schedmenudata[4][0]=schedtypesetter;
            Fri0butt.setIcon(schedsetter(schedtypesetter));
        }
        else if (event.getSource()==Fri1butt) {
            schedmenudata[4][1]=schedtypesetter;
            Fri1butt.setIcon(schedsetter(schedtypesetter));
        }
        else if (event.getSource()==Fri2butt) {
            schedmenudata[4][2]=schedtypesetter;
            Fri2butt.setIcon(schedsetter(schedtypesetter));
        }
        else if (event.getSource()==Fri3butt) {
            schedmenudata[4][3]=schedtypesetter;
            Fri3butt.setIcon(schedsetter(schedtypesetter));
        }
        else if (event.getSource()==Fri4butt) {
            schedmenudata[4][4]=schedtypesetter;
            Fri4butt.setIcon(schedsetter(schedtypesetter));
        }
        else if (event.getSource()==Fri5butt) {
            schedmenudata[4][5]=schedtypesetter;
            Fri5butt.setIcon(schedsetter(schedtypesetter));
        }
        else if (event.getSource()==Fri6butt) {
            schedmenudata[4][6]=schedtypesetter;
            Fri6butt.setIcon(schedsetter(schedtypesetter));
        }
        else if (event.getSource()==Fri7butt) {
            schedmenudata[4][7]=schedtypesetter;
            Fri7butt.setIcon(schedsetter(schedtypesetter));
        }
        else if (event.getSource()==Fri8butt) {
            schedmenudata[4][8]=schedtypesetter;
            Fri8butt.setIcon(schedsetter(schedtypesetter));
        }
        else if (event.getSource()==Fri9butt) {
            schedmenudata[4][9]=schedtypesetter;
            Fri9butt.setIcon(schedsetter(schedtypesetter));
        }
        else if (event.getSource()==Fri10butt) {
            schedmenudata[4][10]=schedtypesetter;
            Fri10butt.setIcon(schedsetter(schedtypesetter));
        }
        else if (event.getSource()==Fri11butt) {
            schedmenudata[4][11]=schedtypesetter;
            Fri11butt.setIcon(schedsetter(schedtypesetter));
        }
        else if (event.getSource()==Fri12butt) {
            schedmenudata[4][12]=schedtypesetter;
            Fri12butt.setIcon(schedsetter(schedtypesetter));
        }
        else if (event.getSource()==Fri13butt) {
            schedmenudata[4][13]=schedtypesetter;
            Fri13butt.setIcon(schedsetter(schedtypesetter));
        }
        else if (event.getSource()==Fri14butt) {
            schedmenudata[4][14]=schedtypesetter;
            Fri14butt.setIcon(schedsetter(schedtypesetter));
        }
        else if (event.getSource()==Fri15butt) {
            schedmenudata[4][15]=schedtypesetter;
            Fri15butt.setIcon(schedsetter(schedtypesetter));
        }
        else if (event.getSource()==Fri16butt) {
            schedmenudata[4][16]=schedtypesetter;
            Fri16butt.setIcon(schedsetter(schedtypesetter));
        }
        else if (event.getSource()==Fri17butt) {
            schedmenudata[4][17]=schedtypesetter;
            Fri17butt.setIcon(schedsetter(schedtypesetter));
        }
        else if (event.getSource()==Fri18butt) {
            schedmenudata[4][18]=schedtypesetter;
            Fri18butt.setIcon(schedsetter(schedtypesetter));
        }
        else if (event.getSource()==Fri19butt) {
            schedmenudata[4][19]=schedtypesetter;
            Fri19butt.setIcon(schedsetter(schedtypesetter));
        }
        else if (event.getSource()==Fri20butt) {
            schedmenudata[4][20]=schedtypesetter;
            Fri20butt.setIcon(schedsetter(schedtypesetter));
        }
        else if (event.getSource()==Fri21butt) {
            schedmenudata[4][21]=schedtypesetter;
            Fri21butt.setIcon(schedsetter(schedtypesetter));
        }
        else if (event.getSource()==Fri22butt) {
            schedmenudata[4][22]=schedtypesetter;
            Fri22butt.setIcon(schedsetter(schedtypesetter));
        }
        else if (event.getSource()==Fri23butt) {
            schedmenudata[4][23]=schedtypesetter;
            Fri23butt.setIcon(schedsetter(schedtypesetter));
        }
        else if (event.getSource()==Sat0butt) {
            schedmenudata[5][0]=schedtypesetter;
            Sat0butt.setIcon(schedsetter(schedtypesetter));
        }
        else if (event.getSource()==Sat1butt) {
            schedmenudata[5][1]=schedtypesetter;
            Sat1butt.setIcon(schedsetter(schedtypesetter));
        }
        else if (event.getSource()==Sat2butt) {
            schedmenudata[5][2]=schedtypesetter;
            Sat2butt.setIcon(schedsetter(schedtypesetter));
        }
        else if (event.getSource()==Sat3butt) {
            schedmenudata[5][3]=schedtypesetter;
            Sat3butt.setIcon(schedsetter(schedtypesetter));
        }
        else if (event.getSource()==Sat4butt) {
            schedmenudata[5][4]=schedtypesetter;
            Sat4butt.setIcon(schedsetter(schedtypesetter));
        }
        else if (event.getSource()==Sat5butt) {
            schedmenudata[5][5]=schedtypesetter;
            Sat5butt.setIcon(schedsetter(schedtypesetter));
        }
        else if (event.getSource()==Sat6butt) {
            schedmenudata[5][6]=schedtypesetter;
            Sat6butt.setIcon(schedsetter(schedtypesetter));
        }
        else if (event.getSource()==Sat7butt) {
            schedmenudata[5][7]=schedtypesetter;
            Sat7butt.setIcon(schedsetter(schedtypesetter));
        }
        else if (event.getSource()==Sat8butt) {
            schedmenudata[5][8]=schedtypesetter;
            Sat8butt.setIcon(schedsetter(schedtypesetter));
        }
        else if (event.getSource()==Sat9butt) {
            schedmenudata[5][9]=schedtypesetter;
            Sat9butt.setIcon(schedsetter(schedtypesetter));
        }
        else if (event.getSource()==Sat10butt) {
            schedmenudata[5][10]=schedtypesetter;
            Sat10butt.setIcon(schedsetter(schedtypesetter));
        }
        else if (event.getSource()==Sat11butt) {
            schedmenudata[5][11]=schedtypesetter;
            Sat11butt.setIcon(schedsetter(schedtypesetter));
        }
        else if (event.getSource()==Sat12butt) {
            schedmenudata[5][12]=schedtypesetter;
            Sat12butt.setIcon(schedsetter(schedtypesetter));
        }
        else if (event.getSource()==Sat13butt) {
            schedmenudata[5][13]=schedtypesetter;
            Sat13butt.setIcon(schedsetter(schedtypesetter));
        }
        else if (event.getSource()==Sat14butt) {
            schedmenudata[5][14]=schedtypesetter;
            Sat14butt.setIcon(schedsetter(schedtypesetter));
        }
        else if (event.getSource()==Sat15butt) {
            schedmenudata[5][15]=schedtypesetter;
            Sat15butt.setIcon(schedsetter(schedtypesetter));
        }
        else if (event.getSource()==Sat16butt) {
            schedmenudata[5][16]=schedtypesetter;
            Sat16butt.setIcon(schedsetter(schedtypesetter));
        }
        else if (event.getSource()==Sat17butt) {
            schedmenudata[5][17]=schedtypesetter;
            Sat17butt.setIcon(schedsetter(schedtypesetter));
        }
        else if (event.getSource()==Sat18butt) {
            schedmenudata[5][18]=schedtypesetter;
            Sat18butt.setIcon(schedsetter(schedtypesetter));
        }
        else if (event.getSource()==Sat19butt) {
            schedmenudata[5][19]=schedtypesetter;
            Sat19butt.setIcon(schedsetter(schedtypesetter));
        }
        else if (event.getSource()==Sat20butt) {
            schedmenudata[5][20]=schedtypesetter;
            Sat20butt.setIcon(schedsetter(schedtypesetter));
        }
        else if (event.getSource()==Sat21butt) {
            schedmenudata[5][21]=schedtypesetter;
            Sat21butt.setIcon(schedsetter(schedtypesetter));
        }
        else if (event.getSource()==Sat22butt) {
            schedmenudata[5][22]=schedtypesetter;
            Sat22butt.setIcon(schedsetter(schedtypesetter));
        }
        else if (event.getSource()==Sat23butt) {
            schedmenudata[5][23]=schedtypesetter;
            Sat23butt.setIcon(schedsetter(schedtypesetter));
        }
        else if (event.getSource()==Sun0butt) {
            schedmenudata[6][0]=schedtypesetter;
            Sun0butt.setIcon(schedsetter(schedtypesetter));
        }
        else if (event.getSource()==Sun1butt) {
            schedmenudata[6][1]=schedtypesetter;
            Sun1butt.setIcon(schedsetter(schedtypesetter));
        }
        else if (event.getSource()==Sun2butt) {
            schedmenudata[6][2]=schedtypesetter;
            Sun2butt.setIcon(schedsetter(schedtypesetter));
        }
        else if (event.getSource()==Sun3butt) {
            schedmenudata[6][3]=schedtypesetter;
            Sun3butt.setIcon(schedsetter(schedtypesetter));
        }
        else if (event.getSource()==Sun4butt) {
            schedmenudata[6][4]=schedtypesetter;
            Sun4butt.setIcon(schedsetter(schedtypesetter));
        }
        else if (event.getSource()==Sun5butt) {
            schedmenudata[6][5]=schedtypesetter;
            Sun5butt.setIcon(schedsetter(schedtypesetter));
        }
        else if (event.getSource()==Sun6butt) {
            schedmenudata[6][6]=schedtypesetter;
            Sun6butt.setIcon(schedsetter(schedtypesetter));
        }
        else if (event.getSource()==Sun7butt) {
            schedmenudata[6][7]=schedtypesetter;
            Sun7butt.setIcon(schedsetter(schedtypesetter));
        }
        else if (event.getSource()==Sun8butt) {
            schedmenudata[6][8]=schedtypesetter;
            Sun8butt.setIcon(schedsetter(schedtypesetter));
        }
        else if (event.getSource()==Sun9butt) {
            schedmenudata[6][9]=schedtypesetter;
            Sun9butt.setIcon(schedsetter(schedtypesetter));
        }
        else if (event.getSource()==Sun10butt) {
            schedmenudata[6][10]=schedtypesetter;
            Sun10butt.setIcon(schedsetter(schedtypesetter));
        }
        else if (event.getSource()==Sun11butt) {
            schedmenudata[6][11]=schedtypesetter;
            Sun11butt.setIcon(schedsetter(schedtypesetter));
        }
        else if (event.getSource()==Sun12butt) {
            schedmenudata[6][12]=schedtypesetter;
            Sun12butt.setIcon(schedsetter(schedtypesetter));
        }
        else if (event.getSource()==Sun13butt) {
            schedmenudata[6][13]=schedtypesetter;
            Sun13butt.setIcon(schedsetter(schedtypesetter));
        }
        else if (event.getSource()==Sun14butt) {
            schedmenudata[6][14]=schedtypesetter;
            Sun14butt.setIcon(schedsetter(schedtypesetter));
        }
        else if (event.getSource()==Sun15butt) {
            schedmenudata[6][15]=schedtypesetter;
            Sun15butt.setIcon(schedsetter(schedtypesetter));
        }
        else if (event.getSource()==Sun16butt) {
            schedmenudata[6][16]=schedtypesetter;
            Sun16butt.setIcon(schedsetter(schedtypesetter));
        }
        else if (event.getSource()==Sun17butt) {
            schedmenudata[6][17]=schedtypesetter;
            Sun17butt.setIcon(schedsetter(schedtypesetter));
        }
        else if (event.getSource()==Sun18butt) {
            schedmenudata[6][18]=schedtypesetter;
            Sun18butt.setIcon(schedsetter(schedtypesetter));
        }
        else if (event.getSource()==Sun19butt) {
            schedmenudata[6][19]=schedtypesetter;
            Sun19butt.setIcon(schedsetter(schedtypesetter));
        }
        else if (event.getSource()==Sun20butt) {
            schedmenudata[6][20]=schedtypesetter;
            Sun20butt.setIcon(schedsetter(schedtypesetter));
        }
        else if (event.getSource()==Sun21butt) {
            schedmenudata[6][21]=schedtypesetter;
            Sun21butt.setIcon(schedsetter(schedtypesetter));
        }
        else if (event.getSource()==Sun22butt) {
            schedmenudata[6][22]=schedtypesetter;
            Sun22butt.setIcon(schedsetter(schedtypesetter));
        }
        else{
            schedmenudata[6][23]=schedtypesetter;
            Sun23butt.setIcon(schedsetter(schedtypesetter));
        }
    }
}
//==================================================================
// calEnder functions
//==================================================================
public static int dayofweekindex(String givendayofweek) {
        if (givendayofweek=="SUNDAY") {
            return 0;
        }
        else if (givendayofweek=="MONDAY") {
            return 1;
        }
        else if (givendayofweek=="TUESDAY") {
            return 2;
        }
        else if (givendayofweek=="WEDNESDAY") {
            return 3;
        }
        else if (givendayofweek=="THURSDAY") {
            return 4;
        }
        else if (givendayofweek=="FRIDAY") {
            return 5;
        }
        else {
            return 6;
        }
}
public ImageIcon calpicker(int startofweek){
    if (startofweek==0) {
    return cal0;
    }
    else if (startofweek==1) {
        return cal1;
    }
    else if (startofweek==2) {
        return cal2;
    }
    else if (startofweek==3) {
        return cal3;
    }
    else if (startofweek==4) {
        return cal4;
    }
    else if (startofweek==5) {
        return cal5;
    }
    else {
        return cal6;
    }
}
//==================================================================
// management functions
//==================================================================
public void closerIhardlyknewer()
{
    // main menu closer
    questozone.setBounds(0, 0, 0, 0);
    frinedzone.setBounds(0, 0, 0, 0);
    schedzone.setBounds(0, 0, 0, 0);
    datumzone.setBounds(0, 0, 0, 0);
    exegol.setBounds(0, 0, 0, 0);
    // sub menu closer
    //questo
    blackberrybasket.setBounds(0, 0, 0, 0);
    blueberrybasket.setBounds(0, 0, 0, 0);
    strawberrybasket.setBounds(0, 0, 0, 0);
    elderberrybasket.setBounds(0, 0, 0, 0);
    salmonberrybasket.setBounds(0, 0, 0, 0);
    sweetgemberrybasket.setBounds(0, 0, 0, 0);
    // calEnder
    monthlol.setBounds(0, 0, 0, 0);
    // shed
    scoobutt.setBounds(0, 0, 0, 0);
    mightworkbutt.setBounds(0, 0, 0, 0);
    emilebutt.setBounds(0, 0, 0, 0);
    leetboibutt.setBounds(0, 0, 0, 0);
    gemerbutt.setBounds(0, 0, 0, 0);
    alphacentauributt.setBounds(0, 0, 0, 0);
    zedzedzedbutt.setBounds(0, 0, 0, 0);
    eraserheadbutt.setBounds(0, 0, 0, 0);
    
    for (int retrival=0; retrival < 24; retrival++) {
        schednamereposity(retrival).setBounds(0, 0, 0, 0);
    };
    for (int retrival=24; retrival < 48; retrival++) {
        schednamereposity(retrival).setBounds(0, 0, 0, 0);
    };
    for (int retrival=48; retrival < 72; retrival++) {
        schednamereposity(retrival).setBounds(0, 0, 0, 0);
    };
    for (int retrival=72; retrival < 96; retrival++) {
        schednamereposity(retrival).setBounds(0, 0, 0, 0);
    };
    for (int retrival=96; retrival < 120; retrival++) {
        schednamereposity(retrival).setBounds(0, 0, 0, 0);
    };
    for (int retrival=120; retrival < 144; retrival++) {
        schednamereposity(retrival).setBounds(0, 0, 0, 0);
    };
    for (int retrival=144; retrival < 168; retrival++) {
        schednamereposity(retrival).setBounds(0, 0, 0, 0);
    };
    //frined
    Agift1mark.setBounds(0, 0, 0, 0);
    Agift2mark.setBounds(0, 0, 0, 0);
    Atalkmark.setBounds(0, 0, 0, 0);
    Bgift1mark.setBounds(0, 0, 0, 0);
    Bgift2mark.setBounds(0, 0, 0, 0);
    Btalkmark.setBounds(0, 0, 0, 0);
    Cgift1mark.setBounds(0, 0, 0, 0);
    Cgift2mark.setBounds(0, 0, 0, 0);
    Ctalkmark.setBounds(0, 0, 0, 0);
    Dgift1mark.setBounds(0, 0, 0, 0);
    Dgift2mark.setBounds(0, 0, 0, 0);
    Dtalkmark.setBounds(0, 0, 0, 0);
    Egift1mark.setBounds(0, 0, 0, 0);
    Egift2mark.setBounds(0, 0, 0, 0);
    Etalkmark.setBounds(0, 0, 0, 0);
    Aheartbutt.setBounds(0, 0, 0, 0);
    Bheartbutt.setBounds(0, 0, 0, 0);
    Cheartbutt.setBounds(0, 0, 0, 0);
    Dheartbutt.setBounds(0, 0, 0, 0);
    Eheartbutt.setBounds(0, 0, 0, 0);
    // re-opener
    frined.setBounds(1122, 262, 36, 40);
    sched.setBounds(1170, 262, 36, 40);
}
public ImageIcon seasondeterminer(int montho){
    if (montho == 12 || montho==1 ||  montho==2) {
        return firstowii;
    }
    if (montho == 3 || montho==4 ||  montho==5) {
        return firstosp;
    }
    if (montho == 6 || montho==7 ||  montho==8) {
        return firstosu;
    }
    else{
        return firstofa;
    }
}
public ImageIcon seasonicondeterminer(int montho){
    if (montho == 12 || montho==1 ||  montho==2) {
        return seasthemnugin;
    }
    if (montho == 3 || montho==4 ||  montho==5) {
        return seasthemspr;
    }
    if (montho == 6 || montho==7 ||  montho==8) {
        return seasthemsum;
    }
    else{
        return seasthemfaa;
    }
}
public void addsecretlabel(JLabel bobmarley){
    add(bobmarley);
    bobmarley.setBounds(0, 0, 0, 0);
}
public void addsecretbutton(JButton robmarley){
    add(robmarley);
    robmarley.setBounds(0, 0, 0, 0);
}
public void addsecretschedbutton(JButton Todmarley){
    add(Todmarley);
    Todmarley.setBounds(0, 0, 0, 0);
    Todmarley.addActionListener(new schedbutttap());
}
public void temptimmyupdateroo(){
    tim.setText(timmy);
    dayo.setText(datboi);
}

private static void writeArrayToFile(String fileName) {
    try (PrintWriter writer = new PrintWriter(fileName)) {
        writer.print("Cashola");
        writer.println();
        writer.print(chacha);
        writer.println();
        
        writer.print("Questdata");
        writer.println();
        writer.print(blackberry);
        writer.println();
        writer.print(blueberry);
        writer.println();
        writer.print(strawberry);
        writer.println();
        writer.print(elderberry);
        writer.println();
        writer.print(salmonberry);
        writer.println();
        writer.print(sweetgemberry);
        writer.println();
        writer.print("Frineddata");
        writer.println();
        
        for (int exxiboi=0; exxiboi < 5; exxiboi++) {
                    writer.print("Frineddata" + exxiboi);
                    writer.println();
                    for (int whyboi=0; whyboi < 4; whyboi++) {
                    writer.print(String.valueOf(frinedmenudata[exxiboi][whyboi]) + " ");
                    };
                    writer.println();
                };
                
        writer.print("Scheddata");
        writer.println();
        for (int exxiboi=0; exxiboi < 7; exxiboi++) {
                    writer.print("Day" + exxiboi);
                    writer.println();
                    for (int whyboi=0; whyboi < 24; whyboi++) {
                        writer.print(String.valueOf(schedmenudata[exxiboi][whyboi]) + " ");
                        };
                    writer.println();
                };
        
        writer.print("File End");
        writer.println();
        }
    catch (FileNotFoundException e) {
        e.printStackTrace();
    }
}
}
