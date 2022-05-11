
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
	
	public Member(int id, String name) { //Member ������
		this.setId(id);
		this.setName(name);
	}
	
	public void exitProject(Project project) { //Project������ �Ķ���ͷ� �޾ƿ� project�� projectList���� �����Ѵ�.
		project.removeMember(this); //�ش� ������Ʈ���� ������ ����� �����Ѵ�.
		this.projectList.remove(project); //�ش� ������Ʈ�� projectList���� �����Ѵ�.
		System.out.println(project.getName()+"���� ���Խ��ϴ�.");
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
