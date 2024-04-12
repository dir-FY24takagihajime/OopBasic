package company;

public class objectSample {

    public static void main(String[] args) {
        //部署インスタンスの作成(コンストラクターメソッドを使用)
        var salesDepartment = new Department("営業部", "xx", 1000000);
        var devDepartment = new Department("開発部", "yy", 0);
        //人物インスタンスの作成
        Employee sales = new Sales("鈴木", salesDepartment, "課長", 100, "なし");
        Employee sales1 = new Sales("吉田", salesDepartment, "部長", 200, "なし");
        Employee engineer = new Engineer("田中", devDepartment, "一般社員", 88, "Java");
        Employee engineer2 = new Engineer("袴田", devDepartment, "一般社員", 300, "python");
        Employee projectManager = new Engineer("佐藤", devDepartment, "PM", 99, "Java");
        var parttimeWoker = new ParttimeWorker("太田", salesDepartment);
        
        //インスタンスメソッドの呼び出し
        sales.report(); 
        sales1.report(2);
        sales1.joinMeeting();
        sales1.announceProgrammingLanguage();
        
        System.out.println("");
        
        engineer.report();
        engineer2.joinMeeting();
        engineer2.announceProgrammingLanguage();
        engineer2.developSoftware();
        
        System.out.println("");
        
        projectManager.report();
        projectManager.joinMeeting();
        if (projectManager instanceof Engineer) {
            //developSoftwareを呼び出す
            ((Engineer) projectManager).developSoftware();
        }
        
        System.out.println("");
        
        ((Workable) sales).work();
        ((Workable) engineer).work();
        ((Workable) projectManager).work();
        ((Workable) parttimeWoker).work();
    }

}
