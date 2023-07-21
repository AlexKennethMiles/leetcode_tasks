package tasks.leetcode.srack;

import java.util.Stack;

/**
 * === СТЭК, Открывающие рождают закрывающие, затем закрывающие вытаскивают дубликаты из стэка ===
 */
public class ValidParentheses {
    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<Character>();
        for (char c : s.toCharArray()) {
            if (c == '(') {
                stack.push(')');
            } else if (c == '{') {
                stack.push('}');
            } else if (c == '[') {
                stack.push(']');
            } else if (stack.empty() || stack.pop() != c) { // Если закрывающая скобка
                // Сюда сваливаемся, если в стеке ничего нет,
                // Либо текущей скобке в стеке нет соотв.
                // В лучшем случае ей есть скобка равная ей сверху стэка
                return false;
            }
        }
        return stack.empty(); // true только если все закрывающие скобки были успешно извлечены
    }
}
