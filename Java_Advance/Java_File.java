package Java_Advance;

import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

public class Java_File {
    public static void main(String[] args) throws Exception{
        File file=new File("MyText.txt");
        file.createNewFile();
        FileWriter fileWriter=new FileWriter("MyText.txt");
        fileWriter.write("-: Multiplication Table :-\n");
        String table="";
        for (int i = 2; i <= 10; i++) {
            for (int j = 1; j <=10 ; j++) {
                int mul=i*j;
                table+=i +" X "+j+"="+mul;
                table+="\n";
            }
            table+="\n";
        }
        fileWriter.write(table);
        fileWriter.close();
        Scanner sc=new Scanner(file);
        while (sc.hasNextLine()){
            String str= sc.nextLine();
            System.out.println(str);
        }
        sc.close();
    }
}
