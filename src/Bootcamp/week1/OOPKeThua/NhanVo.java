package Bootcamp.week1.OOPKeThua;

public class NhanVo extends Animal {
    private int age;
    private int height;

    public NhanVo(int age, int height) {
        // Gọi tới Constructor mặc định của lớp cha (Animal).
        // Nhằm mục đích gán tạo giá trị cho các trường (field) của lớp cha.
        super();
        // Sau đó mới gán giá trị cho các trường (field) của nó.
        this.age = age;
        this.height = height;
    }
    public NhanVo(String name, int age, int height) {
        // Gọi tới Constructor của lớp cha (Animal)
        // Nhằm mục đích gán tạo giá trị cho các trường (field) của lớp cha.
        super(name);
        // Sau đó mới gán giá trị cho các trường (field) của nó.
        this.age = age;
        this.height = height;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    @Override
    public String getAnimalName() {
        return "Nhân is Cục Súc";
    }
}
