package lesson7;

public class HWS {

        public static void main(String[] args) {
            System.out.println("Задание (а).");
            String str = "I like Java!!!";
            System.out.println(str);
            System.out.println();

            System.out.println("Задание (б).");
            System.out.print("Последний символ это \"");
            System.out.println(str.charAt(str.length() - 1) + "\"");
            System.out.println();

            System.out.println("Задание (в).");
            String endCheck = "!!!";
            System.out.println("Строка заканчивается на \"" + endCheck + "\" : " + str.endsWith(endCheck));
            System.out.println();

            System.out.println("Задание (г).");
            String startCheck = "I Like";
            System.out.println("Строка начинается с \"" + startCheck + "\" : " + str.startsWith(startCheck));
            System.out.println();

            System.out.println("Задание (д).");
            String containsCheck = "Java";
            System.out.println("Строка содержит \"" + containsCheck + "\" : " + str.contains(containsCheck));
            System.out.println();

            System.out.println("Задание (е).");
            System.out.println("Позиция подстроки \"" + containsCheck + "\" : " + str.indexOf(containsCheck));
            System.out.println();

            System.out.println("Задание (ж).");
            System.out.println(str.replace('a', 'o'));
            System.out.println();

            System.out.println("Задание (з).");
            System.out.println(str.toUpperCase());
            System.out.println();

            System.out.println("Задание (и).");
            System.out.println(str.toLowerCase());
            System.out.println();
        }

}
