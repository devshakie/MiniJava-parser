// Output created by jacc on Mon Nov 13 11:21:02 EAT 2023


class myMiniJava implements myMiniJavatokens {
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
                case 14:
                    switch (yytok) {
                        case INTEGER:
                            yyn = 2;
                            continue;
                        case '(':
                            yyn = 3;
                            continue;
                    }
                    yyn = 31;
                    continue;

                case 1:
                    yyst[yysp] = 1;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 15:
                    switch (yytok) {
                        case ENDINPUT:
                            yyn = 28;
                            continue;
                        case '*':
                            yyn = 4;
                            continue;
                        case '+':
                            yyn = 5;
                            continue;
                        case '-':
                            yyn = 6;
                            continue;
                        case '/':
                            yyn = 7;
                            continue;
                    }
                    yyn = 31;
                    continue;

                case 2:
                    yyst[yysp] = 2;
                    yysv[yysp] = (yylval
                                 );
                    yytok = (yylex()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 16:
                    yyn = yys2();
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
                case 17:
                    switch (yytok) {
                        case INTEGER:
                            yyn = 2;
                            continue;
                        case '(':
                            yyn = 3;
                            continue;
                    }
                    yyn = 31;
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
                case 18:
                    switch (yytok) {
                        case INTEGER:
                            yyn = 2;
                            continue;
                        case '(':
                            yyn = 3;
                            continue;
                    }
                    yyn = 31;
                    continue;

                case 5:
                    yyst[yysp] = 5;
                    yysv[yysp] = (yylval
                                 );
                    yytok = (yylex()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 19:
                    switch (yytok) {
                        case INTEGER:
                            yyn = 2;
                            continue;
                        case '(':
                            yyn = 3;
                            continue;
                    }
                    yyn = 31;
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
                case 20:
                    switch (yytok) {
                        case INTEGER:
                            yyn = 2;
                            continue;
                        case '(':
                            yyn = 3;
                            continue;
                    }
                    yyn = 31;
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
                case 21:
                    switch (yytok) {
                        case INTEGER:
                            yyn = 2;
                            continue;
                        case '(':
                            yyn = 3;
                            continue;
                    }
                    yyn = 31;
                    continue;

                case 8:
                    yyst[yysp] = 8;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 22:
                    switch (yytok) {
                        case '*':
                            yyn = 4;
                            continue;
                        case '+':
                            yyn = 5;
                            continue;
                        case '-':
                            yyn = 6;
                            continue;
                        case '/':
                            yyn = 7;
                            continue;
                        case ')':
                            yyn = 13;
                            continue;
                    }
                    yyn = 31;
                    continue;

                case 9:
                    yyst[yysp] = 9;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 23:
                    yyn = yys9();
                    continue;

                case 10:
                    yyst[yysp] = 10;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 24:
                    yyn = yys10();
                    continue;

                case 11:
                    yyst[yysp] = 11;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 25:
                    yyn = yys11();
                    continue;

                case 12:
                    yyst[yysp] = 12;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 26:
                    yyn = yys12();
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
                case 27:
                    yyn = yys13();
                    continue;

                case 28:
                    return true;
                case 29:
                    yyerror("stack overflow");
                case 30:
                    return false;
                case 31:
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

    private int yys2() {
        switch (yytok) {
            case '-':
            case '+':
            case '*':
            case ')':
            case ENDINPUT:
            case '/':
                return yyr6();
        }
        return 31;
    }

    private int yys9() {
        switch (yytok) {
            case '-':
            case '+':
            case '*':
            case ')':
            case ENDINPUT:
            case '/':
                return yyr3();
        }
        return 31;
    }

    private int yys10() {
        switch (yytok) {
            case '*':
                return 4;
            case '/':
                return 7;
            case '-':
            case '+':
            case ')':
            case ENDINPUT:
                return yyr1();
        }
        return 31;
    }

    private int yys11() {
        switch (yytok) {
            case '*':
                return 4;
            case '/':
                return 7;
            case '-':
            case '+':
            case ')':
            case ENDINPUT:
                return yyr2();
        }
        return 31;
    }

    private int yys12() {
        switch (yytok) {
            case '-':
            case '+':
            case '*':
            case ')':
            case ENDINPUT:
            case '/':
                return yyr4();
        }
        return 31;
    }

    private int yys13() {
        switch (yytok) {
            case '-':
            case '+':
            case '*':
            case ')':
            case ENDINPUT:
            case '/':
                return yyr5();
        }
        return 31;
    }

    private int yyr1() { // expr : expr '+' expr
        { yyrv = yysv[yysp-3] + yysv[yysp-1]; }
        yysv[yysp-=3] = yyrv;
        return yypexpr();
    }

    private int yyr2() { // expr : expr '-' expr
        { yyrv = yysv[yysp-3] - yysv[yysp-1]; }
        yysv[yysp-=3] = yyrv;
        return yypexpr();
    }

    private int yyr3() { // expr : expr '*' expr
        { yyrv = yysv[yysp-3] * yysv[yysp-1]; }
        yysv[yysp-=3] = yyrv;
        return yypexpr();
    }

    private int yyr4() { // expr : expr '/' expr
        { yyrv = yysv[yysp-3] / yysv[yysp-1]; }
        yysv[yysp-=3] = yyrv;
        return yypexpr();
    }

    private int yyr5() { // expr : '(' expr ')'
        { yyrv = yysv[yysp-2]; }
        yysv[yysp-=3] = yyrv;
        return yypexpr();
    }

    private int yyr6() { // expr : INTEGER
        { yyrv = yysv[yysp-1]; }
        yysv[yysp-=1] = yyrv;
        return yypexpr();
    }

    private int yypexpr() {
        switch (yyst[yysp-1]) {
            case 6: return 11;
            case 5: return 10;
            case 4: return 9;
            case 3: return 8;
            case 0: return 1;
            default: return 12;
        }
    }

    protected String[] yyerrmsgs = {
    };


 Goal : MainClass '('ClassDeclaration ')'
       ;
 MainClass : CLASS Identifier '{' PUBLIC STATIC VOID MAIN '(' STRING '[' ']' Identifier ')' '{' Statement '}' '}'
          ;
 ClassDeclaration : CLASS Identifier '(' EXTENDS Identifier ')''?' '{' '(' VarDeclaration ')' '(' MethodDeclaration ')' '}'
                 ;
 VarDeclaration :Type Identifier ';' 
           ;
 MethodDeclaration : PUBLIC  Type Identifier '(' '(' Type Identifier '(' ',' Type Identifier ')' ')''?' ')' '{' '(' VarDeclaration ')' '(' Statement ')' RETURN Expression ';' '}'
                 ;
Type : INTEGER '[' ']'
|       BOOLEAN
|       INTEGER 'i'
|       Identifier;
Statement : '{' '(' Statement ')' '}' 
|       IF '(' Expression ')' Statement ELSE Statement
|       WHILE '(' Expression ')' Statement
|       SYSTEM OUT PRINTLN '(' Expression ')' ';'
|       Identifier '=' Expression ';'
|       Identifier '[' Expression ']''=' Expression ';' 
         ;
Expression : EXPRESSION '(' '&&' | '<' | '+' | '-' | '*' ')' 
|       Expression '[' Expression ']'
|       Expression '.' LENGTH
|       Expression '.' Identifier '(' '(' Expression '(' ',' Expression ')' ')''?' ')'
|       INTEGER_LITERAL
|       TRUE
|       FALSE
|       Identifier
|       THIS
| NEW INT '[' Expression ']'
|       NEW Identifier '(' ')'
|       '!' Expression
|       '(' Expression ')' 
         ;
Identifier      :       IDENTIFIER ;


%%

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



%%

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
    calc.parse();    // parse the input
  }

}
