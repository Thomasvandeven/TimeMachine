package Application_Bday;

import java.math.BigDecimal;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Formatter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("EEEE, dd MMM yyyy HH:mm:ssa");
        LocalDateTime ldt = LocalDateTime.now();
        String ldtString = dtf.format(ldt);
        System.out.println(ldtString);


        LocalDate date1 = LocalDate.now();
        System.out.println("");
        System.out.format("XXxXXXXXXXXXXXXXXXXxXX * " + "%1$td-%1$tm-%1$tY", date1);
        System.out.format(" * XXxXXXXXXXXXXXXXXXXxXX" + "\n");


        ZoneId zoneId = ZoneId.of("Europe/Brussels");
        System.out.println("\n" + "ZoneId: " + zoneId);

        ZoneId systemZoneId = ZoneId.systemDefault();
        System.out.println("The Current System's (Default) Zone: " + systemZoneId);

        ZoneOffset timeZone = ZoneOffset.ofHours(2);
        System.out.println("Zone offset: " + timeZone);

        System.out.println("\n" + "Time Zone Abbreviation = UTC +2, CEST Central European Summer Time.");
        System.out.println("Time Zone will change to CET: UTC +1, Central European Time (31 okt 2021, 03:00).");
        System.out.println("Time Zone will change to CEST: UTC +2, Central European Summer Time (zo 27 mrt 2022, 02:00).");

        Instant now = Instant.now();

        System.out.format("\n" + "time Sample:" + now.atOffset(ZoneOffset.ofHours(2))); // timezone bij ons is +2

        System.out.println("\n" + "XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX" + "\n");

        System.out.println("Measuring systems" + "\n" + LocalDateTime.now());
      //  System.out.println("Atomic clock (SI) Units, Defined as about 9 billion oscillations of the caesium atom");

        System.out.println("\n" + "XXXXXXXXXXXXXXXXXX My homemade Universal Time Machine Version I.I XXXXXXXXXXXXXXXXXXXXX" + "\n");
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Gelieve uw geboortedatum in te geven :");
        String inputd = keyboard.nextLine();
        //  String inputm = keyboard.nextLine();
        //  String inputy = keyboard.nextLine();

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate date = LocalDate.parse(inputd, formatter);
        LocalDate birthday = date;
        LocalDateTime now1 = LocalDateTime.now();
        System.out.println("");
        System.out.format("%1$td %1$tb %1$tY  %1$tH:%1$tM:%1$tS" + "\n", now1);
        System.out.format("%1$td %1$tb %1$tY" + "\n", date);


        BigDecimal myHours = BigDecimal.valueOf(24);
        BigDecimal bdurenpdag = myHours;
        BigDecimal myMinutes = BigDecimal.valueOf(1440);
        BigDecimal minuten = myMinutes;
        BigDecimal mySeconds = BigDecimal.valueOf(86400);
        BigDecimal sec = mySeconds;
        Long ltotdagen = date1.until(birthday, ChronoUnit.DAYS);
        BigDecimal mijnsweken = BigDecimal.valueOf(0.1428571428571);
        BigDecimal myWeeks = mijnsweken;
        BigDecimal bdweken = myWeeks;

        Long ltotaalverschiljaren = date1.until(birthday, ChronoUnit.YEARS);
        Long ldagen = ltotdagen;
        BigDecimal baantaldagenpos = BigDecimal.valueOf(Math.abs(ldagen)); // maakt + van de -
        Long maanden = date1.until(birthday, ChronoUnit.MONTHS);

        Formatter f = new Formatter();
        System.out.println(f.toString()); // om datum te formateren zoals bij weken/weeks alive
        //
        System.out.format("Day of birth: " + "%1$td-%1$tm-%1$tY", birthday);
        System.out.println("");
        System.out.format("Years alive: " + Math.abs(ltotaalverschiljaren));
        System.out.println("\n");
        System.out.println("Months alive: " + Math.abs(maanden));
        System.out.format("Weeks alive: " + "%.1f", myWeeks.multiply(baantaldagenpos));
        System.out.println(" ");
        System.out.println("Days alive: " + baantaldagenpos);
        System.out.println("Hours alive: " + baantaldagenpos.multiply(bdurenpdag));
        System.out.println("Minutes alive: " + baantaldagenpos.multiply(minuten));
        System.out.println("Seconds alive: " + baantaldagenpos.multiply(sec));

//
        int aantaldagen = baantaldagenpos.intValue();
        int aantaljaar = Math.abs(ltotaalverschiljaren.intValue());

        // converted :
        //       System.out.println(aantaljaar);
        //       System.out.println(aantaldagen);

        LocalDate Sinds = (LocalDate.ofYearDay(2020, 366)); // defining start counting for nulber of days is 2021
        LocalDate nogaantaldagen = (LocalDate.of(2021, 12, 31));  // defining NY


        ////
        LocalDate dateyear = LocalDate.now();
        System.out.println("");
        System.out.format("XXxXXXXXXXXXXXXXXXXxXX * " + "%1$tY", dateyear);
        System.out.format(" * XXxXXXXXXXXXXXXXXXXxXX" + "\n");

        /////


        Long tussen = Sinds.until(LocalDate.now(), ChronoUnit.DAYS);
        Long nogtotNY = LocalDate.now().until(nogaantaldagen, ChronoUnit.DAYS);

        // Creating next birthday date + calculating from date now until the next bday:
        int nextbday = aantaljaar + 1;
        LocalDate volgendBday = birthday.plusYears(nextbday);
        Long nogtotBday = LocalDate.now().until(volgendBday, ChronoUnit.DAYS);

//   invisible     add years to calculate when next bday is = System.out.println(nextbday);
        //       System.out.println("next bday :" + volgendBday);

        System.out.println("");
        System.out.format(tussen + " days scince " + "%1$tY", dateyear);
        System.out.println(".");
        System.out.println(nogtotBday + " days until your next birthday.");
        System.out.println(nogtotNY + " days until New Year.");
    }
}

