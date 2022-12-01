package org.example;

import java.util.Scanner;

public class MailArray {
    public static void main(String []arg){
        Scanner sc =new Scanner(System.in);
        String[] mail = new String[4];
        String[] mailCheck = new String[4];
        String[] gmail = new String[4];
        String[] yahoo =new String[4];

        for(int i=0;i<4;i++) {
             mail[i] = sc.next();
             //System.out.println(mail[i]);
        }
        for(int k=0;k<4;k++){
        for(int j=0;j<4;j++) {
            for(String mail1 : mail[j].split("@")){
                mailCheck[j]=mail1;
                System.out.println(mailCheck[j]);
            }
            System.out.println(j);

            if(mailCheck[1]=="gmail.com"){
                gmail[k]=mailCheck[0].concat(mailCheck[1]);
                System.out.println(gmail[k]);
            }
            else{
                yahoo[k]=mailCheck[0].concat(mailCheck[1]);
            }
        }
        }
        for(int a=0;a<4;a++){
            System.out.print(gmail[a]);
            System.out.print(yahoo[a]);
        }
    }
}
