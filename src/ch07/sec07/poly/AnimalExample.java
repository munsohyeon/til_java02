package ch07.sec07.poly;

public class AnimalExample {

    public static void main(String[] args) {
        Cat cat = new Cat();
        Tiger tiger = new Tiger();
        Cow cow = new Cow();
        Dog dog = new Dog();
        Bulldog bulldog = new Bulldog();

//        System.out.println("누가 야옹 소리를 내었어?");
        animalCrying(cat);
        animalCrying(tiger);
        animalCrying(cow);
        animalCrying(dog);
        animalCrying(bulldog);

    }

    public static void animalCrying(Animal animal) {
        animal.crying();
        // dog객체 넘어오면 jump 메소드 호출
        if (animal instanceof Dog) {
            Dog dog = (Dog) animal;
            dog.jump();
        }
    }
    // 오버로딩이 아닌 다형성으로 호출한다
    // 그 이유는 만약 여기서 동물이 2000개라면 2000개 모두를
    // 작성해서 호출을 해야하기 때문.

}
