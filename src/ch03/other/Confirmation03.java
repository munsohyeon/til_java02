package ch03.other;

public class Confirmation03 {
    public static void main(String[] args) {
        int pencils = 534;
        int students = 30;

        // 학생 한 명이 가지는 연필 수
        int pencilsPerStudent = pencils / students;
        System.out.println(pencilsPerStudent); // 17

        int pencilsLeft = pencils % students;
        System.out.println(pencilsLeft); // 24
    }
}
