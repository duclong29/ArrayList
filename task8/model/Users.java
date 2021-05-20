package exam.model;

public class Users {
    private int id;
    private String userName;
    private String password;
    private int role;
    private String create;
    private String update;


    public Users () {}

    public Users (String userName, String password) {
        this.id = id;
        this.userName = userName;
        this.password = password;
        this.role = role;
    }

    public Users (int id, String userName, String password, int role, String create, String update) {
        this.id = id;
        this.userName = userName;
        this.password = password;
        this.role = role;
        this.create = create;
        this.update = update;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getRole() {
        return role;
    }

    public void setRole(int role) {
        this.role = role;
    }

    public String getCreate() {
        return create;
    }

    public void setCreate(String create) {
        this.create = create;
    }

    public String getUpdate() {
        return update;
    }

    public void setUpdate(String update) {
        this.update = update;
    }
}
