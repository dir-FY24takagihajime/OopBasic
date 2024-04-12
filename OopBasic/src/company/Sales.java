package company;

public class Sales extends Employee {
  //フィールド
    String programmingLanguage;
    //コンストラクター
    public Sales(String name, Department department, String position, int employeeId, String programmingLanguage) {
        //コンストラクターの呼び出し
        super(name, department, position, employeeId);
        this.programmingLanguage = programmingLanguage;
    }
    
  //専門言語発表メソッドをオーバーライド
    @Override
    public void announceProgrammingLanguage() {
        System.out.println("私は開発できません。");
    }
    
    //会議に参加するメソッド
    @Override
    public void joinMeeting() {
        department.meeting();
        System.out.println("→営業として会議に参加します。部署：" + department.getName() + "名前：" + name);
    }
    //言語発表メソッドをオーバーライド
    @Override
    public void developSoftware() {
        System.out.println("システムを開発します。名前：" + name + "、プログラミング言語" + programmingLanguage);
    }
}
