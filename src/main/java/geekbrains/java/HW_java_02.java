// Напишите функцию, для поиска наиболее длинного общего префикса, среди массива строк. 
// Если общего префикса нет, то возвращать пустую строку.
// Пример ["aabb", "aabbb", "aaabb"] - ответ "aa"

package geekbrains.java;

public class HW_java_02 {
    public static void main(String[] args) {
        String[] str = new String[] {"vvaaabbbbb", "vacaam", "vvvaacgabbbb"};
        String prefix = str[0];
        for(String word: str){
            while(!word.startsWith(prefix) && prefix.length() > 0) {
                prefix = prefix.substring(0, prefix.length() - 1);
            }
        }
        System.out.println("Общий префикс: " + prefix);
    }
}