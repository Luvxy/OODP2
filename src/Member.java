
import java.util.ArrayList;

public class Member {
	private int id;
	private String name;
	private ArrayList<Project> projectList = new ArrayList<Project>();
	private Role role;
	
	public void addProject(Project project) {
		projectList.add(project);
	}
	
	public ArrayList<Project> getProjectList() {
		return projectList;
		
	}
	
	public void setRole(Role r) {
		this.role = r;
	}
	
	public Role getRole() {
		return this.role;
	}
	
	public Member(int id, String name) { //Member 생성자
		this.setId(id);
		this.setName(name);
	}
	
	public void exitProject(Project project) { //Project나가기 파라미터로 받아온 project를 projectList에서 삭제한다.
		project.removeMember(this); //해당 프로젝트에서 현재의 멤버를 삭제한다.
		this.projectList.remove(project); //해당 프로젝트를 projectList에서 삭제한다.
		System.out.println(project.getName()+"에서 나왔습니다.");
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Object getProject(String proName) {
		return projectList.get(projectList.indexOf(proName));
	}
}
