package Bootcamp.week1.OOPKeThua;

public class InstanceofDemo {

    public static void main(String[] args) {
        // Khởi tạo một đối tượng động vật.
        // Animal là một lớp trừu tượng,
        // bạn không thể tạo ra một đối tượng từ Constructor của Animal.
        Animal tom = new Cat("Tom", 3, 20);
        Animal nhan = new NhanVo("Nhân", 25, 50);
        System.out.println("name: " + tom.getName());
        System.out.println("animalName: " + tom.getAnimalName());

        System.out.println("name: " + nhan.getName());
        System.out.println("animalName: " + nhan.getAnimalName());

        // Sử dụng toán tử 'instanceof' để kiểm tra xem
        // một đối tượng có phải là một kiểu nào đó hay không.
        boolean isMouse = tom instanceof Mouse;
        System.out.println("Tom is mouse? " + isMouse);

        boolean isCat = tom instanceof Cat;
        System.out.println("Tom is cat? " + isCat);

        boolean isAnimal = tom instanceof Animal;
        System.out.println("Tom is animal? " + isAnimal);
    }
}
