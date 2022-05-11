import java.util.Scanner;

public class main {
	static Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
		Member member1 = new Member(1,"김수빈");

		System.out.println("당신의 id : " + member1.getId());
		System.out.println("당신의 이름은 : " + member1.getName());
		
		Project project1 = new Project("my first project",member1);
		member1.addProject(project1);
		System.out.println("'"+project1.getName()+"'이 생성되었습니다.");
		System.out.println("당신의 역할은 "+member1.getRole());
		Project project2 = new Project("my second project",member1);
		member1.addProject(project2);
		System.out.println("'"+project2.getName()+"'이 생성되었습니다.");
		System.out.println("당신의 역할은 "+member1.getRole());
		
		System.out.println("작업할 project를 선택하세요");
		String num = scan.next();
		
		
		member1.getRole().doIt(member1, project1);

		
	}
}
