package Classwork.task005;
// Учитывая строковый путь, который является абсолютным путем (начиная с косой черты «/») к 

import java.util.Stack;

// файлу или каталогу в файловой системе в стиле Unix, преобразуйте его в упрощенный канонический путь.

// В файловой системе в стиле Unix точка '.' относится к текущему каталогу, двойная точка '..' 
// относится к каталогу выше уровня, и любые множественные последовательные косые черты (т.е. '/') 
// рассматриваются как одна косая черта '/'. Для этой проблемы любой другой формат точек, например '...', 
// рассматривается как имя файла/каталога.
class Task005 {
    class Solution {
        public String simplifyPath(String path) {
            Stack<String> stack = new Stack<>();
            StringBuilder ans = new StringBuilder();

            String[] tokens = path.split("/");
            for (String token : tokens) {
                if ("..".equals(token)) {
                    if (!stack.isEmpty()) {
                        stack.pop();
                    }
                } else if (!".".equals(token) && !token.isBlank()) {
                    stack.push(token);
                }

            }
            if (stack.isEmpty())
                return "/";

            while (!stack.isEmpty()) {
                ans.insert(0, stack.pop()).insert(0, "/");
            }
            return ans.toString();
        }
    }

}

// Deque<String> list = new LinkedList<>();
//         String[] arr = path.split("/");
//         for (int i = 0; i < arr.length; i++) {
//             if (arr[i].equals("") || arr[i].equals(".")) continue;
//             else if (arr[i].equals("..")) {
//                 if (!list.isEmpty()) list.pop();
//             }else list.add(arr[i]);
//         }
//         return "/" + String.join("/", list);