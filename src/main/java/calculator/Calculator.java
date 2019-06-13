package calculator;

import java.util.Stack;

public class Calculator {
    static int operatorPrecedence(char operator) {
        switch (operator) {
            case '+':
            case '-':
                return 1;
            case '*':
            case '/':
                return 2;
        }
        return -1;
    }

    static String infixToPostfix(String infixExpression) {
        StringBuilder postfixExpression = new StringBuilder();
        Stack<Character> stack = new Stack<>();
        char[] charsArray = infixExpression.replaceAll(" ", "").toCharArray();

        for (char currentChar : charsArray) {
            if (Character.isDigit(currentChar)) {
                postfixExpression.append(currentChar);
            } else if (currentChar == '(') {
                stack.push(currentChar);
            } else if (currentChar == ')') {
                while (!stack.isEmpty() && stack.peek() != '(') {
                    postfixExpression.append(stack.pop());
                }

                if (!stack.isEmpty() && stack.peek() != '(') {
                    return "Invalid Expression";
                } else {
                    stack.pop();
                }
            } else {
                while (!stack.isEmpty() && operatorPrecedence(currentChar) <= operatorPrecedence(stack.peek())) {
                    if(stack.peek() == '(') return "Invalid Expression";

                    postfixExpression.append(stack.pop());
                }
                stack.push(currentChar);
            }

        }

        while (!stack.isEmpty()){
            if(stack.peek() == '(') return "Invalid Expression";

            postfixExpression.append(stack.pop());
        }
        return postfixExpression.toString();
    }

    static double evaluatePostfix(String postfixExpression) {
        Stack<Expression> stack = new Stack<>();

        for (char currentChar : postfixExpression.toCharArray()) {
            if (Character.isDigit(currentChar)) {
                stack.push(new Constant((double)(currentChar - '0')));
            } else {
                Expression rightOperand = stack.pop();
                Expression leftOperand = stack.pop();

                switch(currentChar) {
                    case '+':
                        stack.push(new Add(leftOperand, rightOperand));
                        break;
                    case '-':
                        stack.push(new Subtract(leftOperand, rightOperand));
                        break;
                    case '/':
                        stack.push(new Divide(leftOperand, rightOperand));
                        break;
                    case '*':
                        stack.push(new Multiply(leftOperand, rightOperand));
                        break;
                }
            }
        }

        return stack.pop().calculate();
    }

    static double calculateExpression(String expression) {
        return Calculator.evaluatePostfix(Calculator.infixToPostfix(expression));
    }
} 