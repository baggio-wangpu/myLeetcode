import java.util.Stack;

public class Calc {

    public double evaluate(String expr) {

        if(expr == null || expr.equals("")) {
            return 0;
        }

        Stack<Double> stack = new Stack<>();

        for (String t : expr.split("\\s")) {

            double operandOne = 0.0;
            double operandTwo = 0.0;

            switch (t) {
                case "+":
                    operandOne = stack.pop();
                    operandTwo = stack.pop();
                    stack.push(operandTwo + operandOne);
                    break;
                case "-":
                    operandOne = stack.pop();
                    operandTwo = stack.pop();
                    stack.push(operandTwo - operandOne);
                    break;
                case "/":
                    operandOne = stack.pop();
                    operandTwo = stack.pop();
                    stack.push(operandTwo / operandOne);
                    break;
                case "*":
                    operandOne = stack.pop();
                    operandTwo = stack.pop();
                    stack.push(operandTwo * operandOne);
                    break;
                default:
                    stack.push(Double.parseDouble(t));
                    break;
            }
        }
        return stack.pop();
    }


}
