package JavaCourse.Seminar2.Task4;

import java.io.FileWriter;
// import java.io.IOException;

/*
 * Напишите метод, который составит строку, состоящую из 100 повторений слова TEST и 
 * метод, который запишет эту строку в простой текстовый файл, обработайте исключения.
 */
public class program {
    public static void main(String[] args) {
        String str1 = createString();
        writeToFile(str1);
    }

    public static String createString() {
        StringBuilder str = new StringBuilder();
        for (int i = 0; i < 100; i++) {
            str.append("TEST");
        }
        return str.toString();
    }

    public static void writeToFile(String str) {
        try (FileWriter fw = new FileWriter("file.txt", false)) {
            fw.write(str);
            fw.flush();
            fw.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
