import java.util.Scanner;

public class main {
	static Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
		Member member1 = new Member(1,"�����");

		System.out.println("����� id : " + member1.getId());
		System.out.println("����� �̸��� : " + member1.getName());
		
		Project project1 = new Project("my first project",member1);
		member1.addProject(project1);
		System.out.println("'"+project1.getName()+"'�� �����Ǿ����ϴ�.");
		System.out.println("����� ������ "+member1.getRole());
		Project project2 = new Project("my second project",member1);
		member1.addProject(project2);
		System.out.println("'"+project2.getName()+"'�� �����Ǿ����ϴ�.");
		System.out.println("����� ������ "+member1.getRole());
		
		System.out.println("�۾��� project�� �����ϼ���");
		String num = scan.next();
		
		
		member1.getRole().doIt(member1, project1);

		
	}
}
