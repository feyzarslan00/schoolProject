public class School {
    private int id;
    private String name;
    private String code;
    private Boolean active;

    public School() { };

    public School(int id, String name, String code, Boolean active) {
        this.id = id;
        this.name = name;
        this.code = code;
        this.active = active;
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

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public Boolean getActive() {
        return active;
    }

    public void setActive(Boolean active) {
        this.active = active;
    }

    public static void add(String string) {
    }



}
