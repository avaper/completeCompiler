/* The following code was generated by JFlex 1.4.1 on 9/06/20 8:04 */

package compiler.lexical;

import compiler.syntax.sym;
import compiler.lexical.Token;
import es.uned.lsi.compiler.lexical.ScannerIF;
import es.uned.lsi.compiler.lexical.LexicalError;
import es.uned.lsi.compiler.lexical.LexicalErrorManager;

// incluir aqui, si es necesario otras importaciones



/**
 * This class is a scanner generated by 
 * <a href="http://www.jflex.de/">JFlex</a> 1.4.1
 * on 9/06/20 8:04 from the specification file
 * <tt>C:/Users/PC/Desktop/Practicas/PL2/ArquitecturaPLIIGrupoA-2019-2020/doc/specs/scanner.flex</tt>
 */
public class Scanner implements java_cup.runtime.Scanner, ScannerIF {

  /** This character denotes the end of file */
  public static final int YYEOF = -1;

  /** initial size of the lookahead buffer */
  private static final int ZZ_BUFFERSIZE = 16384;

  /** lexical states */
  public static final int YYINITIAL = 0;
  public static final int YYCOMENTARIO = 1;

  /** 
   * Translates characters to character classes
   */
  private static final String ZZ_CMAP_PACKED = 
    "\10\0\3\5\2\0\1\5\22\0\1\5\1\0\1\4\5\0\1\10"+
    "\1\6\1\11\1\7\1\40\1\0\1\46\1\43\1\3\11\2\1\41"+
    "\1\37\1\44\1\42\1\45\2\0\1\12\1\17\1\33\1\14\1\20"+
    "\1\23\1\21\1\24\1\22\2\1\1\25\1\27\1\13\1\15\1\31"+
    "\1\1\1\32\1\26\1\16\1\30\1\36\1\34\1\1\1\35\1\1"+
    "\6\0\1\12\1\17\1\33\1\14\1\20\1\23\1\21\1\24\1\22"+
    "\2\1\1\25\1\27\1\13\1\15\1\31\1\1\1\32\1\26\1\16"+
    "\1\30\1\36\1\34\1\1\1\35\1\1\uff85\0";

  /** 
   * Translates characters to character classes
   */
  private static final char [] ZZ_CMAP = zzUnpackCMap(ZZ_CMAP_PACKED);

  /** 
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\2\1\1\2\1\3\2\4\1\2\1\1\1\5\1\6"+
    "\1\7\1\2\16\3\1\10\1\11\1\12\1\13\1\14"+
    "\1\15\1\16\4\1\1\0\1\17\1\20\1\21\2\3"+
    "\1\22\10\3\1\23\10\3\1\24\1\25\1\26\1\27"+
    "\1\30\1\31\5\3\1\32\12\3\1\33\1\34\1\35"+
    "\1\36\2\3\1\37\12\3\1\40\1\3\1\41\4\3"+
    "\1\42\1\43\3\3\1\44\1\3\1\45\1\46\3\3"+
    "\1\47\1\50\2\3\1\51\2\3\1\52\1\3\1\53"+
    "\2\3\1\54";

  private static int [] zzUnpackAction() {
    int [] result = new int[132];
    int offset = 0;
    offset = zzUnpackAction(ZZ_ACTION_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAction(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /** 
   * Translates a state to a row index in the transition table
   */
  private static final int [] ZZ_ROWMAP = zzUnpackRowMap();

  private static final String ZZ_ROWMAP_PACKED_0 =
    "\0\0\0\47\0\116\0\165\0\234\0\116\0\303\0\352"+
    "\0\116\0\116\0\u0111\0\u0138\0\u015f\0\u0186\0\u01ad\0\u01d4"+
    "\0\u01fb\0\u0222\0\u0249\0\u0270\0\u0297\0\u02be\0\u02e5\0\u030c"+
    "\0\u0333\0\u035a\0\116\0\116\0\u0381\0\116\0\116\0\u03a8"+
    "\0\116\0\u03cf\0\116\0\u03f6\0\u041d\0\303\0\116\0\116"+
    "\0\116\0\u0444\0\u046b\0\165\0\u0492\0\u04b9\0\u04e0\0\u0507"+
    "\0\u052e\0\u0555\0\u057c\0\u05a3\0\165\0\u05ca\0\u05f1\0\u0618"+
    "\0\u063f\0\u0666\0\u068d\0\u06b4\0\u06db\0\116\0\116\0\116"+
    "\0\116\0\165\0\165\0\u0702\0\u0729\0\u0750\0\u0777\0\u079e"+
    "\0\165\0\u07c5\0\u07ec\0\u0813\0\u083a\0\u0861\0\u0888\0\u08af"+
    "\0\u08d6\0\u08fd\0\u0924\0\165\0\165\0\165\0\165\0\u094b"+
    "\0\u0972\0\165\0\u0999\0\u09c0\0\u09e7\0\u0a0e\0\u0a35\0\u0a5c"+
    "\0\u0a83\0\u0aaa\0\u0ad1\0\u0af8\0\165\0\u0b1f\0\165\0\u0b46"+
    "\0\u0b6d\0\u0b94\0\u0bbb\0\165\0\165\0\u0be2\0\u0c09\0\u0c30"+
    "\0\165\0\u0c57\0\165\0\165\0\u0c7e\0\u0ca5\0\u0ccc\0\165"+
    "\0\165\0\u0cf3\0\u0d1a\0\165\0\u0d41\0\u0d68\0\165\0\u0d8f"+
    "\0\165\0\u0db6\0\u0ddd\0\165";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[132];
    int offset = 0;
    offset = zzUnpackRowMap(ZZ_ROWMAP_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackRowMap(String packed, int offset, int [] result) {
    int i = 0;  /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int high = packed.charAt(i++) << 16;
      result[j++] = high | packed.charAt(i++);
    }
    return j;
  }

  /** 
   * The transition table of the DFA
   */
  private static final int [] ZZ_TRANS = zzUnpackTrans();

  private static final String ZZ_TRANS_PACKED_0 =
    "\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12"+
    "\1\13\1\14\1\15\1\16\1\17\1\4\1\20\1\21"+
    "\1\22\1\4\1\23\1\24\3\4\1\25\1\4\1\26"+
    "\1\27\1\30\1\31\1\4\1\32\1\33\1\34\1\35"+
    "\1\36\1\37\1\40\1\3\1\41\6\42\1\43\1\42"+
    "\1\44\1\45\35\42\50\0\3\4\6\0\25\4\12\0"+
    "\2\5\43\0\4\46\1\47\42\46\5\0\1\10\52\0"+
    "\1\50\43\0\1\51\41\0\3\4\6\0\1\4\1\52"+
    "\23\4\11\0\3\4\6\0\3\4\1\53\21\4\11\0"+
    "\3\4\6\0\3\4\1\54\21\4\11\0\3\4\6\0"+
    "\12\4\1\55\5\4\1\56\2\4\1\57\1\4\11\0"+
    "\3\4\6\0\3\4\1\60\2\4\1\61\16\4\11\0"+
    "\3\4\6\0\1\4\1\62\11\4\1\63\11\4\11\0"+
    "\3\4\6\0\1\4\1\64\7\4\1\65\13\4\11\0"+
    "\3\4\6\0\1\66\24\4\11\0\3\4\6\0\3\4"+
    "\1\67\21\4\11\0\3\4\6\0\20\4\1\70\4\4"+
    "\11\0\3\4\6\0\6\4\1\71\16\4\11\0\3\4"+
    "\6\0\3\4\1\72\21\4\11\0\3\4\6\0\12\4"+
    "\1\73\5\4\1\74\4\4\11\0\3\4\6\0\1\75"+
    "\24\4\52\0\1\76\51\0\1\77\1\0\6\42\1\0"+
    "\1\42\2\0\35\42\11\0\1\100\43\0\1\101\41\0"+
    "\3\4\6\0\2\4\1\102\22\4\11\0\3\4\6\0"+
    "\4\4\1\103\20\4\11\0\3\4\6\0\6\4\1\104"+
    "\16\4\11\0\3\4\6\0\16\4\1\105\6\4\11\0"+
    "\3\4\6\0\17\4\1\106\5\4\11\0\3\4\6\0"+
    "\3\4\1\107\21\4\11\0\3\4\6\0\7\4\1\110"+
    "\15\4\11\0\3\4\6\0\2\4\1\111\22\4\11\0"+
    "\3\4\6\0\14\4\1\112\10\4\11\0\3\4\6\0"+
    "\4\4\1\113\20\4\11\0\3\4\6\0\13\4\1\114"+
    "\11\4\11\0\3\4\6\0\2\4\1\115\22\4\11\0"+
    "\3\4\6\0\3\4\1\116\21\4\11\0\3\4\6\0"+
    "\4\4\1\117\14\4\1\120\3\4\11\0\3\4\6\0"+
    "\1\4\1\121\23\4\11\0\3\4\6\0\10\4\1\122"+
    "\14\4\11\0\3\4\6\0\10\4\1\123\14\4\11\0"+
    "\3\4\6\0\20\4\1\124\4\4\11\0\3\4\6\0"+
    "\1\4\1\125\23\4\11\0\3\4\6\0\6\4\1\126"+
    "\16\4\11\0\3\4\6\0\6\4\1\127\16\4\11\0"+
    "\3\4\6\0\13\4\1\130\11\4\11\0\3\4\6\0"+
    "\10\4\1\131\14\4\11\0\3\4\6\0\6\4\1\132"+
    "\16\4\11\0\3\4\6\0\6\4\1\133\16\4\11\0"+
    "\3\4\6\0\14\4\1\134\10\4\11\0\3\4\6\0"+
    "\16\4\1\135\6\4\11\0\3\4\6\0\21\4\1\136"+
    "\3\4\11\0\3\4\6\0\16\4\1\137\6\4\11\0"+
    "\3\4\6\0\3\4\1\140\21\4\11\0\3\4\6\0"+
    "\14\4\1\141\10\4\11\0\3\4\6\0\13\4\1\142"+
    "\11\4\11\0\3\4\6\0\4\4\1\143\20\4\11\0"+
    "\3\4\6\0\6\4\1\144\16\4\11\0\3\4\6\0"+
    "\1\4\1\145\23\4\11\0\3\4\6\0\7\4\1\146"+
    "\15\4\11\0\3\4\6\0\6\4\1\147\16\4\11\0"+
    "\3\4\6\0\13\4\1\150\11\4\11\0\3\4\6\0"+
    "\6\4\1\151\16\4\11\0\3\4\6\0\20\4\1\152"+
    "\4\4\11\0\3\4\6\0\20\4\1\153\4\4\11\0"+
    "\3\4\6\0\4\4\1\154\20\4\11\0\3\4\6\0"+
    "\6\4\1\155\16\4\11\0\3\4\6\0\6\4\1\156"+
    "\16\4\11\0\3\4\6\0\1\157\24\4\11\0\3\4"+
    "\6\0\6\4\1\160\16\4\11\0\3\4\6\0\6\4"+
    "\1\161\16\4\11\0\3\4\6\0\2\4\1\162\22\4"+
    "\11\0\3\4\6\0\1\4\1\163\23\4\11\0\3\4"+
    "\6\0\2\4\1\164\22\4\11\0\3\4\6\0\10\4"+
    "\1\165\2\4\1\166\1\167\10\4\11\0\3\4\6\0"+
    "\1\4\1\170\23\4\11\0\3\4\6\0\20\4\1\171"+
    "\4\4\11\0\3\4\6\0\16\4\1\172\6\4\11\0"+
    "\3\4\6\0\1\4\1\173\23\4\11\0\3\4\6\0"+
    "\1\4\1\174\23\4\11\0\3\4\6\0\4\4\1\175"+
    "\20\4\11\0\3\4\6\0\20\4\1\176\4\4\11\0"+
    "\3\4\6\0\4\4\1\177\20\4\11\0\3\4\6\0"+
    "\20\4\1\200\4\4\11\0\3\4\6\0\6\4\1\201"+
    "\16\4\11\0\3\4\6\0\10\4\1\202\14\4\11\0"+
    "\3\4\6\0\1\4\1\203\23\4\11\0\3\4\6\0"+
    "\7\4\1\204\15\4\10\0";

  private static int [] zzUnpackTrans() {
    int [] result = new int[3588];
    int offset = 0;
    offset = zzUnpackTrans(ZZ_TRANS_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackTrans(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      value--;
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /* error codes */
  private static final int ZZ_UNKNOWN_ERROR = 0;
  private static final int ZZ_NO_MATCH = 1;
  private static final int ZZ_PUSHBACK_2BIG = 2;

  /* error messages for the codes above */
  private static final String ZZ_ERROR_MSG[] = {
    "Unkown internal scanner error",
    "Error: could not match input",
    "Error: pushback value was too large"
  };

  /**
   * ZZ_ATTRIBUTE[aState] contains the attributes of state <code>aState</code>
   */
  private static final int [] ZZ_ATTRIBUTE = zzUnpackAttribute();

  private static final String ZZ_ATTRIBUTE_PACKED_0 =
    "\2\1\1\11\2\1\1\11\2\1\2\11\20\1\2\11"+
    "\1\1\2\11\1\1\1\11\1\1\1\11\2\1\1\0"+
    "\3\11\24\1\4\11\103\1";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[132];
    int offset = 0;
    offset = zzUnpackAttribute(ZZ_ATTRIBUTE_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAttribute(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }

  /** the input device */
  private java.io.Reader zzReader;

  /** the current state of the DFA */
  private int zzState;

  /** the current lexical state */
  private int zzLexicalState = YYINITIAL;

  /** this buffer contains the current text to be matched and is
      the source of the yytext() string */
  private char zzBuffer[] = new char[ZZ_BUFFERSIZE];

  /** the textposition at the last accepting state */
  private int zzMarkedPos;

  /** the textposition at the last state to be included in yytext */
  private int zzPushbackPos;

  /** the current text position in the buffer */
  private int zzCurrentPos;

  /** startRead marks the beginning of the yytext() string in the buffer */
  private int zzStartRead;

  /** endRead marks the last character in the buffer, that has been read
      from input */
  private int zzEndRead;

  /** number of newlines encountered up to the start of the matched text */
  private int yyline;

  /** the number of characters up to the start of the matched text */
  private int yychar;

  /**
   * the number of characters from the last newline up to the start of the 
   * matched text
   */
  private int yycolumn;

  /** 
   * zzAtBOL == true <=> the scanner is currently at the beginning of a line
   */
  private boolean zzAtBOL = true;

  /** zzAtEOF == true <=> the scanner is at the EOF */
  private boolean zzAtEOF;

  /** denotes if the user-EOF-code has already been executed */
  private boolean zzEOFDone;

  /* user code: */
    
    LexicalErrorManager lexicalErrorManager = new LexicalErrorManager ();

    /**Contador de la profundidad de anidamiento del comentario.*/
    int nComentaryCount=0;

    
    

    /**Construye un token con los datos proporcionados*/
    private Token buildToken(int nTokId, int nLine, int nColumn, String szLexema){
       Token token = new Token (nTokId);
       token.setLine (nLine + 1);
       token.setColumn (nColumn + 1);
       token.setLexema (szLexema);

       
       return token;
    }



  /**
   * Creates a new scanner
   * There is also a java.io.InputStream version of this constructor.
   *
   * @param   in  the java.io.Reader to read input from.
   */
  public Scanner(java.io.Reader in) {
    this.zzReader = in;
  }

  /**
   * Creates a new scanner.
   * There is also java.io.Reader version of this constructor.
   *
   * @param   in  the java.io.Inputstream to read input from.
   */
  public Scanner(java.io.InputStream in) {
    this(new java.io.InputStreamReader(in));
  }

  /** 
   * Unpacks the compressed character translation table.
   *
   * @param packed   the packed character translation table
   * @return         the unpacked character translation table
   */
  private static char [] zzUnpackCMap(String packed) {
    char [] map = new char[0x10000];
    int i = 0;  /* index in packed string  */
    int j = 0;  /* index in unpacked array */
    while (i < 154) {
      int  count = packed.charAt(i++);
      char value = packed.charAt(i++);
      do map[j++] = value; while (--count > 0);
    }
    return map;
  }


  /**
   * Refills the input buffer.
   *
   * @return      <code>false</code>, iff there was new input.
   * 
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  private boolean zzRefill() throws java.io.IOException {

    /* first: make room (if you can) */
    if (zzStartRead > 0) {
      System.arraycopy(zzBuffer, zzStartRead,
                       zzBuffer, 0,
                       zzEndRead-zzStartRead);

      /* translate stored positions */
      zzEndRead-= zzStartRead;
      zzCurrentPos-= zzStartRead;
      zzMarkedPos-= zzStartRead;
      zzPushbackPos-= zzStartRead;
      zzStartRead = 0;
    }

    /* is the buffer big enough? */
    if (zzCurrentPos >= zzBuffer.length) {
      /* if not: blow it up */
      char newBuffer[] = new char[zzCurrentPos*2];
      System.arraycopy(zzBuffer, 0, newBuffer, 0, zzBuffer.length);
      zzBuffer = newBuffer;
    }

    /* finally: fill the buffer with new input */
    int numRead = zzReader.read(zzBuffer, zzEndRead,
                                            zzBuffer.length-zzEndRead);

    if (numRead < 0) {
      return true;
    }
    else {
      zzEndRead+= numRead;
      return false;
    }
  }

    
  /**
   * Closes the input stream.
   */
  public final void yyclose() throws java.io.IOException {
    zzAtEOF = true;            /* indicate end of file */
    zzEndRead = zzStartRead;  /* invalidate buffer    */

    if (zzReader != null)
      zzReader.close();
  }


  /**
   * Resets the scanner to read from a new input stream.
   * Does not close the old reader.
   *
   * All internal variables are reset, the old input stream 
   * <b>cannot</b> be reused (internal buffer is discarded and lost).
   * Lexical state is set to <tt>ZZ_INITIAL</tt>.
   *
   * @param reader   the new input stream 
   */
  public final void yyreset(java.io.Reader reader) {
    zzReader = reader;
    zzAtBOL  = true;
    zzAtEOF  = false;
    zzEndRead = zzStartRead = 0;
    zzCurrentPos = zzMarkedPos = zzPushbackPos = 0;
    yyline = yychar = yycolumn = 0;
    zzLexicalState = YYINITIAL;
  }


  /**
   * Returns the current lexical state.
   */
  public final int yystate() {
    return zzLexicalState;
  }


  /**
   * Enters a new lexical state
   *
   * @param newState the new lexical state
   */
  public final void yybegin(int newState) {
    zzLexicalState = newState;
  }


  /**
   * Returns the text matched by the current regular expression.
   */
  public final String yytext() {
    return new String( zzBuffer, zzStartRead, zzMarkedPos-zzStartRead );
  }


  /**
   * Returns the character at position <tt>pos</tt> from the 
   * matched text. 
   * 
   * It is equivalent to yytext().charAt(pos), but faster
   *
   * @param pos the position of the character to fetch. 
   *            A value from 0 to yylength()-1.
   *
   * @return the character at position pos
   */
  public final char yycharat(int pos) {
    return zzBuffer[zzStartRead+pos];
  }


  /**
   * Returns the length of the matched text region.
   */
  public final int yylength() {
    return zzMarkedPos-zzStartRead;
  }


  /**
   * Reports an error that occured while scanning.
   *
   * In a wellformed scanner (no or only correct usage of 
   * yypushback(int) and a match-all fallback rule) this method 
   * will only be called with things that "Can't Possibly Happen".
   * If this method is called, something is seriously wrong
   * (e.g. a JFlex bug producing a faulty scanner etc.).
   *
   * Usual syntax/scanner level error handling should be done
   * in error fallback rules.
   *
   * @param   errorCode  the code of the errormessage to display
   */
  private void zzScanError(int errorCode) throws LexicalError {
    String message;
    try {
      message = ZZ_ERROR_MSG[errorCode];
    }
    catch (ArrayIndexOutOfBoundsException e) {
      message = ZZ_ERROR_MSG[ZZ_UNKNOWN_ERROR];
    }

    throw new LexicalError(message);
  } 


  /**
   * Pushes the specified amount of characters back into the input stream.
   *
   * They will be read again by then next call of the scanning method
   *
   * @param number  the number of characters to be read again.
   *                This number must not be greater than yylength()!
   */
  public void yypushback(int number)  throws LexicalError {
    if ( number > yylength() )
      zzScanError(ZZ_PUSHBACK_2BIG);

    zzMarkedPos -= number;
  }


  /**
   * Contains user EOF-code, which will be executed exactly once,
   * when the end of file is reached
   */
  private void zzDoEOF() throws java.io.IOException {
    if (!zzEOFDone) {
      zzEOFDone = true;
      yyclose();
    }
  }


  /**
   * Resumes scanning until the next regular expression is matched,
   * the end of input is encountered or an I/O-Error occurs.
   *
   * @return      the next token
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  public java_cup.runtime.Symbol next_token() throws java.io.IOException, LexicalError {
    int zzInput;
    int zzAction;

    // cached fields:
    int zzCurrentPosL;
    int zzMarkedPosL;
    int zzEndReadL = zzEndRead;
    char [] zzBufferL = zzBuffer;
    char [] zzCMapL = ZZ_CMAP;

    int [] zzTransL = ZZ_TRANS;
    int [] zzRowMapL = ZZ_ROWMAP;
    int [] zzAttrL = ZZ_ATTRIBUTE;

    while (true) {
      zzMarkedPosL = zzMarkedPos;

      yychar+= zzMarkedPosL-zzStartRead;

      boolean zzR = false;
      for (zzCurrentPosL = zzStartRead; zzCurrentPosL < zzMarkedPosL;
                                                             zzCurrentPosL++) {
        switch (zzBufferL[zzCurrentPosL]) {
        case '\u000B':
        case '\u000C':
        case '\u0085':
        case '\u2028':
        case '\u2029':
          yyline++;
          yycolumn = 0;
          zzR = false;
          break;
        case '\r':
          yyline++;
          yycolumn = 0;
          zzR = true;
          break;
        case '\n':
          if (zzR)
            zzR = false;
          else {
            yyline++;
            yycolumn = 0;
          }
          break;
        default:
          zzR = false;
          yycolumn++;
        }
      }

      if (zzR) {
        // peek one character ahead if it is \n (if we have counted one line too much)
        boolean zzPeek;
        if (zzMarkedPosL < zzEndReadL)
          zzPeek = zzBufferL[zzMarkedPosL] == '\n';
        else if (zzAtEOF)
          zzPeek = false;
        else {
          boolean eof = zzRefill();
          zzEndReadL = zzEndRead;
          zzMarkedPosL = zzMarkedPos;
          zzBufferL = zzBuffer;
          if (eof) 
            zzPeek = false;
          else 
            zzPeek = zzBufferL[zzMarkedPosL] == '\n';
        }
        if (zzPeek) yyline--;
      }
      zzAction = -1;

      zzCurrentPosL = zzCurrentPos = zzStartRead = zzMarkedPosL;
  
      zzState = zzLexicalState;


      zzForAction: {
        while (true) {
    
          if (zzCurrentPosL < zzEndReadL)
            zzInput = zzBufferL[zzCurrentPosL++];
          else if (zzAtEOF) {
            zzInput = YYEOF;
            break zzForAction;
          }
          else {
            // store back cached positions
            zzCurrentPos  = zzCurrentPosL;
            zzMarkedPos   = zzMarkedPosL;
            boolean eof = zzRefill();
            // get translated positions and possibly new buffer
            zzCurrentPosL  = zzCurrentPos;
            zzMarkedPosL   = zzMarkedPos;
            zzBufferL      = zzBuffer;
            zzEndReadL     = zzEndRead;
            if (eof) {
              zzInput = YYEOF;
              break zzForAction;
            }
            else {
              zzInput = zzBufferL[zzCurrentPosL++];
            }
          }
          int zzNext = zzTransL[ zzRowMapL[zzState] + zzCMapL[zzInput] ];
          if (zzNext == -1) break zzForAction;
          zzState = zzNext;

          int zzAttributes = zzAttrL[zzState];
          if ( (zzAttributes & 1) == 1 ) {
            zzAction = zzState;
            zzMarkedPosL = zzCurrentPosL;
            if ( (zzAttributes & 8) == 8 ) break zzForAction;
          }

        }
      }

      // store back cached position
      zzMarkedPos = zzMarkedPosL;

      switch (zzAction < 0 ? zzAction : ZZ_ACTION[zzAction]) {
        case 16: 
          { nComentaryCount=1;                          
                          yybegin(YYCOMENTARIO);
          }
        case 45: break;
        case 39: 
          { return buildToken(sym.TBOOLEAN, yyline, yycolumn, yytext());
          }
        case 46: break;
        case 10: 
          { return buildToken(sym.TDOSPTS, yyline, yycolumn, yytext());
          }
        case 47: break;
        case 13: 
          { return buildToken(sym.TMENOR, yyline, yycolumn, yytext());
          }
        case 48: break;
        case 31: 
          { return buildToken(sym.TELSE, yyline, yycolumn, yytext());
          }
        case 49: break;
        case 36: 
          { return buildToken(sym.TMODULE, yyline, yycolumn, yytext());
          }
        case 50: break;
        case 38: 
          { return buildToken(sym.TRECORD, yyline, yycolumn, yytext());
          }
        case 51: break;
        case 18: 
          { return buildToken(sym.TDO, yyline, yycolumn, yytext());
          }
        case 52: break;
        case 34: 
          { return buildToken(sym.TCONST, yyline, yycolumn, yytext());
          }
        case 53: break;
        case 30: 
          { return buildToken(sym.TTYPE, yyline, yycolumn, yytext());
          }
        case 54: break;
        case 24: 
          { return buildToken(sym.TAND, yyline, yycolumn, yytext());
          }
        case 55: break;
        case 19: 
          { return buildToken(sym.TIF, yyline, yycolumn, yytext());
          }
        case 56: break;
        case 40: 
          { return buildToken(sym.TINTEGER, yyline, yycolumn, yytext());
          }
        case 57: break;
        case 41: 
          { return buildToken(sym.TWRITELN, yyline, yycolumn, yytext());
          }
        case 58: break;
        case 12: 
          { return buildToken(sym.TDIVIDE, yyline, yycolumn, yytext());
          }
        case 59: break;
        case 7: 
          { return buildToken(sym.TPARI, yyline, yycolumn, yytext());
          }
        case 60: break;
        case 8: 
          { return buildToken(sym.TPTOCOMA, yyline, yycolumn, yytext());
          }
        case 61: break;
        case 20: 
          { return buildToken(sym.TASSIGN, yyline, yycolumn, yytext());
          }
        case 62: break;
        case 2: 
          { LexicalError error = new LexicalError ("Caracter incorrecto: ");
                            error.setLine (yyline + 1);
                            error.setColumn (yycolumn + 1);
                            error.setLexema (yytext ());
                            lexicalErrorManager.lexicalFatalError ( error);
          }
        case 63: break;
        case 21: 
          { return buildToken(sym.TDISTINTO, yyline, yycolumn, yytext());
          }
        case 64: break;
        case 44: 
          { return buildToken(sym.TWRITESTRING, yyline, yycolumn, yytext());
          }
        case 65: break;
        case 28: 
          { return buildToken(sym.TTHEN, yyline, yycolumn, yytext());
          }
        case 66: break;
        case 42: 
          { return buildToken(sym.TWRITEINT, yyline, yycolumn, yytext());
          }
        case 67: break;
        case 35: 
          { return buildToken(sym.TWHILE, yyline, yycolumn, yytext());
          }
        case 68: break;
        case 6: 
          { return buildToken(sym.TSUMA, yyline, yycolumn, yytext());
          }
        case 69: break;
        case 17: 
          { LexicalError error = new LexicalError ("Final de comentario SIN balancear: ");
                            error.setLine (yyline + 1);
                            error.setColumn (yycolumn + 1);
                            error.setLexema (yytext ());
                            lexicalErrorManager.lexicalFatalError ( error);
          }
        case 70: break;
        case 23: 
          { if(nComentaryCount==1){
                                nComentaryCount--;
                            
                                yybegin(YYINITIAL);
                            } else {
                            
                                nComentaryCount--;
                            }
          }
        case 71: break;
        case 32: 
          { return buildToken(sym.TBEGIN, yyline, yycolumn, yytext());
          }
        case 72: break;
        case 14: 
          { return buildToken(sym.TPUNTO, yyline, yycolumn, yytext());
          }
        case 73: break;
        case 3: 
          { return buildToken(sym.TIDENTIFICADOR, yyline, yycolumn, yytext());
          }
        case 74: break;
        case 4: 
          { return buildToken(sym.TLINT, yyline, yycolumn, yytext());
          }
        case 75: break;
        case 26: 
          { return buildToken(sym.TEND, yyline, yycolumn, yytext());
          }
        case 76: break;
        case 15: 
          { return buildToken(sym.TLSTRING, yyline, yycolumn, yytext());
          }
        case 77: break;
        case 33: 
          { return buildToken(sym.TLFALSE, yyline, yycolumn, yytext());
          }
        case 78: break;
        case 43: 
          { return buildToken(sym.TPROCEDURE, yyline, yycolumn, yytext());
          }
        case 79: break;
        case 29: 
          { return buildToken(sym.TLTRUE, yyline, yycolumn, yytext());
          }
        case 80: break;
        case 5: 
          { return buildToken(sym.TPARD, yyline, yycolumn, yytext());
          }
        case 81: break;
        case 25: 
          { return buildToken(sym.TNOT, yyline, yycolumn, yytext());
          }
        case 82: break;
        case 11: 
          { return buildToken(sym.TIGUAL, yyline, yycolumn, yytext());
          }
        case 83: break;
        case 9: 
          { return buildToken(sym.TCOMA, yyline, yycolumn, yytext());
          }
        case 84: break;
        case 22: 
          { nComentaryCount++;
          }
        case 85: break;
        case 27: 
          { return buildToken(sym.TVAR, yyline, yycolumn, yytext());
          }
        case 86: break;
        case 37: 
          { return buildToken(sym.TRETURN, yyline, yycolumn, yytext());
          }
        case 87: break;
        case 1: 
          { 
          }
        case 88: break;
        default: 
          if (zzInput == YYEOF && zzStartRead == zzCurrentPos) {
            zzAtEOF = true;
            zzDoEOF();
            switch (zzLexicalState) {
            case YYINITIAL: {
              return buildToken(sym.EOF, yyline, yycolumn, "End Of File");
            }
            case 133: break;
            case YYCOMENTARIO: {
              LexicalError error = new LexicalError ("Comentario sin balancear");
                            error.setLine (yyline + 1);
                            error.setColumn (yycolumn + 1);
                            error.setLexema ("EOF en");

                            lexicalErrorManager.lexicalFatalError (error);
                            
                            System.exit(1);
            }
            case 134: break;
            default:
              { return new java_cup.runtime.Symbol(sym.EOF); }
            }
          } 
          else {
            zzScanError(ZZ_NO_MATCH);
          }
      }
    }
  }


}
