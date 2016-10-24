package codingblocks.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.InputType;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Stack;


public class MainActivity extends AppCompatActivity {

    private Button btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,btn0,btneql,btndot;
    private Button btnclr,btndiv,btnmul,btnadd,btnsub;
    private EditText etinp;
    private TextView tvres;
    private String infix="";
    int flagdot = 1;
    int flagop = 1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn0 = (Button) findViewById(R.id.btn_0);
        btn1 = (Button) findViewById(R.id.btn_1);
        btn2 = (Button) findViewById(R.id.btn_2);
        btn3 = (Button) findViewById(R.id.btn_3);
        btn4 = (Button) findViewById(R.id.btn_4);
        btn5 = (Button) findViewById(R.id.btn_5);
        btn6 = (Button) findViewById(R.id.btn_6);
        btn7 = (Button) findViewById(R.id.btn_7);
        btn8 = (Button) findViewById(R.id.btn_8);
        btn9 = (Button) findViewById(R.id.btn_9);
        btndot = (Button) findViewById(R.id.btn_dot);
        btneql = (Button) findViewById(R.id.btn_eql);
        btnclr = (Button) findViewById(R.id.btn_clr);
        btndiv = (Button) findViewById(R.id.btn_div);
        btnmul = (Button) findViewById(R.id.btn_mul);
        btnadd = (Button) findViewById(R.id.btn_add);
        btnsub = (Button) findViewById(R.id.btn_sub);

        etinp = (EditText) findViewById(R.id.et_inp);
        tvres = (TextView) findViewById(R.id.tv_res);

        etinp.setInputType(InputType.TYPE_NULL);
        try {
            btn0.setOnClickListener(new View.OnClickListener() {

                @Override
                public void onClick(View v) {
                    etinp.setText(etinp.getText() + "0");
                    infix += "0";
                    String tempS = infixEval(infix) + "";
                    char tempC[] = tempS.toCharArray();
                    int len = tempC.length;
                    if (len > 2 && tempC[len - 1] == '0' && tempC[len - 2] == '.') {
                        tempS = tempS.substring(0, len - 2);
                    }
                    tvres.setText(tempS);
                    flagop = 0;
                }
            });

            btn1.setOnClickListener(new View.OnClickListener() {

                @Override
                public void onClick(View v) {
                    etinp.setText(etinp.getText() + "1");
                    infix += "1";
                    String tempS = infixEval(infix) + "";
                    char tempC[] = tempS.toCharArray();
                    int len = tempC.length;
                    if (len > 2 && tempC[len - 1] == '0' && tempC[len - 2] == '.') {
                        tempS = tempS.substring(0, len - 2);
                    }
                    tvres.setText(tempS);
                    flagop = 0;
                }
            });

            btn2.setOnClickListener(new View.OnClickListener() {

                @Override
                public void onClick(View v) {
                    etinp.setText(etinp.getText() + "2");
                    infix += "2";
                    String tempS = infixEval(infix) + "";
                    char tempC[] = tempS.toCharArray();
                    int len = tempC.length;
                    if (len > 2 && tempC[len - 1] == '0' && tempC[len - 2] == '.') {
                        tempS = tempS.substring(0, len - 2);
                    }
                    tvres.setText(tempS);
                    flagop = 0;
                    Log.d("TAGOK", "infix: " + infix);
                }
            });

            btn3.setOnClickListener(new View.OnClickListener() {

                @Override
                public void onClick(View v) {
                    etinp.setText(etinp.getText() + "3");
                    infix += "3";
                    String tempS = infixEval(infix) + "";
                    char tempC[] = tempS.toCharArray();
                    int len = tempC.length;
                    if (len > 2 && tempC[len - 1] == '0' && tempC[len - 2] == '.') {
                        tempS = tempS.substring(0, len - 2);
                    }
                    tvres.setText(tempS);
                    flagop = 0;
                    Log.d("TAGOK", "infix: " + infix);
                }
            });

            btn4.setOnClickListener(new View.OnClickListener() {

                @Override
                public void onClick(View v) {
                    etinp.setText(etinp.getText() + "4");
                    infix += "4";
                    String tempS = infixEval(infix) + "";
                    char tempC[] = tempS.toCharArray();
                    int len = tempC.length;
                    if (len > 2 && tempC[len - 1] == '0' && tempC[len - 2] == '.') {
                        tempS = tempS.substring(0, len - 2);
                    }
                    tvres.setText(tempS);
                    flagop = 0;
                }
            });

            btn5.setOnClickListener(new View.OnClickListener() {

                @Override
                public void onClick(View v) {
                    etinp.setText(etinp.getText() + "5");
                    infix += "5";
                    String tempS = infixEval(infix) + "";
                    char tempC[] = tempS.toCharArray();
                    int len = tempC.length;
                    if (len > 2 && tempC[len - 1] == '0' && tempC[len - 2] == '.') {
                        tempS = tempS.substring(0, len - 2);
                    }
                    tvres.setText(tempS);
                    flagop = 0;
                }
            });

            btn6.setOnClickListener(new View.OnClickListener() {

                @Override
                public void onClick(View v) {
                    etinp.setText(etinp.getText() + "6");
                    infix += "6";
                    String tempS = infixEval(infix) + "";
                    char tempC[] = tempS.toCharArray();
                    int len = tempC.length;
                    if (len > 2 && tempC[len - 1] == '0' && tempC[len - 2] == '.') {
                        tempS = tempS.substring(0, len - 2);
                    }
                    tvres.setText(tempS);
                    flagop = 0;
                }
            });

            btn7.setOnClickListener(new View.OnClickListener() {

                @Override
                public void onClick(View v) {
                    etinp.setText(etinp.getText() + "7");
                    infix += "7";
                    String tempS = infixEval(infix) + "";
                    char tempC[] = tempS.toCharArray();
                    int len = tempC.length;
                    if (len > 2 && tempC[len - 1] == '0' && tempC[len - 2] == '.') {
                        tempS = tempS.substring(0, len - 2);
                    }
                    tvres.setText(tempS);
                    flagop = 0;
                }
            });

            btn8.setOnClickListener(new View.OnClickListener() {

                @Override
                public void onClick(View v) {
                    etinp.setText(etinp.getText() + "8");
                    infix += "8";
                    String tempS = infixEval(infix) + "";
                    char tempC[] = tempS.toCharArray();
                    int len = tempC.length;
                    if (len > 2 && tempC[len - 1] == '0' && tempC[len - 2] == '.') {
                        tempS = tempS.substring(0, len - 2);
                    }
                    tvres.setText(tempS);
                    flagop = 0;
                }
            });

            btn9.setOnClickListener(new View.OnClickListener() {

                @Override
                public void onClick(View v) {
                    etinp.setText(etinp.getText() + "9");
                    infix += "9";
                    String tempS = infixEval(infix) + "";
                    char tempC[] = tempS.toCharArray();
                    int len = tempC.length;
                    if (len > 2 && tempC[len - 1] == '0' && tempC[len - 2] == '.') {
                        tempS = tempS.substring(0, len - 2);
                    }
                    tvres.setText(tempS);
                    flagop = 0;
                }
            });

            btndot.setOnClickListener(new View.OnClickListener() {

                @Override
                public void onClick(View v) {
                    if (flagdot == 1) {
                        char temp[] = infix.toCharArray();
                        int l = temp.length;
                        if (l == 0 || (l > 1 && temp[l - 1] == ' ')) {
                            infix += "0.";
                            etinp.setText(etinp.getText() + "0.");
                        } else {
                            etinp.setText(etinp.getText() + ".");
                            infix += ".";
                        }
                        flagdot = 0;
                        flagop = 0;
                    }
                }
            });

            btnadd.setOnClickListener(new View.OnClickListener() {

                @Override
                public void onClick(View v) {
                    int len = infix.length();
                    if (flagop == 0) {
                        etinp.setText(etinp.getText() + " + ");
                        infix += " + ";
                        flagdot = 1;
                        Log.d("TAGOK", "infix: " + infix);
                        flagop = 1;
                    } else {
                        if (len != 0) {
                            infix = infix.substring(0, len - 3);
                            infix += " + ";
                            etinp.setText(infix);
                            flagdot = 1;
                        }
                    }
                }
            });

            btnsub.setOnClickListener(new View.OnClickListener() {

                @Override
                public void onClick(View v) {
                    int len = infix.length();
                    if (flagop == 0) {
                        etinp.setText(etinp.getText() + " - ");
                        infix += " - ";
                        flagdot = 1;
                        Log.d("TAGOK", "infix: " + infix);
                        flagop = 1;
                    } else {
                        if (len != 0) {
                            infix = infix.substring(0, len - 3);
                            infix += " - ";
                            etinp.setText(infix);
                            flagdot = 1;
                        }
                    }
                }
            });

            btnmul.setOnClickListener(new View.OnClickListener() {

                @Override
                public void onClick(View v) {
                    int len = infix.length();
                    if (flagop == 0) {
                        etinp.setText(etinp.getText() + " x ");
                        infix += " x ";
                        flagdot = 1;
                        Log.d("TAGOK", "infix: " + infix);
                        flagop = 1;
                    } else {
                        if (len != 0) {
                            infix = infix.substring(0, len - 3);
                            infix += " x ";
                            etinp.setText(infix);
                            flagdot = 1;
                        }
                    }
                }
            });

            btndiv.setOnClickListener(new View.OnClickListener() {

                @Override
                public void onClick(View v) {
                    int len = infix.length();
                    if (flagop == 0) {
                        etinp.setText(etinp.getText() + " ÷ ");
                        infix += " ÷ ";
                        flagdot = 1;
                        Log.d("TAGOK", "infix: " + infix);
                        flagop = 1;
                    } else {
                        if (len != 0) {
                            infix = infix.substring(0, len - 3);
                            infix += " ÷ ";
                            etinp.setText(infix);
                            flagdot = 1;
                        }
                    }
                }
            });

            btneql.setOnClickListener(new View.OnClickListener() {

                @Override
                public void onClick(View v) {
                    String result = tvres.getText().toString();
                    char res[] = result.toCharArray();
                    int l = res.length;
                    int j = l-1;
                    int f = 0;
                    while(j>=0){
                        if((res[j]>='0'&&res[j]<='9')||res[j]=='.'){
                            //do nothing;
                        }
                        else{
                            f = 1;
                            break;
                        }
                        j--;
                    }
                    if (tvres.getText().toString() != ""&&f==0) {
                        infix = tvres.getText().toString();
                        char temp[] = infix.toCharArray();
                        int len = infix.length();
                        int shortened = 0;
                        if (len > 2 && temp[len - 1] == '0' && temp[len - 2] == '.') {
                            infix = infix.substring(0, len - 2);
                            shortened = 1;
                            flagdot = 1;
                        }
                        else if(len>1&&temp[len-1]=='.'){
                            infix = infix.substring(0,len-1);
                            shortened = 1;
                            flagdot = 1;
                        }
                        int flag = 0;
                        int i = len - 1;
                        if (shortened == 0) {
                            while (i >= 0) {
                                if (temp[i] == '.') {
                                    flagdot = 0;
                                    flag = 1;
                                    break;
                                }
                                i--;
                            }
                            if (flag == 0) {
                                flagdot = 1;
                            }
                        }
                        etinp.setText(infix);
                        tvres.setText("");
                        flagop = 0;
                    }
                    else if(f==1){
                        etinp.setText(null);
                        tvres.setText("");
                        infix = "";
                        flagdot = 1;
                        flagop = 1;
                    }
                }
            });


            btnclr.setOnClickListener(new View.OnClickListener() {

                @Override
                public void onClick(View v) {

                    String newS = "";
                    char temp[] = infix.toCharArray();
                    int len = infix.length();

                    if (len != 0 && temp[len - 1] == '.') {
                        flagdot = 1;
                    }
                    if (len == 0) {
                        flagop = 1;
                    } else if (len == 1) {
                        etinp.setText(null);
                        infix = "";
                        tvres.setText(null);
                        flagop = 1;
                    } else if (len == 2) {
                        infix = infix.substring(0, len - 1);
                        etinp.setText(infix);
                        String tempS = infixEval(infix) + "";
                        Log.d("TAGC", "tempS: " + tempS);
                        char tempC[] = tempS.toCharArray();
                        int l = tempC.length;
                        if (l > 2 && tempC[l - 1] == '0' && tempC[l - 2] == '.') {
                            tempS = tempS.substring(0, l - 2);
                        }
                        tvres.setText(tempS);
                    } else if (len > 2) {

                        if (temp[len - 2] == '+' || temp[len - 2] == '-' || temp[len - 2] == 'x' || temp[len - 2] == '÷') {
                            newS = infix.substring(0, len - 3);
                            infix = newS;
                            etinp.setText(infix);
                            flagop = 0;
                            //temp[] = infix.toCharArray();
                            int i = len - 4;
                            int flag = 0;
//                    Log.d("TAGC", "iBefore: "+i+" temp[i]: "+temp[i]);
//                    Log.d("TAGC","infix: "+infix);
                            while (i >= 0 && temp[i] != ' ') {
                                // Log.d("TAGC","i: "+i);
                                if (temp[i] == '.') {
                                    flagdot = 0;
                                    flag = 1;
                                    //   Log.d("TAGC","inwhile: ");
                                    break;
                                }
                                i--;
                            }
                            if (flag == 0) {
                                //Log.d("TAGC","inIf: ");
                                flagdot = 1;
                            }
                            //  tvres.setText(infixEval(infix)+"");
                        } else if (temp[len - 3] == '+' || temp[len - 3] == '-' || temp[len - 3] == 'x' || temp[len - 3] == '÷') {
                            infix = infix.substring(0, len - 1);
                            newS = infix.substring(0, len - 4);
                            etinp.setText(infix);
                            String tempS = infixEval(newS) + "";
                            char tempC[] = tempS.toCharArray();
                            int l = tempC.length;
                            if (l > 2 && tempC[l - 1] == '0' && tempC[l - 2] == '.') {
                                tempS = tempS.substring(0, l - 2);
                            }
                            tvres.setText(tempS);
                            flagdot = 1;
                            flagop = 1;
                        } else {
                            infix = infix.substring(0, len - 1);
                            Log.d("TAGC", "infix: " + infix);
                            etinp.setText(infix);
                            String tempS = infixEval(infix) + "";
                            Log.d("TAGC", "tempS: " + tempS);
                            char tempC[] = tempS.toCharArray();
                            int l = tempC.length;
                            if (l > 2 && tempC[l - 1] == '0' && tempC[l - 2] == '.') {
                                tempS = tempS.substring(0, l - 2);
                            }
                            tvres.setText(tempS);
                        }
                    }

                }
            });

            btnclr.setOnLongClickListener(new View.OnLongClickListener() {
                @Override
                public boolean onLongClick(View v) {
                    etinp.setText(null);
                    tvres.setText("");
                    infix = "";
                    flagdot = 1;
                    flagop = 1;
                    return true;
                }
            });
        } catch (Exception e) {
            Log.d("TAG", "Cannot be calculated", e);
            Toast.makeText(MainActivity.this, "Try Again", Toast.LENGTH_SHORT).show();
        }
    }


    float infixEval(String infix){
        char[] tokens = infix.toCharArray();

        Stack<Float> values = new Stack<Float>();
        Stack<Character> ops = new Stack<Character>();

        int len = tokens.length;
//        if(len>2) {
//            Log.d("TAGOK", "token[len-2]: " + tokens[len - 2]);
//            if (tokens[len - 2] == '+' || tokens[len - 2] == '-' || tokens[len - 2] == '*' || tokens[len - 2] == '/') {
//                len = len - 3;
//            }
//        }
        Log.d("TAGOK","len: "+len);
        for(int i=0;i<len;i++){
            if(tokens[i]==' '){
                continue;
            }

            if((tokens[i]>='0'&&tokens[i]<='9')||tokens[i]=='.'){
                StringBuffer sbuf = new StringBuffer();
                while(i<len&&((tokens[i]>='0'&&tokens[i]<='9')||tokens[i]=='.')) {
                    sbuf.append(tokens[i]);
                    i++;
                }
                values.push(Float.parseFloat(sbuf.toString()));
            }

            else if(tokens[i]=='('){
                ops.push(tokens[i]);
            }

            else if(tokens[i]==')'){
                while(ops.peek()!=')'){
                    values.push(applyOp(ops.pop(),values.pop(),values.pop()));
                }
                ops.pop();
            }

            else if(tokens[i]=='+'||tokens[i]=='-'||tokens[i]=='x'||tokens[i]=='÷'){
                while (!ops.empty()&&hasPrecedence(tokens[i],ops.peek())){
                    values.push(applyOp(ops.pop(),values.pop(),values.pop()));
                }
                ops.push(tokens[i]);
            }
        }

        while (!ops.empty()){
            values.push(applyOp(ops.pop(),values.pop(),values.pop()));
        }

        return values.pop();
    }

    public static boolean hasPrecedence(char op1, char op2){
        if (op2 == '(' || op2 == ')')
            return false;
        if ((op1 == 'x' || op1 == '÷') && (op2 == '+' || op2 == '-'))
            return false;
        else
            return true;
    }

    public float applyOp(char op, float b, float a)
    {
        try{
        switch (op)
        {
            case '+':
                return a + b;
            case '-':
                return a - b;
            case 'x':
                return a * b;
            case '÷':
                return a / b;
            }
        }
        catch (Exception e){
            Toast.makeText(this, "Cannot divide by zero", Toast.LENGTH_SHORT).show();
        }
        return 0;
    }

//    char pop(){
//        char x;
//        x = stack_char[topC];
//        topC--;
//        return x;
//    }
//
//    void push(char x){
//        topC++;
//        stack_char[topC] = x;
//    }
//
//    double popI(){
//        double x;
//        x = stack_int[topI];
//        topI--;
//        return x;
//    }
//
//    void pushI(double x){
//        topI++;
//        stack_int[topI] = x;
//    }
//
//    int prec(char c){
//        switch(c){
//            case '(':
//                return 1;
//            case ')':
//                return 2;
//            case '+':
//            case '-':
//                return 3;
//            case '*':
//            case '/':
//            case '%':
//                return 4;
//            case '^':
//                return 5;
//            default:
//                return 0;
//        }
//    }
//
//    String infix_postfix(String infix){
//        int len;
//        char ch;
//        String postfix = "";
//        len = infix.length();
//        Log.d("TAGOK","infix len: "+len);
//        Log.d("TAGOK","infix: "+infix);
//        infix+= ')';
//        Log.d("TAGOK","infix new len: "+len);
//        Log.d("TAGOK"," new infix: "+infix);
//        push('(');
//        for(int i=0,j=0;i<=len;i++){
//            switch(prec(infix.charAt(i))){
//                case 1:
//                    //cout<<"case1: ";
//                    push(infix.charAt(i));
//                    break;
//                case 2:
//                    //cout<<"case2: ";
//                    ch = pop();
//                    Log.d("TAGOK","finally m here where ch : " + ch +" and infix[i] = "+infix.charAt(i));
//                    while(ch!='('){
//                        postfix+=ch;
//                        j++;
//                        ch = pop();
//                    }
//                    break;
//                case 3:
//                    //cout<<"case3: ";
//                    ch = pop();
//                    Log.d("TAGOK","ch: "+ ch);
//                    while(prec(ch)>=3){
//                        postfix+=ch;
//                        ch = pop();
//                    }
//                    push(ch);
//                    push(infix.charAt(i));
//                    Log.d("TAGOK","infix char in case 3: " + infix.charAt(i));
//                    break;
//                case 4:
//                    //cout<<"case4: ";
//                    ch = pop();
//                    while(prec(ch)>=4){
//                        postfix+=ch;
//                        ch = pop();
//                    }
//                    push(ch);
//                    push(infix.charAt(i));
//                    break;
//                case 5:
//                    //cout<<"case5: ";
//                    ch = pop();
//                    while(prec(ch)==5){
//                        postfix+=ch;
//                        ch = pop();
//                    }
//                    push(ch);
//                    push(infix.charAt(i));
//                    break;
//                default:
//                    //cout<<"caseDefault: ";
//                    Log.d("TAGOK","m in default: ");
//                    postfix+=infix.charAt(i);
//                    break;
//            }
//        }
//        //cout<<postfix<<endl;
//        return postfix;
//    }
//
//    double postfixEval(String infix){
//        String postfix = infix_postfix(infix);
//        int len = postfix.length();
//        Log.d("TAGOK","len: "+len);
//        Log.d("TAGOK","postfix: "+postfix);
//        double temp = 0;
//        for(int i=0;i<len;i++){
//            Log.d("TAGOK","i: "+i);
//            if(postfix.charAt(i)<='9'&&postfix.charAt(i)>='0'){
//                pushI(postfix.charAt(i)-48);
//            }
//            else{
//                double a = popI();
//                double b = popI();
//
//                switch(postfix.charAt(i)){
//                    case '+':
//                        temp = a+b;
//                        break;
//                    case '-':
//                        temp = b-a;
//                        break;
//                    case '*':
//                        temp = a*b;
//                        break;
//                    case '/':
//                        temp = b/a;
//                        break;
//                    case '%':
//                        temp = b%a;
//                        break;
//                    case '^':
//                        temp = java.lang.Math.pow(b,a);
//                        break;
//                }
//                pushI(temp);
//            }
//        }
//        return (popI());
//    }

//    int pow(int b, int a){
//
//    }

}
