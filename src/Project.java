import java.util.ArrayList;

public class Project {
	private String name;
	private ArrayList<Member> memberList = new ArrayList<Member>();

	public Project(String name, Member member) {
		this.setName(name);
		member.setRole(new Leader());
		memberList.add(member);
	}
	
	public void addMember(Member member) { //�ش� ������Ʈ�� ����� �߰��Ѵ�.
		this.memberList.add(member);
	}
	
	public void removeMember(Member member) { //�ش� ������Ʈ���� ����� �����Ѵ�.
		this.memberList.remove(member);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public Member getMember(int id) {
		return memberList.get(memberList.indexOf(id));
	}
}
