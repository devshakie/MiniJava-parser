// Output created by jacc on Mon Nov 13 08:56:29 EAT 2023


  import java.util.*;
  

class MiniJava implements MiniJavaTokens {
    private int yyss = 100;
    private int yytok;
    private int yysp = 0;
    private int[] yyst;
    protected int yyerrno = (-1);
    private int[] yysv;
    private int yyrv;

    public boolean parse() {
        int yyn = 0;
        yysp = 0;
        yyst = new int[yyss];
        yysv = new int[yyss];
        yytok = (token
                 );
    loop:
        for (;;) {
            switch (yyn) {
                case 0:
                    yyst[yysp] = 0;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 113:
                    switch (yytok) {
                        case CLASS:
                            yyn = 4;
                            continue;
                    }
                    yyn = 229;
                    continue;

                case 1:
                    yyst[yysp] = 1;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 114:
                    switch (yytok) {
                        case ENDINPUT:
                            yyn = 226;
                            continue;
                    }
                    yyn = 229;
                    continue;

                case 2:
                    yyst[yysp] = 2;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 115:
                    switch (yytok) {
                        case CLASS:
                            yyn = 4;
                            continue;
                        case ';':
                            yyn = yyr3();
                            continue;
                    }
                    yyn = 229;
                    continue;

                case 3:
                    yyst[yysp] = 3;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 116:
                    switch (yytok) {
                        case ';':
                            yyn = 6;
                            continue;
                    }
                    yyn = 229;
                    continue;

                case 4:
                    yyst[yysp] = 4;
                    yysv[yysp] = (yylval
                                 );
                    yytok = (yylex()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 117:
                    switch (yytok) {
                        case ID:
                            yyn = 7;
                            continue;
                    }
                    yyn = 229;
                    continue;

                case 5:
                    yyst[yysp] = 5;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 118:
                    switch (yytok) {
                        case ';':
                            yyn = yyr2();
                            continue;
                    }
                    yyn = 229;
                    continue;

                case 6:
                    yyst[yysp] = 6;
                    yysv[yysp] = (yylval
                                 );
                    yytok = (yylex()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 119:
                    switch (yytok) {
                        case ENDINPUT:
                            yyn = yyr1();
                            continue;
                    }
                    yyn = 229;
                    continue;

                case 7:
                    yyst[yysp] = 7;
                    yysv[yysp] = (yylval
                                 );
                    yytok = (yylex()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 120:
                    switch (yytok) {
                        case '{':
                            yyn = 8;
                            continue;
                    }
                    yyn = 229;
                    continue;

                case 8:
                    yyst[yysp] = 8;
                    yysv[yysp] = (yylval
                                 );
                    yytok = (yylex()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 121:
                    yyn = yys8();
                    continue;

                case 9:
                    yyst[yysp] = 9;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 122:
                    switch (yytok) {
                        case '(':
                            yyn = 17;
                            continue;
                        case ';':
                            yyn = 18;
                            continue;
                    }
                    yyn = 229;
                    continue;

                case 10:
                    yyst[yysp] = 10;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 123:
                    yyn = yys10();
                    continue;

                case 11:
                    yyst[yysp] = 11;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 124:
                    yyn = yys11();
                    continue;

                case 12:
                    yyst[yysp] = 12;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 125:
                    switch (yytok) {
                        case '}':
                            yyn = 20;
                            continue;
                    }
                    yyn = 229;
                    continue;

                case 13:
                    yyst[yysp] = 13;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 126:
                    yyn = yys13();
                    continue;

                case 14:
                    yyst[yysp] = 14;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 127:
                    switch (yytok) {
                        case STATIC:
                            yyn = 22;
                            continue;
                        case ID:
                        case VOID:
                        case INT:
                        case BOOLEAN:
                            yyn = yyr17();
                            continue;
                    }
                    yyn = 229;
                    continue;

                case 15:
                    yyst[yysp] = 15;
                    yysv[yysp] = (yylval
                                 );
                    yytok = (yylex()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 128:
                    switch (yytok) {
                        case STATIC:
                        case ID:
                        case VOID:
                        case INT:
                        case BOOLEAN:
                            yyn = yyr19();
                            continue;
                    }
                    yyn = 229;
                    continue;

                case 16:
                    yyst[yysp] = 16;
                    yysv[yysp] = (yylval
                                 );
                    yytok = (yylex()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 129:
                    switch (yytok) {
                        case STATIC:
                        case ID:
                        case VOID:
                        case INT:
                        case BOOLEAN:
                            yyn = yyr18();
                            continue;
                    }
                    yyn = 229;
                    continue;

                case 17:
                    yyst[yysp] = 17;
                    yysv[yysp] = (yylval
                                 );
                    yytok = (yylex()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 130:
                    switch (yytok) {
                        case BOOLEAN:
                            yyn = 28;
                            continue;
                        case ID:
                            yyn = 29;
                            continue;
                        case INT:
                            yyn = 30;
                            continue;
                        case VOID:
                            yyn = 31;
                            continue;
                        case ')':
                            yyn = yyr32();
                            continue;
                    }
                    yyn = 229;
                    continue;

                case 18:
                    yyst[yysp] = 18;
                    yysv[yysp] = (yylval
                                 );
                    yytok = (yylex()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 131:
                    yyn = yys18();
                    continue;

                case 19:
                    yyst[yysp] = 19;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 132:
                    switch (yytok) {
                        case '}':
                            yyn = yyr5();
                            continue;
                    }
                    yyn = 229;
                    continue;

                case 20:
                    yyst[yysp] = 20;
                    yysv[yysp] = (yylval
                                 );
                    yytok = (yylex()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 133:
                    switch (yytok) {
                        case ';':
                        case CLASS:
                            yyn = yyr4();
                            continue;
                    }
                    yyn = 229;
                    continue;

                case 21:
                    yyst[yysp] = 21;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 134:
                    switch (yytok) {
                        case BOOLEAN:
                            yyn = 28;
                            continue;
                        case ID:
                            yyn = 29;
                            continue;
                        case INT:
                            yyn = 30;
                            continue;
                        case VOID:
                            yyn = 31;
                            continue;
                    }
                    yyn = 229;
                    continue;

                case 22:
                    yyst[yysp] = 22;
                    yysv[yysp] = (yylval
                                 );
                    yytok = (yylex()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 135:
                    switch (yytok) {
                        case ID:
                        case VOID:
                        case INT:
                        case BOOLEAN:
                            yyn = yyr16();
                            continue;
                    }
                    yyn = 229;
                    continue;

                case 23:
                    yyst[yysp] = 23;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 136:
                    switch (yytok) {
                        case ID:
                            yyn = 33;
                            continue;
                    }
                    yyn = 229;
                    continue;

                case 24:
                    yyst[yysp] = 24;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 137:
                    switch (yytok) {
                        case '[':
                            yyn = 34;
                            continue;
                    }
                    yyn = 229;
                    continue;

                case 25:
                    yyst[yysp] = 25;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 138:
                    switch (yytok) {
                        case ')':
                            yyn = 35;
                            continue;
                    }
                    yyn = 229;
                    continue;

                case 26:
                    yyst[yysp] = 26;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 139:
                    switch (yytok) {
                        case ID:
                            yyn = 36;
                            continue;
                    }
                    yyn = 229;
                    continue;

                case 27:
                    yyst[yysp] = 27;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 140:
                    switch (yytok) {
                        case ',':
                            yyn = 37;
                            continue;
                        case ')':
                            yyn = yyr31();
                            continue;
                    }
                    yyn = 229;
                    continue;

                case 28:
                    yyst[yysp] = 28;
                    yysv[yysp] = (yylval
                                 );
                    yytok = (yylex()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 141:
                    switch (yytok) {
                        case ID:
                            yyn = yyr25();
                            continue;
                    }
                    yyn = 229;
                    continue;

                case 29:
                    yyst[yysp] = 29;
                    yysv[yysp] = (yylval
                                 );
                    yytok = (yylex()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 142:
                    switch (yytok) {
                        case '[':
                            yyn = yyr29();
                            continue;
                        case ';':
                        case ',':
                        case ')':
                        case '(':
                            yyn = yyr23();
                            continue;
                    }
                    yyn = 229;
                    continue;

                case 30:
                    yyst[yysp] = 30;
                    yysv[yysp] = (yylval
                                 );
                    yytok = (yylex()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 143:
                    switch (yytok) {
                        case '[':
                            yyn = yyr28();
                            continue;
                        case ID:
                            yyn = yyr24();
                            continue;
                    }
                    yyn = 229;
                    continue;

                case 31:
                    yyst[yysp] = 31;
                    yysv[yysp] = (yylval
                                 );
                    yytok = (yylex()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 144:
                    switch (yytok) {
                        case ID:
                            yyn = yyr26();
                            continue;
                    }
                    yyn = 229;
                    continue;

                case 32:
                    yyst[yysp] = 32;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 145:
                    switch (yytok) {
                        case ';':
                        case '(':
                            yyn = yyr15();
                            continue;
                    }
                    yyn = 229;
                    continue;

                case 33:
                    yyst[yysp] = 33;
                    yysv[yysp] = (yylval
                                 );
                    yytok = (yylex()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 146:
                    switch (yytok) {
                        case '=':
                        case ';':
                        case ',':
                        case ')':
                        case '(':
                            yyn = yyr22();
                            continue;
                    }
                    yyn = 229;
                    continue;

                case 34:
                    yyst[yysp] = 34;
                    yysv[yysp] = (yylval
                                 );
                    yytok = (yylex()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 147:
                    switch (yytok) {
                        case ']':
                            yyn = 38;
                            continue;
                    }
                    yyn = 229;
                    continue;

                case 35:
                    yyst[yysp] = 35;
                    yysv[yysp] = (yylval
                                 );
                    yytok = (yylex()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 148:
                    switch (yytok) {
                        case '{':
                            yyn = 39;
                            continue;
                    }
                    yyn = 229;
                    continue;

                case 36:
                    yyst[yysp] = 36;
                    yysv[yysp] = (yylval
                                 );
                    yytok = (yylex()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 149:
                    switch (yytok) {
                        case '=':
                        case ';':
                        case ',':
                        case ')':
                        case '(':
                            yyn = yyr21();
                            continue;
                    }
                    yyn = 229;
                    continue;

                case 37:
                    yyst[yysp] = 37;
                    yysv[yysp] = (yylval
                                 );
                    yytok = (yylex()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 150:
                    switch (yytok) {
                        case BOOLEAN:
                            yyn = 28;
                            continue;
                        case ID:
                            yyn = 29;
                            continue;
                        case INT:
                            yyn = 30;
                            continue;
                        case VOID:
                            yyn = 31;
                            continue;
                        case ')':
                            yyn = yyr32();
                            continue;
                    }
                    yyn = 229;
                    continue;

                case 38:
                    yyst[yysp] = 38;
                    yysv[yysp] = (yylval
                                 );
                    yytok = (yylex()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 151:
                    switch (yytok) {
                        case ID:
                            yyn = yyr27();
                            continue;
                    }
                    yyn = 229;
                    continue;

                case 39:
                    yyst[yysp] = 39;
                    yysv[yysp] = (yylval
                                 );
                    yytok = (yylex()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 152:
                    yyn = yys39();
                    continue;

                case 40:
                    yyst[yysp] = 40;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 153:
                    switch (yytok) {
                        case ')':
                            yyn = yyr30();
                            continue;
                    }
                    yyn = 229;
                    continue;

                case 41:
                    yyst[yysp] = 41;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 154:
                    switch (yytok) {
                        case '}':
                            yyn = 53;
                            continue;
                    }
                    yyn = 229;
                    continue;

                case 42:
                    yyst[yysp] = 42;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 155:
                    switch (yytok) {
                        case '.':
                            yyn = 54;
                            continue;
                    }
                    yyn = 229;
                    continue;

                case 43:
                    yyst[yysp] = 43;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 156:
                    switch (yytok) {
                        case ';':
                            yyn = 55;
                            continue;
                    }
                    yyn = 229;
                    continue;

                case 44:
                    yyst[yysp] = 44;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 157:
                    switch (yytok) {
                        case '=':
                            yyn = 56;
                            continue;
                    }
                    yyn = 229;
                    continue;

                case 45:
                    yyst[yysp] = 45;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 158:
                    switch (yytok) {
                        case '(':
                            yyn = 57;
                            continue;
                        case '[':
                            yyn = 58;
                            continue;
                    }
                    yyn = 229;
                    continue;

                case 46:
                    yyst[yysp] = 46;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 159:
                    yyn = yys46();
                    continue;

                case 47:
                    yyst[yysp] = 47;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 160:
                    switch (yytok) {
                        case RETURN:
                            yyn = 61;
                            continue;
                        case '}':
                            yyn = yyr14();
                            continue;
                    }
                    yyn = 229;
                    continue;

                case 48:
                    yyst[yysp] = 48;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 161:
                    switch (yytok) {
                        case '=':
                            yyn = 62;
                            continue;
                    }
                    yyn = 229;
                    continue;

                case 49:
                    yyst[yysp] = 49;
                    yysv[yysp] = (yylval
                                 );
                    yytok = (yylex()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 162:
                    switch (yytok) {
                        case '[':
                            yyn = yyr29();
                            continue;
                        case '.':
                            yyn = yyr37();
                            continue;
                        case '=':
                            yyn = yyr23();
                            continue;
                    }
                    yyn = 229;
                    continue;

                case 50:
                    yyst[yysp] = 50;
                    yysv[yysp] = (yylval
                                 );
                    yytok = (yylex()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 163:
                    switch (yytok) {
                        case '(':
                            yyn = 63;
                            continue;
                    }
                    yyn = 229;
                    continue;

                case 51:
                    yyst[yysp] = 51;
                    yysv[yysp] = (yylval
                                 );
                    yytok = (yylex()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 164:
                    switch (yytok) {
                        case '.':
                            yyn = yyr36();
                            continue;
                    }
                    yyn = 229;
                    continue;

                case 52:
                    yyst[yysp] = 52;
                    yysv[yysp] = (yylval
                                 );
                    yytok = (yylex()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 165:
                    switch (yytok) {
                        case '(':
                            yyn = 64;
                            continue;
                    }
                    yyn = 229;
                    continue;

                case 53:
                    yyst[yysp] = 53;
                    yysv[yysp] = (yylval
                                 );
                    yytok = (yylex()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 166:
                    yyn = yys53();
                    continue;

                case 54:
                    yyst[yysp] = 54;
                    yysv[yysp] = (yylval
                                 );
                    yytok = (yylex()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 167:
                    switch (yytok) {
                        case ID:
                            yyn = 66;
                            continue;
                    }
                    yyn = 229;
                    continue;

                case 55:
                    yyst[yysp] = 55;
                    yysv[yysp] = (yylval
                                 );
                    yytok = (yylex()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 168:
                    yyn = yys55();
                    continue;

                case 56:
                    yyst[yysp] = 56;
                    yysv[yysp] = (yylval
                                 );
                    yytok = (yylex()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 169:
                    yyn = yys56();
                    continue;

                case 57:
                    yyst[yysp] = 57;
                    yysv[yysp] = (yylval
                                 );
                    yytok = (yylex()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 170:
                    yyn = yys57();
                    continue;

                case 58:
                    yyst[yysp] = 58;
                    yysv[yysp] = (yylval
                                 );
                    yytok = (yylex()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 171:
                    yyn = yys58();
                    continue;

                case 59:
                    yyst[yysp] = 59;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 172:
                    switch (yytok) {
                        case '}':
                        case RETURN:
                            yyn = yyr40();
                            continue;
                    }
                    yyn = 229;
                    continue;

                case 60:
                    yyst[yysp] = 60;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 173:
                    switch (yytok) {
                        case '}':
                            yyn = yyr11();
                            continue;
                    }
                    yyn = 229;
                    continue;

                case 61:
                    yyst[yysp] = 61;
                    yysv[yysp] = (yylval
                                 );
                    yytok = (yylex()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 174:
                    yyn = yys61();
                    continue;

                case 62:
                    yyst[yysp] = 62;
                    yysv[yysp] = (yylval
                                 );
                    yytok = (yylex()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 175:
                    yyn = yys62();
                    continue;

                case 63:
                    yyst[yysp] = 63;
                    yysv[yysp] = (yylval
                                 );
                    yytok = (yylex()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 176:
                    yyn = yys63();
                    continue;

                case 64:
                    yyst[yysp] = 64;
                    yysv[yysp] = (yylval
                                 );
                    yytok = (yylex()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 177:
                    yyn = yys64();
                    continue;

                case 65:
                    yyst[yysp] = 65;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 178:
                    switch (yytok) {
                        case '[':
                        case '(':
                            yyn = yyr35();
                            continue;
                    }
                    yyn = 229;
                    continue;

                case 66:
                    yyst[yysp] = 66;
                    yysv[yysp] = (yylval
                                 );
                    yytok = (yylex()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 179:
                    switch (yytok) {
                        case '.':
                            yyn = 83;
                            continue;
                        case '[':
                        case '(':
                            yyn = yyr39();
                            continue;
                    }
                    yyn = 229;
                    continue;

                case 67:
                    yyst[yysp] = 67;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 180:
                    switch (yytok) {
                        case ';':
                            yyn = 84;
                            continue;
                    }
                    yyn = 229;
                    continue;

                case 68:
                    yyst[yysp] = 68;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 181:
                    switch (yytok) {
                        case ']':
                        case ';':
                        case ',':
                        case ')':
                            yyn = yyr50();
                            continue;
                    }
                    yyn = 229;
                    continue;

                case 69:
                    yyst[yysp] = 69;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 182:
                    switch (yytok) {
                        case ']':
                        case ';':
                        case ',':
                        case ')':
                            yyn = yyr49();
                            continue;
                    }
                    yyn = 229;
                    continue;

                case 70:
                    yyst[yysp] = 70;
                    yysv[yysp] = (yylval
                                 );
                    yytok = (yylex()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 183:
                    switch (yytok) {
                        case ']':
                        case ';':
                        case ',':
                        case ')':
                            yyn = yyr55();
                            continue;
                    }
                    yyn = 229;
                    continue;

                case 71:
                    yyst[yysp] = 71;
                    yysv[yysp] = (yylval
                                 );
                    yytok = (yylex()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 184:
                    switch (yytok) {
                        case ']':
                        case ';':
                        case ',':
                        case ')':
                            yyn = yyr56();
                            continue;
                        case '.':
                            yyn = yyr37();
                            continue;
                    }
                    yyn = 229;
                    continue;

                case 72:
                    yyst[yysp] = 72;
                    yysv[yysp] = (yylval
                                 );
                    yytok = (yylex()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 185:
                    switch (yytok) {
                        case ID:
                            yyn = 86;
                            continue;
                        case INT:
                            yyn = 87;
                            continue;
                    }
                    yyn = 229;
                    continue;

                case 73:
                    yyst[yysp] = 73;
                    yysv[yysp] = (yylval
                                 );
                    yytok = (yylex()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 186:
                    switch (yytok) {
                        case BINOP:
                            yyn = 88;
                            continue;
                        case ']':
                        case ';':
                        case ',':
                        case ')':
                            yyn = yyr53();
                            continue;
                    }
                    yyn = 229;
                    continue;

                case 74:
                    yyst[yysp] = 74;
                    yysv[yysp] = (yylval
                                 );
                    yytok = (yylex()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 187:
                    switch (yytok) {
                        case ']':
                        case ';':
                        case ',':
                        case ')':
                            yyn = yyr54();
                            continue;
                    }
                    yyn = 229;
                    continue;

                case 75:
                    yyst[yysp] = 75;
                    yysv[yysp] = (yylval
                                 );
                    yytok = (yylex()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 188:
                    switch (yytok) {
                        case NUM:
                            yyn = 89;
                            continue;
                    }
                    yyn = 229;
                    continue;

                case 76:
                    yyst[yysp] = 76;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 189:
                    switch (yytok) {
                        case ')':
                            yyn = 90;
                            continue;
                    }
                    yyn = 229;
                    continue;

                case 77:
                    yyst[yysp] = 77;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 190:
                    switch (yytok) {
                        case ',':
                            yyn = 91;
                            continue;
                        case ')':
                            yyn = yyr34();
                            continue;
                    }
                    yyn = 229;
                    continue;

                case 78:
                    yyst[yysp] = 78;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 191:
                    switch (yytok) {
                        case ']':
                            yyn = 92;
                            continue;
                    }
                    yyn = 229;
                    continue;

                case 79:
                    yyst[yysp] = 79;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 192:
                    switch (yytok) {
                        case ';':
                            yyn = 93;
                            continue;
                    }
                    yyn = 229;
                    continue;

                case 80:
                    yyst[yysp] = 80;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 193:
                    switch (yytok) {
                        case ';':
                            yyn = 94;
                            continue;
                    }
                    yyn = 229;
                    continue;

                case 81:
                    yyst[yysp] = 81;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 194:
                    switch (yytok) {
                        case ')':
                            yyn = 95;
                            continue;
                    }
                    yyn = 229;
                    continue;

                case 82:
                    yyst[yysp] = 82;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 195:
                    switch (yytok) {
                        case ')':
                            yyn = 96;
                            continue;
                    }
                    yyn = 229;
                    continue;

                case 83:
                    yyst[yysp] = 83;
                    yysv[yysp] = (yylval
                                 );
                    yytok = (yylex()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 196:
                    switch (yytok) {
                        case ID:
                            yyn = 66;
                            continue;
                    }
                    yyn = 229;
                    continue;

                case 84:
                    yyst[yysp] = 84;
                    yysv[yysp] = (yylval
                                 );
                    yytok = (yylex()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 197:
                    yyn = yys84();
                    continue;

                case 85:
                    yyst[yysp] = 85;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 198:
                    switch (yytok) {
                        case ';':
                            yyn = 98;
                            continue;
                    }
                    yyn = 229;
                    continue;

                case 86:
                    yyst[yysp] = 86;
                    yysv[yysp] = (yylval
                                 );
                    yytok = (yylex()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 199:
                    switch (yytok) {
                        case '(':
                            yyn = 99;
                            continue;
                        case '[':
                            yyn = 100;
                            continue;
                    }
                    yyn = 229;
                    continue;

                case 87:
                    yyst[yysp] = 87;
                    yysv[yysp] = (yylval
                                 );
                    yytok = (yylex()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 200:
                    switch (yytok) {
                        case '[':
                            yyn = 101;
                            continue;
                    }
                    yyn = 229;
                    continue;

                case 88:
                    yyst[yysp] = 88;
                    yysv[yysp] = (yylval
                                 );
                    yytok = (yylex()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 201:
                    switch (yytok) {
                        case NUM:
                            yyn = 102;
                            continue;
                    }
                    yyn = 229;
                    continue;

                case 89:
                    yyst[yysp] = 89;
                    yysv[yysp] = (yylval
                                 );
                    yytok = (yylex()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 202:
                    switch (yytok) {
                        case ']':
                        case ';':
                        case ',':
                        case ')':
                            yyn = yyr51();
                            continue;
                    }
                    yyn = 229;
                    continue;

                case 90:
                    yyst[yysp] = 90;
                    yysv[yysp] = (yylval
                                 );
                    yytok = (yylex()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 203:
                    switch (yytok) {
                        case ']':
                        case ';':
                        case ',':
                        case ')':
                            yyn = yyr48();
                            continue;
                    }
                    yyn = 229;
                    continue;

                case 91:
                    yyst[yysp] = 91;
                    yysv[yysp] = (yylval
                                 );
                    yytok = (yylex()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 204:
                    yyn = yys91();
                    continue;

                case 92:
                    yyst[yysp] = 92;
                    yysv[yysp] = (yylval
                                 );
                    yytok = (yylex()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 205:
                    switch (yytok) {
                        case ']':
                        case '=':
                        case ';':
                        case ',':
                        case ')':
                            yyn = yyr47();
                            continue;
                    }
                    yyn = 229;
                    continue;

                case 93:
                    yyst[yysp] = 93;
                    yysv[yysp] = (yylval
                                 );
                    yytok = (yylex()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 206:
                    switch (yytok) {
                        case '}':
                            yyn = yyr13();
                            continue;
                    }
                    yyn = 229;
                    continue;

                case 94:
                    yyst[yysp] = 94;
                    yysv[yysp] = (yylval
                                 );
                    yytok = (yylex()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 207:
                    yyn = yys94();
                    continue;

                case 95:
                    yyst[yysp] = 95;
                    yysv[yysp] = (yylval
                                 );
                    yytok = (yylex()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 208:
                    yyn = yys95();
                    continue;

                case 96:
                    yyst[yysp] = 96;
                    yysv[yysp] = (yylval
                                 );
                    yytok = (yylex()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 209:
                    yyn = yys96();
                    continue;

                case 97:
                    yyst[yysp] = 97;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 210:
                    switch (yytok) {
                        case '[':
                        case '(':
                            yyn = yyr38();
                            continue;
                    }
                    yyn = 229;
                    continue;

                case 98:
                    yyst[yysp] = 98;
                    yysv[yysp] = (yylval
                                 );
                    yytok = (yylex()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 211:
                    switch (yytok) {
                        case ']':
                        case ';':
                        case ',':
                        case ')':
                            yyn = yyr57();
                            continue;
                    }
                    yyn = 229;
                    continue;

                case 99:
                    yyst[yysp] = 99;
                    yysv[yysp] = (yylval
                                 );
                    yytok = (yylex()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 212:
                    switch (yytok) {
                        case ')':
                            yyn = 106;
                            continue;
                    }
                    yyn = 229;
                    continue;

                case 100:
                    yyst[yysp] = 100;
                    yysv[yysp] = (yylval
                                 );
                    yytok = (yylex()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 213:
                    yyn = yys100();
                    continue;

                case 101:
                    yyst[yysp] = 101;
                    yysv[yysp] = (yylval
                                 );
                    yytok = (yylex()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 214:
                    yyn = yys101();
                    continue;

                case 102:
                    yyst[yysp] = 102;
                    yysv[yysp] = (yylval
                                 );
                    yytok = (yylex()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 215:
                    switch (yytok) {
                        case ']':
                        case ';':
                        case ',':
                        case ')':
                            yyn = yyr52();
                            continue;
                    }
                    yyn = 229;
                    continue;

                case 103:
                    yyst[yysp] = 103;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 216:
                    switch (yytok) {
                        case ')':
                            yyn = yyr33();
                            continue;
                    }
                    yyn = 229;
                    continue;

                case 104:
                    yyst[yysp] = 104;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 217:
                    switch (yytok) {
                        case ELSE:
                            yyn = 109;
                            continue;
                    }
                    yyn = 229;
                    continue;

                case 105:
                    yyst[yysp] = 105;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 218:
                    yyn = yys105();
                    continue;

                case 106:
                    yyst[yysp] = 106;
                    yysv[yysp] = (yylval
                                 );
                    yytok = (yylex()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 219:
                    switch (yytok) {
                        case ';':
                            yyn = yyr61();
                            continue;
                    }
                    yyn = 229;
                    continue;

                case 107:
                    yyst[yysp] = 107;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 220:
                    switch (yytok) {
                        case ']':
                            yyn = 110;
                            continue;
                    }
                    yyn = 229;
                    continue;

                case 108:
                    yyst[yysp] = 108;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 221:
                    switch (yytok) {
                        case ']':
                            yyn = 111;
                            continue;
                    }
                    yyn = 229;
                    continue;

                case 109:
                    yyst[yysp] = 109;
                    yysv[yysp] = (yylval
                                 );
                    yytok = (yylex()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 222:
                    yyn = yys109();
                    continue;

                case 110:
                    yyst[yysp] = 110;
                    yysv[yysp] = (yylval
                                 );
                    yytok = (yylex()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 223:
                    switch (yytok) {
                        case ';':
                            yyn = yyr59();
                            continue;
                    }
                    yyn = 229;
                    continue;

                case 111:
                    yyst[yysp] = 111;
                    yysv[yysp] = (yylval
                                 );
                    yytok = (yylex()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 224:
                    switch (yytok) {
                        case ';':
                            yyn = yyr60();
                            continue;
                    }
                    yyn = 229;
                    continue;

                case 112:
                    yyst[yysp] = 112;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 225:
                    yyn = yys112();
                    continue;

                case 226:
                    return true;
                case 227:
                    yyerror("stack overflow");
                case 228:
                    return false;
                case 229:
                    yyerror("syntax error");
                    return false;
            }
        }
    }

    protected void yyexpand() {
        int[] newyyst = new int[2*yyst.length];
        int[] newyysv = new int[2*yyst.length];
        for (int i=0; i<yyst.length; i++) {
            newyyst[i] = yyst[i];
            newyysv[i] = yysv[i];
        }
        yyst = newyyst;
        yysv = newyysv;
    }

    private int yys8() {
        switch (yytok) {
            case PRIVATE:
                return 15;
            case PUBLIC:
                return 16;
            case '}':
                return yyr6();
            case STATIC:
            case ID:
            case VOID:
            case INT:
            case BOOLEAN:
                return yyr20();
        }
        return 229;
    }

    private int yys10() {
        switch (yytok) {
            case '}':
            case STATIC:
            case PUBLIC:
            case ID:
            case PRIVATE:
            case VOID:
            case INT:
            case BOOLEAN:
                return yyr7();
        }
        return 229;
    }

    private int yys11() {
        switch (yytok) {
            case PRIVATE:
                return 15;
            case PUBLIC:
                return 16;
            case '}':
                return yyr6();
            case STATIC:
            case ID:
            case VOID:
            case INT:
            case BOOLEAN:
                return yyr20();
        }
        return 229;
    }

    private int yys13() {
        switch (yytok) {
            case '}':
            case STATIC:
            case PUBLIC:
            case ID:
            case PRIVATE:
            case VOID:
            case INT:
            case BOOLEAN:
                return yyr8();
        }
        return 229;
    }

    private int yys18() {
        switch (yytok) {
            case '}':
            case STATIC:
            case PUBLIC:
            case ID:
            case PRIVATE:
            case VOID:
            case INT:
            case BOOLEAN:
                return yyr9();
        }
        return 229;
    }

    private int yys39() {
        switch (yytok) {
            case BOOLEAN:
                return 28;
            case INT:
                return 30;
            case VOID:
                return 31;
            case ID:
                return 49;
            case IF:
                return 50;
            case THIS:
                return 51;
            case WHILE:
                return 52;
            case '}':
                return yyr12();
        }
        return 229;
    }

    private int yys46() {
        switch (yytok) {
            case BOOLEAN:
                return 28;
            case INT:
                return 30;
            case VOID:
                return 31;
            case ID:
                return 49;
            case IF:
                return 50;
            case THIS:
                return 51;
            case WHILE:
                return 52;
            case '}':
            case RETURN:
                return yyr41();
        }
        return 229;
    }

    private int yys53() {
        switch (yytok) {
            case '}':
            case STATIC:
            case PUBLIC:
            case ID:
            case PRIVATE:
            case VOID:
            case INT:
            case BOOLEAN:
                return yyr10();
        }
        return 229;
    }

    private int yys55() {
        switch (yytok) {
            case THIS:
            case IF:
            case RETURN:
            case ID:
            case WHILE:
            case VOID:
            case INT:
            case '}':
            case ELSE:
            case BOOLEAN:
                return yyr44();
        }
        return 229;
    }

    private int yys56() {
        switch (yytok) {
            case THIS:
                return 51;
            case FALSE:
                return 70;
            case ID:
                return 71;
            case NEW:
                return 72;
            case NUM:
                return 73;
            case TRUE:
                return 74;
            case UNOP:
                return 75;
            case ';':
                return yyr58();
        }
        return 229;
    }

    private int yys57() {
        switch (yytok) {
            case THIS:
                return 51;
            case FALSE:
                return 70;
            case ID:
                return 71;
            case NEW:
                return 72;
            case NUM:
                return 73;
            case TRUE:
                return 74;
            case UNOP:
                return 75;
            case ',':
            case ')':
                return yyr58();
        }
        return 229;
    }

    private int yys58() {
        switch (yytok) {
            case THIS:
                return 51;
            case FALSE:
                return 70;
            case ID:
                return 71;
            case NEW:
                return 72;
            case NUM:
                return 73;
            case TRUE:
                return 74;
            case UNOP:
                return 75;
            case ']':
                return yyr58();
        }
        return 229;
    }

    private int yys61() {
        switch (yytok) {
            case THIS:
                return 51;
            case FALSE:
                return 70;
            case ID:
                return 71;
            case NEW:
                return 72;
            case NUM:
                return 73;
            case TRUE:
                return 74;
            case UNOP:
                return 75;
            case ';':
                return yyr58();
        }
        return 229;
    }

    private int yys62() {
        switch (yytok) {
            case THIS:
                return 51;
            case FALSE:
                return 70;
            case ID:
                return 71;
            case NEW:
                return 72;
            case NUM:
                return 73;
            case TRUE:
                return 74;
            case UNOP:
                return 75;
            case ';':
                return yyr58();
        }
        return 229;
    }

    private int yys63() {
        switch (yytok) {
            case THIS:
                return 51;
            case FALSE:
                return 70;
            case ID:
                return 71;
            case NEW:
                return 72;
            case NUM:
                return 73;
            case TRUE:
                return 74;
            case UNOP:
                return 75;
            case ')':
                return yyr58();
        }
        return 229;
    }

    private int yys64() {
        switch (yytok) {
            case THIS:
                return 51;
            case FALSE:
                return 70;
            case ID:
                return 71;
            case NEW:
                return 72;
            case NUM:
                return 73;
            case TRUE:
                return 74;
            case UNOP:
                return 75;
            case ')':
                return yyr58();
        }
        return 229;
    }

    private int yys84() {
        switch (yytok) {
            case THIS:
            case IF:
            case RETURN:
            case ID:
            case WHILE:
            case VOID:
            case INT:
            case '}':
            case ELSE:
            case BOOLEAN:
                return yyr43();
        }
        return 229;
    }

    private int yys91() {
        switch (yytok) {
            case THIS:
                return 51;
            case FALSE:
                return 70;
            case ID:
                return 71;
            case NEW:
                return 72;
            case NUM:
                return 73;
            case TRUE:
                return 74;
            case UNOP:
                return 75;
            case ',':
            case ')':
                return yyr58();
        }
        return 229;
    }

    private int yys94() {
        switch (yytok) {
            case THIS:
            case IF:
            case RETURN:
            case ID:
            case WHILE:
            case VOID:
            case INT:
            case '}':
            case ELSE:
            case BOOLEAN:
                return yyr42();
        }
        return 229;
    }

    private int yys95() {
        switch (yytok) {
            case BOOLEAN:
                return 28;
            case INT:
                return 30;
            case VOID:
                return 31;
            case ID:
                return 49;
            case IF:
                return 50;
            case THIS:
                return 51;
            case WHILE:
                return 52;
        }
        return 229;
    }

    private int yys96() {
        switch (yytok) {
            case BOOLEAN:
                return 28;
            case INT:
                return 30;
            case VOID:
                return 31;
            case ID:
                return 49;
            case IF:
                return 50;
            case THIS:
                return 51;
            case WHILE:
                return 52;
        }
        return 229;
    }

    private int yys100() {
        switch (yytok) {
            case THIS:
                return 51;
            case FALSE:
                return 70;
            case ID:
                return 71;
            case NEW:
                return 72;
            case NUM:
                return 73;
            case TRUE:
                return 74;
            case UNOP:
                return 75;
            case ']':
                return yyr58();
        }
        return 229;
    }

    private int yys101() {
        switch (yytok) {
            case THIS:
                return 51;
            case FALSE:
                return 70;
            case ID:
                return 71;
            case NEW:
                return 72;
            case NUM:
                return 73;
            case TRUE:
                return 74;
            case UNOP:
                return 75;
            case ']':
                return yyr58();
        }
        return 229;
    }

    private int yys105() {
        switch (yytok) {
            case THIS:
            case IF:
            case RETURN:
            case ID:
            case WHILE:
            case VOID:
            case INT:
            case '}':
            case ELSE:
            case BOOLEAN:
                return yyr46();
        }
        return 229;
    }

    private int yys109() {
        switch (yytok) {
            case BOOLEAN:
                return 28;
            case INT:
                return 30;
            case VOID:
                return 31;
            case ID:
                return 49;
            case IF:
                return 50;
            case THIS:
                return 51;
            case WHILE:
                return 52;
        }
        return 229;
    }

    private int yys112() {
        switch (yytok) {
            case THIS:
            case IF:
            case RETURN:
            case ID:
            case WHILE:
            case VOID:
            case INT:
            case '}':
            case ELSE:
            case BOOLEAN:
                return yyr45();
        }
        return 229;
    }

    private int yyr1() { // Program : ClassDeclarations ';'
        { System.out.println("great"); }
        yysv[yysp-=2] = yyrv;
        return 1;
    }

    private int yyr33() { // ArgumentList : Expression ',' ArgumentList
        yysp -= 3;
        return yypArgumentList();
    }

    private int yyr34() { // ArgumentList : Expression
        yysp -= 1;
        return yypArgumentList();
    }

    private int yypArgumentList() {
        switch (yyst[yysp-1]) {
            case 57: return 76;
            default: return 103;
        }
    }

    private int yyr27() { // ArrType : Atype '[' ']'
        yysp -= 3;
        return 23;
    }

    private int yyr28() { // Atype : INT
        yysp -= 1;
        return 24;
    }

    private int yyr29() { // Atype : ID
        yysp -= 1;
        return 24;
    }

    private int yyr4() { // ClassDeclaration : CLASS ID '{' InClassDeclarations '}'
        { System.out.println("great"); }
        yysv[yysp-=5] = yyrv;
        return 2;
    }

    private int yyr2() { // ClassDeclarations : ClassDeclaration ClassDeclarations
        yysp -= 2;
        return yypClassDeclarations();
    }

    private int yyr3() { // ClassDeclarations : ClassDeclaration
        yysp -= 1;
        return yypClassDeclarations();
    }

    private int yypClassDeclarations() {
        switch (yyst[yysp-1]) {
            case 0: return 3;
            default: return 5;
        }
    }

    private int yyr15() { // Declarations : Access Static TypeDec
        yysp -= 3;
        return 9;
    }

    private int yyr49() { // Expression : RefExpr
        yysp -= 1;
        return yypExpression();
    }

    private int yyr50() { // Expression : RefArgs
        yysp -= 1;
        return yypExpression();
    }

    private int yyr51() { // Expression : UNOP NUM
        yysp -= 2;
        return yypExpression();
    }

    private int yyr52() { // Expression : NUM BINOP NUM
        yysp -= 3;
        return yypExpression();
    }

    private int yyr53() { // Expression : NUM
        yysp -= 1;
        return yypExpression();
    }

    private int yyr54() { // Expression : TRUE
        yysp -= 1;
        return yypExpression();
    }

    private int yyr55() { // Expression : FALSE
        yysp -= 1;
        return yypExpression();
    }

    private int yyr56() { // Expression : ID
        yysp -= 1;
        return yypExpression();
    }

    private int yyr57() { // Expression : NEW NewStatements ';'
        yysp -= 3;
        return yypExpression();
    }

    private int yyr58() { // Expression : /* empty */
        return yypExpression();
    }

    private int yypExpression() {
        switch (yyst[yysp-1]) {
            case 101: return 108;
            case 100: return 107;
            case 64: return 82;
            case 63: return 81;
            case 62: return 80;
            case 61: return 79;
            case 58: return 78;
            case 56: return 67;
            default: return 77;
        }
    }

    private int yyr9() { // FieldDeclaration : Declarations ';'
        yysp -= 2;
        return 10;
    }

    private int yyr38() { // IdList : ID '.' IdList
        yysp -= 3;
        return yypIdList();
    }

    private int yyr39() { // IdList : ID
        yysp -= 1;
        return yypIdList();
    }

    private int yypIdList() {
        switch (yyst[yysp-1]) {
            case 54: return 65;
            default: return 97;
        }
    }

    private int yyr7() { // InClassDeclaration : FieldDeclaration
        yysp -= 1;
        return 11;
    }

    private int yyr8() { // InClassDeclaration : MethodDeclaration
        yysp -= 1;
        return 11;
    }

    private int yyr5() { // InClassDeclarations : InClassDeclaration InClassDeclarations
        yysp -= 2;
        return yypInClassDeclarations();
    }

    private int yyr6() { // InClassDeclarations : /* empty */
        return yypInClassDeclarations();
    }

    private int yypInClassDeclarations() {
        switch (yyst[yysp-1]) {
            case 8: return 12;
            default: return 19;
        }
    }

    private int yyr11() { // InnerMethodState : Statements Return
        yysp -= 2;
        return 41;
    }

    private int yyr12() { // InnerMethodState : /* empty */
        return 41;
    }

    private int yyr36() { // MainRef : THIS
        yysp -= 1;
        return 42;
    }

    private int yyr37() { // MainRef : ID
        yysp -= 1;
        return 42;
    }

    private int yyr10() { // MethodDeclaration : Declarations '(' ParameterList ')' '{' InnerMethodState '}'
        yysp -= 7;
        return 13;
    }

    private int yyr59() { // NewStatements : ID '[' Expression ']'
        yysp -= 4;
        return 85;
    }

    private int yyr60() { // NewStatements : INT '[' Expression ']'
        yysp -= 4;
        return 85;
    }

    private int yyr61() { // NewStatements : ID '(' ')'
        yysp -= 3;
        return 85;
    }

    private int yyr30() { // ParameterList : TypeDec ',' ParameterList
        yysp -= 3;
        return yypParameterList();
    }

    private int yyr31() { // ParameterList : TypeDec
        yysp -= 1;
        return yypParameterList();
    }

    private int yyr32() { // ParameterList : /* empty */
        return yypParameterList();
    }

    private int yypParameterList() {
        switch (yyst[yysp-1]) {
            case 17: return 25;
            default: return 40;
        }
    }

    private int yyr24() { // PrimType : INT
        yysp -= 1;
        return 26;
    }

    private int yyr25() { // PrimType : BOOLEAN
        yysp -= 1;
        return 26;
    }

    private int yyr26() { // PrimType : VOID
        yysp -= 1;
        return 26;
    }

    private int yyr18() { // Access : PUBLIC
        yysp -= 1;
        return 14;
    }

    private int yyr19() { // Access : PRIVATE
        yysp -= 1;
        return 14;
    }

    private int yyr20() { // Access : /* empty */
        return 14;
    }

    private int yyr48() { // RefArgs : Reference '(' ArgumentList ')'
        yysp -= 4;
        switch (yyst[yysp-1]) {
            case 109: return 43;
            case 96: return 43;
            case 95: return 43;
            case 46: return 43;
            case 39: return 43;
            default: return 68;
        }
    }

    private int yyr47() { // RefExpr : Reference '[' Expression ']'
        yysp -= 4;
        switch (yyst[yysp-1]) {
            case 109: return 44;
            case 96: return 44;
            case 95: return 44;
            case 46: return 44;
            case 39: return 44;
            default: return 69;
        }
    }

    private int yyr35() { // Reference : MainRef '.' IdList
        yysp -= 3;
        return 45;
    }

    private int yyr13() { // Return : RETURN Expression ';'
        yysp -= 3;
        return 60;
    }

    private int yyr14() { // Return : /* empty */
        return 60;
    }

    private int yyr42() { // Statement : TypeDec '=' Expression ';'
        yysp -= 4;
        return yypStatement();
    }

    private int yyr43() { // Statement : RefExpr '=' Expression ';'
        yysp -= 4;
        return yypStatement();
    }

    private int yyr44() { // Statement : RefArgs ';'
        yysp -= 2;
        return yypStatement();
    }

    private int yyr45() { // Statement : IF '(' Expression ')' Statement ELSE Statement
        yysp -= 7;
        return yypStatement();
    }

    private int yyr46() { // Statement : WHILE '(' Expression ')' Statement
        yysp -= 5;
        return yypStatement();
    }

    private int yypStatement() {
        switch (yyst[yysp-1]) {
            case 109: return 112;
            case 96: return 105;
            case 95: return 104;
            default: return 46;
        }
    }

    private int yyr40() { // Statements : Statement Statements
        yysp -= 2;
        return yypStatements();
    }

    private int yyr41() { // Statements : Statement
        yysp -= 1;
        return yypStatements();
    }

    private int yypStatements() {
        switch (yyst[yysp-1]) {
            case 39: return 47;
            default: return 59;
        }
    }

    private int yyr16() { // Static : STATIC
        yysp -= 1;
        return 21;
    }

    private int yyr17() { // Static : /* empty */
        return 21;
    }

    private int yyr21() { // TypeDec : PrimType ID
        yysp -= 2;
        return yypTypeDec();
    }

    private int yyr22() { // TypeDec : ArrType ID
        yysp -= 2;
        return yypTypeDec();
    }

    private int yyr23() { // TypeDec : ID
        yysp -= 1;
        return yypTypeDec();
    }

    private int yypTypeDec() {
        switch (yyst[yysp-1]) {
            case 37: return 27;
            case 21: return 32;
            case 17: return 27;
            default: return 48;
        }
    }

    protected String[] yyerrmsgs = {
    };

 private void yyerror(String msg) {
    System.out.println("ERROR: " + msg);
    System.exit(1);
  }

  private int c;
  private boolean prev=false;

  /** Read a single input character from standard input.
   */
  private void nextChar() {
    if (c>=0) {
      try {
        c = System.in.read();
      } catch (Exception e) {
        c = (-1);
      }
    }
  }
  private int checkIfKeyword(String a) {
      
      String check=a.toLowerCase();
      int tempToken;
      switch (check) {
        case "while" : return tempToken=WHILE;
        case "int" : return tempToken=INT;
        case "boolean" : return tempToken=BOOLEAN;
        case "void" : return tempToken=VOID;
        case "class" :return tempToken=CLASS;
        case "public" :return tempToken=PUBLIC;
        case "private" : return tempToken=PRIVATE;
        case "static" : return tempToken=STATIC;
        case "if" : return tempToken=IF;           
        case "else" : return tempToken=ELSE;           
        case "true" : return tempToken=TRUE;           
        case "false" : return tempToken=FALSE;           
        case "this" : return tempToken=THIS;           
        case "new" : return tempToken=NEW;           
        case "return" : return tempToken=RETURN;           
        default  : return tempToken=ID;
  }}

 int token;
  int yylval;


  /** Read the next token and return the
   *  corresponding integer code.
   */
  int yylex() {
    for (;;) {
      // Skip whitespace
      while (c==' ' || c=='\n' || c=='\t' || c=='\r') {
        nextChar();
      }
      
      if (c<0) {
        return (token=ENDINPUT);
      }
      switch (c) {
        case '+' : nextChar();
                   if(prev){
                    return token=UNOP;
                   }else{
                    prev=false;
                    return token=BINOP; 
                   }
                   
        case '-' : nextChar();
                   if(prev){
                    return token=UNOP;
                   }else{
                    prev=false;
                    return token=BINOP; 
                   }
        case '*' : nextChar();
                   if(prev){
                    return token=UNOP;
                   }else{
                    prev=false;
                    return token=BINOP; 
                   }
        case '/' : nextChar();
                   if(prev){
                    return token=UNOP;
                   }else{
                    prev=false;
                    return token=BINOP; 
                   }
        case '(' : nextChar();
                    prev=false;
                   return token='(';
        case ')' : nextChar();
                   prev=false;
                   return token=')';
        case '{' : nextChar();
                   prev=false;
                   return token='{';
        case '}' : nextChar();
                   prev=false;
                   return token='}';
        case '[' : nextChar();
                   prev=false;
                   return token='[';
        case ']' : nextChar();
                   prev=false;
                   return token=']';
        case '.' : nextChar();
                   prev=false;
                   return token='.';
        case ';' : nextChar();
                   prev=false;
                   return token=';';
        case '=' : nextChar();
                   prev=false;
                   return token='=';
        default  : if (Character.isDigit((char)c)) {
                     int n = 0;
                       do {
                         n = 10*n + (c - '0');
                         nextChar();
                       } while (Character.isDigit((char)c));
                       
                       prev=false;
                       return token=NUM;
                     }else if (Character.isLetter((char)c)){
                         char v;   
                         String n = "";                      
                         prev=false;                          
                       do {
                        v=(char)c;
                         n = n+v;
                         nextChar();
                       } while (Character.isLetter((char)c)||Character.isDigit((char)c));
                         return token=checkIfKeyword(n);

                     } else {
                       yyerror("Illegal character "+c);
                       nextChar();
                     }
      }
    }
  }

  public static void main(String[] args) {
    MiniJava mini = new MiniJava();
    mini.nextChar(); // prime the character input stream
    mini.yylex();    // prime the token input stream
    mini.parse();    // parse the input
  }

}
