public class Main {
    public static void main(String[] args) {
        // задание на создание своего Exceptiona (ограничение на возраст при заполнении анкеты для регистрации)


        int age = 0;
        try {
            age = TestClass.getAge(37);
            System.out.println(age);
        } catch (TestClass.AgeOldException e) {
            e.printStackTrace();
        } catch (TestClass.AgeYuongException e) {
            e.printStackTrace();
        }
        }
    }
