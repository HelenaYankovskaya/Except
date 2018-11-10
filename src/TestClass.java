
class TestClass{

    public static int getAge(int age) throws AgeOldException, AgeYuongException {

          if (age > 100) {
              throw new AgeOldException(age);}
              else {
                  if (age<18){
                      throw  new AgeYuongException(age);}
                   else {
        System.out.print("Ваш возраст - ");
         return age;}
    }}


static class AgeOldException extends Exception{

    private int age;
    public int getAge(){return age;}
    public AgeOldException(int age){
        System.out.println("Простите, но столько не живут!");
    }
}
static class AgeYuongException extends Exception {

    private int age;

    public int getAge() {
        return age;
    }

    public AgeYuongException(int age) {
        System.out.println("Простите, но вы слишком юны");
    }
}}