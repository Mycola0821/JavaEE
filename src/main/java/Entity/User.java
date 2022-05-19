package Entity;

/**
 * <p>水闸管理系统的用户类。内部属性包括用户的用户名、工号、
 * 密码、角色、当前状态等。</p>
 * <p>其中角色属性包括管理员和普通用户两个状态，当前状态属性包括
 * 正常和停用两个状态。</p>
 */
public class User {

    private String username;
    private String id;
    private String password;
    private int character;
    private int state;

    // 用于控制角色属性
    // ADMINISTRATOR表示管理员，COMMON_USER表示普通用户
    private final int ADMINISTRATOR = 0;
    private final int COMMON_USER = 1;

    // 用于控制当前状态属性
    // NORMAL表示正常状态，STOP表示停用状态
    private final int NORMAL = 0;
    private final int STOP = 1;

    /**
     * 用户类的构造函数。用于初始化用户实例。
     * @param username 用户名
     * @param id 工号
     * @param password 密码
     * @param character 角色
     * @param state 当前状态
     */
    public User(String username, String id, String password, int character, int state) {
        this.username = username;
        this.id = id;
        this.password = password;
        this.character = character;
        this.state = state;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getCharacter() {
        return character;
    }

    public void setCharacter(int character) {
        this.character = character;
    }

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }

    @Override
    public String toString() {
        return "User{" +
                "username='" + username + '\'' +
                ", id='" + id + '\'' +
                ", password='" + password + '\'' +
                ", character=" + character +
                ", state=" + state +
                '}';
    }
}
