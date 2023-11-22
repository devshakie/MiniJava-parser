// Output created by jacc on Mon Nov 13 08:57:35 EAT 2023


class maxJava implements maxJavaTokens {
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
                case 151:
                    switch (yytok) {
                        case CLASS:
                            yyn = 3;
                            continue;
                    }
                    yyn = 305;
                    continue;

                case 1:
                    yyst[yysp] = 1;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 152:
                    switch (yytok) {
                        case ENDINPUT:
                            yyn = 302;
                            continue;
                    }
                    yyn = 305;
                    continue;

                case 2:
                    yyst[yysp] = 2;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 153:
                    switch (yytok) {
                        case '(':
                            yyn = 4;
                            continue;
                    }
                    yyn = 305;
                    continue;

                case 3:
                    yyst[yysp] = 3;
                    yysv[yysp] = (yylval
                                 );
                    yytok = (yylex()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 154:
                    switch (yytok) {
                        case IDENTIFIER:
                            yyn = 6;
                            continue;
                    }
                    yyn = 305;
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
                case 155:
                    switch (yytok) {
                        case CLASS:
                            yyn = 8;
                            continue;
                    }
                    yyn = 305;
                    continue;

                case 5:
                    yyst[yysp] = 5;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 156:
                    switch (yytok) {
                        case '{':
                            yyn = 9;
                            continue;
                    }
                    yyn = 305;
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
                case 157:
                    yyn = yys6();
                    continue;

                case 7:
                    yyst[yysp] = 7;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 158:
                    switch (yytok) {
                        case ')':
                            yyn = 10;
                            continue;
                    }
                    yyn = 305;
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
                case 159:
                    switch (yytok) {
                        case IDENTIFIER:
                            yyn = 6;
                            continue;
                    }
                    yyn = 305;
                    continue;

                case 9:
                    yyst[yysp] = 9;
                    yysv[yysp] = (yylval
                                 );
                    yytok = (yylex()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 160:
                    switch (yytok) {
                        case PUBLIC:
                            yyn = 12;
                            continue;
                    }
                    yyn = 305;
                    continue;

                case 10:
                    yyst[yysp] = 10;
                    yysv[yysp] = (yylval
                                 );
                    yytok = (yylex()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 161:
                    switch (yytok) {
                        case ENDINPUT:
                            yyn = yyr1();
                            continue;
                    }
                    yyn = 305;
                    continue;

                case 11:
                    yyst[yysp] = 11;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 162:
                    switch (yytok) {
                        case '(':
                            yyn = 13;
                            continue;
                    }
                    yyn = 305;
                    continue;

                case 12:
                    yyst[yysp] = 12;
                    yysv[yysp] = (yylval
                                 );
                    yytok = (yylex()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 163:
                    switch (yytok) {
                        case STATIC:
                            yyn = 14;
                            continue;
                    }
                    yyn = 305;
                    continue;

                case 13:
                    yyst[yysp] = 13;
                    yysv[yysp] = (yylval
                                 );
                    yytok = (yylex()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 164:
                    switch (yytok) {
                        case EXTENDS:
                            yyn = 15;
                            continue;
                    }
                    yyn = 305;
                    continue;

                case 14:
                    yyst[yysp] = 14;
                    yysv[yysp] = (yylval
                                 );
                    yytok = (yylex()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 165:
                    switch (yytok) {
                        case VOID:
                            yyn = 16;
                            continue;
                    }
                    yyn = 305;
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
                case 166:
                    switch (yytok) {
                        case IDENTIFIER:
                            yyn = 6;
                            continue;
                    }
                    yyn = 305;
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
                case 167:
                    switch (yytok) {
                        case MAIN:
                            yyn = 18;
                            continue;
                    }
                    yyn = 305;
                    continue;

                case 17:
                    yyst[yysp] = 17;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 168:
                    switch (yytok) {
                        case ')':
                            yyn = 19;
                            continue;
                    }
                    yyn = 305;
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
                case 169:
                    switch (yytok) {
                        case '(':
                            yyn = 20;
                            continue;
                    }
                    yyn = 305;
                    continue;

                case 19:
                    yyst[yysp] = 19;
                    yysv[yysp] = (yylval
                                 );
                    yytok = (yylex()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 170:
                    switch (yytok) {
                        case '?':
                            yyn = 21;
                            continue;
                    }
                    yyn = 305;
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
                case 171:
                    switch (yytok) {
                        case STRING:
                            yyn = 22;
                            continue;
                    }
                    yyn = 305;
                    continue;

                case 21:
                    yyst[yysp] = 21;
                    yysv[yysp] = (yylval
                                 );
                    yytok = (yylex()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 172:
                    switch (yytok) {
                        case '{':
                            yyn = 23;
                            continue;
                    }
                    yyn = 305;
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
                case 173:
                    switch (yytok) {
                        case '[':
                            yyn = 24;
                            continue;
                    }
                    yyn = 305;
                    continue;

                case 23:
                    yyst[yysp] = 23;
                    yysv[yysp] = (yylval
                                 );
                    yytok = (yylex()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 174:
                    switch (yytok) {
                        case '(':
                            yyn = 25;
                            continue;
                    }
                    yyn = 305;
                    continue;

                case 24:
                    yyst[yysp] = 24;
                    yysv[yysp] = (yylval
                                 );
                    yytok = (yylex()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 175:
                    switch (yytok) {
                        case ']':
                            yyn = 26;
                            continue;
                    }
                    yyn = 305;
                    continue;

                case 25:
                    yyst[yysp] = 25;
                    yysv[yysp] = (yylval
                                 );
                    yytok = (yylex()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 176:
                    switch (yytok) {
                        case IDENTIFIER:
                            yyn = 6;
                            continue;
                        case BOOLEAN:
                            yyn = 30;
                            continue;
                        case INTEGER:
                            yyn = 31;
                            continue;
                    }
                    yyn = 305;
                    continue;

                case 26:
                    yyst[yysp] = 26;
                    yysv[yysp] = (yylval
                                 );
                    yytok = (yylex()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 177:
                    switch (yytok) {
                        case IDENTIFIER:
                            yyn = 6;
                            continue;
                    }
                    yyn = 305;
                    continue;

                case 27:
                    yyst[yysp] = 27;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 178:
                    switch (yytok) {
                        case IDENTIFIER:
                            yyn = yyr9();
                            continue;
                    }
                    yyn = 305;
                    continue;

                case 28:
                    yyst[yysp] = 28;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 179:
                    switch (yytok) {
                        case IDENTIFIER:
                            yyn = 6;
                            continue;
                    }
                    yyn = 305;
                    continue;

                case 29:
                    yyst[yysp] = 29;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 180:
                    switch (yytok) {
                        case ')':
                            yyn = 34;
                            continue;
                    }
                    yyn = 305;
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
                case 181:
                    switch (yytok) {
                        case IDENTIFIER:
                            yyn = yyr7();
                            continue;
                    }
                    yyn = 305;
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
                case 182:
                    switch (yytok) {
                        case '[':
                            yyn = 35;
                            continue;
                        case 'i':
                            yyn = 36;
                            continue;
                    }
                    yyn = 305;
                    continue;

                case 32:
                    yyst[yysp] = 32;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 183:
                    switch (yytok) {
                        case ')':
                            yyn = 37;
                            continue;
                    }
                    yyn = 305;
                    continue;

                case 33:
                    yyst[yysp] = 33;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 184:
                    switch (yytok) {
                        case ';':
                            yyn = 38;
                            continue;
                    }
                    yyn = 305;
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
                case 185:
                    switch (yytok) {
                        case '(':
                            yyn = 39;
                            continue;
                    }
                    yyn = 305;
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
                case 186:
                    switch (yytok) {
                        case ']':
                            yyn = 40;
                            continue;
                    }
                    yyn = 305;
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
                case 187:
                    switch (yytok) {
                        case IDENTIFIER:
                            yyn = yyr8();
                            continue;
                    }
                    yyn = 305;
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
                case 188:
                    switch (yytok) {
                        case '{':
                            yyn = 41;
                            continue;
                    }
                    yyn = 305;
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
                case 189:
                    switch (yytok) {
                        case ')':
                            yyn = yyr4();
                            continue;
                    }
                    yyn = 305;
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
                case 190:
                    switch (yytok) {
                        case PUBLIC:
                            yyn = 43;
                            continue;
                    }
                    yyn = 305;
                    continue;

                case 40:
                    yyst[yysp] = 40;
                    yysv[yysp] = (yylval
                                 );
                    yytok = (yylex()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 191:
                    switch (yytok) {
                        case IDENTIFIER:
                            yyn = yyr6();
                            continue;
                    }
                    yyn = 305;
                    continue;

                case 41:
                    yyst[yysp] = 41;
                    yysv[yysp] = (yylval
                                 );
                    yytok = (yylex()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 192:
                    switch (yytok) {
                        case IDENTIFIER:
                            yyn = 6;
                            continue;
                        case IF:
                            yyn = 46;
                            continue;
                        case SYSTEM:
                            yyn = 47;
                            continue;
                        case WHILE:
                            yyn = 48;
                            continue;
                        case '{':
                            yyn = 49;
                            continue;
                    }
                    yyn = 305;
                    continue;

                case 42:
                    yyst[yysp] = 42;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 193:
                    switch (yytok) {
                        case ')':
                            yyn = 50;
                            continue;
                    }
                    yyn = 305;
                    continue;

                case 43:
                    yyst[yysp] = 43;
                    yysv[yysp] = (yylval
                                 );
                    yytok = (yylex()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 194:
                    switch (yytok) {
                        case IDENTIFIER:
                            yyn = 6;
                            continue;
                        case BOOLEAN:
                            yyn = 30;
                            continue;
                        case INTEGER:
                            yyn = 31;
                            continue;
                    }
                    yyn = 305;
                    continue;

                case 44:
                    yyst[yysp] = 44;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 195:
                    switch (yytok) {
                        case '=':
                            yyn = 52;
                            continue;
                        case '[':
                            yyn = 53;
                            continue;
                    }
                    yyn = 305;
                    continue;

                case 45:
                    yyst[yysp] = 45;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 196:
                    switch (yytok) {
                        case '}':
                            yyn = 54;
                            continue;
                    }
                    yyn = 305;
                    continue;

                case 46:
                    yyst[yysp] = 46;
                    yysv[yysp] = (yylval
                                 );
                    yytok = (yylex()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 197:
                    switch (yytok) {
                        case '(':
                            yyn = 55;
                            continue;
                    }
                    yyn = 305;
                    continue;

                case 47:
                    yyst[yysp] = 47;
                    yysv[yysp] = (yylval
                                 );
                    yytok = (yylex()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 198:
                    switch (yytok) {
                        case OUT:
                            yyn = 56;
                            continue;
                    }
                    yyn = 305;
                    continue;

                case 48:
                    yyst[yysp] = 48;
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
                            yyn = 57;
                            continue;
                    }
                    yyn = 305;
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
                case 200:
                    switch (yytok) {
                        case '(':
                            yyn = 58;
                            continue;
                    }
                    yyn = 305;
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
                case 201:
                    switch (yytok) {
                        case '}':
                            yyn = 59;
                            continue;
                    }
                    yyn = 305;
                    continue;

                case 51:
                    yyst[yysp] = 51;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 202:
                    switch (yytok) {
                        case IDENTIFIER:
                            yyn = 6;
                            continue;
                    }
                    yyn = 305;
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
                case 203:
                    yyn = yys52();
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
                case 204:
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
                case 205:
                    switch (yytok) {
                        case '}':
                            yyn = 76;
                            continue;
                    }
                    yyn = 305;
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
                case 206:
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
                case 207:
                    switch (yytok) {
                        case PRINTLN:
                            yyn = 78;
                            continue;
                    }
                    yyn = 305;
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
                case 208:
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
                case 209:
                    switch (yytok) {
                        case IDENTIFIER:
                            yyn = 6;
                            continue;
                        case IF:
                            yyn = 46;
                            continue;
                        case SYSTEM:
                            yyn = 47;
                            continue;
                        case WHILE:
                            yyn = 48;
                            continue;
                        case '{':
                            yyn = 49;
                            continue;
                    }
                    yyn = 305;
                    continue;

                case 59:
                    yyst[yysp] = 59;
                    yysv[yysp] = (yylval
                                 );
                    yytok = (yylex()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 210:
                    switch (yytok) {
                        case ')':
                            yyn = yyr3();
                            continue;
                    }
                    yyn = 305;
                    continue;

                case 60:
                    yyst[yysp] = 60;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 211:
                    switch (yytok) {
                        case '(':
                            yyn = 81;
                            continue;
                    }
                    yyn = 305;
                    continue;

                case 61:
                    yyst[yysp] = 61;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 212:
                    switch (yytok) {
                        case '.':
                            yyn = 82;
                            continue;
                        case ';':
                            yyn = 83;
                            continue;
                        case '[':
                            yyn = 84;
                            continue;
                    }
                    yyn = 305;
                    continue;

                case 62:
                    yyst[yysp] = 62;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 213:
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
                case 214:
                    switch (yytok) {
                        case '(':
                            yyn = 85;
                            continue;
                    }
                    yyn = 305;
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
                case 215:
                    yyn = yys64();
                    continue;

                case 65:
                    yyst[yysp] = 65;
                    yysv[yysp] = (yylval
                                 );
                    yytok = (yylex()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 216:
                    yyn = yys65();
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
                case 217:
                    switch (yytok) {
                        case IDENTIFIER:
                            yyn = 6;
                            continue;
                        case INT:
                            yyn = 87;
                            continue;
                    }
                    yyn = 305;
                    continue;

                case 67:
                    yyst[yysp] = 67;
                    yysv[yysp] = (yylval
                                 );
                    yytok = (yylex()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 218:
                    yyn = yys67();
                    continue;

                case 68:
                    yyst[yysp] = 68;
                    yysv[yysp] = (yylval
                                 );
                    yytok = (yylex()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 219:
                    yyn = yys68();
                    continue;

                case 69:
                    yyst[yysp] = 69;
                    yysv[yysp] = (yylval
                                 );
                    yytok = (yylex()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 220:
                    yyn = yys69();
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
                case 221:
                    yyn = yys70();
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
                case 222:
                    switch (yytok) {
                        case ')':
                            yyn = 90;
                            continue;
                    }
                    yyn = 305;
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
                case 223:
                    yyn = yys72();
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
                case 224:
                    yyn = yys73();
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
                case 225:
                    yyn = yys74();
                    continue;

                case 75:
                    yyst[yysp] = 75;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 226:
                    switch (yytok) {
                        case '.':
                            yyn = 82;
                            continue;
                        case '[':
                            yyn = 84;
                            continue;
                        case ']':
                            yyn = 91;
                            continue;
                    }
                    yyn = 305;
                    continue;

                case 76:
                    yyst[yysp] = 76;
                    yysv[yysp] = (yylval
                                 );
                    yytok = (yylex()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 227:
                    switch (yytok) {
                        case '(':
                            yyn = yyr2();
                            continue;
                    }
                    yyn = 305;
                    continue;

                case 77:
                    yyst[yysp] = 77;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 228:
                    switch (yytok) {
                        case '.':
                            yyn = 82;
                            continue;
                        case '[':
                            yyn = 84;
                            continue;
                        case ')':
                            yyn = 92;
                            continue;
                    }
                    yyn = 305;
                    continue;

                case 78:
                    yyst[yysp] = 78;
                    yysv[yysp] = (yylval
                                 );
                    yytok = (yylex()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 229:
                    switch (yytok) {
                        case '(':
                            yyn = 93;
                            continue;
                    }
                    yyn = 305;
                    continue;

                case 79:
                    yyst[yysp] = 79;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 230:
                    switch (yytok) {
                        case '.':
                            yyn = 82;
                            continue;
                        case '[':
                            yyn = 84;
                            continue;
                        case ')':
                            yyn = 94;
                            continue;
                    }
                    yyn = 305;
                    continue;

                case 80:
                    yyst[yysp] = 80;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 231:
                    switch (yytok) {
                        case ')':
                            yyn = 95;
                            continue;
                    }
                    yyn = 305;
                    continue;

                case 81:
                    yyst[yysp] = 81;
                    yysv[yysp] = (yylval
                                 );
                    yytok = (yylex()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 232:
                    switch (yytok) {
                        case '(':
                            yyn = 96;
                            continue;
                    }
                    yyn = 305;
                    continue;

                case 82:
                    yyst[yysp] = 82;
                    yysv[yysp] = (yylval
                                 );
                    yytok = (yylex()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 233:
                    switch (yytok) {
                        case IDENTIFIER:
                            yyn = 6;
                            continue;
                        case LENGTH:
                            yyn = 98;
                            continue;
                    }
                    yyn = 305;
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
                case 234:
                    switch (yytok) {
                        case ELSE:
                        case '}':
                        case ')':
                            yyn = yyr14();
                            continue;
                    }
                    yyn = 305;
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
                case 235:
                    yyn = yys84();
                    continue;

                case 85:
                    yyst[yysp] = 85;
                    yysv[yysp] = (yylval
                                 );
                    yytok = (yylex()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 236:
                    switch (yytok) {
                        case '&:
                            yyn = 100;
                            continue;
                    }
                    yyn = 305;
                    continue;

                case 86:
                    yyst[yysp] = 86;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 237:
                    switch (yytok) {
                        case '(':
                            yyn = 101;
                            continue;
                    }
                    yyn = 305;
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
                case 238:
                    switch (yytok) {
                        case '[':
                            yyn = 102;
                            continue;
                    }
                    yyn = 305;
                    continue;

                case 88:
                    yyst[yysp] = 88;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 239:
                    yyn = yys88();
                    continue;

                case 89:
                    yyst[yysp] = 89;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 240:
                    switch (yytok) {
                        case '.':
                            yyn = 82;
                            continue;
                        case '[':
                            yyn = 84;
                            continue;
                        case ')':
                            yyn = 103;
                            continue;
                    }
                    yyn = 305;
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
                case 241:
                    yyn = yys90();
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
                case 242:
                    switch (yytok) {
                        case '=':
                            yyn = 104;
                            continue;
                    }
                    yyn = 305;
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
                case 243:
                    switch (yytok) {
                        case IDENTIFIER:
                            yyn = 6;
                            continue;
                        case IF:
                            yyn = 46;
                            continue;
                        case SYSTEM:
                            yyn = 47;
                            continue;
                        case WHILE:
                            yyn = 48;
                            continue;
                        case '{':
                            yyn = 49;
                            continue;
                    }
                    yyn = 305;
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
                case 244:
                    yyn = yys93();
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
                case 245:
                    switch (yytok) {
                        case IDENTIFIER:
                            yyn = 6;
                            continue;
                        case IF:
                            yyn = 46;
                            continue;
                        case SYSTEM:
                            yyn = 47;
                            continue;
                        case WHILE:
                            yyn = 48;
                            continue;
                        case '{':
                            yyn = 49;
                            continue;
                    }
                    yyn = 305;
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
                case 246:
                    switch (yytok) {
                        case '}':
                            yyn = 108;
                            continue;
                    }
                    yyn = 305;
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
                case 247:
                    switch (yytok) {
                        case IDENTIFIER:
                            yyn = 6;
                            continue;
                        case BOOLEAN:
                            yyn = 30;
                            continue;
                        case INTEGER:
                            yyn = 31;
                            continue;
                    }
                    yyn = 305;
                    continue;

                case 97:
                    yyst[yysp] = 97;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 248:
                    switch (yytok) {
                        case '(':
                            yyn = 110;
                            continue;
                    }
                    yyn = 305;
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
                case 249:
                    yyn = yys98();
                    continue;

                case 99:
                    yyst[yysp] = 99;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 250:
                    switch (yytok) {
                        case '.':
                            yyn = 82;
                            continue;
                        case '[':
                            yyn = 84;
                            continue;
                        case ']':
                            yyn = 111;
                            continue;
                    }
                    yyn = 305;
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
                case 251:
                    switch (yytok) {
                        case ' :
                            yyn = 112;
                            continue;
                    }
                    yyn = 305;
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
                case 252:
                    switch (yytok) {
                        case ')':
                            yyn = 113;
                            continue;
                    }
                    yyn = 305;
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
                case 253:
                    yyn = yys102();
                    continue;

                case 103:
                    yyst[yysp] = 103;
                    yysv[yysp] = (yylval
                                 );
                    yytok = (yylex()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 254:
                    yyn = yys103();
                    continue;

                case 104:
                    yyst[yysp] = 104;
                    yysv[yysp] = (yylval
                                 );
                    yytok = (yylex()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 255:
                    yyn = yys104();
                    continue;

                case 105:
                    yyst[yysp] = 105;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 256:
                    switch (yytok) {
                        case ELSE:
                            yyn = 116;
                            continue;
                    }
                    yyn = 305;
                    continue;

                case 106:
                    yyst[yysp] = 106;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 257:
                    switch (yytok) {
                        case '.':
                            yyn = 82;
                            continue;
                        case '[':
                            yyn = 84;
                            continue;
                        case ')':
                            yyn = 117;
                            continue;
                    }
                    yyn = 305;
                    continue;

                case 107:
                    yyst[yysp] = 107;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 258:
                    switch (yytok) {
                        case ELSE:
                        case '}':
                        case ')':
                            yyn = yyr12();
                            continue;
                    }
                    yyn = 305;
                    continue;

                case 108:
                    yyst[yysp] = 108;
                    yysv[yysp] = (yylval
                                 );
                    yytok = (yylex()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 259:
                    switch (yytok) {
                        case ELSE:
                        case '}':
                        case ')':
                            yyn = yyr10();
                            continue;
                    }
                    yyn = 305;
                    continue;

                case 109:
                    yyst[yysp] = 109;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 260:
                    switch (yytok) {
                        case IDENTIFIER:
                            yyn = 6;
                            continue;
                    }
                    yyn = 305;
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
                case 261:
                    switch (yytok) {
                        case '(':
                            yyn = 119;
                            continue;
                    }
                    yyn = 305;
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
                case 262:
                    yyn = yys111();
                    continue;

                case 112:
                    yyst[yysp] = 112;
                    yysv[yysp] = (yylval
                                 );
                    yytok = (yylex()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 263:
                    yyn = yys112();
                    continue;

                case 113:
                    yyst[yysp] = 113;
                    yysv[yysp] = (yylval
                                 );
                    yytok = (yylex()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 264:
                    yyn = yys113();
                    continue;

                case 114:
                    yyst[yysp] = 114;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 265:
                    switch (yytok) {
                        case '.':
                            yyn = 82;
                            continue;
                        case '[':
                            yyn = 84;
                            continue;
                        case ']':
                            yyn = 120;
                            continue;
                    }
                    yyn = 305;
                    continue;

                case 115:
                    yyst[yysp] = 115;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 266:
                    switch (yytok) {
                        case '.':
                            yyn = 82;
                            continue;
                        case '[':
                            yyn = 84;
                            continue;
                        case ';':
                            yyn = 121;
                            continue;
                    }
                    yyn = 305;
                    continue;

                case 116:
                    yyst[yysp] = 116;
                    yysv[yysp] = (yylval
                                 );
                    yytok = (yylex()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 267:
                    switch (yytok) {
                        case IDENTIFIER:
                            yyn = 6;
                            continue;
                        case IF:
                            yyn = 46;
                            continue;
                        case SYSTEM:
                            yyn = 47;
                            continue;
                        case WHILE:
                            yyn = 48;
                            continue;
                        case '{':
                            yyn = 49;
                            continue;
                    }
                    yyn = 305;
                    continue;

                case 117:
                    yyst[yysp] = 117;
                    yysv[yysp] = (yylval
                                 );
                    yytok = (yylex()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 268:
                    switch (yytok) {
                        case ';':
                            yyn = 123;
                            continue;
                    }
                    yyn = 305;
                    continue;

                case 118:
                    yyst[yysp] = 118;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 269:
                    switch (yytok) {
                        case '(':
                            yyn = 124;
                            continue;
                    }
                    yyn = 305;
                    continue;

                case 119:
                    yyst[yysp] = 119;
                    yysv[yysp] = (yylval
                                 );
                    yytok = (yylex()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 270:
                    yyn = yys119();
                    continue;

                case 120:
                    yyst[yysp] = 120;
                    yysv[yysp] = (yylval
                                 );
                    yytok = (yylex()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 271:
                    yyn = yys120();
                    continue;

                case 121:
                    yyst[yysp] = 121;
                    yysv[yysp] = (yylval
                                 );
                    yytok = (yylex()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 272:
                    switch (yytok) {
                        case ELSE:
                        case '}':
                        case ')':
                            yyn = yyr15();
                            continue;
                    }
                    yyn = 305;
                    continue;

                case 122:
                    yyst[yysp] = 122;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 273:
                    switch (yytok) {
                        case ELSE:
                        case '}':
                        case ')':
                            yyn = yyr11();
                            continue;
                    }
                    yyn = 305;
                    continue;

                case 123:
                    yyst[yysp] = 123;
                    yysv[yysp] = (yylval
                                 );
                    yytok = (yylex()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 274:
                    switch (yytok) {
                        case ELSE:
                        case '}':
                        case ')':
                            yyn = yyr13();
                            continue;
                    }
                    yyn = 305;
                    continue;

                case 124:
                    yyst[yysp] = 124;
                    yysv[yysp] = (yylval
                                 );
                    yytok = (yylex()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 275:
                    switch (yytok) {
                        case ',':
                            yyn = 126;
                            continue;
                    }
                    yyn = 305;
                    continue;

                case 125:
                    yyst[yysp] = 125;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 276:
                    switch (yytok) {
                        case '.':
                            yyn = 82;
                            continue;
                        case '[':
                            yyn = 84;
                            continue;
                        case '(':
                            yyn = 127;
                            continue;
                    }
                    yyn = 305;
                    continue;

                case 126:
                    yyst[yysp] = 126;
                    yysv[yysp] = (yylval
                                 );
                    yytok = (yylex()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 277:
                    switch (yytok) {
                        case IDENTIFIER:
                            yyn = 6;
                            continue;
                        case BOOLEAN:
                            yyn = 30;
                            continue;
                        case INTEGER:
                            yyn = 31;
                            continue;
                    }
                    yyn = 305;
                    continue;

                case 127:
                    yyst[yysp] = 127;
                    yysv[yysp] = (yylval
                                 );
                    yytok = (yylex()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 278:
                    switch (yytok) {
                        case ',':
                            yyn = 129;
                            continue;
                    }
                    yyn = 305;
                    continue;

                case 128:
                    yyst[yysp] = 128;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 279:
                    switch (yytok) {
                        case IDENTIFIER:
                            yyn = 6;
                            continue;
                    }
                    yyn = 305;
                    continue;

                case 129:
                    yyst[yysp] = 129;
                    yysv[yysp] = (yylval
                                 );
                    yytok = (yylex()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 280:
                    yyn = yys129();
                    continue;

                case 130:
                    yyst[yysp] = 130;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 281:
                    switch (yytok) {
                        case ')':
                            yyn = 132;
                            continue;
                    }
                    yyn = 305;
                    continue;

                case 131:
                    yyst[yysp] = 131;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 282:
                    switch (yytok) {
                        case '.':
                            yyn = 82;
                            continue;
                        case '[':
                            yyn = 84;
                            continue;
                        case ')':
                            yyn = 133;
                            continue;
                    }
                    yyn = 305;
                    continue;

                case 132:
                    yyst[yysp] = 132;
                    yysv[yysp] = (yylval
                                 );
                    yytok = (yylex()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 283:
                    switch (yytok) {
                        case ')':
                            yyn = 134;
                            continue;
                    }
                    yyn = 305;
                    continue;

                case 133:
                    yyst[yysp] = 133;
                    yysv[yysp] = (yylval
                                 );
                    yytok = (yylex()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 284:
                    switch (yytok) {
                        case ')':
                            yyn = 135;
                            continue;
                    }
                    yyn = 305;
                    continue;

                case 134:
                    yyst[yysp] = 134;
                    yysv[yysp] = (yylval
                                 );
                    yytok = (yylex()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 285:
                    switch (yytok) {
                        case '?':
                            yyn = 136;
                            continue;
                    }
                    yyn = 305;
                    continue;

                case 135:
                    yyst[yysp] = 135;
                    yysv[yysp] = (yylval
                                 );
                    yytok = (yylex()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 286:
                    switch (yytok) {
                        case '?':
                            yyn = 137;
                            continue;
                    }
                    yyn = 305;
                    continue;

                case 136:
                    yyst[yysp] = 136;
                    yysv[yysp] = (yylval
                                 );
                    yytok = (yylex()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 287:
                    switch (yytok) {
                        case ')':
                            yyn = 138;
                            continue;
                    }
                    yyn = 305;
                    continue;

                case 137:
                    yyst[yysp] = 137;
                    yysv[yysp] = (yylval
                                 );
                    yytok = (yylex()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 288:
                    switch (yytok) {
                        case ')':
                            yyn = 139;
                            continue;
                    }
                    yyn = 305;
                    continue;

                case 138:
                    yyst[yysp] = 138;
                    yysv[yysp] = (yylval
                                 );
                    yytok = (yylex()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 289:
                    switch (yytok) {
                        case '{':
                            yyn = 140;
                            continue;
                    }
                    yyn = 305;
                    continue;

                case 139:
                    yyst[yysp] = 139;
                    yysv[yysp] = (yylval
                                 );
                    yytok = (yylex()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 290:
                    yyn = yys139();
                    continue;

                case 140:
                    yyst[yysp] = 140;
                    yysv[yysp] = (yylval
                                 );
                    yytok = (yylex()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 291:
                    switch (yytok) {
                        case '(':
                            yyn = 141;
                            continue;
                    }
                    yyn = 305;
                    continue;

                case 141:
                    yyst[yysp] = 141;
                    yysv[yysp] = (yylval
                                 );
                    yytok = (yylex()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 292:
                    switch (yytok) {
                        case IDENTIFIER:
                            yyn = 6;
                            continue;
                        case BOOLEAN:
                            yyn = 30;
                            continue;
                        case INTEGER:
                            yyn = 31;
                            continue;
                    }
                    yyn = 305;
                    continue;

                case 142:
                    yyst[yysp] = 142;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 293:
                    switch (yytok) {
                        case ')':
                            yyn = 143;
                            continue;
                    }
                    yyn = 305;
                    continue;

                case 143:
                    yyst[yysp] = 143;
                    yysv[yysp] = (yylval
                                 );
                    yytok = (yylex()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 294:
                    switch (yytok) {
                        case '(':
                            yyn = 144;
                            continue;
                    }
                    yyn = 305;
                    continue;

                case 144:
                    yyst[yysp] = 144;
                    yysv[yysp] = (yylval
                                 );
                    yytok = (yylex()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 295:
                    switch (yytok) {
                        case IDENTIFIER:
                            yyn = 6;
                            continue;
                        case IF:
                            yyn = 46;
                            continue;
                        case SYSTEM:
                            yyn = 47;
                            continue;
                        case WHILE:
                            yyn = 48;
                            continue;
                        case '{':
                            yyn = 49;
                            continue;
                    }
                    yyn = 305;
                    continue;

                case 145:
                    yyst[yysp] = 145;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 296:
                    switch (yytok) {
                        case ')':
                            yyn = 146;
                            continue;
                    }
                    yyn = 305;
                    continue;

                case 146:
                    yyst[yysp] = 146;
                    yysv[yysp] = (yylval
                                 );
                    yytok = (yylex()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 297:
                    switch (yytok) {
                        case RETURN:
                            yyn = 147;
                            continue;
                    }
                    yyn = 305;
                    continue;

                case 147:
                    yyst[yysp] = 147;
                    yysv[yysp] = (yylval
                                 );
                    yytok = (yylex()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 298:
                    yyn = yys147();
                    continue;

                case 148:
                    yyst[yysp] = 148;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 299:
                    switch (yytok) {
                        case '.':
                            yyn = 82;
                            continue;
                        case '[':
                            yyn = 84;
                            continue;
                        case ';':
                            yyn = 149;
                            continue;
                    }
                    yyn = 305;
                    continue;

                case 149:
                    yyst[yysp] = 149;
                    yysv[yysp] = (yylval
                                 );
                    yytok = (yylex()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 300:
                    switch (yytok) {
                        case '}':
                            yyn = 150;
                            continue;
                    }
                    yyn = 305;
                    continue;

                case 150:
                    yyst[yysp] = 150;
                    yysv[yysp] = (yylval
                                 );
                    yytok = (yylex()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 301:
                    switch (yytok) {
                        case ')':
                            yyn = yyr5();
                            continue;
                    }
                    yyn = 305;
                    continue;

                case 302:
                    return true;
                case 303:
                    yyerror("stack overflow");
                case 304:
                    return false;
                case 305:
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

    private int yys6() {
        switch (yytok) {
            case '(':
            case IDENTIFIER:
            case '{':
            case ']':
            case '[':
            case '=':
            case ';':
            case '.':
            case ')':
                return yyr33();
        }
        return 305;
    }

    private int yys52() {
        switch (yytok) {
            case IDENTIFIER:
                return 6;
            case EXPRESSION:
                return 63;
            case FALSE:
                return 64;
            case INTEGER_LITERAL:
                return 65;
            case NEW:
                return 66;
            case THIS:
                return 67;
            case TRUE:
                return 68;
            case '!':
                return 69;
            case '(':
                return 70;
            case '*':
                return 71;
            case '+':
                return 72;
            case '-':
                return 73;
            case '<':
                return 74;
        }
        return 305;
    }

    private int yys53() {
        switch (yytok) {
            case IDENTIFIER:
                return 6;
            case EXPRESSION:
                return 63;
            case FALSE:
                return 64;
            case INTEGER_LITERAL:
                return 65;
            case NEW:
                return 66;
            case THIS:
                return 67;
            case TRUE:
                return 68;
            case '!':
                return 69;
            case '(':
                return 70;
            case '*':
                return 71;
            case '+':
                return 72;
            case '-':
                return 73;
            case '<':
                return 74;
        }
        return 305;
    }

    private int yys55() {
        switch (yytok) {
            case IDENTIFIER:
                return 6;
            case EXPRESSION:
                return 63;
            case FALSE:
                return 64;
            case INTEGER_LITERAL:
                return 65;
            case NEW:
                return 66;
            case THIS:
                return 67;
            case TRUE:
                return 68;
            case '!':
                return 69;
            case '(':
                return 70;
            case '*':
                return 71;
            case '+':
                return 72;
            case '-':
                return 73;
            case '<':
                return 74;
        }
        return 305;
    }

    private int yys57() {
        switch (yytok) {
            case IDENTIFIER:
                return 6;
            case EXPRESSION:
                return 63;
            case FALSE:
                return 64;
            case INTEGER_LITERAL:
                return 65;
            case NEW:
                return 66;
            case THIS:
                return 67;
            case TRUE:
                return 68;
            case '!':
                return 69;
            case '(':
                return 70;
            case '*':
                return 71;
            case '+':
                return 72;
            case '-':
                return 73;
            case '<':
                return 74;
        }
        return 305;
    }

    private int yys62() {
        switch (yytok) {
            case '(':
            case ']':
            case '[':
            case ';':
            case '.':
            case ')':
                return yyr27();
        }
        return 305;
    }

    private int yys64() {
        switch (yytok) {
            case '(':
            case ']':
            case '[':
            case ';':
            case '.':
            case ')':
                return yyr26();
        }
        return 305;
    }

    private int yys65() {
        switch (yytok) {
            case '(':
            case ']':
            case '[':
            case ';':
            case '.':
            case ')':
                return yyr24();
        }
        return 305;
    }

    private int yys67() {
        switch (yytok) {
            case '(':
            case ']':
            case '[':
            case ';':
            case '.':
            case ')':
                return yyr28();
        }
        return 305;
    }

    private int yys68() {
        switch (yytok) {
            case '(':
            case ']':
            case '[':
            case ';':
            case '.':
            case ')':
                return yyr25();
        }
        return 305;
    }

    private int yys69() {
        switch (yytok) {
            case IDENTIFIER:
                return 6;
            case EXPRESSION:
                return 63;
            case FALSE:
                return 64;
            case INTEGER_LITERAL:
                return 65;
            case NEW:
                return 66;
            case THIS:
                return 67;
            case TRUE:
                return 68;
            case '!':
                return 69;
            case '(':
                return 70;
            case '*':
                return 71;
            case '+':
                return 72;
            case '-':
                return 73;
            case '<':
                return 74;
        }
        return 305;
    }

    private int yys70() {
        switch (yytok) {
            case IDENTIFIER:
                return 6;
            case EXPRESSION:
                return 63;
            case FALSE:
                return 64;
            case INTEGER_LITERAL:
                return 65;
            case NEW:
                return 66;
            case THIS:
                return 67;
            case TRUE:
                return 68;
            case '!':
                return 69;
            case '(':
                return 70;
            case '*':
                return 71;
            case '+':
                return 72;
            case '-':
                return 73;
            case '<':
                return 74;
        }
        return 305;
    }

    private int yys72() {
        switch (yytok) {
            case '(':
            case ']':
            case '[':
            case ';':
            case '.':
            case ')':
                return yyr18();
        }
        return 305;
    }

    private int yys73() {
        switch (yytok) {
            case '(':
            case ']':
            case '[':
            case ';':
            case '.':
            case ')':
                return yyr19();
        }
        return 305;
    }

    private int yys74() {
        switch (yytok) {
            case '(':
            case ']':
            case '[':
            case ';':
            case '.':
            case ')':
                return yyr17();
        }
        return 305;
    }

    private int yys84() {
        switch (yytok) {
            case IDENTIFIER:
                return 6;
            case EXPRESSION:
                return 63;
            case FALSE:
                return 64;
            case INTEGER_LITERAL:
                return 65;
            case NEW:
                return 66;
            case THIS:
                return 67;
            case TRUE:
                return 68;
            case '!':
                return 69;
            case '(':
                return 70;
            case '*':
                return 71;
            case '+':
                return 72;
            case '-':
                return 73;
            case '<':
                return 74;
        }
        return 305;
    }

    private int yys88() {
        switch (yytok) {
            case '.':
                return 82;
            case '[':
                return 84;
            case '(':
            case ']':
            case ';':
            case ')':
                return yyr31();
        }
        return 305;
    }

    private int yys90() {
        switch (yytok) {
            case '(':
            case ']':
            case '[':
            case ';':
            case '.':
            case ')':
                return yyr20();
        }
        return 305;
    }

    private int yys93() {
        switch (yytok) {
            case IDENTIFIER:
                return 6;
            case EXPRESSION:
                return 63;
            case FALSE:
                return 64;
            case INTEGER_LITERAL:
                return 65;
            case NEW:
                return 66;
            case THIS:
                return 67;
            case TRUE:
                return 68;
            case '!':
                return 69;
            case '(':
                return 70;
            case '*':
                return 71;
            case '+':
                return 72;
            case '-':
                return 73;
            case '<':
                return 74;
        }
        return 305;
    }

    private int yys98() {
        switch (yytok) {
            case '(':
            case ']':
            case '[':
            case ';':
            case '.':
            case ')':
                return yyr22();
        }
        return 305;
    }

    private int yys102() {
        switch (yytok) {
            case IDENTIFIER:
                return 6;
            case EXPRESSION:
                return 63;
            case FALSE:
                return 64;
            case INTEGER_LITERAL:
                return 65;
            case NEW:
                return 66;
            case THIS:
                return 67;
            case TRUE:
                return 68;
            case '!':
                return 69;
            case '(':
                return 70;
            case '*':
                return 71;
            case '+':
                return 72;
            case '-':
                return 73;
            case '<':
                return 74;
        }
        return 305;
    }

    private int yys103() {
        switch (yytok) {
            case '(':
            case ']':
            case '[':
            case ';':
            case '.':
            case ')':
                return yyr32();
        }
        return 305;
    }

    private int yys104() {
        switch (yytok) {
            case IDENTIFIER:
                return 6;
            case EXPRESSION:
                return 63;
            case FALSE:
                return 64;
            case INTEGER_LITERAL:
                return 65;
            case NEW:
                return 66;
            case THIS:
                return 67;
            case TRUE:
                return 68;
            case '!':
                return 69;
            case '(':
                return 70;
            case '*':
                return 71;
            case '+':
                return 72;
            case '-':
                return 73;
            case '<':
                return 74;
        }
        return 305;
    }

    private int yys111() {
        switch (yytok) {
            case '(':
            case ']':
            case '[':
            case ';':
            case '.':
            case ')':
                return yyr21();
        }
        return 305;
    }

    private int yys112() {
        switch (yytok) {
            case '(':
            case ']':
            case '[':
            case ';':
            case '.':
            case ')':
                return yyr16();
        }
        return 305;
    }

    private int yys113() {
        switch (yytok) {
            case '(':
            case ']':
            case '[':
            case ';':
            case '.':
            case ')':
                return yyr30();
        }
        return 305;
    }

    private int yys119() {
        switch (yytok) {
            case IDENTIFIER:
                return 6;
            case EXPRESSION:
                return 63;
            case FALSE:
                return 64;
            case INTEGER_LITERAL:
                return 65;
            case NEW:
                return 66;
            case THIS:
                return 67;
            case TRUE:
                return 68;
            case '!':
                return 69;
            case '(':
                return 70;
            case '*':
                return 71;
            case '+':
                return 72;
            case '-':
                return 73;
            case '<':
                return 74;
        }
        return 305;
    }

    private int yys120() {
        switch (yytok) {
            case '(':
            case ']':
            case '[':
            case ';':
            case '.':
            case ')':
                return yyr29();
        }
        return 305;
    }

    private int yys129() {
        switch (yytok) {
            case IDENTIFIER:
                return 6;
            case EXPRESSION:
                return 63;
            case FALSE:
                return 64;
            case INTEGER_LITERAL:
                return 65;
            case NEW:
                return 66;
            case THIS:
                return 67;
            case TRUE:
                return 68;
            case '!':
                return 69;
            case '(':
                return 70;
            case '*':
                return 71;
            case '+':
                return 72;
            case '-':
                return 73;
            case '<':
                return 74;
        }
        return 305;
    }

    private int yys139() {
        switch (yytok) {
            case '(':
            case ']':
            case '[':
            case ';':
            case '.':
            case ')':
                return yyr23();
        }
        return 305;
    }

    private int yys147() {
        switch (yytok) {
            case IDENTIFIER:
                return 6;
            case EXPRESSION:
                return 63;
            case FALSE:
                return 64;
            case INTEGER_LITERAL:
                return 65;
            case NEW:
                return 66;
            case THIS:
                return 67;
            case TRUE:
                return 68;
            case '!':
                return 69;
            case '(':
                return 70;
            case '*':
                return 71;
            case '+':
                return 72;
            case '-':
                return 73;
            case '<':
                return 74;
        }
        return 305;
    }

    private int yyr1() { // Goal : MainClass '(' ClassDeclaration ')'
        yysp -= 4;
        return 1;
    }

    private int yyr16() { // Expression : EXPRESSION '(' '& ' 
        yysp -= 4;
        return yypExpression();
    }

    private int yyr17() { // Expression : '<'
        yysp -= 1;
        return yypExpression();
    }

    private int yyr18() { // Expression : '+'
        yysp -= 1;
        return yypExpression();
    }

    private int yyr19() { // Expression : '-'
        yysp -= 1;
        return yypExpression();
    }

    private int yyr20() { // Expression : '*' ')'
        yysp -= 2;
        return yypExpression();
    }

    private int yyr21() { // Expression : Expression '[' Expression ']'
        yysp -= 4;
        return yypExpression();
    }

    private int yyr22() { // Expression : Expression '.' LENGTH
        yysp -= 3;
        return yypExpression();
    }

    private int yyr23() { // Expression : Expression '.' Identifier '(' '(' Expression '(' ',' Expression ')' ')' '?' ')'
        yysp -= 13;
        return yypExpression();
    }

    private int yyr24() { // Expression : INTEGER_LITERAL
        yysp -= 1;
        return yypExpression();
    }

    private int yyr25() { // Expression : TRUE
        yysp -= 1;
        return yypExpression();
    }

    private int yyr26() { // Expression : FALSE
        yysp -= 1;
        return yypExpression();
    }

    private int yyr27() { // Expression : Identifier
        yysp -= 1;
        return yypExpression();
    }

    private int yyr28() { // Expression : THIS
        yysp -= 1;
        return yypExpression();
    }

    private int yyr29() { // Expression : NEW INT '[' Expression ']'
        yysp -= 5;
        return yypExpression();
    }

    private int yyr30() { // Expression : NEW Identifier '(' ')'
        yysp -= 4;
        return yypExpression();
    }

    private int yyr31() { // Expression : '!' Expression
        yysp -= 2;
        return yypExpression();
    }

    private int yyr32() { // Expression : '(' Expression ')'
        yysp -= 3;
        return yypExpression();
    }

    private int yypExpression() {
        switch (yyst[yysp-1]) {
            case 129: return 131;
            case 119: return 125;
            case 104: return 115;
            case 102: return 114;
            case 93: return 106;
            case 84: return 99;
            case 70: return 89;
            case 69: return 88;
            case 57: return 79;
            case 55: return 77;
            case 53: return 75;
            case 52: return 61;
            default: return 148;
        }
    }

    private int yyr3() { // ClassDeclaration : CLASS Identifier '(' EXTENDS Identifier ')' '?' '{' '(' VarDeclaration ')' '(' MethodDeclaration ')' '}'
        yysp -= 15;
        return 7;
    }

    private int yyr33() { // Identifier : IDENTIFIER
        yysp -= 1;
        switch (yyst[yysp-1]) {
            case 144: return 44;
            case 141: return 27;
            case 128: return 130;
            case 126: return 27;
            case 116: return 44;
            case 109: return 118;
            case 96: return 27;
            case 94: return 44;
            case 92: return 44;
            case 82: return 97;
            case 66: return 86;
            case 58: return 44;
            case 51: return 60;
            case 43: return 27;
            case 41: return 44;
            case 28: return 33;
            case 26: return 32;
            case 25: return 27;
            case 15: return 17;
            case 8: return 11;
            case 3: return 5;
            default: return 62;
        }
    }

    private int yyr2() { // MainClass : CLASS Identifier '{' PUBLIC STATIC VOID MAIN '(' STRING '[' ']' Identifier ')' '{' Statement '}' '}'
        yysp -= 17;
        return 2;
    }

    private int yyr5() { // MethodDeclaration : PUBLIC Type Identifier '(' '(' Type Identifier '(' ',' Type Identifier ')' ')' '?' ')' '{' '(' VarDeclaration ')' '(' Statement ')' RETURN Expression ';' '}'
        yysp -= 26;
        return 42;
    }

    private int yyr10() { // Statement : '{' '(' Statement ')' '}'
        yysp -= 5;
        return yypStatement();
    }

    private int yyr11() { // Statement : IF '(' Expression ')' Statement ELSE Statement
        yysp -= 7;
        return yypStatement();
    }

    private int yyr12() { // Statement : WHILE '(' Expression ')' Statement
        yysp -= 5;
        return yypStatement();
    }

    private int yyr13() { // Statement : SYSTEM OUT PRINTLN '(' Expression ')' ';'
        yysp -= 7;
        return yypStatement();
    }

    private int yyr14() { // Statement : Identifier '=' Expression ';'
        yysp -= 4;
        return yypStatement();
    }

    private int yyr15() { // Statement : Identifier '[' Expression ']' '=' Expression ';'
        yysp -= 7;
        return yypStatement();
    }

    private int yypStatement() {
        switch (yyst[yysp-1]) {
            case 116: return 122;
            case 94: return 107;
            case 92: return 105;
            case 58: return 80;
            case 41: return 45;
            default: return 145;
        }
    }

    private int yyr6() { // Type : INTEGER '[' ']'
        yysp -= 3;
        return yypType();
    }

    private int yyr7() { // Type : BOOLEAN
        yysp -= 1;
        return yypType();
    }

    private int yyr8() { // Type : INTEGER 'i'
        yysp -= 2;
        return yypType();
    }

    private int yyr9() { // Type : Identifier
        yysp -= 1;
        return yypType();
    }

    private int yypType() {
        switch (yyst[yysp-1]) {
            case 126: return 128;
            case 96: return 109;
            case 43: return 51;
            default: return 28;
        }
    }

    private int yyr4() { // VarDeclaration : Type Identifier ';'
        yysp -= 3;
        switch (yyst[yysp-1]) {
            case 25: return 29;
            default: return 142;
        }
    }

    protected String[] yyerrmsgs = {
    };


  private void yyerror(String msg) {
    System.out.println("ERROR: " + msg);
    System.exit(1);
  }

  private int c;

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
                   return token='+';
        case '-' : nextChar();
                   return token='-';
        case '*' : nextChar();
                   return token='*';
        case '/' : nextChar();
                   return token='/';
        case '(' : nextChar();
                   return token='(';
        case ')' : nextChar();
                   return token=')';
        case ';' : nextChar();
                   return token=';';
        default  : if (Character.isDigit((char)c)) {
                     int n = 0;
                       do {
                         n = 10*n + (c - '0');
                         nextChar();
                       } while (Character.isDigit((char)c));
                       yylval = n;
                       return token=INTEGER;
                     } else {
                       yyerror("Illegal character "+c);
                       nextChar();
                     }
      }
    }
  }

  public static void main(String[] args) {
    Calc calc = new Calc();
    calc.nextChar(); // prime the character input stream
    calc.yylex();    // prime the token input stream
    calc.parse();    // parse the input}

}
