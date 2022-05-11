

public abstract class Role {
	
	public abstract void doIt();
	public abstract String getRoleName();
	public void doIt(Member Leader, Project project) {
		// TODO Auto-generated method stub
		
	}
	
	public void chageRole(Member member, int num) {
		if(num == 1) {
			member.setRole(new Leader());
		}else if(num == 2) {
			member.setRole(new Leader());
		}else if(num == 3) {
			member.setRole(new Leader());
		}else {
			System.out.println("잘못된 입력");
		}
	}
}
