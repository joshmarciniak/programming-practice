import java.util.*;

//This code was created by the following: Naveena Kesani, Matthew Kessler, Joshua Marciniak, Kay Martens, Gabe Nava, Autumn Neil, Olisebuka Obioha

public class Calendars
{
public static void main(String args[])
{
Scanner console = new Scanner(System.in);

System.out.println("This program takes the input of the year 2018 and displays the calendar for that year.  The year entered is checked to see if it is a leap year.");

Int year;

year = console.nextInt();

System.out.println(year + "Calendar");

boolean leap = false;
            if(Y % 4 == 0)
            {
                if( Y % 100 == 0)
                {
                
                    if ( Y % 400 == 0)
                        leap = true;
                    else
                        leap = false;
                }
                else
                    leap = true;
            }
            else
                leap = false;

            if(leap)
                System.out.println(Y + " is a leap year.");
            else
                System.out.println(Y + " is not a leap year.");

public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
    System.out.print("Enter the desired year:");
    int year= sc.nextInt();
    String[] month_names = {"",   "January", "February", "March", "April", "May", "June", "July", "August", "September",    "October", "November", "December"
};
import java.util.*;
public class Calendar
{
 public static void main(String args[])
 {
  System.out.println("This program prompts the user to enter the year 2018."+
  "\nOnce entered, the program checks to see if this year is a leap year or not." +
  "\nIt then outputs the calendar for the year 2018.");
  int year;
  Scanner console = new Scanner(System.in);
  System.out.println("Please enter the year 2018.");
  year = console.nextInt();
  while(year != 2018)
  {
   System.out.println("Please enter the year 2018.");
   year = console.nextInt();
  }
  int month = 1;
  int startDay;
  int firstDay = 2;
  int day = 1, day2 = 1, day3 = 1, day4 =1, day5 = 1, day6 = 1, day7 = 1, day8 = 1, day9 =1, day10 = 1, day11 = 1, day12 = 1;
  int counter = 1;
  boolean leap = false;
  for(month = 1; month <=12; month++)
  {
   if(month == 1)
   {
    System.out.println("January " + year);
    System.out.println();
    System.out.println("Sun\tMon\tTue\tWed\tThu\tFri\tSat\n");
    startDay = firstDay;
    for(counter = 1; counter <= 36; counter++)
     {
      if(counter < startDay)
       System.out.print("\t");
      else if(counter == 8 || counter == 16 || counter == 24 || counter == 32)
       System.out.print("\n");
      else
       {
        System.out.print(day + "\t");
        day++;
       }
     }
   System.out.println();
   System.out.println();
   }
  else if (month == 2)
   {
    System.out.println("February " + year);
    System.out.println();
    System.out.println("Sun\tMon\tTue\tWed\tThu\tFri\tSat\n");
    startDay = ((31%7)+firstDay);
       { 
        if(startDay == 0)
         startDay = 7;
       }
     {
      if(year % 4 == 0)
       {
        if(year % 100 == 0)
         {
          if(year % 400 == 0)
           leap = true;
          else leap = false;
         }
        else
         leap = true;
       }
      else
       leap = false;
     }
   {
    if(leap == true)
     {
      for(counter = 1; counter <= 37; counter++)
       {
        if(counter < startDay)
         System.out.print("\t");
        else if(counter == 8 || counter == 16 || counter == 24 || counter == 32)
         System.out.print("\n");
        else
         {
          System.out.print(day2 + "\t");
          day2++;
         
         }
       }
      System.out.println();
     }
    else
     {
      for(counter = 1; counter <= 36; counter++)
       {
        if(counter < startDay)
         System.out.print("\t");
        else if(counter == 8 || counter == 16 || counter == 24 || counter == 32)
         System.out.print("\n");
        else
         {
          System.out.print(day2 + "\t");
          day2++;
         }
       }
      System.out.println();
      System.out.println();
     }
   }
   
   }
   else if( month == 3)
   {
    System.out.println("March " + year);
    System.out.println();
    System.out.println("Sun\tMon\tTue\tWed\tThu\tFri\tSat\n");
     {
      if(leap == true)
      {
       startDay = ((29%7)+((31%7)+firstDay));
       {      
        if(startDay == 0)
         startDay = 7;
       }
      }
      else
      {       
       startDay = ((28%7)+((31%7)+firstDay));
       {
        if(startDay == 0)
         startDay = 7;
       }
      }
     }
    for(counter = 1; counter <= 39; counter++)
    {
     if(counter < startDay)
      System.out.print("\t");
     else if(counter == 8 || counter == 16 || counter == 24 || counter == 32)
      System.out.print("\n");
     else
      {
       System.out.print(day3 + "\t");
       day3++;
      }
    }
   System.out.println();
   System.out.println();
   }
   else if(month == 4)
   {
    System.out.println("April " + year);
    System.out.println();
    System.out.println("Sun\tMon\tTue\tWed\tThu\tFri\tSat\n");
     {
      if(leap == true)
      {
       startDay = (31+((29%7)+((31%7)+firstDay))%7);
        
        if(startDay == 0)
         startDay = 7;
      }
       
      else
      {
       startDay = (31+((28%7)+((31%7)+firstDay)))%(7);
       {
        if(startDay == 0)
         startDay = 7;
       }
      }
     }
   for(counter = 1; counter <= 36; counter++)
    {
     if(counter < startDay)
      System.out.print("\t");
     else if(counter == 8 || counter == 16 || counter == 24 || counter == 32)
      System.out.print("\n");
     else
      {
       System.out.print(day4 + "\t");
       day4++;
      }
    }
   System.out.println();
   System.out.println();
  }
     else if(month == 5)
   {
    System.out.println("May " + year);
    System.out.println();
    System.out.println("Sun\tMon\tTue\tWed\tThu\tFri\tSat\n");
     {
      if(leap == true)
      {
       startDay = (30+(31+((29%7)+((31%7)+firstDay)))%(7))%7;
       {
        if(startDay == 0)
         startDay = 7;
       }
      }
      else
      {
       startDay = (30+(31+((28%7)+((31%7)+firstDay)))%(7))%7;
       {
        if(startDay == 0)
         startDay = 7;
       }
      }
     }
   for(counter = 1; counter <= 36; counter++)
    {
     if(counter < startDay)
      System.out.print("\t");
     else if(counter == 8 || counter == 16 || counter == 24 || counter == 32)
      System.out.print("\n");
     else
      {
       System.out.print(day5 + "\t");
       day5++;
      }
    }
   System.out.println();
   System.out.println();
  }
     else if(month == 6)
   {
    System.out.println("June " + year);
    System.out.println();
    System.out.println("Sun\tMon\tTue\tWed\tThu\tFri\tSat\n");
     {
      if(leap == true)
      {
       startDay = (31+(30+(31+((29%7)+((31%7)+firstDay)))%(7))%7)%(7);
       {
        if(startDay == 0)
         startDay = 7;
       }
      }
      else
      {       
       startDay = (31 +(30+(31+((28%7)+((31%7)+firstDay)))%(7))%7)%(7);
       {
        if(startDay == 0)
         startDay = 7;
       }
      }
       
     }
   for(counter = 1; counter <= 36; counter++)
    {
     if(counter < startDay)
      System.out.print("\t");
     else if(counter == 8 || counter == 16 || counter == 24 || counter == 32)
      System.out.print("\n");
     else
      {
       System.out.print(day6 + "\t");
       day6++;
      }
    }
   System.out.println();
   System.out.println();
  }
     else if(month == 7)
   {
    System.out.println("July " + year);
    System.out.println();
    System.out.println("Sun\tMon\tTue\tWed\tThu\tFri\tSat\n");
     {
      if(leap == true)
      {
       startDay = (30+(31+(30+(31+((29%7)+((31%7)+firstDay)))%(7))%7)%(7))%(7);
       {
        if(startDay == 0)
         startDay = 7;
       }
      }
      else
      {
       startDay = (30+(31+(30+(31+((28%7)+((31%7)+firstDay)))%(7))%7)%(7))%(7);
       {
        if(startDay == 0)
         startDay = 7;
       }
      }
     }
   for(counter = 1; counter <= 36; counter++)
    {
     if(counter < startDay)
      System.out.print("\t");
     else if(counter == 8 || counter == 16 || counter == 24 || counter == 32)
      System.out.print("\n");
     else
      {
       System.out.print(day7 + "\t");
       day7++;
      }
    }
   System.out.println();
   System.out.println();
  }
       else if(month == 8)
   {
    System.out.println("August " + year);
    System.out.println();
    System.out.println("Sun\tMon\tTue\tWed\tThu\tFri\tSat\n");
     {
      if(leap == true)
      {
       startDay = (31 + (30+(31+(30+(31+((29%7)+((31%7)+firstDay)))%(7))%7)%(7))%(7))%(7);;
       {
        if(startDay == 0)
         startDay = 7;
       }
      }
      else
      {
       startDay = (31 + (30+(31+(30+(31+((28%7)+((31%7)+firstDay)))%(7))%7)%(7))%(7))%(7);
       {
        if(startDay == 0)
         startDay = 7;
       }
      }
       
     }
   for(counter = 1; counter <= 36; counter++)
    {
     if(counter < startDay)
      System.out.print("\t");
     else if(counter == 8 || counter == 16 || counter == 24 || counter == 32)
      System.out.print("\n");
     else
      {
       System.out.print(day8 + "\t");
       day8++;
      }
    }
   System.out.println();
   System.out.println();
  }
       else if(month == 9)
   {
    System.out.println("September " + year);
    System.out.println();
    System.out.println("Sun\tMon\tTue\tWed\tThu\tFri\tSat\n");
     {
      if(leap == true)
      {
       startDay = (31 +(31 + (30+(31+(30+(31+((29%7)+((31%7)+firstDay)))%(7))%7)%(7))%(7))%(7))%(7);;
       {
        if(startDay == 0)
         startDay = 7;
       }
      }
      else
      {
       startDay = (31 +(31 + (30+(31+(30+(31+((28%7)+((31%7)+firstDay)))%(7))%7)%(7))%(7))%(7))%(7);
       {
        if(startDay == 0)
         startDay = 7;
       }
      }
     }
   for(counter = 1; counter <= 36; counter++)
    {
     if(counter < startDay)
      System.out.print("\t");
     else if(counter == 8 || counter == 16 || counter == 24 || counter == 32)
      System.out.print("\n");
     else
      {
       System.out.print(day9 + "\t");
       day9++;
      }
    }
   System.out.println();
   System.out.println();
  }
      else if(month == 10)
   {
    System.out.println("October " + year);
    System.out.println();
    System.out.println("Sun\tMon\tTue\tWed\tThu\tFri\tSat\n");
     {
      if(leap == true)
      {
       startDay = (30 + (31 +(31 + (30+(31+(30+(31+((29%7)+((31%7)+firstDay)))%(7))%7)%(7))%(7))%(7))%(7))%(7);;
       {
        if(startDay == 0)
         startDay = 7;
       }
      }
      else
      {
       startDay = (30 + (31 +(31 + (30+(31+(30+(31+((28%7)+((31%7)+firstDay)))%(7))%7)%(7))%(7))%(7))%(7))%(7);
       {
        if(startDay == 0)
         startDay = 7;
       }
      }
       
     }
   for(counter = 1; counter <= 36; counter++)
    {
     if(counter < startDay)
      System.out.print("\t");
     else if(counter == 8 || counter == 16 || counter == 24 || counter == 32)
      System.out.print("\n");
     else
      {
       System.out.print(day10 + "\t");
       day10++;
      }
    }
   System.out.println();
   System.out.println();
  }
     else if(month == 11)
   {
    System.out.println("November " + year);
    System.out.println();
    System.out.println("Sun\tMon\tTue\tWed\tThu\tFri\tSat\n");
     {
      if(leap == true)
      {
       startDay =(31 +(30 + (31 +(31 + (30+(31+(30+(31+((29%7)+((31%7)+firstDay)))%(7))%7)%(7))%(7))%(7))%(7))%(7))%(7);
       {
        if(startDay == 0)
         startDay = 7;
       }
      }
       
      else
      {
       startDay = (31 +(30 + (31 +(31 + (30+(31+(30+(31+((28%7)+((31%7)+firstDay)))%(7))%7)%(7))%(7))%(7))%(7))%(7))%(7);
       {
        if(startDay == 0)
         startDay = 7;
       }
      }
       
     }
   for(counter = 1; counter <= 36; counter++)
    {
     if(counter < startDay)
      System.out.print("\t");
     else if(counter == 8 || counter == 16 || counter == 24 || counter == 32)
      System.out.print("\n");
     else
      {
       System.out.print(day11 + "\t");
       day11++;
      }
    }
   System.out.println();
   System.out.println();
   }
    else if(month == 12)
   {
    System.out.println("December " + year);
    System.out.println();
    System.out.println("Sun\tMon\tTue\tWed\tThu\tFri\tSat\n");
     {
      if(leap == true)
      {
       startDay = (30+(31 +(30 + (31 +(31 + (30+(31+(30+(31+((29%7)+((31%7)+firstDay)))%(7))%7)%(7))%(7))%(7))%(7))%(7))%(7))%(7);
       {
        if(startDay == 0)
         startDay = 7;
       }
      }
       
      else
      {
       startDay = (30+(31 +(30 + (31 +(31 + (30+(31+(30+(31+((28%7)+((31%7)+firstDay)))%(7))%7)%(7))%(7))%(7))%(7))%(7))%(7))%(7);
       {
        if(startDay == 0)
         startDay = 7;
       }
      }
       
     }
   for(counter = 1; counter <= 35; counter++)
    {
     if(counter < startDay)
      System.out.print("\t");
     else if(counter == 8 || counter == 16 || counter == 24 || counter == 32)
      System.out.print("\n");
     else
      {
       System.out.print(day12 + "\t");
       day12++;
      }
    }
   System.out.println();
   System.out.println();
   }
  }  
 }
}
