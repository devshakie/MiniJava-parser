// Output created by jacc on Tue Nov 21 15:07:28 EAT 2023


class MiniJavaParser implements miniJavaParserTokens {
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
                case 120:
                    switch (yytok) {
                        case CLASS:
                            yyn = 3;
                            continue;
                    }
                    yyn = 243;
                    continue;

                case 1:
                    yyst[yysp] = 1;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 121:
                    switch (yytok) {
                        case ENDINPUT:
                            yyn = 240;
                            continue;
                    }
                    yyn = 243;
                    continue;

                case 2:
                    yyst[yysp] = 2;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 122:
                    switch (yytok) {
                        case '(':
                            yyn = 4;
                            continue;
                    }
                    yyn = 243;
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
                case 123:
                    switch (yytok) {
                        case IDENTIFIER:
                            yyn = 6;
                            continue;
                    }
                    yyn = 243;
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
                case 124:
                    switch (yytok) {
                        case CLASS:
                            yyn = 8;
                            continue;
                    }
                    yyn = 243;
                    continue;

                case 5:
                    yyst[yysp] = 5;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 125:
                    switch (yytok) {
                        case '{':
                            yyn = 9;
                            continue;
                    }
                    yyn = 243;
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
                case 126:
                    yyn = yys6();
                    continue;

                case 7:
                    yyst[yysp] = 7;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 127:
                    switch (yytok) {
                        case ')':
                            yyn = 10;
                            continue;
                    }
                    yyn = 243;
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
                case 128:
                    switch (yytok) {
                        case IDENTIFIER:
                            yyn = 6;
                            continue;
                    }
                    yyn = 243;
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
                case 129:
                    switch (yytok) {
                        case PUBLIC:
                            yyn = 12;
                            continue;
                    }
                    yyn = 243;
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
                case 130:
                    switch (yytok) {
                        case ENDINPUT:
                            yyn = yyr1();
                            continue;
                    }
                    yyn = 243;
                    continue;

                case 11:
                    yyst[yysp] = 11;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 131:
                    switch (yytok) {
                        case '(':
                            yyn = 13;
                            continue;
                    }
                    yyn = 243;
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
                case 132:
                    switch (yytok) {
                        case STATIC:
                            yyn = 14;
                            continue;
                    }
                    yyn = 243;
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
                case 133:
                    switch (yytok) {
                        case EXTENDS:
                            yyn = 15;
                            continue;
                    }
                    yyn = 243;
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
                case 134:
                    switch (yytok) {
                        case VOID:
                            yyn = 16;
                            continue;
                    }
                    yyn = 243;
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
                case 135:
                    switch (yytok) {
                        case IDENTIFIER:
                            yyn = 6;
                            continue;
                    }
                    yyn = 243;
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
                case 136:
                    switch (yytok) {
                        case MAIN:
                            yyn = 18;
                            continue;
                    }
                    yyn = 243;
                    continue;

                case 17:
                    yyst[yysp] = 17;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 137:
                    switch (yytok) {
                        case ')':
                            yyn = 19;
                            continue;
                    }
                    yyn = 243;
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
                case 138:
                    switch (yytok) {
                        case '(':
                            yyn = 20;
                            continue;
                    }
                    yyn = 243;
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
                case 139:
                    switch (yytok) {
                        case '?':
                            yyn = 21;
                            continue;
                    }
                    yyn = 243;
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
                case 140:
                    switch (yytok) {
                        case STRING:
                            yyn = 22;
                            continue;
                    }
                    yyn = 243;
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
                case 141:
                    switch (yytok) {
                        case '{':
                            yyn = 23;
                            continue;
                    }
                    yyn = 243;
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
                case 142:
                    switch (yytok) {
                        case '[':
                            yyn = 24;
                            continue;
                    }
                    yyn = 243;
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
                case 143:
                    switch (yytok) {
                        case '(':
                            yyn = 25;
                            continue;
                    }
                    yyn = 243;
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
                case 144:
                    switch (yytok) {
                        case ']':
                            yyn = 26;
                            continue;
                    }
                    yyn = 243;
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
                case 145:
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
                    yyn = 243;
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
                case 146:
                    switch (yytok) {
                        case IDENTIFIER:
                            yyn = 6;
                            continue;
                    }
                    yyn = 243;
                    continue;

                case 27:
                    yyst[yysp] = 27;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 147:
                    switch (yytok) {
                        case IDENTIFIER:
                            yyn = yyr9();
                            continue;
                    }
                    yyn = 243;
                    continue;

                case 28:
                    yyst[yysp] = 28;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 148:
                    switch (yytok) {
                        case IDENTIFIER:
                            yyn = 6;
                            continue;
                    }
                    yyn = 243;
                    continue;

                case 29:
                    yyst[yysp] = 29;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 149:
                    switch (yytok) {
                        case ')':
                            yyn = 34;
                            continue;
                    }
                    yyn = 243;
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
                case 150:
                    switch (yytok) {
                        case IDENTIFIER:
                            yyn = yyr7();
                            continue;
                    }
                    yyn = 243;
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
                case 151:
                    switch (yytok) {
                        case '[':
                            yyn = 35;
                            continue;
                        case 'i':
                            yyn = 36;
                            continue;
                    }
                    yyn = 243;
                    continue;

                case 32:
                    yyst[yysp] = 32;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 152:
                    switch (yytok) {
                        case ')':
                            yyn = 37;
                            continue;
                    }
                    yyn = 243;
                    continue;

                case 33:
                    yyst[yysp] = 33;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 153:
                    switch (yytok) {
                        case ';':
                            yyn = 38;
                            continue;
                    }
                    yyn = 243;
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
                case 154:
                    switch (yytok) {
                        case '(':
                            yyn = 39;
                            continue;
                    }
                    yyn = 243;
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
                case 155:
                    switch (yytok) {
                        case ']':
                            yyn = 40;
                            continue;
                    }
                    yyn = 243;
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
                case 156:
                    switch (yytok) {
                        case IDENTIFIER:
                            yyn = yyr8();
                            continue;
                    }
                    yyn = 243;
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
                case 157:
                    switch (yytok) {
                        case '{':
                            yyn = 41;
                            continue;
                    }
                    yyn = 243;
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
                case 158:
                    switch (yytok) {
                        case ')':
                            yyn = yyr4();
                            continue;
                    }
                    yyn = 243;
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
                case 159:
                    switch (yytok) {
                        case PUBLIC:
                            yyn = 43;
                            continue;
                    }
                    yyn = 243;
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
                case 160:
                    switch (yytok) {
                        case IDENTIFIER:
                            yyn = yyr6();
                            continue;
                    }
                    yyn = 243;
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
                case 161:
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
                    yyn = 243;
                    continue;

                case 42:
                    yyst[yysp] = 42;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 162:
                    switch (yytok) {
                        case ')':
                            yyn = 50;
                            continue;
                    }
                    yyn = 243;
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
                case 163:
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
                    yyn = 243;
                    continue;

                case 44:
                    yyst[yysp] = 44;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 164:
                    switch (yytok) {
                        case '=':
                            yyn = 52;
                            continue;
                        case '[':
                            yyn = 53;
                            continue;
                    }
                    yyn = 243;
                    continue;

                case 45:
                    yyst[yysp] = 45;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 165:
                    switch (yytok) {
                        case '}':
                            yyn = 54;
                            continue;
                    }
                    yyn = 243;
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
                case 166:
                    switch (yytok) {
                        case '(':
                            yyn = 55;
                            continue;
                    }
                    yyn = 243;
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
                case 167:
                    switch (yytok) {
                        case OUT:
                            yyn = 56;
                            continue;
                    }
                    yyn = 243;
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
                case 168:
                    switch (yytok) {
                        case '(':
                            yyn = 57;
                            continue;
                    }
                    yyn = 243;
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
                case 169:
                    switch (yytok) {
                        case '(':
                            yyn = 58;
                            continue;
                    }
                    yyn = 243;
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
                case 170:
                    switch (yytok) {
                        case '}':
                            yyn = 59;
                            continue;
                    }
                    yyn = 243;
                    continue;

                case 51:
                    yyst[yysp] = 51;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 171:
                    switch (yytok) {
                        case IDENTIFIER:
                            yyn = 6;
                            continue;
                    }
                    yyn = 243;
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
                case 172:
                    switch (yytok) {
                        case INTEGER:
                            yyn = 62;
                            continue;
                        case '(':
                            yyn = 63;
                            continue;
                    }
                    yyn = 243;
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
                case 173:
                    switch (yytok) {
                        case INTEGER:
                            yyn = 62;
                            continue;
                        case '(':
                            yyn = 63;
                            continue;
                    }
                    yyn = 243;
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
                case 174:
                    switch (yytok) {
                        case '}':
                            yyn = 65;
                            continue;
                    }
                    yyn = 243;
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
                case 175:
                    switch (yytok) {
                        case INTEGER:
                            yyn = 62;
                            continue;
                        case '(':
                            yyn = 63;
                            continue;
                    }
                    yyn = 243;
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
                case 176:
                    switch (yytok) {
                        case PRINTLN:
                            yyn = 67;
                            continue;
                    }
                    yyn = 243;
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
                case 177:
                    switch (yytok) {
                        case INTEGER:
                            yyn = 62;
                            continue;
                        case '(':
                            yyn = 63;
                            continue;
                    }
                    yyn = 243;
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
                case 178:
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
                    yyn = 243;
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
                case 179:
                    switch (yytok) {
                        case ')':
                            yyn = yyr3();
                            continue;
                    }
                    yyn = 243;
                    continue;

                case 60:
                    yyst[yysp] = 60;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 180:
                    switch (yytok) {
                        case '(':
                            yyn = 70;
                            continue;
                    }
                    yyn = 243;
                    continue;

                case 61:
                    yyst[yysp] = 61;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 181:
                    switch (yytok) {
                        case '*':
                            yyn = 71;
                            continue;
                        case '+':
                            yyn = 72;
                            continue;
                        case '-':
                            yyn = 73;
                            continue;
                        case '/':
                            yyn = 74;
                            continue;
                        case ';':
                            yyn = 75;
                            continue;
                    }
                    yyn = 243;
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
                case 182:
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
                case 183:
                    switch (yytok) {
                        case INTEGER:
                            yyn = 62;
                            continue;
                        case '(':
                            yyn = 63;
                            continue;
                    }
                    yyn = 243;
                    continue;

                case 64:
                    yyst[yysp] = 64;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 184:
                    switch (yytok) {
                        case '*':
                            yyn = 71;
                            continue;
                        case '+':
                            yyn = 72;
                            continue;
                        case '-':
                            yyn = 73;
                            continue;
                        case '/':
                            yyn = 74;
                            continue;
                        case ']':
                            yyn = 77;
                            continue;
                    }
                    yyn = 243;
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
                case 185:
                    switch (yytok) {
                        case '(':
                            yyn = yyr2();
                            continue;
                    }
                    yyn = 243;
                    continue;

                case 66:
                    yyst[yysp] = 66;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 186:
                    switch (yytok) {
                        case '*':
                            yyn = 71;
                            continue;
                        case '+':
                            yyn = 72;
                            continue;
                        case '-':
                            yyn = 73;
                            continue;
                        case '/':
                            yyn = 74;
                            continue;
                        case ')':
                            yyn = 78;
                            continue;
                    }
                    yyn = 243;
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
                case 187:
                    switch (yytok) {
                        case '(':
                            yyn = 79;
                            continue;
                    }
                    yyn = 243;
                    continue;

                case 68:
                    yyst[yysp] = 68;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 188:
                    switch (yytok) {
                        case '*':
                            yyn = 71;
                            continue;
                        case '+':
                            yyn = 72;
                            continue;
                        case '-':
                            yyn = 73;
                            continue;
                        case '/':
                            yyn = 74;
                            continue;
                        case ')':
                            yyn = 80;
                            continue;
                    }
                    yyn = 243;
                    continue;

                case 69:
                    yyst[yysp] = 69;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 189:
                    switch (yytok) {
                        case ')':
                            yyn = 81;
                            continue;
                    }
                    yyn = 243;
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
                case 190:
                    switch (yytok) {
                        case '(':
                            yyn = 82;
                            continue;
                    }
                    yyn = 243;
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
                case 191:
                    switch (yytok) {
                        case INTEGER:
                            yyn = 62;
                            continue;
                        case '(':
                            yyn = 63;
                            continue;
                    }
                    yyn = 243;
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
                case 192:
                    switch (yytok) {
                        case INTEGER:
                            yyn = 62;
                            continue;
                        case '(':
                            yyn = 63;
                            continue;
                    }
                    yyn = 243;
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
                case 193:
                    switch (yytok) {
                        case INTEGER:
                            yyn = 62;
                            continue;
                        case '(':
                            yyn = 63;
                            continue;
                    }
                    yyn = 243;
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
                case 194:
                    switch (yytok) {
                        case INTEGER:
                            yyn = 62;
                            continue;
                        case '(':
                            yyn = 63;
                            continue;
                    }
                    yyn = 243;
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
                case 195:
                    switch (yytok) {
                        case ')':
                        case ELSE:
                        case '}':
                            yyn = yyr14();
                            continue;
                    }
                    yyn = 243;
                    continue;

                case 76:
                    yyst[yysp] = 76;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 196:
                    switch (yytok) {
                        case '*':
                            yyn = 71;
                            continue;
                        case '+':
                            yyn = 72;
                            continue;
                        case '-':
                            yyn = 73;
                            continue;
                        case '/':
                            yyn = 74;
                            continue;
                        case ')':
                            yyn = 87;
                            continue;
                    }
                    yyn = 243;
                    continue;

                case 77:
                    yyst[yysp] = 77;
                    yysv[yysp] = (yylval
                                 );
                    yytok = (yylex()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 197:
                    switch (yytok) {
                        case '=':
                            yyn = 88;
                            continue;
                    }
                    yyn = 243;
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
                case 198:
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
                    yyn = 243;
                    continue;

                case 79:
                    yyst[yysp] = 79;
                    yysv[yysp] = (yylval
                                 );
                    yytok = (yylex()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 199:
                    switch (yytok) {
                        case INTEGER:
                            yyn = 62;
                            continue;
                        case '(':
                            yyn = 63;
                            continue;
                    }
                    yyn = 243;
                    continue;

                case 80:
                    yyst[yysp] = 80;
                    yysv[yysp] = (yylval
                                 );
                    yytok = (yylex()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 200:
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
                    yyn = 243;
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
                case 201:
                    switch (yytok) {
                        case '}':
                            yyn = 92;
                            continue;
                    }
                    yyn = 243;
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
                case 202:
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
                    yyn = 243;
                    continue;

                case 83:
                    yyst[yysp] = 83;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 203:
                    yyn = yys83();
                    continue;

                case 84:
                    yyst[yysp] = 84;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 204:
                    yyn = yys84();
                    continue;

                case 85:
                    yyst[yysp] = 85;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 205:
                    yyn = yys85();
                    continue;

                case 86:
                    yyst[yysp] = 86;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 206:
                    yyn = yys86();
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
                case 207:
                    yyn = yys87();
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
                case 208:
                    switch (yytok) {
                        case INTEGER:
                            yyn = 62;
                            continue;
                        case '(':
                            yyn = 63;
                            continue;
                    }
                    yyn = 243;
                    continue;

                case 89:
                    yyst[yysp] = 89;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 209:
                    switch (yytok) {
                        case ELSE:
                            yyn = 95;
                            continue;
                    }
                    yyn = 243;
                    continue;

                case 90:
                    yyst[yysp] = 90;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 210:
                    switch (yytok) {
                        case '*':
                            yyn = 71;
                            continue;
                        case '+':
                            yyn = 72;
                            continue;
                        case '-':
                            yyn = 73;
                            continue;
                        case '/':
                            yyn = 74;
                            continue;
                        case ')':
                            yyn = 96;
                            continue;
                    }
                    yyn = 243;
                    continue;

                case 91:
                    yyst[yysp] = 91;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 211:
                    switch (yytok) {
                        case ')':
                        case ELSE:
                        case '}':
                            yyn = yyr12();
                            continue;
                    }
                    yyn = 243;
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
                case 212:
                    switch (yytok) {
                        case ')':
                        case ELSE:
                        case '}':
                            yyn = yyr10();
                            continue;
                    }
                    yyn = 243;
                    continue;

                case 93:
                    yyst[yysp] = 93;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 213:
                    switch (yytok) {
                        case IDENTIFIER:
                            yyn = 6;
                            continue;
                    }
                    yyn = 243;
                    continue;

                case 94:
                    yyst[yysp] = 94;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 214:
                    switch (yytok) {
                        case '*':
                            yyn = 71;
                            continue;
                        case '+':
                            yyn = 72;
                            continue;
                        case '-':
                            yyn = 73;
                            continue;
                        case '/':
                            yyn = 74;
                            continue;
                        case ';':
                            yyn = 98;
                            continue;
                    }
                    yyn = 243;
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
                case 215:
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
                    yyn = 243;
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
                case 216:
                    switch (yytok) {
                        case ';':
                            yyn = 100;
                            continue;
                    }
                    yyn = 243;
                    continue;

                case 97:
                    yyst[yysp] = 97;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 217:
                    switch (yytok) {
                        case '(':
                            yyn = 101;
                            continue;
                    }
                    yyn = 243;
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
                case 218:
                    switch (yytok) {
                        case ')':
                        case ELSE:
                        case '}':
                            yyn = yyr15();
                            continue;
                    }
                    yyn = 243;
                    continue;

                case 99:
                    yyst[yysp] = 99;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 219:
                    switch (yytok) {
                        case ')':
                        case ELSE:
                        case '}':
                            yyn = yyr11();
                            continue;
                    }
                    yyn = 243;
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
                case 220:
                    switch (yytok) {
                        case ')':
                        case ELSE:
                        case '}':
                            yyn = yyr13();
                            continue;
                    }
                    yyn = 243;
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
                case 221:
                    switch (yytok) {
                        case ',':
                            yyn = 102;
                            continue;
                    }
                    yyn = 243;
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
                case 222:
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
                    yyn = 243;
                    continue;

                case 103:
                    yyst[yysp] = 103;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 223:
                    switch (yytok) {
                        case IDENTIFIER:
                            yyn = 6;
                            continue;
                    }
                    yyn = 243;
                    continue;

                case 104:
                    yyst[yysp] = 104;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 224:
                    switch (yytok) {
                        case ')':
                            yyn = 105;
                            continue;
                    }
                    yyn = 243;
                    continue;

                case 105:
                    yyst[yysp] = 105;
                    yysv[yysp] = (yylval
                                 );
                    yytok = (yylex()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 225:
                    switch (yytok) {
                        case ')':
                            yyn = 106;
                            continue;
                    }
                    yyn = 243;
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
                case 226:
                    switch (yytok) {
                        case '?':
                            yyn = 107;
                            continue;
                    }
                    yyn = 243;
                    continue;

                case 107:
                    yyst[yysp] = 107;
                    yysv[yysp] = (yylval
                                 );
                    yytok = (yylex()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 227:
                    switch (yytok) {
                        case ')':
                            yyn = 108;
                            continue;
                    }
                    yyn = 243;
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
                case 228:
                    switch (yytok) {
                        case '{':
                            yyn = 109;
                            continue;
                    }
                    yyn = 243;
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
                case 229:
                    switch (yytok) {
                        case '(':
                            yyn = 110;
                            continue;
                    }
                    yyn = 243;
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
                case 230:
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
                    yyn = 243;
                    continue;

                case 111:
                    yyst[yysp] = 111;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 231:
                    switch (yytok) {
                        case ')':
                            yyn = 112;
                            continue;
                    }
                    yyn = 243;
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
                case 232:
                    switch (yytok) {
                        case '(':
                            yyn = 113;
                            continue;
                    }
                    yyn = 243;
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
                case 233:
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
                    yyn = 243;
                    continue;

                case 114:
                    yyst[yysp] = 114;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 234:
                    switch (yytok) {
                        case ')':
                            yyn = 115;
                            continue;
                    }
                    yyn = 243;
                    continue;

                case 115:
                    yyst[yysp] = 115;
                    yysv[yysp] = (yylval
                                 );
                    yytok = (yylex()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 235:
                    switch (yytok) {
                        case RETURN:
                            yyn = 116;
                            continue;
                    }
                    yyn = 243;
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
                case 236:
                    switch (yytok) {
                        case INTEGER:
                            yyn = 62;
                            continue;
                        case '(':
                            yyn = 63;
                            continue;
                    }
                    yyn = 243;
                    continue;

                case 117:
                    yyst[yysp] = 117;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 237:
                    switch (yytok) {
                        case '*':
                            yyn = 71;
                            continue;
                        case '+':
                            yyn = 72;
                            continue;
                        case '-':
                            yyn = 73;
                            continue;
                        case '/':
                            yyn = 74;
                            continue;
                        case ';':
                            yyn = 118;
                            continue;
                    }
                    yyn = 243;
                    continue;

                case 118:
                    yyst[yysp] = 118;
                    yysv[yysp] = (yylval
                                 );
                    yytok = (yylex()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 238:
                    switch (yytok) {
                        case '}':
                            yyn = 119;
                            continue;
                    }
                    yyn = 243;
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
                case 239:
                    switch (yytok) {
                        case ')':
                            yyn = yyr5();
                            continue;
                    }
                    yyn = 243;
                    continue;

                case 240:
                    return true;
                case 241:
                    yyerror("stack overflow");
                case 242:
                    return false;
                case 243:
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
            case ')':
            case '(':
            case IDENTIFIER:
            case '{':
            case '[':
            case '=':
            case ';':
                return yyr22();
        }
        return 243;
    }

    private int yys62() {
        switch (yytok) {
            case '+':
            case '*':
            case ')':
            case ']':
            case ';':
            case '/':
            case '-':
                return yyr21();
        }
        return 243;
    }

    private int yys83() {
        switch (yytok) {
            case '+':
                return 72;
            case '-':
                return 73;
            case '*':
            case ')':
            case ']':
            case ';':
            case '/':
                return yyr18();
        }
        return 243;
    }

    private int yys84() {
        switch (yytok) {
            case '+':
            case '*':
            case ')':
            case ']':
            case ';':
            case '/':
            case '-':
                return yyr16();
        }
        return 243;
    }

    private int yys85() {
        switch (yytok) {
            case '+':
            case '*':
            case ')':
            case ']':
            case ';':
            case '/':
            case '-':
                return yyr17();
        }
        return 243;
    }

    private int yys86() {
        switch (yytok) {
            case '+':
                return 72;
            case '-':
                return 73;
            case '*':
            case ')':
            case ']':
            case ';':
            case '/':
                return yyr19();
        }
        return 243;
    }

    private int yys87() {
        switch (yytok) {
            case '+':
            case '*':
            case ')':
            case ']':
            case ';':
            case '/':
            case '-':
                return yyr20();
        }
        return 243;
    }

    private int yyr1() { // Goal : MainClass '(' ClassDeclaration ')'
        yysp -= 4;
        return 1;
    }

    private int yyr16() { // Expression : Expression '+' Expression
        { yyrv = yysv[yysp-3] + yysv[yysp-1]; }
        yysv[yysp-=3] = yyrv;
        return yypExpression();
    }

    private int yyr17() { // Expression : Expression '-' Expression
        { yyrv = yysv[yysp-3] - yysv[yysp-1]; }
        yysv[yysp-=3] = yyrv;
        return yypExpression();
    }

    private int yyr18() { // Expression : Expression '*' Expression
        { yyrv = yysv[yysp-3] * yysv[yysp-1]; }
        yysv[yysp-=3] = yyrv;
        return yypExpression();
    }

    private int yyr19() { // Expression : Expression '/' Expression
        { yyrv = yysv[yysp-3] / yysv[yysp-1]; }
        yysv[yysp-=3] = yyrv;
        return yypExpression();
    }

    private int yyr20() { // Expression : '(' Expression ')'
        { yyrv = yysv[yysp-2]; }
        yysv[yysp-=3] = yyrv;
        return yypExpression();
    }

    private int yyr21() { // Expression : INTEGER
        { yyrv = yysv[yysp-1]; }
        yysv[yysp-=1] = yyrv;
        return yypExpression();
    }

    private int yypExpression() {
        switch (yyst[yysp-1]) {
            case 88: return 94;
            case 79: return 90;
            case 74: return 86;
            case 73: return 85;
            case 72: return 84;
            case 71: return 83;
            case 63: return 76;
            case 57: return 68;
            case 55: return 66;
            case 53: return 64;
            case 52: return 61;
            default: return 117;
        }
    }

    private int yyr3() { // ClassDeclaration : CLASS Identifier '(' EXTENDS Identifier ')' '?' '{' '(' VarDeclaration ')' '(' MethodDeclaration ')' '}'
        yysp -= 15;
        return 7;
    }

    private int yyr22() { // Identifier : IDENTIFIER
        yysp -= 1;
        switch (yyst[yysp-1]) {
            case 110: return 27;
            case 103: return 104;
            case 102: return 27;
            case 93: return 97;
            case 82: return 27;
            case 51: return 60;
            case 43: return 27;
            case 28: return 33;
            case 26: return 32;
            case 25: return 27;
            case 15: return 17;
            case 8: return 11;
            case 3: return 5;
            default: return 44;
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
            case 95: return 99;
            case 80: return 91;
            case 78: return 89;
            case 58: return 69;
            case 41: return 45;
            default: return 114;
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
            case 102: return 103;
            case 82: return 93;
            case 43: return 51;
            default: return 28;
        }
    }

    private int yyr4() { // VarDeclaration : Type Identifier ';'
        yysp -= 3;
        switch (yyst[yysp-1]) {
            case 25: return 29;
            default: return 111;
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
 
  %%
  

}
