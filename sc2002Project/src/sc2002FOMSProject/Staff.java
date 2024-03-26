package sc2002FOMSProject;

public class Staff {
    private String name;
    private int loginId;
    private char role;
    private char gender;
    private int age;
    private String branch;
    private String password;
    public Staff() {
        // Initialize any variables if needed
        this.password="password";
    }
    public void displayNewOrder(){
    	//need to update
    }
    public int getQuantity(){
    	//need to update
    	return 0;

    }
    // Setter methods
    public void setName(String name) {
        this.name = name;
    }

    public void setLoginId(int loginId) {
        this.loginId = loginId;
    }

    public void setRole(char role) {
        this.role = role;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    // Getter methods
    public String getName() {
        return name;
    }

    public int getLoginId() {
        return loginId;
    }

    public char getRole() {
        return role;
    }

    public char getGender() {
        return gender;
    }

    public int getAge() {
        return age;
    }

    public String getBranch() {
        return branch;
    }

}

