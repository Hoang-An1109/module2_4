import java.util.*;
public class Human {
    static Scanner scanner=new Scanner(System.in);

    String name;
    int age;
    String gender;
    String education;

    public Human(String name,int age,String gender,String education){
        this.name=name;
        this.age=age;
        this.gender=gender;
        this.education=education;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getEducation() {
        return education;
    }

    public void setEducation(String education) {
        this.education = education;
    }

    public void speak(){
        System.out.println("Hello world");
    }

    public void jump(){
        System.out.println(" ");
    }

    public static void main(String[] args) {
        Human[] humans = new Human[3];

        for(int i=0;i<3;i++){
            System.out.print("Tên: ");
            String name = scanner.nextLine();

            System.out.print("Tuổi: ");
            int age = Integer.parseInt(scanner.nextLine());

            System.out.print("Giới tính: ");
            String gender=scanner.nextLine();

            System.out.print("Học vấn: ");
            String education=scanner.nextLine();

            System.out.println();

            humans[i]=new Human(name, age,gender,education);
        }

        for (int i = 0; i < 3; i++) {
            System.out.println("Tên: " + humans[i].getName());
            System.out.println("Tuổi: " + humans[i].getAge());
            System.out.println("Giới tính: " + humans[i].getGender());
            System.out.println("Học vấn: " + humans[i].getEducation());
            System.out.println();
        }
    }
}
