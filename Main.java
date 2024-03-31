import java.nio.file.*;
import java.io.*;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    private static final long MILLIS = 4000L;
    private static final long MILLIS1 = 3000L;
    private static final long MILLIS2 = 1000L;


    private static final char CHAR = '*';

    public static void main(String[] args) throws IOException, InterruptedException {
        Scanner obj = new Scanner(System.in);
        logo();
        Thread.sleep(MILLIS);
        login();
        System.out.print("\t\t\t\t\t\t\t");
        String ch = obj.nextLine();
        choice(ch);
    }

    private static void logo() throws IOException, InterruptedException {
        Process start = new ProcessBuilder("cmd", "/c", "cls").inheritIO().start();
        start.waitFor();
        System.out.print("\n\n\n\t\t\t\t  /$$$$$$   /$$$$$$  /$$      /$$ /$$$$$$$  /$$   /$$ /$$$$$$$$/$$$$$$$$ /$$$$$$$  /$$$$$$/$$$$$$$$ /$$$$$$$$ /$$$$$$$ \n");
        System.out.print("\t\t\t\t /$$__  $$ /$$__  $$| $$$    /$$$| $$__  $$| $$  | $$|__  $$__/ $$_____/| $$__  $$|_  $$_/_____ $$ | $$_____/| $$__  $$\n");
        System.out.print("\t\t\t\t| $$  \\__/| $$  \\ $$| $$$$  /$$$$| $$  \\ $$| $$  | $$   | $$  | $$      | $$  \\ $$  | $$      /$$/ | $$      | $$  \\ $$\n");
        System.out.print("\t\t\t\t| $$      | $$  | $$| $$ $$/$$ $$| $$$$$$$/| $$  | $$   | $$  | $$$$$   | $$$$$$$/  | $$     /$$/  | $$$$$   | $$  | $$\n");
        System.out.print("\t\t\t\t| $$      | $$  | $$| $$  $$$| $$| $$____/ | $$  | $$   | $$  | $$__/   | $$__  $$  | $$    /$$/   | $$__/   | $$  | $$\n");
        System.out.print("\t\t\t\t| $$    $$| $$  | $$| $$\\  $ | $$| $$      | $$  | $$   | $$  | $$      | $$  \\ $$  | $$   /$$/    | $$      | $$  | $$\n");
        System.out.print("\t\t\t\t|  $$$$$$/|  $$$$$$/| $$ \\/  | $$| $$      |  $$$$$$/   | $$  | $$$$$$$$| $$  | $$ /$$$$$$/$$$$$$$$| $$$$$$$$| $$$$$$$/\n");
        System.out.print("\t\t\t\t \\______/  \\______/ |__/     |__/|__/       \\______/    |__/  |________/|__/  |__/|______/________/|________/|_______/ \n");
        System.out.print("\t\t\t\t             /$$$$$$$$/$$$$$$$$ /$$       /$$$$$$$$ /$$$$$$$  /$$   /$$  /$$$$$$  /$$   /$$ /$$$$$$$$                  \n");
        System.out.print("\t\t\t\t            |__  $$__/ $$_____/| $$      | $$_____/| $$__  $$| $$  | $$ /$$__  $$| $$$ | $$| $$_____/                  \n");
        System.out.print("\t\t\t\t               | $$  | $$      | $$      | $$      | $$  \\ $$| $$  | $$| $$  \\ $$| $$$$| $$| $$                        \n");
        System.out.print("\t\t\t\t               | $$  | $$$$$   | $$      | $$$$$   | $$$$$$$/| $$$$$$$$| $$  | $$| $$ $$ $$| $$$$$                     \n");
        System.out.print("\t\t\t\t               | $$  | $$__/   | $$      | $$__/   | $$____/ | $$__  $$| $$  | $$| $$  $$$$| $$__/                     \n");
        System.out.print("\t\t\t\t               | $$  | $$      | $$      | $$      | $$      | $$  | $$| $$  | $$| $$\\  $$$| $$                        \n");
        System.out.print("\t\t\t\t               | $$  | $$$$$$$$| $$$$$$$$| $$$$$$$$| $$      | $$  | $$|  $$$$$$/| $$ \\  $$| $$$$$$$$                  \n");
        System.out.print("\t\t\t\t               |__/  |________/|________/|________/|__/      |__/  |__/ \\______/ |__/  \\__/|________/                  \n");
        System.out.print("\t\t\t\t             /$$$$$$$  /$$$$$$ /$$$$$$$  /$$$$$$$$  /$$$$$$  /$$$$$$$$/$$$$$$  /$$$$$$$  /$$     /$$                   \n");
        System.out.print("\t\t\t\t            | $$__  $$|_  $$_/| $$__  $$| $$_____/ /$$__  $$|__  $$__/$$__  $$| $$__  $$|  $$   /$$/                   \n");
        System.out.print("\t\t\t\t            | $$  \\ $$  | $$  | $$  \\ $$| $$      | $$  \\__/   | $$ | $$  \\ $$| $$  \\ $$ \\  $$ /$$/                    \n");
        System.out.print("\t\t\t\t            | $$  | $$  | $$  | $$$$$$$/| $$$$$   | $$         | $$ | $$  | $$| $$$$$$$/  \\  $$$$/                     \n");
        System.out.print("\t\t\t\t            | $$  | $$  | $$  | $$__  $$| $$__/   | $$         | $$ | $$  | $$| $$__  $$   \\  $$/                      \n");
        System.out.print("\t\t\t\t            | $$  | $$  | $$  | $$  \\ $$| $$      | $$    $$   | $$ | $$  | $$| $$  \\ $$    | $$                       \n");
        System.out.print("\t\t\t\t            | $$$$$$$/ /$$$$$$| $$  | $$| $$$$$$$$|  $$$$$$/   | $$ |  $$$$$$/| $$  | $$    | $$                       \n");
        System.out.print("\t\t\t\t            |_______/ |______/|__/  |__/|________/ \\______/    |__/  \\______/ |__/  |__/    |__/                       \n");
    }

    private static void login() throws IOException, InterruptedException {
        Process start = new ProcessBuilder("cmd", "/c", "cls").inheritIO().start();
        start.waitFor();
        System.out.print("\n\n\n\n\n");
        System.out.print("\t\t\t\t\t\t\t    .--..--..--..--..--..--..--..--..--..--..--..--..--..--..--..--.\n");
        System.out.print("\t\t\t\t\t\t\t   / .. \\.. \\.. \\.. \\.. \\.. \\.. \\.. \\.. \\.. \\.. \\.. \\.. \\.. \\.. \\.. \\\n");
        System.out.print("\t\t\t\t\t\t\t   \\ \\/\\ \\/\\ \\/\\ \\/\\ \\/\\ \\/\\ \\/\\ \\/\\ \\/\\ \\/\\ \\/\\ \\/\\ \\/\\ \\/\\ \\/\\ \\/ /\n");
        System.out.print("\t\t\t\t\t\t\t    \\/ /\\/ /\\/ /\\/ /\\/ /\\/ /\\/ /\\/ /\\/ /\\/ /\\/ /\\/ /\\/ /\\/ /\\/ /\\/ /\n");
        System.out.print("\t\t\t\t\t\t\t    / /\\/ /`' /`' /`' /`' /`' /`' /`' /`' /`' /`' /`' /`' /`' /\\/ /\\\n");
        System.out.print("\t\t\t\t\t\t\t   / /\\ \\/`--'`--'`--'`--'`--'`--'`--'`--'`--'`--'`--'`--'`--'\\ \\/\\ \\\n");
        System.out.print("\t\t\t\t\t\t\t   \\ \\/\\ \\                                                    /\\ \\/ /\n");
        System.out.print("\t\t\t\t\t\t\t    \\/ /\\ \\                                                  / /\\/ /\n");
        System.out.print("\t\t\t\t\t\t\t    / /\\/ /     WELCOME TO COMPUTERIZED PHONE DIRECTORY      \\ \\/ /\\\n");
        System.out.print("\t\t\t\t\t\t\t   / /\\ \\/                                                    \\ \\/\\ \\\n");
        System.out.print("\t\t\t\t\t\t\t   \\ \\/\\ \\                FOR SIGN IN PRESS 1                 /\\ \\/ /\n");
        System.out.print("\t\t\t\t\t\t\t    \\/ /\\ \\                                                  / /\\/ /\n");
        System.out.print("\t\t\t\t\t\t\t    / /\\/ /               FOR SIGN UP PRESS 2                \\ \\/ /\\\n");
        System.out.print("\t\t\t\t\t\t\t   / /\\ \\/                                                    \\ \\/\\ \\\n");
        System.out.print("\t\t\t\t\t\t\t   \\ \\/\\ \\.--..--..--..--..--..--..--..--..--..--..--..--..--./\\ \\/ /\n");
        System.out.print("\t\t\t\t\t\t\t    \\/ /\\/ ../ ../ ../ ../ ../ ../ ../ ../ ../ ../ ../ ../ ../ /\\/ /\n");
        System.out.print("\t\t\t\t\t\t\t    / /\\/ /\\/ /\\/ /\\/ /\\/ /\\/ /\\/ /\\/ /\\/ /\\/ /\\/ /\\/ /\\/ /\\/ /\\/ /\\\n");
        System.out.print("\t\t\t\t\t\t\t   / /\\ \\/\\ \\/\\ \\/\\ \\/\\ \\/\\ \\/\\ \\/\\ \\/\\ \\/\\ \\/\\ \\/\\ \\/\\ \\/\\ \\/\\ \\/\\ \\\n");
        System.out.print("\t\t\t\t\t\t\t   \\ `'\\ `'\\ `'\\ `'\\ `'\\ `'\\ `'\\ `'\\ `'\\ `'\\ `'\\ `'\\ `'\\ `'\\ `'\\ `' /\n");
        System.out.print("\t\t\t\t\t\t\t    `--'`--'`--'`--'`--'`--'`--'`--'`--'`--'`--'`--'`--'`--'`--'`--'\n");

    }

    private static void choice(String ch) throws InterruptedException, IOException {
        String s = ch, id = null;
        Scanner obj = new Scanner(System.in);
        switch (s) {
            case "1": {
                id = user("1");
                break;
            }
            case "2": {
                id = user("2");
                break;
            }
            default: {
                System.out.println("\n\n\n\n\t\t\t\t\t\t\tIn-Valid Choice.\n\t\t\t\t\t\t\tPlease choose correct choice");
                Thread.sleep(MILLIS1);
                login();
                System.out.print("\t\t\t\t\t\t\t");
                s = obj.nextLine();
                choice(s);
            }
        }
        Thread.sleep(MILLIS);
        Work();
        System.out.print("\t\t\t\t\t\t\t");
        s = obj.nextLine();
        Work2(s, id);
    }

    private static String user(String ch) throws IOException, InterruptedException {
        String s = ch;
        Process start = new ProcessBuilder("cmd", "/c", "cls").inheritIO().start();
        start.waitFor();
        String id = "", sen, cid, cPas, pas = "", pas2;
        char[] password = new char[8];
        int nf = 0, flag, j;
        Scanner obj = new Scanner(System.in);
        switch (s) {
            case "1": {
                System.out.println("\n\n\t\t\t\t\t\t\tEnter Your ID");
                System.out.print("\t\t\t\t\t\t\t");
                id = obj.nextLine();
                while (id.isEmpty()) {
                    System.out.println("\n\n\t\t\t\t\t\t\tPlease ENTER the ID");
                    System.out.print("\t\t\t\t\t\t\t");
                    id = obj.nextLine();
                }
                while (true) {
                    try {
                        System.out.print("\t\t\t\t\t\t\t");
                        password = PasswordField.getPassword("\n\t\t\t\t\t\t\tEnter Your Password: ");
                        while (null == password) {
                            System.out.print("\t\t\t\t\t\t\t");
                            password = PasswordField.getPassword("\n\t\t\t\t\t\t\tEnter Your Password: ");
                        }
                    } catch (IOException ioe) {
                        ioe.printStackTrace();
                    }
                    assert null != password;
                    pas = new String(password);
                    File myfile = new File("user.txt");
                    Scanner myReader = new Scanner(myfile);
                    while (true) {
                        boolean b = !myReader.hasNextLine();
                        if (b) break;
                        sen = myReader.nextLine();
                        j = 0;
                        while (CHAR != sen.charAt(j)) {
                            j++;
                        }
                        cid = sen.substring(0, j);
                        cPas = sen.substring(j + 1, j + 9);
                        if (cid.equals(id) && cPas.equals(pas)) {
                            System.out.println("\n\n\t\t\t\t\t\t\tSIGN-IN SUCCESSFUL");
                            return id;
                        }
                    }
                    myReader.close();
                    System.out.println("\n\n\t\t\t\t\t\t\tInvalid ID or Password\n\t\t\t\t\t\t\tTryAgain");
                    Thread.sleep(1000);
                    System.out.println("\n\n\t\t\t\t\t\t\tEnter Your ID");
                    System.out.print("\t\t\t\t\t\t\t");
                    id = obj.nextLine();
                    while (id.isEmpty()) {
                        System.out.println("\n\n\t\t\t\t\t\t\tPlease ENTER the ID");
                        System.out.print("\t\t\t\t\t\t\t");
                        id = obj.nextLine();
                    }
                }
            }
            case "2": {
                while (0 == nf) {
                    File myfile = new File("user.txt");
                    if (!myfile.exists()) {
                        myfile.createNewFile();
                    }
                    Scanner myReader = new Scanner(myfile);
                    System.out.println("\t\t\t\t\t\t\tEnter Your ID");
                    System.out.print("\t\t\t\t\t\t\t");
                    id = obj.nextLine();
                    while (id.isEmpty()) {
                        System.out.println("\n\n\t\t\t\t\t\t\tPlease ENTER the ID");
                        System.out.print("\t\t\t\t\t\t\t");
                        id = obj.nextLine();
                    }
                    flag = 0;
                    while (myReader.hasNextLine() && 0 == flag) {
                        sen = myReader.nextLine();
                        j = 0;
                        while (CHAR != sen.charAt(j)) {
                            j++;
                        }
                        cid = sen.substring(0, j);
                        if (id.equals(cid)) {
                            System.out.println("\n\n\t\t\t\t\t\t\tID already exist\n\t\t\t\t\t\t\tEnter new ID");
                            flag = 1;
                        }
                        if (0 == flag) {
                            nf = 1;
                        }
                    }
                    myReader.close();
                    if (0 == flag) {
                        nf = 1;
                    }
                }
                flag = 0;
                while ((0 == flag)) {
                    try {
                        System.out.print("\t\t\t\t\t\t\t");
                        password = PasswordField.getPassword("\n\t\t\t\t\t\t\tEnter Your Password: ");
                        while (null == password) {
                            System.out.print("\t\t\t\t\t\t\t");
                            password = PasswordField.getPassword("\n\t\t\t\t\t\t\tEnter Your Password: ");
                        }
                    } catch (IOException ioe) {
                        ioe.printStackTrace();
                    }
                    assert null != password;
                    pas = new String(password);
                    try {
                        System.out.print("\t\t\t\t\t\t\t");
                        password = PasswordField.getPassword("\n\t\t\t\t\t\t\tRE-Enter Your Password: ");
                        while (null == password) {
                            System.out.print("\t\t\t\t\t\t\t");
                            password = PasswordField.getPassword("\n\t\t\t\t\t\t\tEnter Your Password: ");
                        }
                    } catch (IOException ioe) {
                        ioe.printStackTrace();
                    }
                    assert null != password;
                    pas2 = new String(password);
                    if (pas2.equals(pas)) {
                        flag = 1;
                    } else {
                        System.out.println("\n\n\t\t\t\t\t\t\tPassword not matches\n\t\t\t\t\t\t\tRe-enter password");
                    }
                }
                FileWriter myWriter = new FileWriter("user.txt", true);
                myWriter.write(id + "*" + pas + "\n");
                myWriter.close();
                System.out.println("\n\n\t\t\t\t\t\t\tSIGN-UP SUCCESSFUL");
                return id;
            }
            default: {
                System.out.println("\n\n\n\n\t\t\t\t\t\t\t\tIn-Valid Choice.\n\t\t\t\t\t\t\tPlease choose correct choice");
                Thread.sleep(MILLIS1);
                start.waitFor();
                login();
                System.out.print("\t\t\t\t\t\t\t");
                s = obj.nextLine();
                id = user(s);
                return id;
            }
        }
    }

    private static void Work() throws IOException, InterruptedException {
        Process start = new ProcessBuilder("cmd", "/c", "cls").inheritIO().start();
        start.waitFor();
        System.out.print("\n\n\n\n");
        System.out.print("\t\t\t\t\t\t\t   _.-._.-._.-._.-._.-._.-._.-._.-._.-._.-._.-._.-._.-._.-._\n");
        System.out.print("\t\t\t\t\t\t\t ,'_.-._.-._.-._.-._.-._.-._.-._.-._.-._.-._.-._.-._.-._.-._`.\n");
        System.out.print("\t\t\t\t\t\t\t( (                                                         ) )\n");
        System.out.print("\t\t\t\t\t\t\t ) )                                                       ( (\n");
        System.out.print("\t\t\t\t\t\t\t( (                   WELCOME TO DIRECTORY                  ) )\n");
        System.out.print("\t\t\t\t\t\t\t ) )                                                       ( (\n");
        System.out.print("\t\t\t\t\t\t\t( (                                                         ) )\n");
        System.out.print("\t\t\t\t\t\t\t ) )         1. View Directory                             ( (\n");
        System.out.print("\t\t\t\t\t\t\t( (                                                         ) )\n");
        System.out.print("\t\t\t\t\t\t\t ) )         2. Search Contact                             ( (\n");
        System.out.print("\t\t\t\t\t\t\t( (                                                         ) )\n");
        System.out.print("\t\t\t\t\t\t\t ) )         3. Add Contact                                ( (\n");
        System.out.print("\t\t\t\t\t\t\t( (                                                         ) )\n");
        System.out.print("\t\t\t\t\t\t\t ) )         4. Delete Contact                             ( (\n");
        System.out.print("\t\t\t\t\t\t\t( (                                                         ) )\n");
        System.out.print("\t\t\t\t\t\t\t ) )         5. Update Contact                             ( (\n");
        System.out.print("\t\t\t\t\t\t\t( (                                                         ) )\n");
        System.out.print("\t\t\t\t\t\t\t ) )         6. Log Out                                      ( (\n");
        System.out.print("\t\t\t\t\t\t\t( (                                                         ) )\n");
        System.out.print("\t\t\t\t\t\t\t ) )                                                       ( (\n");
        System.out.print("\t\t\t\t\t\t\t( (_.-._.-._.-._.-._.-._.-._.-._.-._.-._.-._.-._.-._.-._.-._) )\n");
        System.out.print("\t\t\t\t\t\t\t `._.-._.-._.-._.-._.-._.-._.-._.-._.-._.-._.-._.-._.-._.-._,'\n");
    }

    private static void SearchMenu() throws IOException, InterruptedException {
        Process start = new ProcessBuilder("cmd", "/c", "cls").inheritIO().start();
        start.waitFor();
        System.out.print("\n\n\n\n");
        System.out.print("\t\t\t\t\t\t\t   _.-._.-._.-._.-._.-._.-._.-._.-._.-._.-._.-._.-._.-._.-._\n");
        System.out.print("\t\t\t\t\t\t\t ,'_.-._.-._.-._.-._.-._.-._.-._.-._.-._.-._.-._.-._.-._.-._`.\n");
        System.out.print("\t\t\t\t\t\t\t( (                                                         ) )\n");
        System.out.print("\t\t\t\t\t\t\t ) )                                                       ( (\n");
        System.out.print("\t\t\t\t\t\t\t( (                       SEARCH                            ) )\n");
        System.out.print("\t\t\t\t\t\t\t ) )                                                       ( (\n");
        System.out.print("\t\t\t\t\t\t\t( (                                                         ) )\n");
        System.out.print("\t\t\t\t\t\t\t ) )         1. By Name                                    ( (\n");
        System.out.print("\t\t\t\t\t\t\t( (                                                         ) )\n");
        System.out.print("\t\t\t\t\t\t\t ) )         2. By Profession                              ( (\n");
        System.out.print("\t\t\t\t\t\t\t( (                                                         ) )\n");
        System.out.print("\t\t\t\t\t\t\t ) )         3. By Phone Number                            ( (\n");
        System.out.print("\t\t\t\t\t\t\t( (                                                         ) )\n");
        System.out.print("\t\t\t\t\t\t\t ) )         4. Back To Menu                               ( (\n");
        System.out.print("\t\t\t\t\t\t\t( (                                                         ) )\n");
        System.out.print("\t\t\t\t\t\t\t ) )                                                       ( (\n");
        System.out.print("\t\t\t\t\t\t\t( (_.-._.-._.-._.-._.-._.-._.-._.-._.-._.-._.-._.-._.-._.-._) )\n");
        System.out.print("\t\t\t\t\t\t\t `._.-._.-._.-._.-._.-._.-._.-._.-._.-._.-._.-._.-._.-._.-._,'\n");
    }
    private static void Update() throws IOException, InterruptedException {
        Process start = new ProcessBuilder("cmd", "/c", "cls").inheritIO().start();
        start.waitFor();
        System.out.print("\n\n\n\n");
        System.out.print("\t\t\t\t\t\t\t   _.-._.-._.-._.-._.-._.-._.-._.-._.-._.-._.-._.-._.-._.-._\n");
        System.out.print("\t\t\t\t\t\t\t ,'_.-._.-._.-._.-._.-._.-._.-._.-._.-._.-._.-._.-._.-._.-._`.\n");
        System.out.print("\t\t\t\t\t\t\t( (                                                         ) )\n");
        System.out.print("\t\t\t\t\t\t\t ) )                                                       ( (\n");
        System.out.print("\t\t\t\t\t\t\t( (                   UPDATE CONTACT                        ) )\n");
        System.out.print("\t\t\t\t\t\t\t ) )                                                       ( (\n");
        System.out.print("\t\t\t\t\t\t\t( (                                                         ) )\n");
        System.out.print("\t\t\t\t\t\t\t ) )         1. Name                                       ( (\n");
        System.out.print("\t\t\t\t\t\t\t( (                                                         ) )\n");
        System.out.print("\t\t\t\t\t\t\t ) )         2. Profession                                 ( (\n");
        System.out.print("\t\t\t\t\t\t\t( (                                                         ) )\n");
        System.out.print("\t\t\t\t\t\t\t ) )         3. Phone Number                               ( (\n");
        System.out.print("\t\t\t\t\t\t\t( (                                                         ) )\n");
        System.out.print("\t\t\t\t\t\t\t ) )         4. Email                                      ( (\n");
        System.out.print("\t\t\t\t\t\t\t( (                                                         ) )\n");
        System.out.print("\t\t\t\t\t\t\t ) )         5. Address                                    ( (\n");
        System.out.print("\t\t\t\t\t\t\t( (                                                         ) )\n");
        System.out.print("\t\t\t\t\t\t\t ) )         6. Back To Menu                               ( (\n");
        System.out.print("\t\t\t\t\t\t\t( (                                                         ) )\n");
        System.out.print("\t\t\t\t\t\t\t ) )                                                       ( (\n");
        System.out.print("\t\t\t\t\t\t\t( (_.-._.-._.-._.-._.-._.-._.-._.-._.-._.-._.-._.-._.-._.-._) )\n");
        System.out.print("\t\t\t\t\t\t\t `._.-._.-._.-._.-._.-._.-._.-._.-._.-._.-._.-._.-._.-._.-._,'\n");
    }
    private static void Update2(String ch, String id, Directory td) throws IOException, InterruptedException {
        Process start = new ProcessBuilder("cmd", "/c", "cls").inheritIO().start();
        start.waitFor();
        String s = ch, name, phoneNumber, profession, email, address;
        Scanner obj = new Scanner(System.in);
        switch (s) {
            case "1": {
                Node cur = find(td);
                System.out.println("\n\n\n");
                System.out.println("\t\t\t\t\t\t\tEnter the New Name");
                System.out.print("\t\t\t\t\t\t\t");
                name = obj.nextLine();
                while (name.isEmpty()) {
                    System.out.println("\n\n\t\t\t\t\t\t\tPlease ENTER the Name");
                    System.out.print("\t\t\t\t\t\t\t");
                    name = obj.nextLine();
                }
                assert cur != null;
                cur.setName(name);
                System.out.println("\n\n\t\t\t\t\t\t\tContact Name updated successfully");
                SAVE(td, id);
                Thread.sleep(MILLIS1);
                Update();
                System.out.print("\t\t\t\t\t\t\t");
                s = obj.nextLine();
                Update2(s,id,td);
                break;
            }
            case "2": {
                Node cur = find(td);
                System.out.println("\n\n\n");
                System.out.println("\t\t\t\t\t\t\tEnter the new Profession");
                System.out.print("\t\t\t\t\t\t\t");
                profession = obj.nextLine();
                while (profession.isEmpty()) {
                    System.out.println("\n\n\t\t\t\t\t\t\tPlease ENTER the Profession");
                    System.out.print("\t\t\t\t\t\t\t");
                    profession = obj.nextLine();
                }
                assert cur != null;
                cur.setProfession(profession);
                System.out.println("\n\n\t\t\t\t\t\t\tContact Profession Updated successfully");
                SAVE(td, id);
                Thread.sleep(MILLIS1);
                Update();
                System.out.print("\t\t\t\t\t\t\t");
                s = obj.nextLine();
                Update2(s,id,td);
                break;
            }
            case "3": {
                Node cur = find(td);
                System.out.println("\n\n\n");
                System.out.println("\t\t\t\t\t\t\tEnter the new Phone Number");
                System.out.print("\t\t\t\t\t\t\t");
                phoneNumber = obj.nextLine();
                while (phoneNumber.isEmpty()) {
                    System.out.println("\n\n\t\t\t\t\t\t\tPlease ENTER the Phone Number");
                    System.out.print("\t\t\t\t\t\t\t");
                    phoneNumber = obj.nextLine();
                }
                assert cur != null;
                cur.setPhoneNum(phoneNumber);
                System.out.println("\n\n\t\t\t\t\t\t\tContact Email Updated Successfully");
                SAVE(td, id);
                Thread.sleep(MILLIS1);
                Update();
                System.out.print("\t\t\t\t\t\t\t");
                s = obj.nextLine();
                Update2(s,id,td);
                break;
            }
            case "5": {
                Node cur = find(td);
                System.out.println("\n\n\n");
                System.out.println("\t\t\t\t\t\t\tEnter the new Address");
                System.out.print("\t\t\t\t\t\t\t");
                address = obj.nextLine();
                while (address.isEmpty()) {
                    System.out.println("\n\n\t\t\t\t\t\t\tPlease ENTER the Address");
                    System.out.print("\t\t\t\t\t\t\t");
                    address = obj.nextLine();
                }
                while (address.contains(",")) {
                    System.out.println("\n\n\t\t\t\t\t\t\tPlease ENTER the Address without comma ','");
                    System.out.print("\t\t\t\t\t\t\t");
                    address = obj.nextLine();
                }
                assert cur != null;
                cur.setAddress(address);
                System.out.println("\n\n\t\t\t\t\t\t\tContact Address Updated Successfully");
                SAVE(td, id);
                Thread.sleep(MILLIS1);
                Update();
                System.out.print("\t\t\t\t\t\t\t");
                s = obj.nextLine();
                Update2(s,id,td);
                break;
            }
            case "4": {
                Node cur = find(td);
                System.out.println("\n\n\n");
                System.out.println("\t\t\t\t\t\t\tEnter the new Email");
                System.out.print("\t\t\t\t\t\t\t");
                email = obj.nextLine();
                while(!email.contains("@"))  {
                    System.out.println("\n\n\t\t\t\t\t\t\tPlease ENTER the Email");
                    System.out.print("\t\t\t\t\t\t\t");
                    email = obj.nextLine();
                }
                assert cur != null;
                cur.setEmail(email);
                System.out.println("\n\n\t\t\t\t\t\t\tContact Phone Number Updated Successfully");
                SAVE(td, id);
                Thread.sleep(MILLIS1);
                Update();
                System.out.print("\t\t\t\t\t\t\t");
                s = obj.nextLine();
                Update2(s,id,td);
                break;
            }
            case "6": {
                Work();
                System.out.print("\t\t\t\t\t\t\t");
                s = obj.nextLine();
                Work2(s,id);
                break;
            }
            default: {
                System.out.println("\n\n\n\n\t\t\t\t\t\t\tIn-Valid Choice.\n\t\t\t\t\t\t\tPlease choose correct choice");
                Thread.sleep(MILLIS1);
                SearchMenu();
                System.out.print("\t\t\t\t\t\t\t");
                s = obj.nextLine();
                SearchMenu2(s,id,td);
            }
        }
    }
    private static Node find(Directory td) {
        String name, phoneNumber, profession;
        Scanner obj = new Scanner(System.in);
        System.out.println("\n\n\n");
        System.out.println("\t\t\t\t\t\t\tEnter the Name");
        System.out.print("\t\t\t\t\t\t\t");
        name = obj.nextLine();
        while (name.isEmpty()) {
            System.out.println("\n\n\t\t\t\t\t\t\tPlease ENTER the Name");
            System.out.print("\t\t\t\t\t\t\t");
            name = obj.nextLine();
        }
        System.out.println("\t\t\t\t\t\t\tEnter the Phone Number");
        System.out.print("\t\t\t\t\t\t\t");
        phoneNumber = obj.nextLine();
        while (phoneNumber.isEmpty()) {
            System.out.println("\n\n\t\t\t\t\t\t\tPlease ENTER the Phone Number");
            System.out.print("\t\t\t\t\t\t\t");
            phoneNumber = obj.nextLine();
        }
        System.out.println("\t\t\t\t\t\t\tEnter the Profession");
        System.out.print("\t\t\t\t\t\t\t");
        profession = obj.nextLine();
        while (profession.isEmpty()) {
            System.out.println("\n\n\t\t\t\t\t\t\tPlease ENTER the Profession");
            System.out.print("\t\t\t\t\t\t\t");
            profession = obj.nextLine();
        }
        Node cur = td.getTop();
        if(cur == null) {
            System.out.println("\t\t\t\t\t\t\tNo Record Found");
            return null;
        }
        while (cur != null) {
            String cName = cur.getName().toLowerCase();
            String cProfession = cur.getProfession().toLowerCase();
            String cPhNum = cur.getPhoneNum().toLowerCase();
            profession = profession.toLowerCase();
            name = name.toLowerCase();
            phoneNumber = phoneNumber.toLowerCase();
            if(cProfession.equalsIgnoreCase(profession) && cName.equalsIgnoreCase(name) && cPhNum.equalsIgnoreCase(phoneNumber)) {
                return cur;
            }
            cur = cur.next;
        }
        return null;
    }
    private static void SearchMenu2(String ch, String id, Directory td) throws IOException, InterruptedException {
        Process start = new ProcessBuilder("cmd", "/c", "cls").inheritIO().start();
        start.waitFor();
        String s = ch, name, phoneNumber, profession;
        Scanner obj = new Scanner(System.in);
        switch (s) {
            case "1": {
                System.out.println("\n\n\n");
                System.out.println("\t\t\t\t\t\t\tEnter the Name");
                System.out.print("\t\t\t\t\t\t\t");
                name = obj.nextLine();
                while (name.isEmpty()) {
                    System.out.println("\n\n\t\t\t\t\t\t\tPlease ENTER the Name");
                    System.out.print("\t\t\t\t\t\t\t");
                    name = obj.nextLine();
                }
                System.out.println();
                search(td,name);
                System.out.println("\n\n\t\t\t\t\t\t\tPress Key to continue");
                System.out.println("\t\t\t\t\t\t\t");
                obj.nextLine();
                Thread.sleep(MILLIS1);
                SearchMenu();
                System.out.print("\t\t\t\t\t\t\t");
                s = obj.nextLine();
                SearchMenu2(s,id,td);
                break;
            }
            case "2": {
                System.out.println("\n\n\n");
                System.out.println("\t\t\t\t\t\t\tEnter the Profession");
                System.out.print("\t\t\t\t\t\t\t");
                profession = obj.nextLine();
                while (profession.isEmpty()) {
                    System.out.println("\n\n\t\t\t\t\t\t\tPlease ENTER the Profession");
                    System.out.print("\t\t\t\t\t\t\t");
                    profession = obj.nextLine();
                }
                System.out.println();
                search2(td,profession);
                System.out.println("\n\n\t\t\t\t\t\t\tPress Key to continue");
                System.out.println("\t\t\t\t\t\t\t");
                obj.nextLine();
                Thread.sleep(MILLIS1);
                SearchMenu();
                System.out.print("\t\t\t\t\t\t\t");
                s = obj.nextLine();
                SearchMenu2(s,id,td);
                break;
            }
            case "3": {
                System.out.println("\n\n\n");
                System.out.println("\t\t\t\t\t\t\tEnter the Phone Number");
                System.out.print("\t\t\t\t\t\t\t");
                phoneNumber = obj.nextLine();
                while (phoneNumber.isEmpty()) {
                    System.out.println("\n\n\t\t\t\t\t\t\tPlease ENTER the Phone Number");
                    System.out.print("\t\t\t\t\t\t\t");
                    phoneNumber = obj.nextLine();
                }
                System.out.println();
                search3(td,phoneNumber);
                System.out.println("\n\n\t\t\t\t\t\t\tPress Key to continue");
                System.out.println("\t\t\t\t\t\t\t");
                obj.nextLine();
                Thread.sleep(MILLIS1);
                SearchMenu();
                System.out.print("\t\t\t\t\t\t\t");
                s = obj.nextLine();
                SearchMenu2(s,id,td);
                break;
            }
            case "4": {
                Work();
                System.out.print("\t\t\t\t\t\t\t");
                s = obj.nextLine();
                Work2(s,id);
                break;
            }
            default: {
                System.out.println("\n\n\n\n\t\t\t\t\t\t\tIn-Valid Choice.\n\t\t\t\t\t\t\tPlease choose correct choice");
                Thread.sleep(MILLIS1);
                SearchMenu();
                System.out.print("\t\t\t\t\t\t\t");
                s = obj.nextLine();
                SearchMenu2(s,id,td);
            }
        }
    }
    private static void Work2(String ch, String id) throws IOException, InterruptedException{
        Process start = new ProcessBuilder("cmd", "/c", "cls").inheritIO().start();
        start.waitFor();
        DirectoryHeap dHeap = retrieveData(id);
        Directory td = new Directory();
        heapsort(dHeap, td);
        String s = ch, name, address, email, phoneNumber, profession;
        Scanner obj = new Scanner(System.in);
        switch (s) {
            case "1": {
                System.out.println("\n\n\n");
                td.print();
                System.out.println("\n\n\t\t\t\t\tPress Key to continue");
                System.out.print("\t\t\t\t\t");
                obj.nextLine();
                Thread.sleep(MILLIS1);
                Work();
                System.out.print("\t\t\t\t\t\t\t");
                s = obj.nextLine();
                Work2(s,id);
                break;
            }
            case "2": {
                Thread.sleep(MILLIS2);
                SearchMenu();
                System.out.print("\t\t\t\t\t\t\t");
                s = obj.nextLine();
                SearchMenu2(s,id,td);
                Thread.sleep(MILLIS1);
                Work();
                System.out.print("\t\t\t\t\t\t\t");
                s = obj.nextLine();
                Work2(s,id);
                break;
            }
            case "3": {
                System.out.println("\n\n\n");
                System.out.println("\t\t\t\t\t\t\tEnter the Name");
                System.out.print("\t\t\t\t\t\t\t");
                name = obj.nextLine();
                while (name.isEmpty()) {
                    System.out.println("\n\n\t\t\t\t\t\t\tPlease ENTER the Name");
                    System.out.print("\t\t\t\t\t\t\t");
                    name = obj.nextLine();
                }
                System.out.println("\t\t\t\t\t\t\tEnter the Address");
                System.out.print("\t\t\t\t\t\t\t");
                address = obj.nextLine();
                while (address.isEmpty()) {
                    System.out.println("\n\n\t\t\t\t\t\t\tPlease ENTER the Address");
                    System.out.print("\t\t\t\t\t\t\t");
                    address = obj.nextLine();
                }
                while (address.contains(",")) {
                    System.out.println("\n\n\t\t\t\t\t\t\tPlease ENTER the Address without comma ','");
                    System.out.print("\t\t\t\t\t\t\t");
                    address = obj.nextLine();
                }
                System.out.println("\t\t\t\t\t\t\tEnter the Email");
                System.out.print("\t\t\t\t\t\t\t");
                email = obj.nextLine();
                while (!email.contains("@")) {
                    System.out.println("\n\n\t\t\t\t\t\t\tPlease ENTER the Email");
                    System.out.print("\t\t\t\t\t\t\t");
                    email = obj.nextLine();
                }
                System.out.println("\t\t\t\t\t\t\tEnter the Phone Number");
                System.out.print("\t\t\t\t\t\t\t");
                phoneNumber = obj.nextLine();
                while (!phoneNumber.startsWith("03")) {
                    System.out.println("\n\n\t\t\t\t\t\t\tPlease ENTER the PhoneNumber");
                    System.out.print("\t\t\t\t\t\t\t");
                    phoneNumber = obj.nextLine();
                }
                System.out.println("\t\t\t\t\t\t\tEnter the Profession");
                System.out.print("\t\t\t\t\t\t\t");
                profession = obj.nextLine();
                while (profession.isEmpty()) {
                    System.out.println("\n\n\t\t\t\t\t\t\tPlease ENTER the Profession");
                    System.out.print("\t\t\t\t\t\t\t");
                    profession = obj.nextLine();
                }
                Node node = new Node(name, address, email, phoneNumber, profession);
                td.insert(node);
                SAVE(td,id);
                System.out.println("\n\n\t\t\t\t\t\t\tContact successfully inserted");
                Thread.sleep(MILLIS1);
                Work();
                System.out.print("\t\t\t\t\t\t\t");
                s = obj.nextLine();
                Work2(s,id);
                break;
            }
            case "4": {
                System.out.println("\n\n\n");
                System.out.println("\t\t\t\t\t\t\tEnter the Name");
                System.out.print("\t\t\t\t\t\t\t");
                name = obj.nextLine();
                while (name.isEmpty()) {
                    System.out.println("\n\n\t\t\t\t\t\t\tPlease ENTER the Name");
                    System.out.print("\t\t\t\t\t\t\t");
                    name = obj.nextLine();
                }
                System.out.println("\t\t\t\t\t\t\tEnter the Phone Number");
                System.out.print("\t\t\t\t\t\t\t");
                phoneNumber = obj.nextLine();
                while (phoneNumber.isEmpty()) {
                    System.out.println("\n\n\t\t\t\t\t\t\tPlease ENTER the Phone Number");
                    System.out.print("\t\t\t\t\t\t\t");
                    phoneNumber = obj.nextLine();
                }
                System.out.println("\t\t\t\t\t\t\tEnter the Profession Number");
                System.out.print("\t\t\t\t\t\t\t");
                profession = obj.nextLine();
                while (profession.isEmpty()) {
                    System.out.println("\n\n\t\t\t\t\t\t\tPlease ENTER the Profession");
                    System.out.print("\t\t\t\t\t\t\t");
                    profession = obj.nextLine();
                }
                td.delete(name,phoneNumber,profession);
                SAVE(td,id);
                Thread.sleep(MILLIS1);
                Work();
                System.out.print("\t\t\t\t\t\t\t");
                s = obj.nextLine();
                Work2(s,id);
                break;
            }
            case "6": {
                SAVE(td, id);
                System.exit(0);
            }
            case "5": {
                Thread.sleep(MILLIS2);
                Update();
                System.out.print("\t\t\t\t\t\t\t");
                s = obj.nextLine();
                Update2(s,id,td);
                Thread.sleep(MILLIS1);
                Work();
                System.out.print("\t\t\t\t\t\t\t");
                s = obj.nextLine();
                Work2(s,id);
                break;
            }
            default: {
                System.out.println("\n\n\n\n\t\t\t\t\t\t\tIn-Valid Choice.\n\t\t\t\t\t\t\tPlease choose correct choice");
                Thread.sleep(MILLIS1);
                Work();
                System.out.print("\t\t\t\t\t\t\t");
                s = obj.nextLine();
                Work2(s,id);
            }
        }
    }
    private static void search(Directory td, String name) {
        Node cur = td.getTop();
        if(cur == null) {
            System.out.println("\t\t\t\t\t\t\tNo Record Found");
            return;
        }
        System.out.printf("\t\t\t\t%-20s%-30s%-30s%-15s%-15s\n\n","Name","Address","Email","PhoneNumber","Profession");
        while (cur != null) {
            String cName = cur.getName().toLowerCase();
            name = name.toLowerCase();
            if(cName.contains(name)) {
                System.out.format("\t\t\t\t%-20s%-30s%-30s%-15s%-15s\n", cur.getName(), cur.getAddress(), cur.getEmail(), cur.getPhoneNum(),cur.getProfession());
            }
            cur = cur.next;
        }
    }
    private static void search2(Directory td, String profession) {
        Node cur = td.getTop();
        if(cur == null) {
            System.out.println("\t\t\t\t\t\t\tNo Record Found");
            return;
        }
        System.out.printf("\t\t\t\t%-20s%-30s%-30s%-15s%-15s\n\n","Name","Address","Email","PhoneNumber","Profession");
        while (cur != null) {
            String cName = cur.getProfession().toLowerCase();
            profession = profession.toLowerCase();
            if(cName.equalsIgnoreCase(profession)) {
                System.out.format("\t\t\t\t%-20s%-30s%-30s%-15s%-15s\n", cur.getName(), cur.getAddress(), cur.getEmail(), cur.getPhoneNum(),cur.getProfession());
            }
            cur = cur.next;
        }
    }
    private static void search3(Directory td, String phNum) {
        Node cur = td.getTop();
        if(cur == null) {
            System.out.println("\t\t\t\t\t\t\tNo Record Found");
            return;
        }
        System.out.printf("\t\t\t\t%-20s%-30s%-30s%-15s%-15s\n\n","Name","Address","Email","PhoneNumber","Profession");
        while (cur != null) {
            String cName = cur.getPhoneNum().toLowerCase();
            phNum = phNum.toLowerCase();
            if(cName.equals(phNum)) {
                System.out.format("\t\t\t\t%-20s%-30s%-30s%-15s%-15s\n", cur.getName(), cur.getAddress(), cur.getEmail(), cur.getPhoneNum(),cur.getProfession());
            }
            cur = cur.next;
        }
    }
    private static void heapsort(DirectoryHeap dHeap, Directory td) {
        for (int i = 0; i < dHeap.getSize(); i++) {
            td.insert(dHeap.arr[i]);
        }
    }
    private static DirectoryHeap retrieveData(String id) throws IOException {
        DirectoryHeap dHeap = null;
        String sen, file = id + ".txt";
        File myFile = new File(file);
        if(!myFile.exists()) {
            myFile.createNewFile();
        }
        else {
            Path file2 = Paths.get(file);
            long count = Files.lines(file2).count();
            dHeap = new DirectoryHeap((int) count);
            Scanner myReader = new Scanner(myFile);
            while (myReader.hasNextLine()) {
                sen = myReader.nextLine();
                String[] senSplit = sen.split(",");
                Node newNode = new Node(senSplit[0], senSplit[1], senSplit[2], senSplit[3], senSplit[4]);
                dHeap.insert(newNode);
            }
        }
        return dHeap;
    }
    private static void SAVE(Directory td, String id) throws IOException {
        DirectoryHeap dHeap = new DirectoryHeap(td.getSize());
        Node cur = td.getTop();
        while(cur != null) {
            dHeap.insert(cur);
            cur = cur.next;
        }
        SAVE(dHeap, id);
    }
    private static void SAVE(DirectoryHeap dHeap, String id) throws IOException {
        String sen, file = id + ".txt";
        File myFile = new File(file);
        FileWriter myWriter = new FileWriter(myFile);
        Node cur = dHeap.delete();
        while(cur != null) {
            sen = cur.getName() + "," + cur.getAddress() + "," + cur.getEmail() + "," + cur.getPhoneNum() + "," + cur.getProfession() + "\n";
            myWriter.write(sen);
            cur = dHeap.delete();
        }
        myWriter.close();
    }
}
class Node{
    private String Name, Address, Email,PhoneNum, Profession;
    Node next;
    public Node(String name, String address, String email, String phoneNum, String profession) {
        Name = name;
        Address = address;
        Email = email;
        PhoneNum = phoneNum;
        Profession = profession;
    }
    public void setName(String name) {
        Name = name;
    }
    public void setAddress(String address) {
        Address = address;
    }
    public void setEmail(String email) {
        Email = email;
    }
    public void setPhoneNum(String phoneNum) {
        PhoneNum = phoneNum;
    }
    public void setProfession(String profession) {
        Profession = profession;
    }
    public String getProfession() {
        return Profession;
    }
    public String getName() {
        return Name;
    }
    public String getAddress() {
        return Address;
    }
    public String getEmail() {
        return Email;
    }
    public String getPhoneNum() {
        return PhoneNum;
    }
}
class Directory{
    private Node Top, Last;
    private int size;
    public Node getTop() {
        return Top;
    }

    public Directory() {
        Top = null;
        Last = null;
    }

    public int getSize() {
        return size;
    }

    public void insert(Node n) {
        if(Top == null) {
            Top = Last = n;
        }
        else {
            Last.next = n;
            Last = n;
        }
        sort();
        size++;
    }
    public void delete(String name, String phNum, String profession) {
        Node cur = Top, prv = null;
        boolean swap = false;
        while (cur != null) {
            if(cur.getName().equals(name) && cur.getPhoneNum().equals(phNum) && cur.getProfession().equals(profession)) {
                swap = true;
                if(cur == Top) {
                    Top = Top.next;
                }
                else {
                    assert prv != null;
                    prv.next = cur.next;
                }
            }
            prv = cur;
            cur = cur.next;
        }
        if(swap) {
            sort();
            System.out.println("\n\t\t\t\t\t\t\tContact successfully deleted");
        }
        else {
            System.out.println("\n\t\t\t\t\t\t\tContact Not Found");
        }
        size--;
    }
    public void print() {
        if(Top == null) {
            System.out.println("\t\t\t\t\t\t\tNo Record Found");
            return;
        }
        Node cur  = Top;
        System.out.printf("\t\t\t\t%-20s%-30s%-30s%-15s%-15s\n\n","Name","Address","Email","PhoneNumber","Profession");
        while (cur != null) {
            System.out.format("\t\t\t\t%-20s%-30s%-30s%-15s%-15s\n", cur.getName(), cur.getAddress(), cur.getEmail(), cur.getPhoneNum(), cur.getProfession());
            cur = cur.next;
        }
    }
    private void sort() {
        boolean swap = true;
        while (swap) {
            swap = false;
            Node cur = Top, prv = null, temp;
            while (cur.next != null) {
                if (cur.getProfession().compareToIgnoreCase(cur.next.getProfession()) > 0) {
                    if (cur == Top) {
                        temp = cur.next;
                        cur.next = temp.next;
                        Top = temp;
                        temp.next = cur;
                    } else {
                        temp = cur;
                        assert prv != null;
                        prv.next = cur.next;
                        temp.next = cur.next.next;
                        prv.next.next = temp;
                    }
                    swap = true;
                }
                else if (cur.getProfession().compareToIgnoreCase(cur.next.getProfession()) == 0) {
                    if (cur.getName().compareToIgnoreCase(cur.next.getName()) > 0) {
                        if (cur == Top) {
                            temp = cur.next;
                            cur.next = temp.next;
                            Top = temp;
                            temp.next = cur;
                        } else {
                            temp = cur;
                            assert prv != null;
                            prv.next = cur.next;
                            temp.next = cur.next.next;
                            prv.next.next = temp;
                        }
                        swap = true;
                    }
                }
                prv = cur;
                cur = cur.next;
                if(cur == null) {
                    break;
                }
            }
        }
    }
}
class DirectoryHeap{
    Node[] arr;
    private int size;
    private final int capacity;
    public int getSize() {
        return size;
    }
    public DirectoryHeap(int capacity) {
        this.capacity = capacity;
        arr = new Node[capacity];
        size = 0;
    }
    private int parent(int index) {
        return (index - 1) / 2;
    }
    private int leftChild(int index) {
        return 2 * index + 1;
    }
    private int rightChild(int index) {
        return 2 * index + 2;
    }
    public void insert(Node node) {
        if (size == capacity) {
            System.out.println("Heap is full. Cannot insert.");
            return;
        }

        arr[size] = node;
        size++;
        int currentIndex = size - 1;
        while (currentIndex > 0) {
            if(arr[currentIndex].getProfession().compareToIgnoreCase(arr[parent(currentIndex)].getProfession()) < 0) {
                Node temp = arr[currentIndex];
                arr[currentIndex] = arr[parent(currentIndex)];
                arr[parent(currentIndex)] = temp;
                currentIndex = parent(currentIndex);
            } else if (arr[currentIndex].getProfession().compareToIgnoreCase(arr[parent(currentIndex)].getProfession()) == 0) {
                if(arr[currentIndex].getName().compareToIgnoreCase(arr[parent(currentIndex)].getName()) < 0) {
                    Node temp = arr[currentIndex];
                    arr[currentIndex] = arr[parent(currentIndex)];
                    arr[parent(currentIndex)] = temp;
                    currentIndex = parent(currentIndex);
                }
            }
            else {
                break;
            }
        }
    }
    public Node delete() {
        if (size <= 0) {
            System.out.println("Heap is empty.");

            return null;
        }

        if (size == 1) {
            size--;
            return arr[0];
        }

        Node min = arr[0];
        arr[0] = arr[size - 1];
        size--;

        heapifyDown(0);

        return min;
    }

    private void heapifyDown( int index) {
        int left = leftChild(index);
        int right = rightChild(index);
        int smallest = index;

        if (left < size && arr[left].getProfession().compareToIgnoreCase(arr[smallest].getProfession()) < 0) {
            smallest = left;
        }
        else if(left < size && arr[left].getProfession().compareToIgnoreCase(arr[smallest].getProfession()) == 0) {
            if(arr[left].getName().compareToIgnoreCase(arr[smallest].getName()) < 0) {
                smallest = left;
            }
        }
        if (right < size && arr[right].getProfession().compareToIgnoreCase(arr[smallest].getProfession()) < 0) {
            smallest = right;
        }
        else if(right < size && arr[right].getProfession().compareToIgnoreCase(arr[smallest].getProfession()) == 0) {
            if(arr[right].getName().compareToIgnoreCase(arr[smallest].getName()) < 0) {
                smallest = right;
            }
        }
        if (smallest != index) {
            Node temp = arr[index];
            arr[index] = arr[smallest];
            arr[smallest] = temp;
            heapifyDown(smallest);
        }
    }
}
enum PasswordApp {
    ;

    public static void main(String[] argv) {
        char[] password = null;
        try {
            password = PasswordField.getPassword("Enter your password: ");
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
        if (null == password) {
            System.out.println("No password entered");
        } else {
            String valueOf = String.valueOf(password);
            System.out.println("The password entered is: " + valueOf);
        }
    }
}

enum PasswordField {
    ;
    private static final int INT = 128;
    private static final char VAL = ' ';
    private static final char CHAR = '\n';
    private static final char CHAR1 = '\r';

    static char[] getPassword(String prompt) throws IOException {
        InputStream inputStream = System.in;
        MaskingThread maskingthread = new MaskingThread(prompt);
        Thread thread = new Thread(maskingthread);
        thread.start();

        char[] lineBuffer;
        char[] buf;
        buf = lineBuffer = new char[INT];
        int room = buf.length;
        int offset = 0;
        int c;
        loop:
        while (true) {
            switch (c = inputStream.read()) {
                case -1:
                case CHAR:
                    break loop;
                case CHAR1:
                    int c2 = inputStream.read();
                    if ((CHAR != c2) && (-1 != c2)) {
                        if (!(inputStream instanceof PushbackInputStream)) {
                            inputStream = new PushbackInputStream(inputStream);
                        }
                        ((PushbackInputStream) inputStream).unread(c2);
                    } else {
                        break loop;
                    }
                default:
                    --room;
                    if (0 > room) {
                        buf = new char[offset + INT];
                        room = buf.length - offset - 1;
                        System.arraycopy(lineBuffer, 0, buf, 0, offset);
                        Arrays.fill(lineBuffer, VAL);
                        lineBuffer = buf;
                    }
                    buf[offset] = (char) c;
                    offset++;
                    break;
            }
        }
        maskingthread.stopMasking();
        if (0 == offset) {
            return null;
        }
        char[] ret = new char[offset];
        System.arraycopy(buf, 0, ret, 0, offset);
        Arrays.fill(buf, VAL);
        return ret;
    }
}

class MaskingThread extends Thread {
    private static final char ECHO_CHAR = '*';
    private static final char CHAR = '}';
    private volatile boolean stop;

    MaskingThread(String prompt) {
        System.out.print(prompt);
    }

    public void run() {
        int priority = Thread.currentThread().getPriority();
        Thread.currentThread().setPriority(Thread.MAX_PRIORITY);
        try {
            this.stop = true;
            while (this.stop) {
                char echoChar = ECHO_CHAR;
                System.out.print("\010" + echoChar);
                try {
                    sleep(1);
                } catch (InterruptedException iex) {
                    Thread.currentThread().interrupt();
                    return;
                }
            }
        } finally {
            Thread.currentThread().setPriority(priority);
        }
    }

    void stopMasking() {
        this.stop = false;
    }

    @Override
    public String toString() {
        return "MaskingThread{" +
                "stop=" + this.stop +
                CHAR;
    }
}