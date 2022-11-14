public class Main {
    public static void main(String[] args) {
        //Задание 1
        System.out.println("Задание 1");
        int bananas = 800;
        System.out.println("значение переменной bananas с переменной int равно " + bananas);
        byte pillows = 125;
        System.out.println("значение переменной pillows с переменной byte равно " + pillows);
        short doors = 32000;
        System.out.println("значение переменной doors с переменной short равно " + doors);
        long seeds = 78754L;
        System.out.println("значение переменной seeds с переменной long равно " + seeds);
        float grams = 2.7837F;
        System.out.println("значение переменной grams с переменной float равно " + grams);
        double e = 2.8;
        System.out.println("значение переменной e с переменной double равно " + e);
        // Задача 2
        System.out.println("Задача 2");
        double variables1 = 27.2;
        long variables2 = 987_678_965_549L;
        byte variables3 = 2;
        short variables4 = 786;
        boolean variables5 = false;
        char variables6=569;
        float variables7=-159F;
        int variables8=278974;
        short variables9=67;
        // Задача 3
        System.out.println("Задача 3");
        var pupils_1_Class=23;
        var pupils_2_Class=27;
        var pupils_3_Class=30;
        var papersCount=480;
        var papersPerPupil = papersCount/(pupils_1_Class+pupils_2_Class+pupils_3_Class);
        System.out.println("на каждого ученика расчитано"+ papersPerPupil+"листов бумаги");
        // Задача 4
        System.out.println("Задача 4");
        var bottle = 16;
        var minutes = 2;
        var productivityInOneMinute= bottle/minutes;
        System.out.println("производительность за одну минуту"+bottle/minutes+"штук");
        var twentyMinutes = 20;
        var productivityTwentyMinutes=twentyMinutes * productivityInOneMinute;
        System.out.println(" производительность за двадцать минут " + twentyMinutes* productivityInOneMinute + " штук " );
        var inDayHours=24;
        var inOneHoursMinutes=60;
        var minutesInDay= 24*60;
        System.out.println(" в сутках " + inDayHours*inOneHoursMinutes + " минут ");
        var minutesInThreeDays=3 * minutesInDay;
        System.out.println(" за  " +  minutesInThreeDays + " минут машина произвела бутылок " + productivityInOneMinute * minutesInThreeDays + " штук " );
        var minutesInMonth=10*minutesInThreeDays;
        System.out.println("за " + minutesInMonth + " минут машина произвела бутылок " + productivityInOneMinute * minutesInMonth+"штук");
        // Задача 5
        System.out.println("Задача5");
        var totalCans=120;
        var whiteCansPerClass =2;
        var brownCansPerClass =4;
        var totalClass = totalCans/ (whiteCansPerClass+brownCansPerClass);
        var totalWhiteCans= totalClass * whiteCansPerClass;
        var totalBrownCans=totalClass * brownCansPerClass;
        System.out.println (" В школе где " +totalClass+ " классов,нужно " +totalWhiteCans+ " банок белой краски и банок " + totalBrownCans + " коричневой краски ");
        //Задача 6
        System.out.println("Задача6");
        var baNaNasGrams = 80;
        var milkGrams = 105;
        var iceCreamGrams = 100;
        var egsGrams = 70;
        var totalGrams = 80+105+100+70;
        System.out.println(" Всего  " + ( baNaNasGrams + milkGrams + iceCreamGrams + egsGrams + " грамм завтрака "));
        var kiloGram=1000;
        var totalGramsBreakfast = 355;
        float  kilogramInBreakfast = totalGramsBreakfast /(float) kiloGram;
        System.out.println ( " Килограм в завтраке " + kilogramInBreakfast);
        // Задача 6
        System.out.println("Задача 6 ");
        int needToResetGrams=7000;
        System.out.println(" Спортсмену надо сбросить  " + ( needToResetGrams ) + " грамм " );
        int losesEveryDay=250;
        System.out.println( " Если он будет худеть на  " + losesEveryDay + " грам каждый день ");
        int itWillTakeDays=needToResetGrams/losesEveryDay;
        System.out.println(" На похудение понадобится " + needToResetGrams/losesEveryDay + " дней " );
         losesEveryDay=250*2;
        System.out.println( " Если спортсмен будет тратить " + losesEveryDay+ " то похудеет за " + needToResetGrams/losesEveryDay + " дней " );
        //Задача 8
        System.out.println("Задача 8");
        int mashaGets= 67760;
        System.out.println( " Маша получает зарплату " +mashaGets);
        int afterIncrease=67760/100*10+67760;
        int revenueIncreasedBy=6776;
        System.out.println( " После повышения она получает " + afterIncrease + " годовой доход вырос на " + revenueIncreasedBy );
        int denisGets=83690;
        System.out.println( " Денис получает зарплату " +mashaGets);
        int after  = 83690/100*10+83690;
        int incomeHasGrown=8369;
        System.out.println( " После повышения он получает " + after + " годовой доход вырос на " +incomeHasGrown );
        int kristinaGets=76230;
        System.out.println( " Кристина получает зарплату " +kristinaGets);
        int nowItGets=76230/100*10+76230;
        int theIncreaseWas=7623;
        System.out.println( " После повышения она получает " + nowItGets + " годовой доход вырос на " + theIncreaseWas  );















    }

}