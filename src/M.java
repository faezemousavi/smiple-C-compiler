

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class M {
    public static String[] token = new String[1111];
    public static int count = 0;
    static String[] no = new String[1111];

    public static void main(String[] args) throws IOException {

        File f = new File("E:\\input.txt");     //Creation of File Descriptor for input file
        FileReader fr = new FileReader(f);   //Creation of File Reader object
        BufferedReader br = new BufferedReader(fr);  //Creation of BufferedReader object
        int c = 0;
        String tok = "";
        //System.out.println(br.readLine());
        while ((c = br.read()) != -1)         //Read char by Char
        {
            char character = (char) c;
            if (character == '#') {
                tok = "";
                c = br.read();
                character = (char) c;
                while (character != '\n') {
                    c = br.read();
                    character = (char) c;
                    tok = "";
                }
                if (tok != "")
                    System.out.println(tok);
            }
            if ((character >= 'a' && character <= 'z') || (character >= 'A' && character <= 'Z') || character == '_' || (character >= '0' && character <= '9')) {
                tok = "";
                while ((character >= 'a' && character <= 'z') || (character >= 'A' && character <= 'Z') || character == '_' || (character >= '0' && character <= '9') || character == ' ') {
                    if (character == ' ') {
                        //    System.out.print("");
                        c = br.read();
                        character = (char) c;
                    } else {

                        tok = tok + character;
                        c = br.read();
                        character = (char) c;

                        if (character >= '0' && character <= '9') {
                            //    if (!(character >= 'a' && character <= 'z') || (character >= 'A' && character <= 'Z'))
                            tok = tok + character;
                            c = br.read();
                            character = (char) c;
                            while (character >= '0' && character <= '9') {
                                c = br.read();
                                character = (char) c;
                                if (!(character >= 'a' && character <= 'z') || (character >= 'A' && character <= 'Z'))
                                    tok = tok + character;

                            }
                            if ((character >= 'a' && character <= 'z') || (character >= 'A' && character <= 'Z')) {
                                c = br.read();
                                character = (char) c;
                                while ((character >= 'a' && character <= 'z') || (character >= 'A' && character <= 'Z')) {
                                    if ((character >= 'a' && character <= 'z') || (character >= 'A' && character <= 'Z')) {
                                        tok = "";
                                    }
                                    c = br.read();
                                    character = (char) c;
                                }
                                tok = "";
                                System.out.println("khata");
                            }

                        }


                        if (character == '(') {
                            if (tok != "") {
                                //     System.out.println(tok);
                                token[count] = tok;
                                count++;
                            }
                            tok = "";
                            //System.out.println(character);
                            token[count] = String.valueOf(character);
                            no[count] = String.valueOf(character);
                            count++;
                            c = br.read();
                            character = (char) c;
                        }
                        if (character == ' ') {
                            if (tok != "") {
                                //  System.out.println(tok);
                                token[count] = tok;
                                count++;
                            }
                            tok = "";
                            System.out.print("");
                            c = br.read();
                            character = (char) c;
                        }
                        if (character == ')') {
                            if (tok != "") {
                                // System.out.println(tok);
                                token[count] = tok;
                                count++;
                            }
                            tok = "";
                            // System.out.println(character);
                            token[count] = String.valueOf(character);
                            no[count] = String.valueOf(character);
                            count++;
                            c = br.read();
                            character = (char) c;
                        }
                        if (character == '[') {
                            if (tok != "") {
                                // System.out.println(tok);
                                token[count] = tok;
                                count++;
                            }
                            tok = "";
                            //   System.out.println(character);
                            token[count] = String.valueOf(character);
                            no[count] = String.valueOf(character);
                            count++;
                            c = br.read();
                            character = (char) c;
                        }
                        if (character == ']') {
                            if (tok != "") {
                                // System.out.println(tok);
                                token[count] = tok;
                                count++;
                            }
                            tok = "";
                            //System.out.println(character);
                            token[count] = String.valueOf(character);
                            no[count] = String.valueOf(character);
                            count++;
                            c = br.read();
                            character = (char) c;
                        }
                        if (character == '+') {
                            if (tok != "") {
                                //   System.out.println(tok);
                                token[count] = tok;
                                System.out.println(token[count]);
                                count++;
                            }
                            tok = "";
                            //System.out.println(character);
                            token[count] = String.valueOf(character);
                            no[count] = String.valueOf(character);
                            count++;
                            c = br.read();
                            character = (char) c;
                        }
                        if (character == '-') {
                            if (tok != "") {
                                // System.out.println(tok);
                                token[count] = tok;
                                count++;
                            }
                            tok = "";
                            //System.out.println(character);
                            token[count] = String.valueOf(character);
                            no[count] = String.valueOf(character);
                            count++;
                            c = br.read();
                            character = (char) c;
                        }
                        if (character == '*') {
                            if (tok != "") {
                                //System.out.println(tok);
                                token[count] = tok;
                                count++;
                            }
                            tok = "";
                            //  System.out.println(character);
                            token[count] = String.valueOf(character);
                            no[count] = String.valueOf(character);
                            count++;
                            c = br.read();
                            character = (char) c;
                        }
                        if (character == '/') {
                            if (tok != "")
                                System.out.println(tok);
                            tok = "";
                            System.out.println(character);
                            c = br.read();
                            character = (char) c;
                        }
                        if (character == ';') {
                            if (tok != "") {
                                // System.out.println(tok);
                                token[count] = tok;
                                count++;
                            }
                            tok = "";
                            //System.out.println(character);
                            token[count] = String.valueOf(character);
                            no[count] = String.valueOf(character);
                            count++;
                            c = br.read();
                            character = (char) c;
                        }
                        if (character == ':') {
                            if (tok != "") {
                                //System.out.println(tok);
                                token[count] = tok;
                                count++;
                            }
                            tok = "";
                            // System.out.println(character);
                            token[count] = String.valueOf(character);
                            no[count] = String.valueOf(character);
                            count++;
                            c = br.read();
                            character = (char) c;
                        }
                        if (character == ',') {
                            if (tok != "") {
                                //System.out.println(tok);
                                token[count] = tok;
                                count++;
                            }
                            tok = "";
                            //    System.out.println(character);
                            token[count] = String.valueOf(character);
                            no[count] = String.valueOf(character);
                            count++;
                            c = br.read();
                            character = (char) c;
                        }
                        if (character == '!') {
                            if (tok != "")
                                System.out.println(tok);
                            tok = "";
                            System.out.println(character);
                            c = br.read();
                            character = (char) c;
                        }
                        if (character == '%') {
                            if (tok != "") {
                                //System.out.println(tok);
                                token[count] = tok;
                                count++;
                            }
                            tok = "";
                            //  System.out.println(character);
                            token[count] = String.valueOf(character);
                            no[count] = String.valueOf(character);
                            count++;
                            c = br.read();
                            character = (char) c;
                        }
                        if (character == '>') {

                            c = br.read();
                            character = (char) c;
                            if (character == '=') {
                                if (tok != "") {
                                    token[count] = tok;
                                    count++;

                                }
                                tok = "";
                                //  System.out.println(">=");
                                token[count] = ">=";
                                no[count] = ">=";
                                count++;
                                c = br.read();
                                character = (char) c;
                            } else {
                                if (tok != "") {
                                    token[count] = tok;
                                    count++;
                                }
                                tok = "";
                                token[count] = ">";
                                no[count] = ">";
                                count++;
                            }
                        }
                        if (character == '<') {
                            c = br.read();
                            character = (char) c;
                            if (character == '=') {
                                if (tok != "") {
                                    token[count] = tok;
                                    count++;

                                }
                                tok = "";
                                //   System.out.println("<=");
                                token[count] = "<=";
                                no[count] = "<=";
                                count++;
                                c = br.read();
                                character = (char) c;
                            } else {
                                if (tok != "") {
                                    token[count] = tok;
                                    count++;

                                }
                                tok = "";
                                token[count] = "<";
                                no[count] = "<";
                                count++;
                            }
                        }
                        if (character == '=') {
                            c = br.read();
                            character = (char) c;
                            if (character == '=') {
                                if (tok != "") {
                                    token[count] = tok;
                                    count++;
                                }
                                tok = "";
                                //System.out.println("==");
                                token[count] = "==";
                                no[count] = "==";
                                count++;
                                c = br.read();
                                character = (char) c;
                            } else {
                                if (tok != "") {
                                    token[count] = tok;
                                    count++;
                                }
                                tok = "";
                                token[count] = "=";
                                no[count] = "=";
                                count++;
                            }
                        }
                        if (character == '|') {
                            c = br.read();
                            character = (char) c;
                            if (character == '|') {
                                if (tok != "") {
                                    token[count] = tok;
                                    count++;
                                }
                                tok = "";
                                //  System.out.println("||");
                                token[count] = "||";
                                no[count] = "||";
                                count++;
                                c = br.read();
                                character = (char) c;
                            } else {
                                if (tok != "") {
                                    token[count] = tok;
                                    count++;
                                }
                                tok = "";
                                System.out.println("khata");
                                c = br.read();
                                character = (char) c;
                            }
                        }
                        if (character == '&') {
                            c = br.read();
                            character = (char) c;
                            if (character == '&') {
                                if (tok != "") {
                                    token[count] = tok;
                                    count++;
                                }
                                tok = "";
                                //System.out.println("&&");
                                token[count] = "&&";
                                no[count] = "&&";
                                count++;
                                c = br.read();
                                character = (char) c;
                            } else {
                                if (tok != "") {
                                    token[count] = tok;
                                    count++;
                                }
                                tok = "";
                                System.out.println("khata");
                                c = br.read();
                                character = (char) c;
                            }
                        }
                    }
                }


                if (tok != "") {
                    token[count] = tok;
                    count++;

                }


            }
            if (character == '{') {
                //   System.out.println(character);
                token[count] = String.valueOf(character);
                no[count] = String.valueOf(character);
                count++;
            }
            if (character == '(') {
                // System.out.println(character);
                token[count] = String.valueOf(character);
                no[count] = String.valueOf(character);
                count++;
            }
            if (character == '}') {
                //   System.out.println(character);
                token[count] = String.valueOf(character);
                no[count] = String.valueOf(character);
                count++;
            }
            if (character == ')') {
                //   System.out.println(character);
                token[count] = String.valueOf(character);
                no[count] = String.valueOf(character);
                count++;
            }
            if (character == ';') {
                //    System.out.println(character);
                token[count] = String.valueOf(character);
                no[count] = String.valueOf(character);
                count++;
            }
            if (character == ',') {
                // System.out.println(character);
                token[count] = String.valueOf(character);
                no[count] = String.valueOf(character);
                count++;
            }
            if (character == ':') {
                //     System.out.println(character);
                token[count] = String.valueOf(character);
                no[count] = String.valueOf(character);
                count++;
            }

        }
        int length = 0;
        System.out.println("**********************************************************************************************************************************************************************************");
        for (int i = 0; i < token.length; i++) {
            if (token[i] != null) {
                //   System.out.println(token[i]);
                length++;
            }

        }
        char l;
        for (int i=0;i<length;i++){

            if (token[i].equals("-")||token[i].equals("+")||token[i].equals("*")||token[i].equals("/")||token[i].equals("%")||
                    token[i].equals("||")||token[i].equals("&&")||token[i].equals("!")||token[i].equals(">")||token[i].equals("<")||
                    token[i].equals(">=")||token[i].equals("<=")||token[i].equals("==")||token[i].equals(":")||token[i].equals(";")||
                    token[i].equals(",")||token[i].equals("{")||token[i].equals("}")||token[i].equals("[")||token[i].equals("]")||
                    token[i].equals("(")||token[i].equals(")")||token[i].equals("=")){
                no[i]=token[i];
            }
            else {
                l = token[i].charAt(0);
                if (l >= '0' && l <= '9') {
                    no[i] = "1";
                }
                else no[i]="s";
            }
        }
        int q1 = 0,q2=0;
        String[] z1 = new String[1111],z2=new String[1111];
        for (int i=0;i<length;i++) {
            if (token[i].equals("num")){
                no[i]="num";
                z1[q1]=token[i-2];
                no[i-2]="num";
                q1++;
            }
            if (token[i].equals("list")){
                no[i]="list";
                z2[q2]=token[i-2];
                no[i-2]="list";
                q2++;
            }
        }
        int k=0;
        for (int i=0;i<length;i++){
            for (int j=0;j<length;j++){
                if (z1[j]!=null){
                    if (token[i].equals(z1[j])){
                        no[i]="num";
                        i++;
                    }
                    if (token[i].equals(z2[j])){
                        no[i]="list";
                        i++;
                    }
                }

            }
        }
        for (int i=0;i<length;i++){
            System.out.println(token[i]);
            //    System.out.println(no[i]);
        }

        prog();
        System.out.println("finishd");
    }

    public static int nexttoken = 0;



    public static void prog() {
        func();
        A();
    }
    public static void A() {
        if (token[nexttoken]!=null){
            char w = token[nexttoken].charAt(0);
            if ((w >= 'a' && w <= 'z') || (w >= 'A' && w <= 'Z') || (w == '_')) {
                prog();
            }
        }

    }
    static  String [] tabe=new String[10];
    static int tedad=0;
    static int tedad11=0;
    static int tedad22=0;
    static int tedadmoteqayer=0;
    public static void func() {

        char w = token[nexttoken].charAt(0);
        if ((w >= 'a' && w <= 'z') || (w >= 'A' && w <= 'Z')) {
            tabe[tedad]=token[nexttoken];
            tedad++;
            nexttoken++;
            if (token[nexttoken].equals("(")) {
                tedad11=nexttoken;
                while (!token[tedad11].equals(")")){
                    if (token[tedad11].equals(",")){
                        tedad22++;
                    }
                    tedad11++;
                }
                nexttoken++;
                if (!(token[nexttoken].equals(")")))
                    flist();
                if (token[nexttoken].equals(")")) {
                    nexttoken++;
                    if (token[nexttoken].equals(":")) {
                        nexttoken++;
                        if (token[nexttoken].equals("num") || token[nexttoken].equals("list")) {
                            nexttoken++;
                            if (token[nexttoken].equals("{")) {
                                nexttoken++;
                                body();
                                if (token[nexttoken].equals("}")) {
                                    nexttoken++;
                                } else System.out.println("syntax } ndre");
                            } else System.out.println("syntax { ndre");
                        } else System.out.println("syntax list ya num tarif nshd");
                    } else System.out.println("syntax : ndre");
                } else System.out.println("syntax ) ndre");
            } else System.out.println("syntax ( ndre");
        } else System.out.println("ba identi tabe shoro nshd");


    }
    public static void body() {
        stmt();
        B();
    }
    public static void stmt() {
        if (!((token[nexttoken].equals("if")) || (token[nexttoken].equals("while")) || (token[nexttoken].equals("for")) || (token[nexttoken].equals("return")) || (token[nexttoken].equals("local")))) {
            char w = token[nexttoken].charAt(0);
            if ((w >= 'a' && w <= 'z') || (w >= 'A' && w <= 'Z') || (w == '_') || (w >= '0' && w <= '9') || w == '+' || w == '_' || w == '(' || w == '!') {
                expr();
                if (token[nexttoken].equals(";")) {
                    nexttoken++;
                } else
                    System.out.println("error ;");
            }
        }
        if (token[nexttoken].equals("local")) {
            defvar();
            if (token[nexttoken].equals(";")){
                nexttoken++;
            }
        }
        if (token[nexttoken].equals("while")) {
            nexttoken++;
            if (token[nexttoken].equals("(")) {
                nexttoken++;
                expr();
                if (token[nexttoken].equals(")")) {
                    nexttoken++;
                    stmt();
                } else
                    System.out.println("error )");
            } else
                System.out.println("error ( ");
        }

        if (token[nexttoken].equals("for")) {
            nexttoken++;
            if (token[nexttoken].equals("(")) {
                nexttoken++;
                char w = token[nexttoken].charAt(0);
                if ((w >= 'a' && w <= 'z') || (w >= 'A' && w <= 'Z') || (w == '_')) {
                    nexttoken++;
                    if (token[nexttoken].equals("in")) {
                        nexttoken++;
                        expr();
                        //      nexttoken++;
                        if (token[nexttoken].equals(")")) {
                            nexttoken++;
                            stmt();
                        } else
                            System.out.println("error )");
                    } else
                        System.out.println(" error in");
                } else System.out.println("identi nis");
            } else
                System.out.println("error (");
        }

        if (token[nexttoken].equals("return")) {
            nexttoken++;
            expr();
            //  nexttoken++;
            if (token[nexttoken].equals(";")) {
                nexttoken++;
            } else
                System.out.println("error ;");
        }

        if (token[nexttoken].equals("{")) {
            nexttoken++;
            body();
            if (token[nexttoken].equals("}")) {
                nexttoken++;
            } else
                System.out.println("error }");
        }
        if (token[nexttoken].equals("if")) {
            nexttoken++;
            if (token[nexttoken].equals("(")) {
                nexttoken++;
                expr();
                if (token[nexttoken].equals(")")) {
                    nexttoken++;
                    stmt();
                    if (token[nexttoken].equals("else")){
                        G();
                    }

                } else
                    System.out.println(" error )");
            } else System.out.println("error (");
        }

    }
    public static void B() {
        char w = token[nexttoken].charAt(0);
        if ((w >= 'a' && w <= 'z') || (w >= 'A' && w <= 'Z') || (w == '_') || (w == '{') || w == '!' || (w >= '0' && w <= '9') || w == '+' || w == '_' || w == '(') {
            body();
        }
    }
    public static void G() {
        if (token[nexttoken].equals("else")) {
            nexttoken++;
            stmt();
        } else
            System.out.println(" error else");
    }
    public static void defvar() {
        if (token[nexttoken].equals("local")) {
            nexttoken++;
            flist();
            if (!token[nexttoken].equals(";")){
                System.out.println("eror ;");
            }
        } else
            System.out.println("error local");
    }
    public static void expr() {
        expr1();

        if (token[nexttoken].equals("=")){
            char w = token[nexttoken+1].charAt(0);
            if (token[nexttoken-1].equals("]")&&(no[nexttoken+1].equals(no[nexttoken-4]))){
                nexttoken++;
                expr1();
            }
            else {
                if (token[nexttoken+1].equals("vec")){
                    nexttoken++;
                    expr1();
                }
                else {
                    if (no[nexttoken-1].equals("num")&&(w>='0'&&w<='9')){
                        nexttoken++;
                        expr1();
                    }
                    else {
                        if (no[nexttoken-1].equals(no[nexttoken+1])){
                            nexttoken++;
                            expr1();
                        }
                        else {
                            System.out.println("entesab na dorost");
                            System.out.println(token[nexttoken+1]);
                            nexttoken++;
                            expr1();
                        }
                    }

                }

            }


        }

    }
    public static void expr1(){
        expr2();

        if (token[nexttoken].equals("+")){
            if (no[nexttoken-1].equals(no[nexttoken+1])){
                nexttoken++;
                expr2();
            }
            else {
                System.out.println("noe do ebarat ba ham farq darad");
                nexttoken++;
                expr2();
            }

        }
        if (token[nexttoken].equals("-")){
            if (no[nexttoken-1].equals(no[nexttoken+1])){
                nexttoken++;
                expr2();
            }
            else {
                System.out.println("noe do ebarat ba ham farq darad");
                nexttoken++;
                expr2();
            }
        }
    }
    public static void expr2(){
        expr3();
        while (token[nexttoken].equals("*")){
            if (no[nexttoken-1].equals(no[nexttoken+1])){
                nexttoken++;
                expr3();
            }
            else {
                System.out.println("noe do ebarat ba ham farq darad*");
                nexttoken++;
                expr3();
            }
        }
        while (token[nexttoken].equals("/")){
            if (no[nexttoken-1].equals(no[nexttoken+1])){
                nexttoken++;
                expr3();
            }
            else {
                System.out.println("noe do ebarat ba ham farq darad/");
                nexttoken++;
                expr3();
            }
        }
        while (token[nexttoken].equals("%")){
            if (no[nexttoken-1].equals(no[nexttoken+1])){
                nexttoken++;
                expr3();
            }
            else {
                System.out.println("noe do ebarat ba ham farq darad%");
                nexttoken++;
                expr3();
            }
        }

    }
    public static void expr3(){
        expr4();
        while (token[nexttoken].equals(">")){
            if (no[nexttoken-1].equals(no[nexttoken+1])){
                nexttoken++;
                expr4();
            }
            else {
                System.out.println("type motefavt moqayese shdn >");
                nexttoken++;
                expr4();
            }
        }
        while (token[nexttoken].equals("<")){
            if (no[nexttoken-1].equals(no[nexttoken+1])){
                nexttoken++;
                expr4();
            }
            else {
                System.out.println("type motefavt moqayese shdn <");
                nexttoken++;
                expr4();
            }
        }
        while (token[nexttoken].equals("==")){
            if (no[nexttoken-1].equals(no[nexttoken+1])){
                nexttoken++;
                expr4();
            }
            else {
                System.out.println("type motefavt moqayese shdn ==");
                nexttoken++;
                expr4();
            }
        }
        while (token[nexttoken].equals(">=")){
            if (no[nexttoken-1].equals(no[nexttoken+1])){
                nexttoken++;
                expr4();
            }
            else {
                System.out.println("type motefavt moqayese shdn >=");
                nexttoken++;
                expr4();
            }
        }
        while (token[nexttoken].equals("<=")){
            if (no[nexttoken-1].equals(no[nexttoken+1])){
                nexttoken++;
                expr5();
            }
            else {
                System.out.println("type mooefavet moqayese shdn <=");
                nexttoken++;
                expr5();
            }
        }
    }
    public static void expr4(){
        expr5();
        if (token[nexttoken].equals("||")){
            if (no[nexttoken-1].equals(no[nexttoken+1])){
                nexttoken++;
                expr5();
            }
            else {
                System.out.println("do meqdar motefavet moqayese shdnd");
                nexttoken++;
                expr5();
            }
        }
        if (token[nexttoken].equals("&&")){
            if (no[nexttoken-1].equals(no[nexttoken+1])){
                nexttoken++;
                expr5();
            }
            else {
                System.out.println("do meqdar na monaseb moqayese shdn");
                nexttoken++;
                expr5();
            }
        }
    }
    public static void expr5(){
        expr6();
        while (token[nexttoken].equals("[")){
            nexttoken++;
            expr6();
            while (token[nexttoken].equals("]")){
                nexttoken++;
            }
        }
    }
    public static void expr6(){
        expr7();
    }
    static int uu=0;
    static int uu2=0;
    static int uu3=0;
    public static void expr7(){
        char w = token[nexttoken].charAt(0);
        if ((w >= 'a' && w <= 'z') || (w >= 'A' && w <= 'Z') || (w == '_')) {
            iden();
            if (token[nexttoken].equals("(")){
                if (token[nexttoken+1].equals(tabe[0])){
                    uu=nexttoken+1;
                    uu2=nexttoken+1;
                    if (!(no[uu+2].equals(no[uu+2-nexttoken+1]))){
                        System.out.println("noe paramet haye vorodi tabe na dorost mibashad...");
                        uu2++;
                    }
                    while (!token[uu].equals(")")){
                        if (token[uu].equals(",")){
                            uu3++;
                        }
                        uu++;
                    }
                    if (tedad22!=uu3){
                        System.out.println("tedad parametr haye tabe farq darad...");
                    }
                    if (no[uu -1].equals(no[uu -1 - nexttoken +3])||(! no[uu -1].equals("1")) ){
                        System.out.println("noe paramet haye vorodi tabe na dorost mibashad...");
                    }

                    nexttoken++;
                    clist();

                    if (token[nexttoken].equals(")")){
                        nexttoken++;
                    }

                }
                else {
                    nexttoken++;
                    clist();

                    if (token[nexttoken].equals(")")){
                        nexttoken++;
                    }
                }


            }
        }
        if (w>='0'&& w<='9'){
            num();
        }

        if (token[nexttoken].equals("!")) {
            nexttoken++;
            expr();
        }
        if (token[nexttoken].equals("-")) {
            nexttoken++;
            expr();
        }
        if (token[nexttoken].equals("+")) {
            if (no[nexttoken-1].equals(no[nexttoken+1])){
                nexttoken++;
                expr2();
            }
            else {
                System.out.println("noe do ebarat ba ham farq darad");
                nexttoken++;
                expr2();
            }
        }
        if (token[nexttoken].equals("(")) {
            nexttoken++;
            expr();
            if (token[nexttoken].equals(")")){
                nexttoken++;
            }
            else System.out.println(") ndre");
        }
    }
    public static void iden(){
        char w = token[nexttoken].charAt(0);
        if ((w >= 'a' && w <= 'z') || (w >= 'A' && w <= 'Z') || (w == '_')) {
            nexttoken++;
        }

    }
    public static void num(){
        char w = token[nexttoken].charAt(0);
        if ((w >= '0' && w <= '9')) {
            nexttoken++;
        }
    }
    static String[]notabe=new String[10];
    static int tedad1=0;
    public static void flist() {
        char w = token[nexttoken].charAt(0);
        if ((w >= 'a' && w <= 'z') || (w >= 'A' && w <= 'Z') || (w == '_')) {
            notabe[tedad1]=no[nexttoken];
            tedad1++;
            nexttoken++;
            if (token[nexttoken].equals(":")) {
                nexttoken++;
                if (token[nexttoken].equals("num") || token[nexttoken].equals("list")) {
                    nexttoken++;
                    H();
                } else
                    System.out.println(" type ( num ya list ) moshakhas nis");
            } else
                System.out.println("error :");
        } else
            System.out.println(" ba identifier shoro nshd");
    }
    public static void H() {
        if (token[nexttoken].equals(",")) {
            nexttoken++;
            flist();
        }
    }
    public static void clist() {
        expr();
        K();
    }
    public static void K() {
        if (token[nexttoken].equals(",")) {
            nexttoken++;
            clist();
        }
    }

}