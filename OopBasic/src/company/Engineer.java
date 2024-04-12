package company;

public class Engineer extends Employee {
    //フィールド
    String programmingLanguage;
    
    //コンストラクター
    public Engineer(String name, Department department, String position, int employeeId, String programmingLanguage) {
        super(name, department, position, employeeId);
        this.programmingLanguage = programmingLanguage;
    }
    
    //会議に参加するメソッドをオーバーライド
    @Override
    public void joinMeeting() {
        department.meeting();
        System.out.println("→技術的な準備を行い、上記の会議に参加します。名前：" + name);
    }
    
  //専門言語発表メソッドをオーバーライド
    public void announceProgrammingLanguage() {
        System.out.println("私の使用する言語は" + programmingLanguage + "です。");
    }
    
    //言語発表メソッドをオーバーライド
    @Override
    public void developSoftware() {
        System.out.println("システムを開発します。名前：" + name + "、プログラミング言語" + programmingLanguage);
    }

}
