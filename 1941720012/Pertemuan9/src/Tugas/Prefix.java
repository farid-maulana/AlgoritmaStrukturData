package Tugas;

/**
 *
 * @author FARLAN
 */
public class Prefix {

    int n, top;
    char stack[];

    public Prefix(int total) {
        n = total;
        top = -1;
        stack = new char[n];
        push('(');
    }

    public String reverseInfix(String infix) {
        String reverse = "";
        for (int i = n - 2; i >= 0; i--) {
            if (infix.charAt(i) == '(') {
                reverse = reverse + ")";
            } else if (infix.charAt(i) == ')') {
                reverse = reverse + "(";
            } else {
                reverse = reverse + infix.charAt(i);
            }

        }
        return reverse;
    }

    public String reversePostfix(String postfix) {
        String reverse = "";
        for (int i = postfix.length() - 1; i >= 0; i--) {
            reverse = reverse + postfix.charAt(i);
        }
        return reverse;
    }

    public void push(char c) {
        top++;
        stack[top] = c;
    }

    public char pop() {
        char item = stack[top];
        top--;
        return item;
    }

    public boolean IsOperand(char c) {
        if ((c >= 'A' && c <= 'Z') || (c >= 'a' && c <= 'z') || (c >= '0' && c <= '9') || c == ' ' || c == '.') {
            return true;
        } else {
            return false;
        }
    }

    public boolean IsOperator(char c) {
        if (c == '^' || c == '%' || c == '/' || c == '*' || c == '-' || c == '+') {
            return true;
        } else {
            return false;
        }
    }

    public int presedence(char c) {
        switch (c) {
            case '^':
                return 5;
            case '%':
                return 4;
            case '/':
                return 3;
            case '*':
                return 3;
            case '-':
                return 1;
            case '+':
                return 2;
            default:
                return 0;
        }
    }

    public String konversi(String Q) {
        String P = "";
        char c;
        for (int i = 0; i < n; i++) {
            c = Q.charAt(i);
            if (IsOperand(c)) {
                P = P + c;
            }
            if (c == '(') {
                push(c);
            }
            if (c == ')') {
                while (stack[top] != '(') {
                    P = P + pop();
                }
                char temp = pop();
            }
            if (IsOperator(c)) {
                while (presedence(stack[top]) >= presedence(c)) {
                    P = P + pop();
                }
                push(c);
            }
        }
        return P;
    }
}
