package Model;

public class Project {
    String username;
    String stages;
    String title;

    public Project(){}

    public Project(String username, String stages, String title) {
        this.username = username;
        this.stages = stages;
        this.title = title;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getStages() {
        return stages;
    }

    public void setStages(String stages) {
        this.stages = stages;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
