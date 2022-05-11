import java.util.Scanner;

public class Leader extends Role{
	private String name = "Leader";
	private String input;
	private String memName;
	private String memRole;
	private String memId;
	private Member member;
	
	Scanner scan = new Scanner(System.in);
	
	public void addMember(Member member, Project project) { //�ش� ������Ʈ�� ����� �߰��Ѵ�.
		project.addMember(member);
		System.out.println(project.getName()+"�� "+member.getName()+"�� �߰��߽��ϴ�.");
	}
	
	public void removeMember(Member member, Project project) { //�ش� ������Ʈ���� ����� �����Ѵ�.
		project.removeMember(member);
		System.out.println(project.getName()+"���� "+member.getName()+"�� �����߽��ϴ�.");
	}
	
	public void editRole(Member member, Role role) { //�ش� ������Ʈ���� ����� ������ ����
		member.setRole(role);
		System.out.println(member.getName()+"�� ������"+member.getRole().getRoleName()+"�� ����Ǿ����ϴ�.");
	}
	
	@Override
	public void doIt(Member Leader, Project project) {
		System.out.println("1. ��� �߰�");
		System.out.println("2. ��� ����");
		System.out.println("3. ��� ���� ����");
		
		this.input = scan.next();

		if(Integer.parseInt(input) == 1) { // ��� �߰�
			System.out.print("�߰��Ϸ��� ����� �̸��� �Է��ϼ��� : ");
			this.memName = scan.next();
			System.out.print("����� id : ");
			this.memId = scan.next();
			member = new Member(Integer.parseInt(memId), memName);
			project.addMember(member);
			System.out.println(project.getName()+"�� "+member.getName()+"�߰��Ϸ�");
		}
		else if(Integer.parseInt(input) == 2) { // ��� ����
			System.out.print("�����Ϸ��� �ϴ� ����� id : ");
			this.memId = scan.next();
			this.member = project.getMember(Integer.parseInt(memId));
			project.removeMember(member);
			System.out.println(project.getName()+"�� "+member.getName()+"�����Ϸ�");
		}
		else if(Integer.parseInt(input) == 2) { // ��� ���� ����
			System.out.print("������ �����ϰ��� �ϴ� ����� id : ");
			this.memId = scan.next();
			this.member = project.getMember(Integer.parseInt(memId));
			System.out.println("�����ϰ��� �ϴ� ������ �Է��ϼ���\n"
					+ "1. Leader"
					+ "2. Editor"
					+ "3. Nomal"
					+ " : ");
			this.memRole = scan.next();
			member.getRole().chageRole(member, Integer.parseInt(memRole));
		}else {
			System.out.println("�߸��� �Է�");
		}
	}	

	@Override
	public String getRoleName() {
		// TODO Auto-generated method stub
		return name;
	}

	@Override
	public void doIt() {
		// TODO Auto-generated method stub
		
	}
}
