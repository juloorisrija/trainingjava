package org.example;
import java.util.Scanner;
public enum MonthEnum {

            January(1),
            Febraury(2),
            March(3),
            April(4),
            May(5),
            june(6),
            july(7),
            august(8),
            september(9),
            october(10),
            november(11),
            december(12);

            private  int mon;
            private MonthEnum(int mon)
            {
                this.mon=mon;
            }




        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);
            int x=sc.nextInt();

            for(MonthEnum m:MonthEnum.values())
            {
                if( m.mon==x)
                {
                    System.out.println(m);
                }
            }

        }
    }

