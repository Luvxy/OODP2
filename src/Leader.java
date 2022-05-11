import java.util.Scanner;

public class Leader extends Role{
	private String name = "Leader";
	private String input;
	private String memName;
	private String memRole;
	private String memId;
	private Member member;
	
	Scanner scan = new Scanner(System.in);
	
	public void addMember(Member member, Project project) { //해당 프로젝트에 멤버를 추가한다.
		project.addMember(member);
		System.out.println(project.getName()+"에 "+member.getName()+"을 추가했습니다.");
	}
	
	public void removeMember(Member member, Project project) { //해당 프로젝트에서 멤버를 삭제한다.
		project.removeMember(member);
		System.out.println(project.getName()+"에서 "+member.getName()+"을 삭제했습니다.");
	}
	
	public void editRole(Member member, Role role) { //해당 프로젝트에서 멤버의 역할을 변경
		member.setRole(role);
		System.out.println(member.getName()+"의 역할이"+member.getRole().getRoleName()+"로 변경되었습니다.");
	}
	
	@Override
	public void doIt(Member Leader, Project project) {
		System.out.println("1. 멤버 추가");
		System.out.println("2. 멤버 삭제");
		System.out.println("3. 멤버 역할 변경");
		
		this.input = scan.next();

		if(Integer.parseInt(input) == 1) { // 멤버 추가
			System.out.print("추가하려는 멤버의 이름을 입력하세요 : ");
			this.memName = scan.next();
			System.out.print("멤버의 id : ");
			this.memId = scan.next();
			member = new Member(Integer.parseInt(memId), memName);
			project.addMember(member);
			System.out.println(project.getName()+"에 "+member.getName()+"추가완료");
		}
		else if(Integer.parseInt(input) == 2) { // 멤버 삭제
			System.out.print("삭제하려고 하는 멤버의 id : ");
			this.memId = scan.next();
			this.member = project.getMember(Integer.parseInt(memId));
			project.removeMember(member);
			System.out.println(project.getName()+"에 "+member.getName()+"삭제완료");
		}
		else if(Integer.parseInt(input) == 2) { // 멤버 역할 변경
			System.out.print("역할을 변경하고자 하는 멤버의 id : ");
			this.memId = scan.next();
			this.member = project.getMember(Integer.parseInt(memId));
			System.out.println("변경하고자 하는 역할을 입력하세요\n"
					+ "1. Leader"
					+ "2. Editor"
					+ "3. Nomal"
					+ " : ");
			this.memRole = scan.next();
			member.getRole().chageRole(member, Integer.parseInt(memRole));
		}else {
			System.out.println("잘못된 입력");
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
