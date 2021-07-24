// skeleton for reading/processing external files
import java.io.*;
import java.util.*;
import java.text.*;

public class MaskData {
    public static void main(String[] args) throws IOException {
        NumberFormat fmt = NumberFormat.getNumberInstance();
        fmt.setMinimumFractionDigits(3);
        fmt.setMaximumFractionDigits(3);

        Scanner sn = new Scanner(new File("C:\\Users\\imren\\Desktop\\Games + Programming\\Java\\TextDocs for Projects\\P27file.txt")); //fill in file name in particular project
        int maxIndex = -1;
        int[] nums = new int[100];

        while (sn.hasNextInt()) {
            maxIndex++;
            nums[maxIndex] = sn.nextInt();
        }

        for (int x=0; x <= maxIndex; x++) {
            int num = nums[x];

            System.out.println("Switch status for data value " + num + ":");
            for (int switchNum = 0; switchNum < 8; switchNum++) {

                int eval = num & (int) Math.pow(2,switchNum);
                if (eval > 0)
                    System.out.println("Switch sw" + (switchNum+56) + " is \"on\"");

                else System.out.println("Switch sw" + (switchNum+56) + " is \"off\"");
            }
            System.out.println();
        }

        sn.close();

    }
}
