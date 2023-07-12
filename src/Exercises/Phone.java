package Exercises;

import java.util.Scanner;

public class Phone {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("\t\tMainMenu" + "\n" + "1.phoneBook" + "\n" + "2.Messages" + "\n" + "3.Chat" + "\n" +"4.Call register" + "\n" + "5.Tones"+"\n"+"6.Settings"+"\n" + "7.Call desk" + "\n" + "8.Games" + "9.Calculator" + "\n" + "10.Reminder" +"\n" + "11.Clock" + "\n" + "12.Profiles" + "\n" + "13.Sim Services");
        System.out.print("\nEnter MainMenu: ");
        int mainMenu = input.nextInt();
        if (mainMenu == 1){
            System.out.println("\t\tPhoneBook" + "\n" + "1.Search" + "\n" + "2.Service Nos" + "\n" + "3.Add names" + "\n" + "4.Erase" + "\n" + "5.Edit"+ "\n" + "6.Assign tone" + "\n" + "7.Send b' Card" + "\n" + "8.Options" + "\n" + "9.Speed dials" + "\n" + "10.Voice tag");
            System.out.print("\nEnter MainMenu1: ");
            int mainMenu1 = input.nextInt();
            if(mainMenu1 == 8){
                System.out.println("\t\tOptions" + "\n" + "1.Type of views" + "\n" + "2.Memory status");

            }

        }
        if(mainMenu == 2){
            System.out.println("\t\tMessages" + "\n" + "1.Write messages" + "\n" + "2.Inbox" + "\n" + "3.Outbox" + "\n" + "4.Picture messages" + "\n" + "5.Template" + "\n" + "6.Smileys" + "\n" + "7.Messages" + "\n"+ "8.Info service" + "\n" + "9.Voice mailbox number" + "\n" + "Service command editor");
            System.out.print("\nEnter MainMenu2: ");
            int mainMenu2 = input.nextInt();
            if(mainMenu2 == 7){
                System.out.println("\t\tMessage settings" + "\n" + "1.Set 1" + "\n" + "2.Common");
                System.out.print("\nEnter mainMenu7: ");
                int mainMenu7 = input.nextInt();
                if(mainMenu7 == 1){
                    System.out.println("\t\tSet 1" + "\n" + "1.Message centre number" + "\n"+ "2.Messages sent as" + "\n" + "3.Messages validity");
                }
                if(mainMenu7 == 2){
                    System.out.println("\t\tCommon" + "\n" + "1.Delivery reports" + "\n" + "2.Reply via same centre" + "\n" + "3.Character support");
                }

            }
            

        }
        if(mainMenu ==  4){
            System.out.println("\t\tCall register" + "\n" + "1.Missed calls" + "\n" + "2.Received calls" + "\n" + "3.Dialled numbers" + "\n" + "4.Erase recent call lists" + "\n" + "5.Show call duration" + "\n" + "6.Show call costs" + "\n" + "7.Call cost settings" + "\n" + "8.Prepaid credit");
            System.out.print("\nEnter mainMenu4: ");
            int mainMenu4 = input.nextInt();
            if(mainMenu4 == 5){
                System.out.println("\t\tShow call duration" + "\n" + "1.Last call duration" + "\n" + "2.All calls' duration" + "\n" + "3.Received calls' duration" + "\n"+ "4.Dialled calls' duration" + "\n" + "5.Clear timers");
            }
            if(mainMenu4 == 6){
                System.out.println("\t\tShow call costs" + "\n" + "1.Last call cost" + "\n" + "2.All calls' cost" + "\n" + "3.Clear counters");
            }
            if(mainMenu4 == 7){
                System.out.println("\t\tCall cost settings" + "\n" + "1.Call cost limit" + "\n" + "2.Show costs in");
            }

        }
        if(mainMenu == 5){
            System.out.println("\t\tTones" + "\n" + "1.Ringing tone" + "\n" + "2.Ringing volume" + "\n" + "3.Incoming call alert" + "\n" + "4.Composer" + "\n" + "5.Message alert tone" + "\n" + "6.Keypad tones" + "\n" + "7.Warning and game tones" + "\n" + "8.Vibrating alert" + "\n" + "9.Screen saver");


        }
        if(mainMenu == 6){
            System.out.println("\t\tSettings" + "\n" + "1.Call settings" + "\n" + "2.Phone settings" + "\n" + "3.Security settings" + "\n" + "4.Restore factory settings");
            System.out.print("\nEnter MainMenu6: ");
            int mainMenu6 = input.nextInt();
            if(mainMenu6 == 1){
                System.out.println("\t\tSettings" + "\n" + "1.Automatic redial" + "\n" + "2.Speed dialing" + "\n" + "3.Call waiting options" + "\n" + "4.Own number sending" + "\n" + "5.Phone line in use" + "\n" + "6.Automatic answer");
            }
            if(mainMenu6 == 2){
                System.out.println("\t\tPhone settings" + "\n" + "1.Language" + "\n" + "2.Cell info display" + "\n" + "3.Welcome note" + "\n" + "4.Network selection" + "\n" + "5.Lights" + "\n" + "6.confirm SIM service actions");
            }
            if(mainMenu6 == 3){
                System.out.println("\t\tSecurity settings" + "\n" + "1.PIN code request" + "\n" + "2.Call barring service" + "\n" +"3.Fixed dialling" + "\n" + "4.Closed user group" + "\n" + "5.Phone security" + "\n" + "6.Change access codes");
            }



        }
        if(mainMenu == 11){
            System.out.println("\t\tClock" + "\n" + "1.Alarm clock" + "\n" + "2.Clock settings" + "\n" + "3.Date setting" + "\n" + "4.Stopwatch" + "\n" + "5.Countdown timer"  + "\n" + "6.Auto update of date and time");
        }

    }

}
