//This code was created by the following: Naveena Kesani, Matthew Kessler, Joshua Marciniak, Kay Martens, Gabe Nava, Autumn Neil, Olisebuka Obioha
import java.util.*;
public class Calendar2018
{
 public static void main(String args[])
 {
  int year;
  Scanner console = new Scanner(System.in);
System.out.println("This program takes the input of the year 2018 and displays the calendar for that year.  The year entered is checked to see if it is a leap year.");
  System.out.println("Please enter the year 2018.");
  year = console.nextInt();
boolean leap = false;
            if(year % 4 == 0)
            {
                if( year % 100 == 0)
                {
                
                    if ( year % 400 == 0)
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
                System.out.println(year + " is a leap year.");
            else
                System.out.println(year + " is not a leap year.");
System.out.println();
System.out.println(year + " Calendar");
System.out.println();
  int month = 1;
  int startDay;
  int firstDay = 6;
  int newline;
  int day = 1, day2 = 1, day3 = 1, day4 =1, day5 = 1, day6 = 1, day7 = 1, day8 = 1, day9 =1, day10 = 1, day11 = 1, day12 = 1;
  int counter = 1;
for(month = 1; month <=12; month++)
  {
   if(month == 1)
   {
    System.out.println("January " + year);
    System.out.println();
    System.out.println("Sun\tMon\tTue\tWed\tThu\tFri\tSat\n");
    startDay = firstDay;
	 if(startDay == 7||startDay==6)
	  newline = 5;
	else
	  newline = 4;
    for(counter = 1; counter <= ((startDay-1)+31+newline); counter++)
     {
      if(counter < startDay)
       System.out.print("\t");
      else if(counter == 8 || counter == 16 || counter == 24 || counter == 32||counter==40)
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
		{
			newline = 5;
			startDay = 7;
		}
		else
			newline = 4;
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
      for(counter = 1; counter <= ((startDay-1)+29+newline); counter++)
       {
        if(counter < startDay)
         System.out.print("\t");
        else if(counter == 8 || counter == 16 || counter == 24 || counter == 32||counter==40)
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
      for(counter = 1; counter <= ((startDay-1)+28+newline); counter++)
       {
        if(counter < startDay)
         System.out.print("\t");
        else if(counter == 8 || counter == 16 || counter == 24 || counter == 32||counter==40)
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
		{
			newline = 5;
			startDay = 7;
		}
		else
			newline = 4;
       }
      }
      else
      {       
       startDay = ((28%7)+((31%7)+firstDay));
	     { 
        if(startDay == 0)
		{
			newline = 5;
			startDay = 7;
		}
		else
			newline = 4;
       }
      }
     }
    for(counter = 1; counter <= ((startDay-1)+31+newline); counter++)
    {
     if(counter < startDay)
      System.out.print("\t");
     else if(counter == 8 || counter == 16 || counter == 24 || counter == 32||counter==40)
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
	     { 
        if(startDay == 0)
		{
			newline = 5;
			startDay = 7;
		}
		else
			newline = 4;
       }
      }
       
      else
      {
       startDay = (31+((28%7)+((31%7)+firstDay)))%(7);
       { 
        if(startDay == 0)
		{
			newline = 5;
			startDay = 7;
		}
		else
			newline = 4;
       }
      }
     }
   for(counter = 1; counter <= ((startDay-1)+30+newline); counter++)
    {
     if(counter < startDay)
      System.out.print("\t");
     else if(counter == 8 || counter == 16 || counter == 24 || counter == 32||counter==40)
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
		{
			newline = 5;
			startDay = 7;
		}
		else
			newline = 4;
       }
      }
      else
      {
       startDay = (30+(31+((28%7)+((31%7)+firstDay)))%(7))%7;
      { 
        if(startDay == 0)
		{
			newline = 5;
			startDay = 7;
		}
		else
			newline = 4;
       }
      }
     }
   for(counter = 1; counter <= ((startDay-1)+31+newline); counter++)
    {
     if(counter < startDay)
      System.out.print("\t");
     else if(counter == 8 || counter == 16 || counter == 24 || counter == 32||counter==40)
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
		{
			newline = 5;
			startDay = 7;
		}
		else
			newline = 4;
       }
      }
      else
      {       
       startDay = (31 +(30+(31+((28%7)+((31%7)+firstDay)))%(7))%7)%(7);
       { 
        if(startDay == 0)
		{
			newline = 5;
			startDay = 7;
		}
		else
			newline = 4;
       }
      }
       
     }
   for(counter = 1; counter <= ((startDay-1)+30+newline); counter++)
    {
     if(counter < startDay)
      System.out.print("\t");
     else if(counter == 8 || counter == 16 || counter == 24 || counter == 32||counter==40)
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
		{
			newline = 5;
			startDay = 7;
		}
		else
			newline = 4;
       }
      }
      else
      {
       startDay = (30+(31+(30+(31+((28%7)+((31%7)+firstDay)))%(7))%7)%(7))%(7);
      { 
        if(startDay == 0)
		{
			newline = 5;
			startDay = 7;
		}
		else
			newline = 4;
       }
      }
     }
   for(counter = 1; counter <= ((startDay-1)+31+newline); counter++)
    {
     if(counter < startDay)
      System.out.print("\t");
     else if(counter == 8 || counter == 16 || counter == 24 || counter == 32||counter==40)
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
		{
			newline = 5;
			startDay = 7;
		}
		else
			newline = 4;
       }
      }
      else
      {
       startDay = (31 + (30+(31+(30+(31+((28%7)+((31%7)+firstDay)))%(7))%7)%(7))%(7))%(7);
       { 
        if(startDay == 0)
		{
			newline = 5;
			startDay = 7;
		}
		else
			newline = 4;
       }
      }
       
     }
   for(counter = 1; counter <= ((startDay-1)+31+newline); counter++)
    {
     if(counter < startDay)
      System.out.print("\t");
     else if(counter == 8 || counter == 16 || counter == 24 || counter == 32||counter==40)
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
		{
			newline = 5;
			startDay = 7;
		}
		else
			newline = 4;
       }
      }
      else
      {
       startDay = (31 +(31 + (30+(31+(30+(31+((28%7)+((31%7)+firstDay)))%(7))%7)%(7))%(7))%(7))%(7);
       { 
        if(startDay == 0)
		{
			newline = 5;
			startDay = 7;
		}
		else
			newline = 4;
       }
      }
     }
   for(counter = 1; counter <= ((startDay-1)+30+newline); counter++)
    {
     if(counter < startDay)
      System.out.print("\t");
     else if(counter == 8 || counter == 16 || counter == 24 || counter == 32||counter==40)
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
		{
			newline = 5;
			startDay = 7;
		}
		else
			newline = 4;
       }
      }
      else
      {
       startDay = (30 + (31 +(31 + (30+(31+(30+(31+((28%7)+((31%7)+firstDay)))%(7))%7)%(7))%(7))%(7))%(7))%(7);
       { 
        if(startDay == 0)
		{
			newline = 5;
			startDay = 7;
		}
		else
			newline = 4;
       }
      }
       
     }
   for(counter = 1; counter <= ((startDay-1)+31+newline); counter++)
    {
     if(counter < startDay)
      System.out.print("\t");
     else if(counter == 8 || counter == 16 || counter == 24 || counter == 32||counter==40)
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
		{
			newline = 5;
			startDay = 7;
		}
		else
			newline = 4;
       }
      }
       
      else
      {
       startDay = (31 +(30 + (31 +(31 + (30+(31+(30+(31+((28%7)+((31%7)+firstDay)))%(7))%7)%(7))%(7))%(7))%(7))%(7))%(7);
       { 
        if(startDay == 0)
		{
			newline = 5;
			startDay = 7;
		}
		else
			newline = 4;
       }
      }
       
     }
   for(counter = 1; counter <= ((startDay-1)+30+newline); counter++)
    {
     if(counter < startDay)
      System.out.print("\t");
     else if(counter == 8 || counter == 16 || counter == 24 || counter == 32||counter==40)
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
		{
			newline = 5;
			startDay = 7;
		}
		else
			newline = 4;
       }
      }
       
      else
      {
       startDay = (30+(31 +(30 + (31 +(31 + (30+(31+(30+(31+((28%7)+((31%7)+firstDay)))%(7))%7)%(7))%(7))%(7))%(7))%(7))%(7))%(7);
       { 
        if(startDay == 0)
		{
			newline = 5;
			startDay = 7;
		}
		else
			newline = 4;
       }
      }
       
     }
   for(counter = 1; counter <= ((startDay-1)+31+newline); counter++)
    {
     if(counter < startDay)
      System.out.print("\t");
     else if(counter == 8 || counter == 16 || counter == 24 || counter == 32||counter == 40)
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
 
